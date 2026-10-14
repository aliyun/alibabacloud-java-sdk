// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateSensitiveScanTaskRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. The client generates this parameter value, which must be unique across different requests. <code>ClientToken</code> supports only ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The URL of the image to be scanned. Only HTTP/HTTPS protocols are supported. The image size cannot exceed 10 MB. You must specify either <code>ImageUrl</code> or <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/document.jpg">https://example.com/document.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static CreateSensitiveScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveScanTaskRequest self = new CreateSensitiveScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveScanTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSensitiveScanTaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
