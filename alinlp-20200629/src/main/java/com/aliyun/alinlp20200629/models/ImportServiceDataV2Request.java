// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataV2Request extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Documents")
    public java.util.List<ImportServiceDataV2RequestDocuments> documents;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    public static ImportServiceDataV2Request build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataV2Request self = new ImportServiceDataV2Request();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataV2Request setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ImportServiceDataV2Request setDocuments(java.util.List<ImportServiceDataV2RequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<ImportServiceDataV2RequestDocuments> getDocuments() {
        return this.documents;
    }

    public ImportServiceDataV2Request setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public static class ImportServiceDataV2RequestDocuments extends TeaModel {
        @NameInMap("BizParams")
        public java.util.Map<String, String> bizParams;

        @NameInMap("DocId")
        public String docId;

        @NameInMap("FileExtension")
        public String fileExtension;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Version")
        public String version;

        public static ImportServiceDataV2RequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            ImportServiceDataV2RequestDocuments self = new ImportServiceDataV2RequestDocuments();
            return TeaModel.build(map, self);
        }

        public ImportServiceDataV2RequestDocuments setBizParams(java.util.Map<String, String> bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public java.util.Map<String, String> getBizParams() {
            return this.bizParams;
        }

        public ImportServiceDataV2RequestDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ImportServiceDataV2RequestDocuments setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }
        public String getFileExtension() {
            return this.fileExtension;
        }

        public ImportServiceDataV2RequestDocuments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ImportServiceDataV2RequestDocuments setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ImportServiceDataV2RequestDocuments setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
