// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("ImportInfo")
    public java.util.Map<String, String> importInfo;

    /**
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-oss-bucket/test_dir/</p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionRequest self = new CreateDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatasetVersionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateDatasetVersionRequest setImportInfo(java.util.Map<String, String> importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public java.util.Map<String, String> getImportInfo() {
        return this.importInfo;
    }

    public CreateDatasetVersionRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public CreateDatasetVersionRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
