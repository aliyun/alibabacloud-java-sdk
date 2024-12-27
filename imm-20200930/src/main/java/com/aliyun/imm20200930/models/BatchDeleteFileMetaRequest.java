// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaRequest extends TeaModel {
    /**
     * <p>The name of the dataset. You can obtain the name of the dataset from the response of the <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URIs of the OSS buckets in which the files whose metadata you want to delete are stored. You can specify up to 100 URIs.</p>
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
