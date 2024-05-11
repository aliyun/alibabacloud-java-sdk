// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FigureCluster")
    public FigureClusterForReq figureCluster;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateFigureClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterRequest self = new UpdateFigureClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFigureClusterRequest setFigureCluster(FigureClusterForReq figureCluster) {
        this.figureCluster = figureCluster;
        return this;
    }
    public FigureClusterForReq getFigureCluster() {
        return this.figureCluster;
    }

    public UpdateFigureClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
