// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionShrinkRequest extends TeaModel {
    /**
     * <p>The list of products and their detection boxes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Products")
    public String productsShrink;

    /**
     * <p>The ID of the customer-specific SKU vector database that determines which database is used for retrieval. The database must be created in advance through the database creation process.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The optional business request ID used for Tracing Analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>didui-request-001</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>The HTTPS URL of the overall floor display image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/didui.jpg">https://example.com/didui.jpg</a></p>
     */
    @NameInMap("TargetImageUrl")
    public String targetImageUrl;

    public static DiduiAreaDeductionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionShrinkRequest self = new DiduiAreaDeductionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionShrinkRequest setProductsShrink(String productsShrink) {
        this.productsShrink = productsShrink;
        return this;
    }
    public String getProductsShrink() {
        return this.productsShrink;
    }

    public DiduiAreaDeductionShrinkRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public DiduiAreaDeductionShrinkRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public DiduiAreaDeductionShrinkRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

}
