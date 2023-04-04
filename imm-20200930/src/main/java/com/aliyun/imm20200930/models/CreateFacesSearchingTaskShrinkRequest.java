// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFacesSearchingTaskShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResult")
    public String maxResult;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sources")
    public String sourcesShrink;

    @NameInMap("TopK")
    public Long topK;

    @NameInMap("UserData")
    public String userData;

    public static CreateFacesSearchingTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFacesSearchingTaskShrinkRequest self = new CreateFacesSearchingTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFacesSearchingTaskShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFacesSearchingTaskShrinkRequest setMaxResult(String maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public String getMaxResult() {
        return this.maxResult;
    }

    public CreateFacesSearchingTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateFacesSearchingTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFacesSearchingTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateFacesSearchingTaskShrinkRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public CreateFacesSearchingTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
