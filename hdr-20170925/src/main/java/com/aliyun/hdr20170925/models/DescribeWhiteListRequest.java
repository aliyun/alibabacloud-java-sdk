// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeWhiteListRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListRequest self = new DescribeWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
