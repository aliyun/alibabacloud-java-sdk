// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetGlobalCloudAccountSystemRolePolicyResponseBody extends TeaModel {
    /**
     * <p>The access policy document for the global cloud account system role (JSON character string).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The unique identifier of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGlobalCloudAccountSystemRolePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalCloudAccountSystemRolePolicyResponseBody self = new GetGlobalCloudAccountSystemRolePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGlobalCloudAccountSystemRolePolicyResponseBody setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public GetGlobalCloudAccountSystemRolePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
