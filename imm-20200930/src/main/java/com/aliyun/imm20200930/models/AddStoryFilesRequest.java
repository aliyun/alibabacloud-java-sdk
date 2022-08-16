// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<AddStoryFilesRequestFiles> files;

    @NameInMap("ObjectId")
    public String objectId;

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
