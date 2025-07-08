// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SendSmsTestRequest extends TeaModel {
    @NameInMap("NcToken")
    public String ncToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RemoteIp")
    public String remoteIp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Sig")
    public String sig;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    @NameInMap("TestType")
    public String testType;

    public static SendSmsTestRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsTestRequest self = new SendSmsTestRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsTestRequest setNcToken(String ncToken) {
        this.ncToken = ncToken;
        return this;
    }
    public String getNcToken() {
        return this.ncToken;
    }

    public SendSmsTestRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendSmsTestRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SendSmsTestRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SendSmsTestRequest setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public SendSmsTestRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendSmsTestRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendSmsTestRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendSmsTestRequest setSig(String sig) {
        this.sig = sig;
        return this;
    }
    public String getSig() {
        return this.sig;
    }

    public SendSmsTestRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsTestRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendSmsTestRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendSmsTestRequest setTestType(String testType) {
        this.testType = testType;
        return this;
    }
    public String getTestType() {
        return this.testType;
    }

}
