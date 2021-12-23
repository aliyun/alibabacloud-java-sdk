// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("ProjectName")
    public String projectName;

    public static BatchUpdateFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaShrinkRequest self = new BatchUpdateFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchUpdateFileMetaShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public BatchUpdateFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
