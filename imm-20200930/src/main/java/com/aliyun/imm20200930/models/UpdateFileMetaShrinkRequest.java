// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("File")
    public String fileShrink;

    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaShrinkRequest self = new UpdateFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFileMetaShrinkRequest setFileShrink(String fileShrink) {
        this.fileShrink = fileShrink;
        return this;
    }
    public String getFileShrink() {
        return this.fileShrink;
    }

    public UpdateFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
