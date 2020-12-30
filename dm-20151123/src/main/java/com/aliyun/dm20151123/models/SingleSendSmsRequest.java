// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendSmsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("RecNum")
    public String recNum;

    @NameInMap("ParamString")
    public String paramString;

    @NameInMap("Version")
    public String version;

    public static SingleSendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleSendSmsRequest self = new SingleSendSmsRequest();
        return TeaModel.build(map, self);
    }

    public SingleSendSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleSendSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleSendSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleSendSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SingleSendSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SingleSendSmsRequest setRecNum(String recNum) {
        this.recNum = recNum;
        return this;
    }
    public String getRecNum() {
        return this.recNum;
    }

    public SingleSendSmsRequest setParamString(String paramString) {
        this.paramString = paramString;
        return this;
    }
    public String getParamString() {
        return this.paramString;
    }

    public SingleSendSmsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
