// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryRequest extends TeaModel {
    /**
     * <p>The address information for the story. IMM filters photos whose shooting locations match the specified address to generate the story. This parameter takes effect only when StoryType is set to TravelMemory.</p>
     * <blockquote>
     * <p>Due to regulatory requirements, parsing GPS information into addresses is not supported in Hong Kong (China), Macao (China), Taiwan (China), or regions outside of mainland China.</p>
     * </blockquote>
     */
    @NameInMap("Address")
    public AddressForStory address;

    /**
     * <p>A custom identifier for the story. This ID can be different from ObjectId. You can use this ID to retrieve or sort stories.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels. These labels contain custom information about the story and can be used for retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of photos in the generated story. The actual number of photos is between the values of MinFileCount and MaxFileCount. The value must be an integer greater than the value of MinFileCount. To ensure the quality of the generated story, the internal algorithm limits the maximum number of photos to 1,500. If you set MaxFileCount to a value greater than 1,500, the setting does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxFileCount")
    public Long maxFileCount;

    /**
     * <p>The minimum number of photos in the generated story. The actual number of photos is between the values of MinFileCount and MaxFileCount. The value must be an integer greater than 1. If the number of available candidate photos is less than this value, an empty story is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinFileCount")
    public Long minFileCount;

    /**
     * <p>The notification configuration. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the topic for asynchronous notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>test-topic</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <p>The ID for the story object. This parameter is optional. If you do not specify an ID, IMM generates one. You can use the story ID to query or update the story. If you specify an ID that already exists, the corresponding story is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The end time of the photo collection for the story. This parameter and StoryStartTime define a time range. IMM filters candidate photos within this time range to generate the story. The value must be a string in the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-30T16:00:00Z</p>
     */
    @NameInMap("StoryEndTime")
    public String storyEndTime;

    /**
     * <p>The name of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>The start time of the photo collection for the story. This parameter and StoryEndTime define a time range. IMM filters candidate photos within this time range to generate the story. The value must be a string in the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-12-30T16:00:00Z</p>
     */
    @NameInMap("StoryStartTime")
    public String storyStartTime;

    /**
     * <p>The subtype of the story to generate. For more information about story subtypes and their valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Solo</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story to generate. For more information about story types and their valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <p>This parameter provides a tagging mechanism that can be used in the following scenarios:</p>
     * <ul>
     * <li><p>Set custom data that is returned in MNS messages.</p>
     * </li>
     * <li><p>Use as a search condition to search for tasks.</p>
     * </li>
     * <li><p>Use as a variable in TargetURI.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The custom information that is returned in an asynchronous notification message. You can use this information to associate the notification message with your services. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryRequest self = new CreateStoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoryRequest setAddress(AddressForStory address) {
        this.address = address;
        return this;
    }
    public AddressForStory getAddress() {
        return this.address;
    }

    public CreateStoryRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreateStoryRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public CreateStoryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateStoryRequest setMaxFileCount(Long maxFileCount) {
        this.maxFileCount = maxFileCount;
        return this;
    }
    public Long getMaxFileCount() {
        return this.maxFileCount;
    }

    public CreateStoryRequest setMinFileCount(Long minFileCount) {
        this.minFileCount = minFileCount;
        return this;
    }
    public Long getMinFileCount() {
        return this.minFileCount;
    }

    public CreateStoryRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateStoryRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateStoryRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CreateStoryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateStoryRequest setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public CreateStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateStoryRequest setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public CreateStoryRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateStoryRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public CreateStoryRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateStoryRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
