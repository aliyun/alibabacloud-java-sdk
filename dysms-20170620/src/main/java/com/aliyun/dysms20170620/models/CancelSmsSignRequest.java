// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CancelSmsSignRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignatureCode")
    public String signatureCode;

    @NameInMap("SignatureId")
    public Long signatureId;

    public static CancelSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSmsSignRequest self = new CancelSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CancelSmsSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelSmsSignRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CancelSmsSignRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CancelSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CancelSmsSignRequest setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
        return this;
    }
    public String getSignatureCode() {
        return this.signatureCode;
    }

    public CancelSmsSignRequest setSignatureId(Long signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public Long getSignatureId() {
        return this.signatureId;
    }

}
