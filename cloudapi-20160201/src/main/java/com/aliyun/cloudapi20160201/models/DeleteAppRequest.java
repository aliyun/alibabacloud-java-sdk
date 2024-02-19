// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
