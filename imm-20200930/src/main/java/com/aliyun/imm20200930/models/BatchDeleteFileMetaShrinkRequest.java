// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaShrinkRequest extends TeaModel {
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
    public String URIsShrink;

    public static BatchDeleteFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteFileMetaShrinkRequest self = new BatchDeleteFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchDeleteFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchDeleteFileMetaShrinkRequest setURIsShrink(String URIsShrink) {
        this.URIsShrink = URIsShrink;
        return this;
    }
    public String getURIsShrink() {
        return this.URIsShrink;
    }

}
