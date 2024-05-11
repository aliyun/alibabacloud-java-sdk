// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cover")
    public CreateCustomizedStoryRequestCover cover;

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
    @NameInMap("Files")
    public java.util.List<CreateCustomizedStoryRequestFiles> files;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoryType")
    public String storyType;

    public static CreateCustomizedStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryRequest self = new CreateCustomizedStoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryRequest setCover(CreateCustomizedStoryRequestCover cover) {
        this.cover = cover;
        return this;
    }
    public CreateCustomizedStoryRequestCover getCover() {
        return this.cover;
    }

    public CreateCustomizedStoryRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public CreateCustomizedStoryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateCustomizedStoryRequest setFiles(java.util.List<CreateCustomizedStoryRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<CreateCustomizedStoryRequestFiles> getFiles() {
        return this.files;
    }

    public CreateCustomizedStoryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCustomizedStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateCustomizedStoryRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateCustomizedStoryRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

    public static class CreateCustomizedStoryRequestCover extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateCustomizedStoryRequestCover build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomizedStoryRequestCover self = new CreateCustomizedStoryRequestCover();
            return TeaModel.build(map, self);
        }

        public CreateCustomizedStoryRequestCover setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateCustomizedStoryRequestFiles extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateCustomizedStoryRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomizedStoryRequestFiles self = new CreateCustomizedStoryRequestFiles();
            return TeaModel.build(map, self);
        }

        public CreateCustomizedStoryRequestFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
