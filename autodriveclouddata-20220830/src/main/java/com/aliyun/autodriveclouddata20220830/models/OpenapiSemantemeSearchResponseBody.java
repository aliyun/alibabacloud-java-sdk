// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSemantemeSearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Object data;

    @NameInMap("stackTraces")
    public String stackTraces;

    @NameInMap("success")
    public Boolean success;

    public static OpenapiSemantemeSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSemantemeSearchResponseBody self = new OpenapiSemantemeSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenapiSemantemeSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenapiSemantemeSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenapiSemantemeSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenapiSemantemeSearchResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public OpenapiSemantemeSearchResponseBody setStackTraces(String stackTraces) {
        this.stackTraces = stackTraces;
        return this;
    }
    public String getStackTraces() {
        return this.stackTraces;
    }

    public OpenapiSemantemeSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
