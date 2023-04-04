// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusteringTaskRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("UserData")
    public String userData;

    public static CreateSimilarImageClusteringTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusteringTaskRequest self = new CreateSimilarImageClusteringTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusteringTaskRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateSimilarImageClusteringTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateSimilarImageClusteringTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateSimilarImageClusteringTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateSimilarImageClusteringTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
