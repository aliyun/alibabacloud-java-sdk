// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Story extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    @NameInMap("Cover")
    public File cover;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("FigureClusterIds")
    public java.util.List<String> figureClusterIds;

    @NameInMap("Files")
    public java.util.List<File> files;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StoryEndTime")
    public String storyEndTime;

    @NameInMap("StoryName")
    public String storyName;

    @NameInMap("StoryStartTime")
    public String storyStartTime;

    @NameInMap("StorySubType")
    public String storySubType;

    @NameInMap("StoryType")
    public String storyType;

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
