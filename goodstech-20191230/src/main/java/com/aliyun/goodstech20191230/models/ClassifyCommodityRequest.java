// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static ClassifyCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityRequest self = new ClassifyCommodityRequest();
        return TeaModel.build(map, self);
    }

    public ClassifyCommodityRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
