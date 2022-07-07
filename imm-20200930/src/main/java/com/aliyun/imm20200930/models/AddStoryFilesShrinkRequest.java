// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesShrinkRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("ObjectId")
    public String objectId;

    // A short description of struct
    @NameInMap("ProjectName")
    public String projectName;

    public static AddStoryFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesShrinkRequest self = new AddStoryFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public AddStoryFilesShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public AddStoryFilesShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public AddStoryFilesShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
