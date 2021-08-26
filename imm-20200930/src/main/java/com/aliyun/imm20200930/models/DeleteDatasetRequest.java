// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteDatasetRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    public static DeleteDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetRequest self = new DeleteDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

}
