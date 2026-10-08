// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileMetaShrinkRequest extends TeaModel {
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
     * <p>The URI of the file. Make sure that the file has been <strong>indexed</strong>.</p>
     * <p>The OSS URI format is oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of the OSS bucket that resides in the same region as the current project, and <code>${Object}</code> is the full path of the file including the file name extension.</p>
     * <p>The PDS URI format is pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("URI")
    public String URI;

    /**
     * <p>Specifies the specific fields to return, instead of all existing metadata fields. You can use this parameter to reduce the size of the returned struct.</p>
     * <p>If you do not specify this parameter or leave it empty, all fields are returned.</p>
     */
    @NameInMap("WithFields")
    public String withFieldsShrink;

    public static GetFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileMetaShrinkRequest self = new GetFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFileMetaShrinkRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public GetFileMetaShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
