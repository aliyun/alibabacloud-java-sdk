// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsSaleControlShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaleControls")
    public String saleControlsShrink;

    public static CreateEnsSaleControlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsSaleControlShrinkRequest self = new CreateEnsSaleControlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsSaleControlShrinkRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public CreateEnsSaleControlShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateEnsSaleControlShrinkRequest setSaleControlsShrink(String saleControlsShrink) {
        this.saleControlsShrink = saleControlsShrink;
        return this;
    }
    public String getSaleControlsShrink() {
        return this.saleControlsShrink;
    }

}
