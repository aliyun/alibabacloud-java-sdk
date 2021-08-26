// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public java.util.List<BatchIndexFileMetaRequestFiles> files;

    public static BatchIndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaRequest self = new BatchIndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchIndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchIndexFileMetaRequest setFiles(java.util.List<BatchIndexFileMetaRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<BatchIndexFileMetaRequestFiles> getFiles() {
        return this.files;
    }

    public static class BatchIndexFileMetaRequestFiles extends TeaModel {
        @NameInMap("URI")
        public String URI;

        @NameInMap("CustomLabels")
        public java.util.Map<String, ?> customLabels;

        public static BatchIndexFileMetaRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            BatchIndexFileMetaRequestFiles self = new BatchIndexFileMetaRequestFiles();
            return TeaModel.build(map, self);
        }

        public BatchIndexFileMetaRequestFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public BatchIndexFileMetaRequestFiles setCustomLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }
        public java.util.Map<String, ?> getCustomLabels() {
            return this.customLabels;
        }

    }

}
