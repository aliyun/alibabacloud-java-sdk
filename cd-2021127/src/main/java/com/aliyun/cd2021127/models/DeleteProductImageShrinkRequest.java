// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteProductImageShrinkRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductImageIds")
    public String productImageIdsShrink;

    public static DeleteProductImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductImageShrinkRequest self = new DeleteProductImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductImageShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeleteProductImageShrinkRequest setProductImageIdsShrink(String productImageIdsShrink) {
        this.productImageIdsShrink = productImageIdsShrink;
        return this;
    }
    public String getProductImageIdsShrink() {
        return this.productImageIdsShrink;
    }

}
