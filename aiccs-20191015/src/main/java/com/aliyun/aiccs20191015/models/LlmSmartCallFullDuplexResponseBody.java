// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallFullDuplexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>153955119976^140696759976</p>
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
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LlmSmartCallFullDuplexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallFullDuplexResponseBody self = new LlmSmartCallFullDuplexResponseBody();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallFullDuplexResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public LlmSmartCallFullDuplexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LlmSmartCallFullDuplexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LlmSmartCallFullDuplexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
