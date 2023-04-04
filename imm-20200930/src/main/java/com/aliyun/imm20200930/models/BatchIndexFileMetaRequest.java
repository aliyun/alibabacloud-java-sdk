// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<InputFile> files;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

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

}
