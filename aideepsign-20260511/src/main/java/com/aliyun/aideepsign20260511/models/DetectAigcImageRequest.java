// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectAigcImageRequest extends TeaModel {
    /**
     * <p>The URL of the image to detect. Only HTTP and HTTPS protocols are supported. You must provide at least one of ImageUrl and ObjectKey.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ObjectKey of the image to detect in OSS. When you use ObjectKey, make sure that the key belongs to the namespace of the current caller. You must provide at least one of ImageUrl and ObjectKey.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static DetectAigcImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectAigcImageRequest self = new DetectAigcImageRequest();
        return TeaModel.build(map, self);
    }

    public DetectAigcImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectAigcImageRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
