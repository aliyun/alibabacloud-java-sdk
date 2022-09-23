// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillInfoRequest extends TeaModel {
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

    public static QueryMonthlyBillInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillInfoRequest self = new QueryMonthlyBillInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillInfoRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public QueryMonthlyBillInfoRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryMonthlyBillInfoRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public QueryMonthlyBillInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMonthlyBillInfoRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryMonthlyBillInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMonthlyBillInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMonthlyBillInfoRequest setSubjectItemId(String subjectItemId) {
        this.subjectItemId = subjectItemId;
        return this;
    }
    public String getSubjectItemId() {
        return this.subjectItemId;
    }

}
