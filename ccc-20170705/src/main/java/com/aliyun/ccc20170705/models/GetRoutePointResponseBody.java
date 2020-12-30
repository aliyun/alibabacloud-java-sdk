// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRoutePointResponseBody extends TeaModel {
    @NameInMap("StatusDesc")
    public String statusDesc;

    @NameInMap("RoutePoint")
    public String routePoint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("StatusCode")
    public String statusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetRoutePointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutePointResponseBody self = new GetRoutePointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutePointResponseBody setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public GetRoutePointResponseBody setRoutePoint(String routePoint) {
        this.routePoint = routePoint;
        return this;
    }
    public String getRoutePoint() {
        return this.routePoint;
    }

    public GetRoutePointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutePointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRoutePointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRoutePointResponseBody setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public GetRoutePointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRoutePointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
