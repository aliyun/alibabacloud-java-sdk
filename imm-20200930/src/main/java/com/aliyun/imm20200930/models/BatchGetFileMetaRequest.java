// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaRequest extends TeaModel {
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
    public java.util.List<String> URIs;

    /**
     * <p>The fields to return. If you specify this parameter, only specified metadata fields are returned. You can use this parameter to control the size of the response.</p>
     * <p>If you do not specify this parameter or leave this parameter empty, the operation returns all metadata fields.</p>
     */
    @NameInMap("WithFields")
    public java.util.List<String> withFields;

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

    public BatchGetFileMetaRequest setWithFields(java.util.List<String> withFields) {
        this.withFields = withFields;
        return this;
    }
    public java.util.List<String> getWithFields() {
        return this.withFields;
    }

}
