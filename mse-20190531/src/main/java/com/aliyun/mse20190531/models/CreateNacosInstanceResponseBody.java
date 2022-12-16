// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosInstanceResponseBody extends TeaModel {
    // The message returned.
    @NameInMap("Code")
    public Integer code;

    // Indicates whether the request is successful.
    @NameInMap("Data")
    public String data;

    // The data structure.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The ID of the request.
    @NameInMap("Message")
    public String message;

    // The HTTP status code returned.
    @NameInMap("RequestId")
    public String requestId;

    // The status code returned.
    @NameInMap("Success")
    public Boolean success;

    public static CreateNacosInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosInstanceResponseBody self = new CreateNacosInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNacosInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateNacosInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateNacosInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateNacosInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNacosInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNacosInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
