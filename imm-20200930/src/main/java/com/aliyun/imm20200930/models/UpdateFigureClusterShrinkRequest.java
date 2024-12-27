// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterShrinkRequest extends TeaModel {
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
    public String figureClusterShrink;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateFigureClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterShrinkRequest self = new UpdateFigureClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFigureClusterShrinkRequest setFigureClusterShrink(String figureClusterShrink) {
        this.figureClusterShrink = figureClusterShrink;
        return this;
    }
    public String getFigureClusterShrink() {
        return this.figureClusterShrink;
    }

    public UpdateFigureClusterShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
