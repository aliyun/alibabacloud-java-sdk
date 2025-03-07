// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static CreateMediaLiveInputSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputSecurityGroupResponseBody self = new CreateMediaLiveInputSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaLiveInputSecurityGroupResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
