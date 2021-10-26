// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceResponseBody extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SingleCallByVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceResponseBody self = new SingleCallByVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleCallByVoiceResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SingleCallByVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SingleCallByVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SingleCallByVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
