// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductHotspotDetectionShrinkRequest extends TeaModel {
    /**
     * <p>The HTTPS URLs of reference images that define the SKU whitelist. A maximum of 20 images are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceImageUrls")
    public String referenceImageUrlsShrink;

    /**
     * <p>The unique business ID for this single-scene call.</p>
     * 
     * <strong>example:</strong>
     * <p>hotspot-request-001</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>The HTTPS OSS or CDN URL of the target image to be annotated with bounding boxes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/scene.jpg">https://example.com/scene.jpg</a></p>
     */
    @NameInMap("TargetImageUrl")
    public String targetImageUrl;

    public static ProductHotspotDetectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ProductHotspotDetectionShrinkRequest self = new ProductHotspotDetectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ProductHotspotDetectionShrinkRequest setReferenceImageUrlsShrink(String referenceImageUrlsShrink) {
        this.referenceImageUrlsShrink = referenceImageUrlsShrink;
        return this;
    }
    public String getReferenceImageUrlsShrink() {
        return this.referenceImageUrlsShrink;
    }

    public ProductHotspotDetectionShrinkRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public ProductHotspotDetectionShrinkRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

}
