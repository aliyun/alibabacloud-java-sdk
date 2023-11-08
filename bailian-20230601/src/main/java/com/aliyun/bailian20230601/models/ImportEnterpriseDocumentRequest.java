// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportEnterpriseDocumentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DocumentList")
    public java.util.List<ImportEnterpriseDocumentRequestDocumentList> documentList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static ImportEnterpriseDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseDocumentRequest self = new ImportEnterpriseDocumentRequest();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseDocumentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ImportEnterpriseDocumentRequest setDocumentList(java.util.List<ImportEnterpriseDocumentRequestDocumentList> documentList) {
        this.documentList = documentList;
        return this;
    }
    public java.util.List<ImportEnterpriseDocumentRequestDocumentList> getDocumentList() {
        return this.documentList;
    }

    public ImportEnterpriseDocumentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportEnterpriseDocumentRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ImportEnterpriseDocumentRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static class ImportEnterpriseDocumentRequestDocumentList extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("FileCanDownload")
        public Boolean fileCanDownload;

        @NameInMap("FileLink")
        public String fileLink;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePreviewLink")
        public String filePreviewLink;

        public static ImportEnterpriseDocumentRequestDocumentList build(java.util.Map<String, ?> map) throws Exception {
            ImportEnterpriseDocumentRequestDocumentList self = new ImportEnterpriseDocumentRequestDocumentList();
            return TeaModel.build(map, self);
        }

        public ImportEnterpriseDocumentRequestDocumentList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ImportEnterpriseDocumentRequestDocumentList setFileCanDownload(Boolean fileCanDownload) {
            this.fileCanDownload = fileCanDownload;
            return this;
        }
        public Boolean getFileCanDownload() {
            return this.fileCanDownload;
        }

        public ImportEnterpriseDocumentRequestDocumentList setFileLink(String fileLink) {
            this.fileLink = fileLink;
            return this;
        }
        public String getFileLink() {
            return this.fileLink;
        }

        public ImportEnterpriseDocumentRequestDocumentList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ImportEnterpriseDocumentRequestDocumentList setFilePreviewLink(String filePreviewLink) {
            this.filePreviewLink = filePreviewLink;
            return this;
        }
        public String getFilePreviewLink() {
            return this.filePreviewLink;
        }

    }

}
