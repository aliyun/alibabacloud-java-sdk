// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDetectNotifyConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddLiveDetectNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDetectNotifyConfigRequest self = new AddLiveDetectNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDetectNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveDetectNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public AddLiveDetectNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveDetectNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
