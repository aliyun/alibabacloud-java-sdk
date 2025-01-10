// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DetachElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission to do this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachElasticNetworkInterfaceResponseBody self = new DetachElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DetachElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetachElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
