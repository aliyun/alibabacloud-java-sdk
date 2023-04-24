// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("File")
    public InputFile file;

    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaRequest self = new UpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFileMetaRequest setFile(InputFile file) {
        this.file = file;
        return this;
    }
    public InputFile getFile() {
        return this.file;
    }

    public UpdateFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
