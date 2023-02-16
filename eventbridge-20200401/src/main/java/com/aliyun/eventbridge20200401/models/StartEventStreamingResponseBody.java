// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class StartEventStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Boolean code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartEventStreamingResponseBody self = new StartEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public StartEventStreamingResponseBody setCode(Boolean code) {
        this.code = code;
        return this;
    }
    public Boolean getCode() {
        return this.code;
    }

    public StartEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
