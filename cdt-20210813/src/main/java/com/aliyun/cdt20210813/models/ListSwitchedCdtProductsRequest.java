// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListSwitchedCdtProductsRequest extends TeaModel {
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    @NameInMap("Product")
    public String product;

    public static ListSwitchedCdtProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSwitchedCdtProductsRequest self = new ListSwitchedCdtProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListSwitchedCdtProductsRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

    public ListSwitchedCdtProductsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
