// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfoListResult extends TeaModel {
    @NameInMap("productSaleInfos")
    public java.util.List<ProductSaleInfo> productSaleInfos;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ProductSaleInfoListResult build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfoListResult self = new ProductSaleInfoListResult();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfoListResult setProductSaleInfos(java.util.List<ProductSaleInfo> productSaleInfos) {
        this.productSaleInfos = productSaleInfos;
        return this;
    }
    public java.util.List<ProductSaleInfo> getProductSaleInfos() {
        return this.productSaleInfos;
    }

    public ProductSaleInfoListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
