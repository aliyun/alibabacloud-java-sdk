// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFigureClusterRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("FigureClusterId")
    public String figureClusterId;

    @NameInMap("ProjectName")
    public String projectName;

    public static GetFigureClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFigureClusterRequest self = new GetFigureClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetFigureClusterRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetFigureClusterRequest setFigureClusterId(String figureClusterId) {
        this.figureClusterId = figureClusterId;
        return this;
    }
    public String getFigureClusterId() {
        return this.figureClusterId;
    }

    public GetFigureClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
