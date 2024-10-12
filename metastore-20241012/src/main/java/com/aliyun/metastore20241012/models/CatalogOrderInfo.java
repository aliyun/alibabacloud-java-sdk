// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class CatalogOrderInfo extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    public static CatalogOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        CatalogOrderInfo self = new CatalogOrderInfo();
        return TeaModel.build(map, self);
    }

    public CatalogOrderInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
