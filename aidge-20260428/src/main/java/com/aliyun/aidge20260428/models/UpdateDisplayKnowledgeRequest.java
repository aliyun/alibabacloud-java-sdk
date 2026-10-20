// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class UpdateDisplayKnowledgeRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The records to update. A maximum of 500 records can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public java.util.List<UpdateDisplayKnowledgeRequestRecords> records;

    public static UpdateDisplayKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisplayKnowledgeRequest self = new UpdateDisplayKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDisplayKnowledgeRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public UpdateDisplayKnowledgeRequest setRecords(java.util.List<UpdateDisplayKnowledgeRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<UpdateDisplayKnowledgeRequestRecords> getRecords() {
        return this.records;
    }

    public static class UpdateDisplayKnowledgeRequestRecords extends TeaModel {
        /**
         * <p>The HTTP or HTTPS URL of the product image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx/96f21ebdaeeba27a.jpg">https://xxxx/96f21ebdaeeba27a.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1489638581</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The SKU ID. If this parameter is not empty, the original value is overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>sku-001</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The SKU name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product front image</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        public static UpdateDisplayKnowledgeRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisplayKnowledgeRequestRecords self = new UpdateDisplayKnowledgeRequestRecords();
            return TeaModel.build(map, self);
        }

        public UpdateDisplayKnowledgeRequestRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public UpdateDisplayKnowledgeRequestRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public UpdateDisplayKnowledgeRequestRecords setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public UpdateDisplayKnowledgeRequestRecords setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

}
