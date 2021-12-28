// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddProductImageShrinkRequest extends TeaModel {
    // 商品编号(ID)-必填
    @NameInMap("ProductId")
    public String productId;

    // 商品图片列表-必填
    @NameInMap("ProductImageList")
    public String productImageListShrink;

    public static AddProductImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductImageShrinkRequest self = new AddProductImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddProductImageShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddProductImageShrinkRequest setProductImageListShrink(String productImageListShrink) {
        this.productImageListShrink = productImageListShrink;
        return this;
    }
    public String getProductImageListShrink() {
        return this.productImageListShrink;
    }

}
