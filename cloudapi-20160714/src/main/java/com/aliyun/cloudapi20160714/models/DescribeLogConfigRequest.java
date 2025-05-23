// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigRequest extends TeaModel {
    /**
     * <p>The log type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PROVIDER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROVIDER</p>
     */
    @NameInMap("LogType")
    public String logType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigRequest self = new DescribeLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
