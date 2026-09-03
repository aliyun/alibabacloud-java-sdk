// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class AddDocumentsRequest extends TeaModel {
    /**
     * <p>The deduplication configuration.</p>
     */
    @NameInMap("Dedup")
    public AddDocumentsRequestDedup dedup;

    /**
     * <p>The list of documents.</p>
     */
    @NameInMap("Documents")
    public java.util.List<AddDocumentsRequestDocuments> documents;

    /**
     * <p>The import type.</p>
     * 
     * <strong>example:</strong>
     * <p>LOCAL_UPLOAD</p>
     */
    @NameInMap("ImportType")
    public String importType;

    /**
     * <p>The knowledge base ID.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-3bd02617e9be335f</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The batch label configuration. The key must be a label field that is already defined in the knowledge base. The value supports string, int64, float32, bool, and list types.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;department&quot;:&quot;legal&quot;,&quot;topics&quot;:[&quot;policy&quot;,&quot;contract&quot;],&quot;reviewed&quot;:true}</p>
     */
    @NameInMap("MetaFields")
    public Object metaFields;

    /**
     * <p>The processing strategy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-strategy-7043984ca395eabd</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>Not supported. Ignore this parameter.</p>
     */
    @NameInMap("dingTalkConfiguration")
    public AddDocumentsRequestDingTalkConfiguration dingTalkConfiguration;

    /**
     * <p>Defaults to root when omitted.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("parentId")
    public String parentId;

    public static AddDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDocumentsRequest self = new AddDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public AddDocumentsRequest setDedup(AddDocumentsRequestDedup dedup) {
        this.dedup = dedup;
        return this;
    }
    public AddDocumentsRequestDedup getDedup() {
        return this.dedup;
    }

    public AddDocumentsRequest setDocuments(java.util.List<AddDocumentsRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<AddDocumentsRequestDocuments> getDocuments() {
        return this.documents;
    }

    public AddDocumentsRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public AddDocumentsRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public AddDocumentsRequest setMetaFields(Object metaFields) {
        this.metaFields = metaFields;
        return this;
    }
    public Object getMetaFields() {
        return this.metaFields;
    }

    public AddDocumentsRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public AddDocumentsRequest setDingTalkConfiguration(AddDocumentsRequestDingTalkConfiguration dingTalkConfiguration) {
        this.dingTalkConfiguration = dingTalkConfiguration;
        return this;
    }
    public AddDocumentsRequestDingTalkConfiguration getDingTalkConfiguration() {
        return this.dingTalkConfiguration;
    }

    public AddDocumentsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public static class AddDocumentsRequestDedup extends TeaModel {
        /**
         * <p>Specifies whether to enable content deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContentDedup")
        public Boolean contentDedup;

        /**
         * <p>Specifies whether to enable document name deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DocNameDedup")
        public Boolean docNameDedup;

        public static AddDocumentsRequestDedup build(java.util.Map<String, ?> map) throws Exception {
            AddDocumentsRequestDedup self = new AddDocumentsRequestDedup();
            return TeaModel.build(map, self);
        }

        public AddDocumentsRequestDedup setContentDedup(Boolean contentDedup) {
            this.contentDedup = contentDedup;
            return this;
        }
        public Boolean getContentDedup() {
            return this.contentDedup;
        }

        public AddDocumentsRequestDedup setDocNameDedup(Boolean docNameDedup) {
            this.docNameDedup = docNameDedup;
            return this;
        }
        public Boolean getDocNameDedup() {
            return this.docNameDedup;
        }

    }

    public static class AddDocumentsRequestDocuments extends TeaModel {
        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>CHANGELOG.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The document path. This is the file name or relative path used during upload, which must be consistent with the pre-signed URL request.</p>
         * 
         * <strong>example:</strong>
         * <p>2026_06_23_17_49_52WwGSUezpG2u2iHWxyYGzkf9KtormhkxN/CHANGELOG.md</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The processing strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-strategy-7043984ca395eabd</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        public static AddDocumentsRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            AddDocumentsRequestDocuments self = new AddDocumentsRequestDocuments();
            return TeaModel.build(map, self);
        }

        public AddDocumentsRequestDocuments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddDocumentsRequestDocuments setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AddDocumentsRequestDocuments setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AddDocumentsRequestDocuments setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class AddDocumentsRequestDingTalkConfiguration extends TeaModel {
        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("appPassword")
        public String appPassword;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("dingDocMcpLink")
        public String dingDocMcpLink;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("dingTableMcpLink")
        public String dingTableMcpLink;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("knowledgeId")
        public String knowledgeId;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("knowledgeType")
        public String knowledgeType;

        /**
         * <p>Not supported. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("userId")
        public String userId;

        public static AddDocumentsRequestDingTalkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            AddDocumentsRequestDingTalkConfiguration self = new AddDocumentsRequestDingTalkConfiguration();
            return TeaModel.build(map, self);
        }

        public AddDocumentsRequestDingTalkConfiguration setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AddDocumentsRequestDingTalkConfiguration setAppPassword(String appPassword) {
            this.appPassword = appPassword;
            return this;
        }
        public String getAppPassword() {
            return this.appPassword;
        }

        public AddDocumentsRequestDingTalkConfiguration setDingDocMcpLink(String dingDocMcpLink) {
            this.dingDocMcpLink = dingDocMcpLink;
            return this;
        }
        public String getDingDocMcpLink() {
            return this.dingDocMcpLink;
        }

        public AddDocumentsRequestDingTalkConfiguration setDingTableMcpLink(String dingTableMcpLink) {
            this.dingTableMcpLink = dingTableMcpLink;
            return this;
        }
        public String getDingTableMcpLink() {
            return this.dingTableMcpLink;
        }

        public AddDocumentsRequestDingTalkConfiguration setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public AddDocumentsRequestDingTalkConfiguration setKnowledgeType(String knowledgeType) {
            this.knowledgeType = knowledgeType;
            return this;
        }
        public String getKnowledgeType() {
            return this.knowledgeType;
        }

        public AddDocumentsRequestDingTalkConfiguration setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
