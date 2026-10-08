// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For more information about how to obtain the dataset name, refer to <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, refer to <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The list of file URIs. A maximum of 100 URIs are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("URIs")
    public java.util.List<String> URIs;

    /**
     * <p>The list of fields to be returned. If you specify this parameter, only the values of the specified fields are returned, instead of all existing metadata fields. This parameter can be used to reduce the size of the returned struct.</p>
     * <p>If you do not specify this parameter or leave it empty, all fields are returned.</p>
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
