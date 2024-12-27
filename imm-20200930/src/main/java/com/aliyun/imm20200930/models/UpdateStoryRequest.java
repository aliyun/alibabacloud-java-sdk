// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryRequest extends TeaModel {
    /**
     * <p>The cover image of the story.</p>
     */
    @NameInMap("Cover")
    public UpdateStoryRequestCover cover;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom tags. You can specify up to 100 custom tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdata</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The ID of the story.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the story.</p>
     * 
     * <strong>example:</strong>
     * <p>newstory</p>
     */
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
        /**
         * <p>The URI of the cover image.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1/object</p>
         */
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
