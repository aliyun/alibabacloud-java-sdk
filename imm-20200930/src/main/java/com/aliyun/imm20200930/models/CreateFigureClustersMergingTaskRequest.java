// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("From")
    public String from;

    @NameInMap("Froms")
    public java.util.List<String> froms;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     */
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

    public CreateFigureClustersMergingTaskRequest setFroms(java.util.List<String> froms) {
        this.froms = froms;
        return this;
    }
    public java.util.List<String> getFroms() {
        return this.froms;
    }

    public CreateFigureClustersMergingTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
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
