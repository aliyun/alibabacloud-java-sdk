// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectAigcImageRequest extends TeaModel {
    /**
     * <p>The URL of the image to detect. Only HTTP/HTTPS protocols are supported. You must provide at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

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

}
