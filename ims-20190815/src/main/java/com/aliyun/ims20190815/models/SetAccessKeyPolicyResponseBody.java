// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetAccessKeyPolicyResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The network access restriction policy.</p>
     * <p>A JSON-formatted string. For more information, see the AccessKeyPolicy structure description.</p>
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
     * <p>30C9068D-FBAA-4998-9986-8A562FED0BC3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessKeyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessKeyPolicyResponseBody self = new SetAccessKeyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessKeyPolicyResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public SetAccessKeyPolicyResponseBody setAccessKeyPolicy(String accessKeyPolicy) {
        this.accessKeyPolicy = accessKeyPolicy;
        return this;
    }
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    public SetAccessKeyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
