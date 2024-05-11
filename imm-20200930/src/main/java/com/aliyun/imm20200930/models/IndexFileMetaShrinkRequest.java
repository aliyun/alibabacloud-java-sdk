// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("File")
    public String fileShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("UserData")
    public String userData;

    public static IndexFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaShrinkRequest self = new IndexFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public IndexFileMetaShrinkRequest setFileShrink(String fileShrink) {
        this.fileShrink = fileShrink;
        return this;
    }
    public String getFileShrink() {
        return this.fileShrink;
    }

    public IndexFileMetaShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public IndexFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public IndexFileMetaShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
