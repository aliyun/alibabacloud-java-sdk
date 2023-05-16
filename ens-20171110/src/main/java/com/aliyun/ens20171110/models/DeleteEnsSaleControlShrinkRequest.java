// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleControlShrinkRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("SaleControls")
    public String saleControlsShrink;

    public static DeleteEnsSaleControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleControlShrinkRequest self = new DeleteEnsSaleControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleControlShrinkRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public DeleteEnsSaleControlShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DeleteEnsSaleControlShrinkRequest setSaleControlsShrink(String saleControlsShrink) {
        this.saleControlsShrink = saleControlsShrink;
        return this;
    }
    public String getSaleControlsShrink() {
        return this.saleControlsShrink;
    }

}
