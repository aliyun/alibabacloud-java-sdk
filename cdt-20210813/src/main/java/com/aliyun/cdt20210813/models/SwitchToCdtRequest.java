// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class SwitchToCdtRequest extends TeaModel {
    @NameInMap("BillingType")
    public String billingType;

    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    @NameInMap("Product")
    public String product;

    public static SwitchToCdtRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchToCdtRequest self = new SwitchToCdtRequest();
        return TeaModel.build(map, self);
    }

    public SwitchToCdtRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public SwitchToCdtRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

    public SwitchToCdtRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
