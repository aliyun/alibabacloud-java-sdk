// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFileMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("URI")
    public String URI;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    public static UpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaRequest self = new UpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFileMetaRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public UpdateFileMetaRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
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
