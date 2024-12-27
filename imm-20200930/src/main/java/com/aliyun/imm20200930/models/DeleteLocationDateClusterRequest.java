// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteLocationDateClusterRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The ID of the group to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>location-date-cluster-71dd4f32-9597-4085-a2ab-3a7b0fd0aff9</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteLocationDateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocationDateClusterRequest self = new DeleteLocationDateClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLocationDateClusterRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DeleteLocationDateClusterRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public DeleteLocationDateClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
