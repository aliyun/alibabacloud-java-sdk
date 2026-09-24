// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralRephotographyDetectionRequest extends TeaModel {
    /**
     * <p>The HTTPS URL of the original image to recognize. The URL must be accessible and must not contain whitespace or URL-embedded usernames or passwords.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static GeneralRephotographyDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneralRephotographyDetectionRequest self = new GeneralRephotographyDetectionRequest();
        return TeaModel.build(map, self);
    }

    public GeneralRephotographyDetectionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
