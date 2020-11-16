// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotDetectPornConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    public static DeleteLiveSnapshotDetectPornConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotDetectPornConfigRequest self = new DeleteLiveSnapshotDetectPornConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotDetectPornConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveSnapshotDetectPornConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveSnapshotDetectPornConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
