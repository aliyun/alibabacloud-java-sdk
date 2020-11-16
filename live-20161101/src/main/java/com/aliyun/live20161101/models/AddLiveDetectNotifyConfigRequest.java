// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDetectNotifyConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("NotifyUrl")
    @Validation(required = true)
    public String notifyUrl;

    public static AddLiveDetectNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDetectNotifyConfigRequest self = new AddLiveDetectNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDetectNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
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

}
