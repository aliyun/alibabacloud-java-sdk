// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeSystemParamsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSystemParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParamsRequest self = new DescribeSystemParamsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParamsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
