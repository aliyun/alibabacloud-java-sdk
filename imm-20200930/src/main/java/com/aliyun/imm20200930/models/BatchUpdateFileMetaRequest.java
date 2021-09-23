// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<FileForReq> files;

    public static BatchUpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaRequest self = new BatchUpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
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

}
