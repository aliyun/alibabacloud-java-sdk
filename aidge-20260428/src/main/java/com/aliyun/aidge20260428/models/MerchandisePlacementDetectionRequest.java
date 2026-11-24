// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionRequest extends TeaModel {
    /**
     * <p>The ID of the custom API. Pass this parameter if you need to specify a custom version of the API. If you created a custom API during the trial phase, you can query the ApiId of the corresponding feature in the product console by choosing Intelligent Inspection &gt; API Management &gt; My APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>api_xxx</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The URL of the original shelf or floor display image to be recognized. The URL must be accessible over the Internet or from OSS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ID of the customer-specific SKU vector database, which determines the database used for retrieval. The database must be created through the database creation process in advance.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The custom rule. You can enter a detection prompt, which is passed as the <code>rule</code> input parameter to the workflow. If this parameter is specified, the <code>type</code> parameter is not required and the independent rule branch is used. If this parameter is left empty, you must specify the <code>type</code> parameter to start detection.</p>
     * 
     * <strong>example:</strong>
     * <p>Identify all visible beverage products in the image and return only a JSON array. Output format example: [{&quot;bbox_2d&quot;:[100,200,250,600],&quot;sku_name&quot;:&quot;Coca-Cola&quot;}]</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The business type. This parameter is reserved for future routing based on business lines. Currently, only skincare products are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Skincare</p>
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
