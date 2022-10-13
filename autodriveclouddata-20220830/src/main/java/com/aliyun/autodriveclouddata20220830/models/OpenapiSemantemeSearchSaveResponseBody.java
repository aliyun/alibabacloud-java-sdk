// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSemantemeSearchSaveResponseBody extends TeaModel {
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

    public static OpenapiSemantemeSearchSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSemantemeSearchSaveResponseBody self = new OpenapiSemantemeSearchSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenapiSemantemeSearchSaveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenapiSemantemeSearchSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenapiSemantemeSearchSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenapiSemantemeSearchSaveResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public OpenapiSemantemeSearchSaveResponseBody setStackTraces(String stackTraces) {
        this.stackTraces = stackTraces;
        return this;
    }
    public String getStackTraces() {
        return this.stackTraces;
    }

    public OpenapiSemantemeSearchSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
