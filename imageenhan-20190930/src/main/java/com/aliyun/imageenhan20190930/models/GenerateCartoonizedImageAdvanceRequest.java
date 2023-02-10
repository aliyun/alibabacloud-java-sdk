// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateCartoonizedImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    @NameInMap("Index")
    public String index;

    public static GenerateCartoonizedImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCartoonizedImageAdvanceRequest self = new GenerateCartoonizedImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCartoonizedImageAdvanceRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public GenerateCartoonizedImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public GenerateCartoonizedImageAdvanceRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

}
