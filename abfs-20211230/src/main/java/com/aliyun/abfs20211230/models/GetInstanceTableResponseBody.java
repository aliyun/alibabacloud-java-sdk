// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class GetInstanceTableResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetInstanceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTableResponseBody self = new GetInstanceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceTableResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
