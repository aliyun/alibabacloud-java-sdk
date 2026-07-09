// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class SignUserImageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client generates this value. Make sure the value is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The URL of the image to be signed. HTTP and HTTPS URLs are supported. Specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ObjectKey of the image to be signed in OSS. When you use <code>ObjectKey</code>, make sure the key belongs to the namespace of the current caller. Specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static SignUserImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SignUserImageRequest self = new SignUserImageRequest();
        return TeaModel.build(map, self);
    }

    public SignUserImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SignUserImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SignUserImageRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
