// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectImageBasicInfoRequest extends TeaModel {
    /**
     * <p>The URL of the image. Only HTTP/HTTPS protocols are supported. Specify either <code>ImageUrl</code> or <code>ObjectKey</code>. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

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

}
