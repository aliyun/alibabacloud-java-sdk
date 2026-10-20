// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AddDisplayKnowledgeRequest extends TeaModel {
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
     * <p>The records to add. A maximum of 500 records are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public java.util.List<AddDisplayKnowledgeRequestRecords> records;

    public static AddDisplayKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDisplayKnowledgeRequest self = new AddDisplayKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public AddDisplayKnowledgeRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public AddDisplayKnowledgeRequest setRecords(java.util.List<AddDisplayKnowledgeRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<AddDisplayKnowledgeRequestRecords> getRecords() {
        return this.records;
    }

    public static class AddDisplayKnowledgeRequestRecords extends TeaModel {
        /**
         * <p>The HTTP(S) URL of the product image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx/img_1784599244373_9c2309a0.jpg">https://xxxx/img_1784599244373_9c2309a0.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The SKU ID. If this parameter is left empty, the platform generates the ID.</p>
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

        public static AddDisplayKnowledgeRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            AddDisplayKnowledgeRequestRecords self = new AddDisplayKnowledgeRequestRecords();
            return TeaModel.build(map, self);
        }

        public AddDisplayKnowledgeRequestRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public AddDisplayKnowledgeRequestRecords setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public AddDisplayKnowledgeRequestRecords setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

}
