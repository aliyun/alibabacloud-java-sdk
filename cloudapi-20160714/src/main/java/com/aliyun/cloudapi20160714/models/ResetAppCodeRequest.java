// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppCodeRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AppCode")
    public String appCode;

    public static ResetAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeRequest self = new ResetAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ResetAppCodeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

}
