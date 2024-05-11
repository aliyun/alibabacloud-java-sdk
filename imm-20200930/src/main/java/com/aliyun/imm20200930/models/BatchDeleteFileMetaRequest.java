// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaRequest extends TeaModel {
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

    public static BatchDeleteFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteFileMetaRequest self = new BatchDeleteFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchDeleteFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchDeleteFileMetaRequest setURIs(java.util.List<String> URIs) {
        this.URIs = URIs;
        return this;
    }
    public java.util.List<String> getURIs() {
        return this.URIs;
    }

}
