// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlStockRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CustomAccount")
    public String customAccount;

    @NameInMap("ModuleCode")
    public String moduleCode;

    @NameInMap("OrderType")
    public String orderType;

    public static DescribeEnsSaleControlStockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlStockRequest self = new DescribeEnsSaleControlStockRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlStockRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public DescribeEnsSaleControlStockRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeEnsSaleControlStockRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public DescribeEnsSaleControlStockRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

    public DescribeEnsSaleControlStockRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
