// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("ObjectId")
    public String objectId;

    // A short description of struct
    @NameInMap("ProjectName")
    public String projectName;

    public static RemoveStoryFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveStoryFilesShrinkRequest self = new RemoveStoryFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveStoryFilesShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public RemoveStoryFilesShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public RemoveStoryFilesShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public RemoveStoryFilesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
