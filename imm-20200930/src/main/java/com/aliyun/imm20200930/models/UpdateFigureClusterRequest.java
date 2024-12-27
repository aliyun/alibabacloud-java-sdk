// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterRequest extends TeaModel {
    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The information about the cluster.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FigureCluster")
    public FigureClusterForReq figureCluster;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
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
