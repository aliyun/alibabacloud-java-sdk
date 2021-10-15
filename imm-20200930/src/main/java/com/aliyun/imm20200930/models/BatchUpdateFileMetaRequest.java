// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<FileForReq> files;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    public static BatchUpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaRequest self = new BatchUpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchUpdateFileMetaRequest setFiles(java.util.List<FileForReq> files) {
        this.files = files;
        return this;
    }
    public java.util.List<FileForReq> getFiles() {
        return this.files;
    }

    public BatchUpdateFileMetaRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public BatchUpdateFileMetaRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public BatchUpdateFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
