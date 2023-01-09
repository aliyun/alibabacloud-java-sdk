// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The data of the node.
    @NameInMap("Data")
    public Long data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. true: The request was successful. false: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static UpdateGatewayRouteTimeoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTimeoutResponseBody self = new UpdateGatewayRouteTimeoutResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTimeoutResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGatewayRouteTimeoutResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateGatewayRouteTimeoutResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayRouteTimeoutResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayRouteTimeoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayRouteTimeoutResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
