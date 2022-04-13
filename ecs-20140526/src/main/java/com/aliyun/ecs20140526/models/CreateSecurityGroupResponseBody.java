// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static CreateSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupResponseBody self = new CreateSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityGroupResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
