// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaRequest extends TeaModel {
    /**
     * <p>The name of the dataset. You can obtain the name of the dataset from the response of the <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The file whose metadata you want to update. The value must be in the JSON format.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("File")
    public InputFile file;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
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
