// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryRequest extends TeaModel {
    @NameInMap("Cover")
    public UpdateStoryRequestCover cover;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StoryName")
    public String storyName;

    public static UpdateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryRequest self = new UpdateStoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoryRequest setCover(UpdateStoryRequestCover cover) {
        this.cover = cover;
        return this;
    }
    public UpdateStoryRequestCover getCover() {
        return this.cover;
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

    public static class UpdateStoryRequestCover extends TeaModel {
        @NameInMap("URI")
        public String URI;

        public static UpdateStoryRequestCover build(java.util.Map<String, ?> map) throws Exception {
            UpdateStoryRequestCover self = new UpdateStoryRequestCover();
            return TeaModel.build(map, self);
        }

        public UpdateStoryRequestCover setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
