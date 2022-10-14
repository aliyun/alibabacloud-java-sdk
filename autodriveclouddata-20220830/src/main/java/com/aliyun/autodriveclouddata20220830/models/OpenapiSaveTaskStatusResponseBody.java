// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSaveTaskStatusResponseBody extends TeaModel {
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

    public static OpenapiSaveTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSaveTaskStatusResponseBody self = new OpenapiSaveTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenapiSaveTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenapiSaveTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenapiSaveTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenapiSaveTaskStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public OpenapiSaveTaskStatusResponseBody setStackTraces(String stackTraces) {
        this.stackTraces = stackTraces;
        return this;
    }
    public String getStackTraces() {
        return this.stackTraces;
    }

    public OpenapiSaveTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
