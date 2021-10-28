// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DescribeRecordDataRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Acid")
    public String acid;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecLevel")
    public Integer secLevel;

    public static DescribeRecordDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataRequest self = new DescribeRecordDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeRecordDataRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DescribeRecordDataRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public DescribeRecordDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRecordDataRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DescribeRecordDataRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRecordDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRecordDataRequest setSecLevel(Integer secLevel) {
        this.secLevel = secLevel;
        return this;
    }
    public Integer getSecLevel() {
        return this.secLevel;
    }

}
