// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryBillingStatisticsRequest extends TeaModel {
    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("ItemName")
    public String itemName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryBillingStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingStatisticsRequest self = new QueryBillingStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillingStatisticsRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public QueryBillingStatisticsRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public QueryBillingStatisticsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryBillingStatisticsRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryBillingStatisticsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryBillingStatisticsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
