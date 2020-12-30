// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureAttributeRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeFurnitureAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureAttributeRequest self = new RecognizeFurnitureAttributeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureAttributeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
