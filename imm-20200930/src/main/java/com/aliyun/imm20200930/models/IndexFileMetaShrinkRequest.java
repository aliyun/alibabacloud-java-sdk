// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaShrinkRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("URI")
    public String URI;

    @NameInMap("CustomLabels")
    public String customLabelsShrink;

    public static IndexFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaShrinkRequest self = new IndexFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public IndexFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public IndexFileMetaShrinkRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public IndexFileMetaShrinkRequest setCustomLabelsShrink(String customLabelsShrink) {
        this.customLabelsShrink = customLabelsShrink;
        return this;
    }
    public String getCustomLabelsShrink() {
        return this.customLabelsShrink;
    }

}
