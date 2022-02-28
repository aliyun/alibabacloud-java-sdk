// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServiceDependencyStatusRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeServiceDependencyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDependencyStatusRequest self = new DescribeServiceDependencyStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDependencyStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
