// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The objects that you want to add.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public java.util.List<AddStoryFilesRequestFiles> files;

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
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static AddStoryFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesRequest self = new AddStoryFilesRequest();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public AddStoryFilesRequest setFiles(java.util.List<AddStoryFilesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AddStoryFilesRequestFiles> getFiles() {
        return this.files;
    }

    public AddStoryFilesRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public AddStoryFilesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public static class AddStoryFilesRequestFiles extends TeaModel {
        /**
         * <p>The URI of the object.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static AddStoryFilesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            AddStoryFilesRequestFiles self = new AddStoryFilesRequestFiles();
            return TeaModel.build(map, self);
        }

        public AddStoryFilesRequestFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
