// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("File")
    public InputFile file;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

    public static IndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaRequest self = new IndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public IndexFileMetaRequest setFile(InputFile file) {
        this.file = file;
        return this;
    }
    public InputFile getFile() {
        return this.file;
    }

    public IndexFileMetaRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public IndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
