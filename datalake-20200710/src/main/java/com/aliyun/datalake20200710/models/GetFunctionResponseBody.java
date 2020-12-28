// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    @NameInMap("Function")
    public Function function;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static GetFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponseBody self = new GetFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionResponseBody setFunction(Function function) {
        this.function = function;
        return this;
    }
    public Function getFunction() {
        return this.function;
    }

    public GetFunctionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
