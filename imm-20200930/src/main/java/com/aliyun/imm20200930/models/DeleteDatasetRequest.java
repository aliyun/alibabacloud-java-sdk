// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteDatasetRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetRequest self = new DeleteDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DeleteDatasetRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
