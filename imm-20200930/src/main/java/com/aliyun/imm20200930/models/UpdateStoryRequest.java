// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryRequest extends TeaModel {
    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StoryName")
    public String storyName;

    public static UpdateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryRequest self = new UpdateStoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoryRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public UpdateStoryRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public UpdateStoryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateStoryRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateStoryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

}
