// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionLiteRequest extends TeaModel {
    /**
     * <p>The HTTPS URL of the display image to be detected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static MerchandisePlacementDetectionLiteRequest build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionLiteRequest self = new MerchandisePlacementDetectionLiteRequest();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionLiteRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
