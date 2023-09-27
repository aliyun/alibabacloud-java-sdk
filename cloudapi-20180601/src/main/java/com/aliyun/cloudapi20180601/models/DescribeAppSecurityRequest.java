// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAppSecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityRequest self = new DescribeAppSecurityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppSecurityRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
