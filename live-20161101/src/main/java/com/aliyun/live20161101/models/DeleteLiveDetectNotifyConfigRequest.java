// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDetectNotifyConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DeleteLiveDetectNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDetectNotifyConfigRequest self = new DeleteLiveDetectNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDetectNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveDetectNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
