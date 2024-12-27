// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The files that you want to delete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public java.util.List<RemoveStoryFilesRequestFiles> files;

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

    public static RemoveStoryFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveStoryFilesRequest self = new RemoveStoryFilesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveStoryFilesRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public RemoveStoryFilesRequest setFiles(java.util.List<RemoveStoryFilesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<RemoveStoryFilesRequestFiles> getFiles() {
        return this.files;
    }

    public RemoveStoryFilesRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public RemoveStoryFilesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public static class RemoveStoryFilesRequestFiles extends TeaModel {
        /**
         * <p>The URI of the Object Storage Service (OSS) bucket where you store the files that you want to delete.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the files that have an extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1/object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static RemoveStoryFilesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            RemoveStoryFilesRequestFiles self = new RemoveStoryFilesRequestFiles();
            return TeaModel.build(map, self);
        }

        public RemoveStoryFilesRequestFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
