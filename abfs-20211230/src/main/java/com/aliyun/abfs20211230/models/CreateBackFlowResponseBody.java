// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateBackFlowResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 错误消息
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // result
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static CreateBackFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackFlowResponseBody self = new CreateBackFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBackFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBackFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackFlowResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
