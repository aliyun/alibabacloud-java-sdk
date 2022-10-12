// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("MaskImageURL")
    public String maskImageURL;

    public static RefineMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskRequest self = new RefineMaskRequest();
        return TeaModel.build(map, self);
    }

    public RefineMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RefineMaskRequest setMaskImageURL(String maskImageURL) {
        this.maskImageURL = maskImageURL;
        return this;
    }
    public String getMaskImageURL() {
        return this.maskImageURL;
    }

}
