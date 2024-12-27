// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryRequest extends TeaModel {
    /**
     * <p>The cover image of the story. You can specify an image as the cover image of the custom story.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cover")
    public CreateCustomizedStoryRequestCover cover;

    /**
     * <p>The custom labels. You can specify labels to help you identify and retrieve the story.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The files of the story. You can specify up to 100 files in a custom story.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public java.util.List<CreateCustomizedStoryRequestFiles> files;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the story.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>The subtype of the story. For information about valid subtypes, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Solo</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story. For information about valid types, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
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
         * <p>The URI of the cover image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1/cover</p>
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
         * <p>The URIs of the files.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;URI&quot;:&quot;oss://bucket1/file1&quot;}]</p>
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
