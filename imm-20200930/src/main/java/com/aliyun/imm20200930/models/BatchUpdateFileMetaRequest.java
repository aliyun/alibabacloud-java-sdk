// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<BatchUpdateFileMetaRequestFiles> files;

    public static BatchUpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaRequest self = new BatchUpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchUpdateFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchUpdateFileMetaRequest setFiles(java.util.List<BatchUpdateFileMetaRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<BatchUpdateFileMetaRequestFiles> getFiles() {
        return this.files;
    }

    public static class BatchUpdateFileMetaRequestFiles extends TeaModel {
        @NameInMap("URI")
        public String URI;

        @NameInMap("CustomLabels")
        public java.util.Map<String, ?> customLabels;

        public static BatchUpdateFileMetaRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileMetaRequestFiles self = new BatchUpdateFileMetaRequestFiles();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileMetaRequestFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public BatchUpdateFileMetaRequestFiles setCustomLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }
        public java.util.Map<String, ?> getCustomLabels() {
            return this.customLabels;
        }

    }

}
