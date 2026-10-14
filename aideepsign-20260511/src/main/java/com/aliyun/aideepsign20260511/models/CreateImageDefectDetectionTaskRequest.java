// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageDefectDetectionTaskRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The URL of the image to be detected. Only HTTP/HTTPS protocols are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/product.jpg">https://example.com/product.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static CreateImageDefectDetectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDefectDetectionTaskRequest self = new CreateImageDefectDetectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageDefectDetectionTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageDefectDetectionTaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
