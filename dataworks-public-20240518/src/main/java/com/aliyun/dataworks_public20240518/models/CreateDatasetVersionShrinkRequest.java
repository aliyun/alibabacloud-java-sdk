// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionShrinkRequest extends TeaModel {
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
    public String importInfoShrink;

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

    public static CreateDatasetVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionShrinkRequest self = new CreateDatasetVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatasetVersionShrinkRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateDatasetVersionShrinkRequest setImportInfoShrink(String importInfoShrink) {
        this.importInfoShrink = importInfoShrink;
        return this;
    }
    public String getImportInfoShrink() {
        return this.importInfoShrink;
    }

    public CreateDatasetVersionShrinkRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public CreateDatasetVersionShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
