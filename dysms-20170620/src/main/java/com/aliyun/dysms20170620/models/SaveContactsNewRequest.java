// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SaveContactsNewRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OpenPkgWarning")
    public Integer openPkgWarning;

    @NameInMap("OpenPreventBrushWarning")
    public Integer openPreventBrushWarning;

    @NameInMap("OpenSendWarning")
    public Integer openSendWarning;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ReceiveSignTemplateAuditResult")
    public Integer receiveSignTemplateAuditResult;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VerificationCode")
    public String verificationCode;

    public static SaveContactsNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactsNewRequest self = new SaveContactsNewRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactsNewRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveContactsNewRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveContactsNewRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveContactsNewRequest setOpenPkgWarning(Integer openPkgWarning) {
        this.openPkgWarning = openPkgWarning;
        return this;
    }
    public Integer getOpenPkgWarning() {
        return this.openPkgWarning;
    }

    public SaveContactsNewRequest setOpenPreventBrushWarning(Integer openPreventBrushWarning) {
        this.openPreventBrushWarning = openPreventBrushWarning;
        return this;
    }
    public Integer getOpenPreventBrushWarning() {
        return this.openPreventBrushWarning;
    }

    public SaveContactsNewRequest setOpenSendWarning(Integer openSendWarning) {
        this.openSendWarning = openSendWarning;
        return this;
    }
    public Integer getOpenSendWarning() {
        return this.openSendWarning;
    }

    public SaveContactsNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SaveContactsNewRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SaveContactsNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SaveContactsNewRequest setReceiveSignTemplateAuditResult(Integer receiveSignTemplateAuditResult) {
        this.receiveSignTemplateAuditResult = receiveSignTemplateAuditResult;
        return this;
    }
    public Integer getReceiveSignTemplateAuditResult() {
        return this.receiveSignTemplateAuditResult;
    }

    public SaveContactsNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SaveContactsNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SaveContactsNewRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

}
