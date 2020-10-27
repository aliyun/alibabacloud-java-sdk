// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    public static CreateSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupResponse self = new CreateSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityGroupResponse setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
