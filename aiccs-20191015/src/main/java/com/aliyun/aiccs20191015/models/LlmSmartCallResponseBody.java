// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>125165515<em><strong>^11195613</strong></em>*</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-XX13-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LlmSmartCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallResponseBody self = new LlmSmartCallResponseBody();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public LlmSmartCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LlmSmartCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LlmSmartCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
