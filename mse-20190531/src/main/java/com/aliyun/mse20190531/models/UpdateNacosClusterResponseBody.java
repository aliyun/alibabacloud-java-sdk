// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterResponseBody extends TeaModel {
    // The response code returned.
    @NameInMap("Code")
    public Integer code;

    // The result returned.
    @NameInMap("Data")
    public String data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful.
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNacosClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterResponseBody self = new UpdateNacosClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateNacosClusterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateNacosClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateNacosClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNacosClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNacosClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
