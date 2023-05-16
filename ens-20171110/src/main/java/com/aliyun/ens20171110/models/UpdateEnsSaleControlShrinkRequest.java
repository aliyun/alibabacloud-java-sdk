// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateEnsSaleControlShrinkRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("SaleControls")
    public String saleControlsShrink;

    public static UpdateEnsSaleControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnsSaleControlShrinkRequest self = new UpdateEnsSaleControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnsSaleControlShrinkRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public UpdateEnsSaleControlShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpdateEnsSaleControlShrinkRequest setSaleControlsShrink(String saleControlsShrink) {
        this.saleControlsShrink = saleControlsShrink;
        return this;
    }
    public String getSaleControlsShrink() {
        return this.saleControlsShrink;
    }

}
