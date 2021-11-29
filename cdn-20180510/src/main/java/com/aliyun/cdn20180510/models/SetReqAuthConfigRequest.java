// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqAuthConfigRequest extends TeaModel {
    @NameInMap("AuthRemoteDesc")
    public String authRemoteDesc;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Key1")
    public String key1;

    @NameInMap("Key2")
    public String key2;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TimeOut")
    public String timeOut;

    public static SetReqAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetReqAuthConfigRequest self = new SetReqAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetReqAuthConfigRequest setAuthRemoteDesc(String authRemoteDesc) {
        this.authRemoteDesc = authRemoteDesc;
        return this;
    }
    public String getAuthRemoteDesc() {
        return this.authRemoteDesc;
    }

    public SetReqAuthConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SetReqAuthConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetReqAuthConfigRequest setKey1(String key1) {
        this.key1 = key1;
        return this;
    }
    public String getKey1() {
        return this.key1;
    }

    public SetReqAuthConfigRequest setKey2(String key2) {
        this.key2 = key2;
        return this;
    }
    public String getKey2() {
        return this.key2;
    }

    public SetReqAuthConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetReqAuthConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetReqAuthConfigRequest setTimeOut(String timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public String getTimeOut() {
        return this.timeOut;
    }

}
