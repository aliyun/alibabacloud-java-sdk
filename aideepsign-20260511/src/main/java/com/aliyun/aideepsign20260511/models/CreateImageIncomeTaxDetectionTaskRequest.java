// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageIncomeTaxDetectionTaskRequest extends TeaModel {
    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The URL of the income tax screenshot to detect. Only HTTP/HTTPS URLs are supported. The image size cannot exceed 10 MB. External images are not supported. Only URLs accessible from the Chinese mainland public network are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/incometax.png">https://example.com/incometax.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static CreateImageIncomeTaxDetectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageIncomeTaxDetectionTaskRequest self = new CreateImageIncomeTaxDetectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageIncomeTaxDetectionTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageIncomeTaxDetectionTaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
