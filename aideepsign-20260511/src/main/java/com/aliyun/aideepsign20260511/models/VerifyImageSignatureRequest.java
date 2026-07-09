// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class VerifyImageSignatureRequest extends TeaModel {
    /**
     * <p>The URL of the image to verify. Specify either ImageUrl or ObjectKey. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/signed-photo.jpg">https://example.com/signed-photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ObjectKey of the image in OSS. When you use ObjectKey, ensure that the key belongs to the namespace of the current caller. Specify either ImageUrl or ObjectKey. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static VerifyImageSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyImageSignatureRequest self = new VerifyImageSignatureRequest();
        return TeaModel.build(map, self);
    }

    public VerifyImageSignatureRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public VerifyImageSignatureRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
