// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("From")
    public String from;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("To")
    public String to;

    @NameInMap("UserData")
    public String userData;

    public static CreateFigureClustersMergingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClustersMergingTaskRequest self = new CreateFigureClustersMergingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFigureClustersMergingTaskRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFigureClustersMergingTaskRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CreateFigureClustersMergingTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateFigureClustersMergingTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFigureClustersMergingTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateFigureClustersMergingTaskRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public CreateFigureClustersMergingTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
