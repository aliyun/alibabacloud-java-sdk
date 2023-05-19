// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyResponseBody extends TeaModel {
    /**
     * <p>The name of the protection policy. The name can be up to 64 characters in length and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Specifies whether to set the current policy as the default policy. Valid values:</p>
     * <br>
     * <p>*   default: sets the current policy as the default policy.</p>
     * <p>*   custom: does not set the current policy as the default policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafPolicyResponseBody self = new CreateDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafPolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
