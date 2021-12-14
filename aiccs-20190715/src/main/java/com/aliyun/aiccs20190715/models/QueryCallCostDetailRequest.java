// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCallCostDetailRequest extends TeaModel {
    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubjectItemId")
    public String subjectItemId;

    public static QueryCallCostDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallCostDetailRequest self = new QueryCallCostDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallCostDetailRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public QueryCallCostDetailRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryCallCostDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCallCostDetailRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryCallCostDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCallCostDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCallCostDetailRequest setSubjectItemId(String subjectItemId) {
        this.subjectItemId = subjectItemId;
        return this;
    }
    public String getSubjectItemId() {
        return this.subjectItemId;
    }

}
