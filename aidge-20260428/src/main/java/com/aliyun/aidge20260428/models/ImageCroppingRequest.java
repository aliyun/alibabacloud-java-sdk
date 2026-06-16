// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageCroppingRequest extends TeaModel {
    /**
     * <p>URL of the image to be processed</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Target height</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetHeight")
    public Integer targetHeight;

    /**
     * <p>Target width</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetWidth")
    public Integer targetWidth;

    public static ImageCroppingRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageCroppingRequest self = new ImageCroppingRequest();
        return TeaModel.build(map, self);
    }

    public ImageCroppingRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageCroppingRequest setTargetHeight(Integer targetHeight) {
        this.targetHeight = targetHeight;
        return this;
    }
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    public ImageCroppingRequest setTargetWidth(Integer targetWidth) {
        this.targetWidth = targetWidth;
        return this;
    }
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

}
