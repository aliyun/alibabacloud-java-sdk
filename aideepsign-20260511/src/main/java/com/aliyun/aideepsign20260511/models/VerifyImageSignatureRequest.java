// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class VerifyImageSignatureRequest extends TeaModel {
    /**
     * <p>The URL of the image to verify. Specify either <code>ImageUrl</code> or <code>ObjectKey</code>. At least one of them is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/signed-photo.jpg">https://example.com/signed-photo.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

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

}
