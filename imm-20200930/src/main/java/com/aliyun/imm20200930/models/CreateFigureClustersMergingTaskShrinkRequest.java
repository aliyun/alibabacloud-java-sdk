// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("From")
    public String from;

    @NameInMap("Froms")
    public String fromsShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("To")
    public String to;

    @NameInMap("UserData")
    public String userData;

    public static CreateFigureClustersMergingTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClustersMergingTaskShrinkRequest self = new CreateFigureClustersMergingTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFigureClustersMergingTaskShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setFromsShrink(String fromsShrink) {
        this.fromsShrink = fromsShrink;
        return this;
    }
    public String getFromsShrink() {
        return this.fromsShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
