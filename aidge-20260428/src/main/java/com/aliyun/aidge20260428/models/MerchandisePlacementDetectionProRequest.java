// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionProRequest extends TeaModel {
    /**
     * <p>The HTTPS URL of the display image to detect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The detection rule. When non-empty, this value takes priority as the model prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Identify all Genki Forest beverages on the shelf and mark their positions</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The product type. This parameter must be set to Genki Forest when Rule is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>元气森林</p>
     */
    @NameInMap("Type")
    public String type;

    public static MerchandisePlacementDetectionProRequest build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionProRequest self = new MerchandisePlacementDetectionProRequest();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionProRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public MerchandisePlacementDetectionProRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public MerchandisePlacementDetectionProRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
