// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PauseEventStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Boolean code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PauseEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseEventStreamingResponseBody self = new PauseEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseEventStreamingResponseBody setCode(Boolean code) {
        this.code = code;
        return this;
    }
    public Boolean getCode() {
        return this.code;
    }

    public PauseEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
