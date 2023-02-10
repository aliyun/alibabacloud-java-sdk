// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateCartoonizedImageRequest extends TeaModel {
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Index")
    public String index;

    public static GenerateCartoonizedImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCartoonizedImageRequest self = new GenerateCartoonizedImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCartoonizedImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public GenerateCartoonizedImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GenerateCartoonizedImageRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

}
