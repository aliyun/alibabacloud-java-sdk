// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageUpscaleRequest extends TeaModel {
    /**
     * <p>The URL of the original image. It must be a publicly accessible image URL. You cannot use private network addresses such as localhost. The width and height of the input image must be greater than 100 pixels and less than 3000 pixels. The width and height of the upscaled image must not exceed 3000 pixels.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.jpg">http://example.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The upscaling factor of the image. Valid values: 2 and 4. Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UpscaleFactor")
    public Integer upscaleFactor;

    public static ImageUpscaleRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageUpscaleRequest self = new ImageUpscaleRequest();
        return TeaModel.build(map, self);
    }

    public ImageUpscaleRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageUpscaleRequest setUpscaleFactor(Integer upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Integer getUpscaleFactor() {
        return this.upscaleFactor;
    }

}
