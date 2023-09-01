// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosInstanceResponseBody extends TeaModel {
    /**
     * <p>The result returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>mse-200-105</p>
     */
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
