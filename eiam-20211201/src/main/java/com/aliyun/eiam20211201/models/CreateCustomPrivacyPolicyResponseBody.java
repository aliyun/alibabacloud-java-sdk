// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomPrivacyPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pp_neagxpoznsjdtxxxxx</p>
     */
    @NameInMap("CustomPrivacyPolicyId")
    public String customPrivacyPolicyId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomPrivacyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomPrivacyPolicyResponseBody self = new CreateCustomPrivacyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomPrivacyPolicyResponseBody setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
        this.customPrivacyPolicyId = customPrivacyPolicyId;
        return this;
    }
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    public CreateCustomPrivacyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
