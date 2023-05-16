// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleConditionControlShrinkRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("SaleControls")
    public String saleControlsShrink;

    public static DeleteEnsSaleConditionControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleConditionControlShrinkRequest self = new DeleteEnsSaleConditionControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleConditionControlShrinkRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public DeleteEnsSaleConditionControlShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DeleteEnsSaleConditionControlShrinkRequest setSaleControlsShrink(String saleControlsShrink) {
        this.saleControlsShrink = saleControlsShrink;
        return this;
    }
    public String getSaleControlsShrink() {
        return this.saleControlsShrink;
    }

}
