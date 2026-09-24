// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionRequest extends TeaModel {
    /**
     * <p>Specify this parameter to use a custom API version. If you created a custom API during the trial phase, you can find the corresponding ApiId in the product console under Intelligent Inspection &gt; API Management &gt; My API.</p>
     * 
     * <strong>example:</strong>
     * <p>api_xxx</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The URL of the original shelf or floor stack image to be recognized (accessible over the Internet or through OSS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ID of the customer-specific SKU vector library, which determines which library is used for retrieval. The library must be created in advance through the library creation process.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The custom rule. Enter a detection prompt as the workflow input parameter rule. When this parameter is specified, the type parameter is not required (a dedicated rule branch is used). If Rule is empty, you must specify Type to start detection.</p>
     * 
     * <strong>example:</strong>
     * <p>Please identify all visible beverage products in the image and return only a JSON array. Output format example: [{&quot;bbox_2d&quot;:[100,200,250,600],&quot;sku_name&quot;:&quot;Coca-Cola&quot;}]</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The business type (reserved for future routing by business line). The current release supports skincare &amp; lotion.</p>
     * 
     * <strong>example:</strong>
     * <p>水乳</p>
     */
    @NameInMap("Type")
    public String type;

    public static MerchandisePlacementDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionRequest self = new MerchandisePlacementDetectionRequest();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public MerchandisePlacementDetectionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public MerchandisePlacementDetectionRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public MerchandisePlacementDetectionRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public MerchandisePlacementDetectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
