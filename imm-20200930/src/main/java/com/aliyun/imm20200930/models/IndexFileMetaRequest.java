// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("File")
    public FileForReq file;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

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

    public IndexFileMetaRequest setFile(FileForReq file) {
        this.file = file;
        return this;
    }
    public FileForReq getFile() {
        return this.file;
    }

    public IndexFileMetaRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public IndexFileMetaRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public IndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
