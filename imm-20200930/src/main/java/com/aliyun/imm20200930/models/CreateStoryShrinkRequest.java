// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryShrinkRequest extends TeaModel {
    /**
     * <p>The address of the story. IMM filters candidate photos to generate a story based on the value of this parameter. This parameter takes effect only if you set StoryType to TravelMemory.</p>
     * <blockquote>
     * <p> If you are located in Hong Kong (China), Macao (China), Taiwan (China), or overseas, you cannot specify an address in the Chinese mainland by using this parameter.</p>
     * </blockquote>
     */
    @NameInMap("Address")
    public String addressShrink;

    /**
     * <p>The custom ID. A custom ID of a generated story may differ from the value of ObjectID and can be utilized for subsequent retrieval and sorting of stories.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels. Labels specify the custom information of the story. This enables retrieval based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public String customLabelsShrink;

    /**
     * <p>The name of the dataset. For information about how to obtain the name of a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of photo files in the story. The actual number of photo files ranges from the value of MinFileCount to the value of MaxFileCount. The value of this parameter must be an integer greater than the value of MinFileCount. To provide the desired effect, the algorithm limits the maximum number of photo files to 1,500. If you set MaxFileCount to a value greater than 1,500, this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxFileCount")
    public Long maxFileCount;

    /**
     * <p>The minimum number of photo files in the story. The actual number of photo files ranges from the value of MinFileCount to the value of MaxFileCount. The value of this parameter must be an integer greater than 1. If the actual number of candidate photos is less than the value of this parameter, a null story is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinFileCount")
    public Long minFileCount;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The topic name of the asynchronous reverse notification.</p>
     * 
     * <strong>example:</strong>
     * <p>test-topic</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <p>The ID of the story. This parameter is optional. If you leave this parameter empty, IMM assigns a unique identifier to the story. You can query and update a story based on its ID. You can also manually create an ID for a story. After you create an ID for a story, you must specify this parameter to pass the ID into the system. This way, IMM can record the ID as the unique identifier of the story. If you pass an existing ID into the system, IMM updates the story that corresponds to the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The end time of the photo collection for which you want to create the story. StoryStartTime and StoryEndTime form a time interval based on which IMM filters candidate photos to generate a story. The value must be a string in the RFC3339 format.</p>
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
     * <p>The start time of the photo collection for which you want to create the story. StoryStartTime and StoryEndTime form a time interval based on which IMM filters candidate photos to generate a story. The value must be a string in the RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-12-30T16:00:00Z</p>
     */
    @NameInMap("StoryStartTime")
    public String storyStartTime;

    /**
     * <p>The subtype of the story. For information about valid subtypes, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Solo</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story. For information about valid types, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <p>The tags. You can specify this parameter in one of the following scenarios:</p>
     * <ul>
     * <li>Specify tags as custom data, which is returned in messages provided by Simple Message Queue.</li>
     * <li>Search for tasks by tag.</li>
     * <li>Specify tags as variables in destination URIs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The custom information, which is returned as asynchronous notifications to facilitate notification management in your system. The maximum information length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateStoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryShrinkRequest self = new CreateStoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoryShrinkRequest setAddressShrink(String addressShrink) {
        this.addressShrink = addressShrink;
        return this;
    }
    public String getAddressShrink() {
        return this.addressShrink;
    }

    public CreateStoryShrinkRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreateStoryShrinkRequest setCustomLabelsShrink(String customLabelsShrink) {
        this.customLabelsShrink = customLabelsShrink;
        return this;
    }
    public String getCustomLabelsShrink() {
        return this.customLabelsShrink;
    }

    public CreateStoryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateStoryShrinkRequest setMaxFileCount(Long maxFileCount) {
        this.maxFileCount = maxFileCount;
        return this;
    }
    public Long getMaxFileCount() {
        return this.maxFileCount;
    }

    public CreateStoryShrinkRequest setMinFileCount(Long minFileCount) {
        this.minFileCount = minFileCount;
        return this;
    }
    public Long getMinFileCount() {
        return this.minFileCount;
    }

    public CreateStoryShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateStoryShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateStoryShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CreateStoryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateStoryShrinkRequest setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public CreateStoryShrinkRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateStoryShrinkRequest setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public CreateStoryShrinkRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateStoryShrinkRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public CreateStoryShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateStoryShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
