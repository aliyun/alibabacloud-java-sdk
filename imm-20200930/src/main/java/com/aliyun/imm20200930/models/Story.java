// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Story extends TeaModel {
    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    /**
     * <p>The story cover.</p>
     */
    @NameInMap("Cover")
    public File cover;

    /**
     * <p>The time when the story was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;val&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The fluster IDs.</p>
     */
    @NameInMap("FigureClusterIds")
    public java.util.List<String> figureClusterIds;

    /**
     * <p>The story files.</p>
     */
    @NameInMap("Files")
    public java.util.List<File> files;

    /**
     * <p>The ID of the story object.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The type of the object.</p>
     * 
     * <strong>example:</strong>
     * <p>story</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The ID of the owner to which the story belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>102321002****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The time when the story ends.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
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
     * <p>The time when the story starts.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("StoryStartTime")
    public String storyStartTime;

    /**
     * <p>The subtype of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>ImportantPerson</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The story type.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    /**
     * <p>The time when the story was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Story build(java.util.Map<String, ?> map) throws Exception {
        Story self = new Story();
        return TeaModel.build(map, self);
    }

    public Story setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public Story setCover(File cover) {
        this.cover = cover;
        return this;
    }
    public File getCover() {
        return this.cover;
    }

    public Story setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Story setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public Story setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public Story setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Story setFigureClusterIds(java.util.List<String> figureClusterIds) {
        this.figureClusterIds = figureClusterIds;
        return this;
    }
    public java.util.List<String> getFigureClusterIds() {
        return this.figureClusterIds;
    }

    public Story setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public Story setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public Story setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public Story setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Story setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Story setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public Story setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public Story setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public Story setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public Story setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public Story setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
