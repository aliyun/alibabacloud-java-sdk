// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateInstanceTableResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 消息
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // result
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static CreateInstanceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTableResponseBody self = new CreateInstanceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstanceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceTableResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
