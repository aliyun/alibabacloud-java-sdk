// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class UpdateInstanceTableResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // message
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // result
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static UpdateInstanceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceTableResponseBody self = new UpdateInstanceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceTableResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
