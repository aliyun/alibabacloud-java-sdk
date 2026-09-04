// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-9cdjz6o8ha70******</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    public static CreateSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityPolicyResponseBody self = new CreateSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityPolicyResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

}
