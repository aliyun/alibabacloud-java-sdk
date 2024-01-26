// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAoneAppAuditRequest extends TeaModel {
    @NameInMap("AoneAppName")
    public String aoneAppName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckAoneAppAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAoneAppAuditRequest self = new CheckAoneAppAuditRequest();
        return TeaModel.build(map, self);
    }

    public CheckAoneAppAuditRequest setAoneAppName(String aoneAppName) {
        this.aoneAppName = aoneAppName;
        return this;
    }
    public String getAoneAppName() {
        return this.aoneAppName;
    }

    public CheckAoneAppAuditRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
