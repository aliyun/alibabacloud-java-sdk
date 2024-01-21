// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SubmitDocumentImportJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Docs")
    public java.util.List<SubmitDocumentImportJobRequestDocs> docs;

    public static SubmitDocumentImportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentImportJobRequest self = new SubmitDocumentImportJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentImportJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitDocumentImportJobRequest setDocs(java.util.List<SubmitDocumentImportJobRequestDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<SubmitDocumentImportJobRequestDocs> getDocs() {
        return this.docs;
    }

    public static class SubmitDocumentImportJobRequestDocs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("Type")
        public String type;

        @NameInMap("URL")
        public String URL;

        public static SubmitDocumentImportJobRequestDocs build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocumentImportJobRequestDocs self = new SubmitDocumentImportJobRequestDocs();
            return TeaModel.build(map, self);
        }

        public SubmitDocumentImportJobRequestDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitDocumentImportJobRequestDocs setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SubmitDocumentImportJobRequestDocs setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public SubmitDocumentImportJobRequestDocs setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public SubmitDocumentImportJobRequestDocs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitDocumentImportJobRequestDocs setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
