// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("ProjectName")
    public String projectName;

    public static BatchIndexFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaShrinkRequest self = new BatchIndexFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchIndexFileMetaShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public BatchIndexFileMetaShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public BatchIndexFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
