// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFigureClusterRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For more information about how to obtain the dataset name, see <a href="~~CreateDataset~~">CreateDataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The object ID of the clustering group. You can obtain the object ID from the face group information returned by <a href="~~QueryFigureClusters~~">QueryFigureClusters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-1f2e1a2c-d5ee-4bc5-84f6-fef94ea****</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="~~CreateProject~~">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
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

    public GetFigureClusterRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public GetFigureClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
