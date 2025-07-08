// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillInfoLeafNewRequest extends TeaModel {
    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("ItemId")
    public String itemId;

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

    @NameInMap("SubjectItemId")
    public String subjectItemId;

    public static QueryMonthlyBillInfoLeafNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillInfoLeafNewRequest self = new QueryMonthlyBillInfoLeafNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillInfoLeafNewRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public QueryMonthlyBillInfoLeafNewRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryMonthlyBillInfoLeafNewRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public QueryMonthlyBillInfoLeafNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMonthlyBillInfoLeafNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryMonthlyBillInfoLeafNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMonthlyBillInfoLeafNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMonthlyBillInfoLeafNewRequest setSubjectItemId(String subjectItemId) {
        this.subjectItemId = subjectItemId;
        return this;
    }
    public String getSubjectItemId() {
        return this.subjectItemId;
    }

}
