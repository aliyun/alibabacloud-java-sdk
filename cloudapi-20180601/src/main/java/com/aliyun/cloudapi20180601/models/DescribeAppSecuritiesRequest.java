// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeAppSecuritiesRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAppSecuritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecuritiesRequest self = new DescribeAppSecuritiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecuritiesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppSecuritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
