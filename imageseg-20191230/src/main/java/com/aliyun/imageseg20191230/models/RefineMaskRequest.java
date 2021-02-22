// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskRequest extends TeaModel {
    @NameInMap("MaskImageURL")
    public String maskImageURL;

    @NameInMap("ImageURL")
    public String imageURL;

    public static RefineMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskRequest self = new RefineMaskRequest();
        return TeaModel.build(map, self);
    }

    public RefineMaskRequest setMaskImageURL(String maskImageURL) {
        this.maskImageURL = maskImageURL;
        return this;
    }
    public String getMaskImageURL() {
        return this.maskImageURL;
    }

    public RefineMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
