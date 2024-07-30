// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileMetaShrinkRequest extends TeaModel {
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
    @NameInMap("URI")
    public String URI;

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
