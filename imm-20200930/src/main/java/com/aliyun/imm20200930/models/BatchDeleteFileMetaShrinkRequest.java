// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaShrinkRequest extends TeaModel {
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
