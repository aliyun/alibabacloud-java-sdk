// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductHotspotDetectionRequest extends TeaModel {
    /**
     * <p>The HTTPS URLs of reference images that define the SKU whitelist. A maximum of 20 images are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceImageUrls")
    public java.util.List<String> referenceImageUrls;

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

    public static ProductHotspotDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ProductHotspotDetectionRequest self = new ProductHotspotDetectionRequest();
        return TeaModel.build(map, self);
    }

    public ProductHotspotDetectionRequest setReferenceImageUrls(java.util.List<String> referenceImageUrls) {
        this.referenceImageUrls = referenceImageUrls;
        return this;
    }
    public java.util.List<String> getReferenceImageUrls() {
        return this.referenceImageUrls;
    }

    public ProductHotspotDetectionRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public ProductHotspotDetectionRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

}
