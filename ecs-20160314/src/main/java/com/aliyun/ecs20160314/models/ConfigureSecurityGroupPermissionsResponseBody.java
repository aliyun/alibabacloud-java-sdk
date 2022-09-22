// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ConfigureSecurityGroupPermissionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigureSecurityGroupPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSecurityGroupPermissionsResponseBody self = new ConfigureSecurityGroupPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureSecurityGroupPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
