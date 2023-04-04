// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFigureClusterShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ObjectIds")
    public String objectIdsShrink;

    @NameInMap("ProjectName")
    public String projectName;

    public static BatchGetFigureClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFigureClusterShrinkRequest self = new BatchGetFigureClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFigureClusterShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchGetFigureClusterShrinkRequest setObjectIdsShrink(String objectIdsShrink) {
        this.objectIdsShrink = objectIdsShrink;
        return this;
    }
    public String getObjectIdsShrink() {
        return this.objectIdsShrink;
    }

    public BatchGetFigureClusterShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
