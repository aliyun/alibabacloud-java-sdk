// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public java.util.List<InputFile> files;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("UserData")
    public String userData;

    public static BatchIndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaRequest self = new BatchIndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchIndexFileMetaRequest setFiles(java.util.List<InputFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<InputFile> getFiles() {
        return this.files;
    }

    public BatchIndexFileMetaRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public BatchIndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchIndexFileMetaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
