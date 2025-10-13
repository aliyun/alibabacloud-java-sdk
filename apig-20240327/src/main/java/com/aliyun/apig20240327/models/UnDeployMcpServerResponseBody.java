// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UnDeployMcpServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UnDeployMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnDeployMcpServerResponseBody self = new UnDeployMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public UnDeployMcpServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnDeployMcpServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnDeployMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
