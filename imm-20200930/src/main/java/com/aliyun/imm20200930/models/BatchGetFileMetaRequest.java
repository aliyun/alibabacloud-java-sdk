// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URIs")
    public java.util.List<String> URIs;

    public static BatchGetFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFileMetaRequest self = new BatchGetFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchGetFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchGetFileMetaRequest setURIs(java.util.List<String> URIs) {
        this.URIs = URIs;
        return this;
    }
    public java.util.List<String> getURIs() {
        return this.URIs;
    }

}
