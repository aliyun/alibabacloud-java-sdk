// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtProductsRequest extends TeaModel {
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    @NameInMap("Product")
    public String product;

    public static ListCdtProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdtProductsRequest self = new ListCdtProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListCdtProductsRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

    public ListCdtProductsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
