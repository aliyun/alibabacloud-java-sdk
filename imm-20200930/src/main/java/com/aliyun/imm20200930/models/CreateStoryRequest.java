// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryRequest extends TeaModel {
    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxFileCount")
    public Long maxFileCount;

    @NameInMap("MinFileCount")
    public Long minFileCount;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ObjectId")
    public String objectId;

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

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("UserData")
    public String userData;

    public static CreateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryRequest self = new CreateStoryRequest();
        return TeaModel.build(map, self);
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

    public CreateStoryRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
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
