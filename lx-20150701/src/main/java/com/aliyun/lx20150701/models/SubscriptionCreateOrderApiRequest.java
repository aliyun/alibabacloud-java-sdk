// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class SubscriptionCreateOrderApiRequest extends TeaModel {
    @NameInMap("ownerId")
    public String ownerId;

    @NameInMap("productCode")
    public String productCode;

    public static SubscriptionCreateOrderApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionCreateOrderApiRequest self = new SubscriptionCreateOrderApiRequest();
        return TeaModel.build(map, self);
    }

    public SubscriptionCreateOrderApiRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubscriptionCreateOrderApiRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
