// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppCodeRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("NewAppCode")
    public String newAppCode;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ResetAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeRequest self = new ResetAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ResetAppCodeRequest setNewAppCode(String newAppCode) {
        this.newAppCode = newAppCode;
        return this;
    }
    public String getNewAppCode() {
        return this.newAppCode;
    }

    public ResetAppCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
