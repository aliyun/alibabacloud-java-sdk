// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRequest self = new DescribeAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
