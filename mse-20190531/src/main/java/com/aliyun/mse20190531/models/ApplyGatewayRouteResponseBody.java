// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyGatewayRouteResponseBody extends TeaModel {
    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ApplyGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyGatewayRouteResponseBody self = new ApplyGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyGatewayRouteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApplyGatewayRouteResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ApplyGatewayRouteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApplyGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyGatewayRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
