// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaShrinkRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("File")
    public String fileShrink;

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

    public IndexFileMetaShrinkRequest setFileShrink(String fileShrink) {
        this.fileShrink = fileShrink;
        return this;
    }
    public String getFileShrink() {
        return this.fileShrink;
    }

}
