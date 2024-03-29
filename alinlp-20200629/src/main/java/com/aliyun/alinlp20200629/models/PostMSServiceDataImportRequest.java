// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSServiceDataImportRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Documents")
    public java.util.List<PostMSServiceDataImportRequestDocuments> documents;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static PostMSServiceDataImportRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSServiceDataImportRequest self = new PostMSServiceDataImportRequest();
        return TeaModel.build(map, self);
    }

    public PostMSServiceDataImportRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PostMSServiceDataImportRequest setDocuments(java.util.List<PostMSServiceDataImportRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<PostMSServiceDataImportRequestDocuments> getDocuments() {
        return this.documents;
    }

    public PostMSServiceDataImportRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public static class PostMSServiceDataImportRequestDocuments extends TeaModel {
        @NameInMap("BizParams")
        public java.util.Map<String, ?> bizParams;

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

        public static PostMSServiceDataImportRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            PostMSServiceDataImportRequestDocuments self = new PostMSServiceDataImportRequestDocuments();
            return TeaModel.build(map, self);
        }

        public PostMSServiceDataImportRequestDocuments setBizParams(java.util.Map<String, ?> bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public java.util.Map<String, ?> getBizParams() {
            return this.bizParams;
        }

        public PostMSServiceDataImportRequestDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public PostMSServiceDataImportRequestDocuments setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }
        public String getFileExtension() {
            return this.fileExtension;
        }

        public PostMSServiceDataImportRequestDocuments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PostMSServiceDataImportRequestDocuments setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public PostMSServiceDataImportRequestDocuments setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
