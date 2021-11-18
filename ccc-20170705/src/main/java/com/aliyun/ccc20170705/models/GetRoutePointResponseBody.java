// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRoutePointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoutePoint")
    public String routePoint;

    @NameInMap("StatusCode")
    public String statusCode;

    @NameInMap("StatusDesc")
    public String statusDesc;

    @NameInMap("Success")
    public Boolean success;

    public static GetRoutePointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutePointResponseBody self = new GetRoutePointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutePointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRoutePointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRoutePointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRoutePointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutePointResponseBody setRoutePoint(String routePoint) {
        this.routePoint = routePoint;
        return this;
    }
    public String getRoutePoint() {
        return this.routePoint;
    }

    public GetRoutePointResponseBody setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public GetRoutePointResponseBody setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public GetRoutePointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
