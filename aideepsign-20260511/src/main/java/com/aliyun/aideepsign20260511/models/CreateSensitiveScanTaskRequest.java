// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateSensitiveScanTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The URL of the image to scan. Only HTTP and HTTPS protocols are supported. The image size cannot exceed 10 MB. You must specify at least one of ImageUrl and ObjectKey.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/document.jpg">https://example.com/document.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ObjectKey of the image to scan in OSS. When you use ObjectKey, make sure that the key belongs to the namespace of the current caller. You must specify at least one of ImageUrl and ObjectKey.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/scan/abc12345.jpg</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

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

    public CreateSensitiveScanTaskRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
