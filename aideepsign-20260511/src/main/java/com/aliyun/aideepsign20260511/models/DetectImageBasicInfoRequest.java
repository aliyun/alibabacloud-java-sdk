// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectImageBasicInfoRequest extends TeaModel {
    /**
     * <p>The URL of the image. Only HTTP and HTTPS protocols are supported. Specify either ImageUrl or ObjectKey. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ObjectKey of the image in OSS. When using ObjectKey, ensure that the key belongs to the namespace of the current caller. Specify either ImageUrl or ObjectKey. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static DetectImageBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBasicInfoRequest self = new DetectImageBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageBasicInfoRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectImageBasicInfoRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
