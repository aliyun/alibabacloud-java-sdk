// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteStoryRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoryRequest self = new DeleteStoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStoryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DeleteStoryRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public DeleteStoryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
