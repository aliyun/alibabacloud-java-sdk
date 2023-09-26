// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeSystemParametersRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSystemParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParametersRequest self = new DescribeSystemParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParametersRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
