// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKeyPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: [&quot;kms:<em>&quot;],&quot;Effect&quot;: &quot;Allow&quot;,&quot;Principal&quot;: {&quot;RAM&quot;: [&quot;acs:ram::190325303126</em><strong><em>:</em>&quot;,&quot;acs:ram::119285303511</strong>**:<em>&quot;]},&quot;Resource&quot;: [&quot;</em>&quot;],&quot;Sid&quot;: &quot;kms default key policy&quot;}],&quot;Version&quot;: &quot;1&quot; }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>381D5D33-BB8F-395F-8EE4-AE3B84B523C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetKeyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeyPolicyResponseBody self = new GetKeyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeyPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetKeyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
