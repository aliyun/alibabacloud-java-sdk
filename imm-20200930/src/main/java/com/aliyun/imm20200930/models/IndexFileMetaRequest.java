// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("URI")
    public String URI;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    public static IndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaRequest self = new IndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public IndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public IndexFileMetaRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public IndexFileMetaRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
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
