// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyPolicyResponseBody extends TeaModel {
    /**
     * <p>The access key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The network access restriction policy. The value is a JSON string. For more information, see the AccessKeyPolicy structure description in the SetAccessKeyPolicy documentation.</p>
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
     * <p>4B450CA1-36E8-4AA2-8461-86B42BF4CC4E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyPolicyResponseBody self = new GetAccessKeyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyPolicyResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetAccessKeyPolicyResponseBody setAccessKeyPolicy(String accessKeyPolicy) {
        this.accessKeyPolicy = accessKeyPolicy;
        return this;
    }
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    public GetAccessKeyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
