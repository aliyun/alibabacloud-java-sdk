// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateEnsSaleControlShrinkRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CustomAccount")
    public String customAccount;

    /**
     * <p>This parameter is required.</p>
     */
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

    public UpdateEnsSaleControlShrinkRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public UpdateEnsSaleControlShrinkRequest setSaleControlsShrink(String saleControlsShrink) {
        this.saleControlsShrink = saleControlsShrink;
        return this;
    }
    public String getSaleControlsShrink() {
        return this.saleControlsShrink;
    }

}
