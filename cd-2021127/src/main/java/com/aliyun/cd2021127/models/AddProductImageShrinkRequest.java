// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddProductImageShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("ProductImageList")
    public String productImageListShrink;

    @NameInMap("ProductName")
    public String productName;

    public static AddProductImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductImageShrinkRequest self = new AddProductImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddProductImageShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
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

    public AddProductImageShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
