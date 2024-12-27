// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The array of object URIs. You can specify up to 100 object URIs in an array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("URIs")
    public String URIsShrink;

    /**
     * <p>The fields to return. If you specify this parameter, only specified metadata fields are returned. You can use this parameter to control the size of the response.</p>
     * <p>If you do not specify this parameter or leave this parameter empty, the operation returns all metadata fields.</p>
     */
    @NameInMap("WithFields")
    public String withFieldsShrink;

    public static BatchGetFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFileMetaShrinkRequest self = new BatchGetFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchGetFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchGetFileMetaShrinkRequest setURIsShrink(String URIsShrink) {
        this.URIsShrink = URIsShrink;
        return this;
    }
    public String getURIsShrink() {
        return this.URIsShrink;
    }

    public BatchGetFileMetaShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
