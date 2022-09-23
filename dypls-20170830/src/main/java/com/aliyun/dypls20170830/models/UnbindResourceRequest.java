// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UnbindResourceRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BindIds")
    public String bindIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    public static UnbindResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindResourceRequest self = new UnbindResourceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindResourceRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public UnbindResourceRequest setBindIds(String bindIds) {
        this.bindIds = bindIds;
        return this;
    }
    public String getBindIds() {
        return this.bindIds;
    }

    public UnbindResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindResourceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public UnbindResourceRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public UnbindResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindResourceRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
