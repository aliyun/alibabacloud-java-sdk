// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetAccessKeyPolicyForAccountResponseBody extends TeaModel {
    /**
     * <p>The network access restriction policy. The value is a JSON-formatted string. For more information, see the AccessKeyPolicy structure description in the SetAccessKeyPolicy documentation.</p>
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
     * <p>6616F09B-2768-4C11-8866-A8EE4C4A583E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessKeyPolicyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessKeyPolicyForAccountResponseBody self = new SetAccessKeyPolicyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessKeyPolicyForAccountResponseBody setAccessKeyPolicy(String accessKeyPolicy) {
        this.accessKeyPolicy = accessKeyPolicy;
        return this;
    }
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    public SetAccessKeyPolicyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
