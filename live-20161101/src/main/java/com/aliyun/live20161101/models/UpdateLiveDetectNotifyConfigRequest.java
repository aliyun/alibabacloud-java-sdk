// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDetectNotifyConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("NotifyUrl")
    @Validation(required = true)
    public String notifyUrl;

    public static UpdateLiveDetectNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveDetectNotifyConfigRequest self = new UpdateLiveDetectNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveDetectNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLiveDetectNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveDetectNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

}
