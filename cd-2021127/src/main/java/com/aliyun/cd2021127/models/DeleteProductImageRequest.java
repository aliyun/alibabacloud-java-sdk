// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteProductImageRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductImageIds")
    public java.util.List<String> productImageIds;

    public static DeleteProductImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductImageRequest self = new DeleteProductImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductImageRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DeleteProductImageRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeleteProductImageRequest setProductImageIds(java.util.List<String> productImageIds) {
        this.productImageIds = productImageIds;
        return this;
    }
    public java.util.List<String> getProductImageIds() {
        return this.productImageIds;
    }

}
