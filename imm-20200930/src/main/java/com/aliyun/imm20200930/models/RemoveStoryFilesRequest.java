// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<RemoveStoryFilesRequestFiles> files;

    @NameInMap("ObjectId")
    public String objectId;

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
