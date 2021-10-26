// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("LogType")
    public String logType;

    public static DescribeLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigRequest self = new DescribeLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

}
