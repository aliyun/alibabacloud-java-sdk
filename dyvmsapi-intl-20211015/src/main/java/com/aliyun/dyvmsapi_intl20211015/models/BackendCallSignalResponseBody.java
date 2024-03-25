// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallSignalResponseBody extends TeaModel {
    /**
     * <p>The unique receipt ID for the call. You can use this ID to query the details of a single call.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>The value OK indicates that the request was successful. Other values indicate that the request failed. For more information, see Error codes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BackendCallSignalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackendCallSignalResponseBody self = new BackendCallSignalResponseBody();
        return TeaModel.build(map, self);
    }

    public BackendCallSignalResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public BackendCallSignalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BackendCallSignalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BackendCallSignalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
