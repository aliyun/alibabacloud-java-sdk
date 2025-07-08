// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSignRequest extends TeaModel {
    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("FileIds")
    public String fileIds;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("ServiceType")
    public Integer serviceType;

    @NameInMap("SignName")
    public String signName;

    public static CreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignRequest self = new CreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateSmsSignRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public CreateSmsSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public CreateSmsSignRequest setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

    public CreateSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
