// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionRequest extends TeaModel {
    /**
     * <p>Specifies a custom API version. If you created a &quot;My API&quot; during the trial phase, you can find the corresponding ApiId in the product console under &quot;Intelligent Inspection &gt; API Management &gt; My API&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>api_xxx</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The URL of the shelf or floor-stack image to be recognized (accessible over the public network or from OSS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ID of the customer\&quot;s dedicated SKU vector library, which determines which library is used for retrieval. The library must be created in advance through the library creation process.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The business type (reserved for future routing by business line). The current phase supports skincare &amp; lotion.</p>
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

    public MerchandisePlacementDetectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
