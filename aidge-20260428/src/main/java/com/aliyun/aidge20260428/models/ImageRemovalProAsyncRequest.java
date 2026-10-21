// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemovalProAsyncRequest extends TeaModel {
    /**
     * <p>The business order ID of the caller. This ID is recorded when the request is accepted and returned as-is when you query the asynchronous task result.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The URL of the original image. The image must be in the JPG, JPEG, PNG, BMP, or WEBP format.
     * · Resolution: 256×256 to 3000×3000. File size: ≤ 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static ImageRemovalProAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemovalProAsyncRequest self = new ImageRemovalProAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemovalProAsyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ImageRemovalProAsyncRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
