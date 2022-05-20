// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventLatencyInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetEventLatencyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventLatencyInfoResponseBody self = new GetEventLatencyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventLatencyInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEventLatencyInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetEventLatencyInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventLatencyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventLatencyInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
