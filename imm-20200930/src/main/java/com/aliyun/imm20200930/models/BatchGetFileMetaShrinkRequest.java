// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("URIs")
    public String URIsShrink;

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

}
