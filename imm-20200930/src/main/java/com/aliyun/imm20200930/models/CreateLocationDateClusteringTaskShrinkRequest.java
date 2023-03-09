// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("DateOptions")
    public String dateOptionsShrink;

    @NameInMap("LocationOptions")
    public String locationOptionsShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("UserData")
    public String userData;

    public static CreateLocationDateClusteringTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationDateClusteringTaskShrinkRequest self = new CreateLocationDateClusteringTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocationDateClusteringTaskShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setDateOptionsShrink(String dateOptionsShrink) {
        this.dateOptionsShrink = dateOptionsShrink;
        return this;
    }
    public String getDateOptionsShrink() {
        return this.dateOptionsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setLocationOptionsShrink(String locationOptionsShrink) {
        this.locationOptionsShrink = locationOptionsShrink;
        return this;
    }
    public String getLocationOptionsShrink() {
        return this.locationOptionsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
