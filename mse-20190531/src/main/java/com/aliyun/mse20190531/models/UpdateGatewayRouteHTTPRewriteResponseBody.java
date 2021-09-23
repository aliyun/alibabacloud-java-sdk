// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHTTPRewriteResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public Long data;

    public static UpdateGatewayRouteHTTPRewriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHTTPRewriteResponseBody self = new UpdateGatewayRouteHTTPRewriteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateGatewayRouteHTTPRewriteResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
