// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToPdfJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>JPG</p>
     */
    @NameInMap("ImageNameExtension")
    public String imageNameExtension;

    @NameInMap("ImageNames")
    public String imageNamesShrink;

    @NameInMap("ImageUrls")
    public String imageUrlsShrink;

    public static SubmitConvertImageToPdfJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToPdfJobShrinkRequest self = new SubmitConvertImageToPdfJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToPdfJobShrinkRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToPdfJobShrinkRequest setImageNamesShrink(String imageNamesShrink) {
        this.imageNamesShrink = imageNamesShrink;
        return this;
    }
    public String getImageNamesShrink() {
        return this.imageNamesShrink;
    }

    public SubmitConvertImageToPdfJobShrinkRequest setImageUrlsShrink(String imageUrlsShrink) {
        this.imageUrlsShrink = imageUrlsShrink;
        return this;
    }
    public String getImageUrlsShrink() {
        return this.imageUrlsShrink;
    }

}
