// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteLogConfigRequest extends TeaModel {
    @NameInMap("LogType")
    public String logType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogConfigRequest self = new DeleteLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DeleteLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
