// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyPolicyForAccountResponseBody extends TeaModel {
    /**
     * <p>The network access restriction policy. The value is a JSON-formatted string. For more information about the AccessKeyPolicy structure, see the SetAccessKeyPolicy documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Status&quot;:&quot;Inactive&quot;,&quot;Statements&quot;:[{&quot;Value&quot;:&quot;AllowAllVPC&quot;,&quot;Type&quot;:&quot;VPCWhiteList&quot;,&quot;IPList&quot;:[&quot;::/0&quot;,&quot;0.0.0.0/0&quot;]}]}</p>
     */
    @NameInMap("AccessKeyPolicy")
    public String accessKeyPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85836703-8D4F-485F-9726-4D1C730F957E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyPolicyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyPolicyForAccountResponseBody self = new GetAccessKeyPolicyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyPolicyForAccountResponseBody setAccessKeyPolicy(String accessKeyPolicy) {
        this.accessKeyPolicy = accessKeyPolicy;
        return this;
    }
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    public GetAccessKeyPolicyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
