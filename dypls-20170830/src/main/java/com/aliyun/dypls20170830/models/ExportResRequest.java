// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ExportResRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResBindStatus")
    public Integer resBindStatus;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    public static ExportResRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportResRequest self = new ExportResRequest();
        return TeaModel.build(map, self);
    }

    public ExportResRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public ExportResRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExportResRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ExportResRequest setResBindStatus(Integer resBindStatus) {
        this.resBindStatus = resBindStatus;
        return this;
    }
    public Integer getResBindStatus() {
        return this.resBindStatus;
    }

    public ExportResRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public ExportResRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExportResRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExportResRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
