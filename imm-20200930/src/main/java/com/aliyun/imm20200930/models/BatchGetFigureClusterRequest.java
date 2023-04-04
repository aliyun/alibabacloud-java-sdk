// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFigureClusterRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ObjectIds")
    public java.util.List<String> objectIds;

    @NameInMap("ProjectName")
    public String projectName;

    public static BatchGetFigureClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFigureClusterRequest self = new BatchGetFigureClusterRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFigureClusterRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchGetFigureClusterRequest setObjectIds(java.util.List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    public BatchGetFigureClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
