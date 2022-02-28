// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusRequest self = new DescribeServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
