// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterInfoRequest extends TeaModel {
    @NameInMap("InstanceClusterName")
    public String instanceClusterName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeInstanceClusterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterInfoRequest self = new DescribeInstanceClusterInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterInfoRequest setInstanceClusterName(String instanceClusterName) {
        this.instanceClusterName = instanceClusterName;
        return this;
    }
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    public DescribeInstanceClusterInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
