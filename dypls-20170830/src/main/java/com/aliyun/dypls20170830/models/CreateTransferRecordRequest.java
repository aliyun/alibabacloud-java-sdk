// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateTransferRecordRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("NumberList")
    public String numberList;

    @NameInMap("OriginBillId")
    public String originBillId;

    @NameInMap("OriginName")
    public String originName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TargetBillId")
    public String targetBillId;

    @NameInMap("TargetName")
    public String targetName;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("TransferType")
    public Integer transferType;

    public static CreateTransferRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransferRecordRequest self = new CreateTransferRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransferRecordRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateTransferRecordRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public CreateTransferRecordRequest setOriginBillId(String originBillId) {
        this.originBillId = originBillId;
        return this;
    }
    public String getOriginBillId() {
        return this.originBillId;
    }

    public CreateTransferRecordRequest setOriginName(String originName) {
        this.originName = originName;
        return this;
    }
    public String getOriginName() {
        return this.originName;
    }

    public CreateTransferRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransferRecordRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateTransferRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransferRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransferRecordRequest setTargetBillId(String targetBillId) {
        this.targetBillId = targetBillId;
        return this;
    }
    public String getTargetBillId() {
        return this.targetBillId;
    }

    public CreateTransferRecordRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CreateTransferRecordRequest setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public CreateTransferRecordRequest setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }
    public Integer getTransferType() {
        return this.transferType;
    }

}
