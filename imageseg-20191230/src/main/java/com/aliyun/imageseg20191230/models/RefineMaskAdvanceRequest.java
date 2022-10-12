// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("MaskImageURL")
    public java.io.InputStream maskImageURLObject;

    public static RefineMaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskAdvanceRequest self = new RefineMaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RefineMaskAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RefineMaskAdvanceRequest setMaskImageURLObject(java.io.InputStream maskImageURLObject) {
        this.maskImageURLObject = maskImageURLObject;
        return this;
    }
    public java.io.InputStream getMaskImageURLObject() {
        return this.maskImageURLObject;
    }

}
