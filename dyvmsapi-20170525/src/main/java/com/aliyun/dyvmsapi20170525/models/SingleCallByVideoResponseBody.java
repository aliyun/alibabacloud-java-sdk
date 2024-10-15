// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVideoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>116012354148^10281378****</p>
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
     * <strong>example:</strong>
     * <p>a78278ff-26bb-48ec-805c-26a0f4c102***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SingleCallByVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVideoResponseBody self = new SingleCallByVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleCallByVideoResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SingleCallByVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SingleCallByVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SingleCallByVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
