// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayRouteResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public DeleteGatewayRouteResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRouteResponseBody self = new DeleteGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRouteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGatewayRouteResponseBody setData(DeleteGatewayRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGatewayRouteResponseBodyData getData() {
        return this.data;
    }

    public DeleteGatewayRouteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewayRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGatewayRouteResponseBodyData extends TeaModel {
        // The ID of the default service.
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The time when the route was created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the route was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // ID.
        @NameInMap("Id")
        public Long id;

        // The name of the route.
        @NameInMap("Name")
        public String name;

        // The matching rules of the route.
        @NameInMap("Predicates")
        public String predicates;

        // The sequence number of the route.
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        // The status of the route.
        @NameInMap("Status")
        public Integer status;

        public static DeleteGatewayRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayRouteResponseBodyData self = new DeleteGatewayRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayRouteResponseBodyData setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public DeleteGatewayRouteResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteGatewayRouteResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteGatewayRouteResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteGatewayRouteResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteGatewayRouteResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGatewayRouteResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGatewayRouteResponseBodyData setPredicates(String predicates) {
            this.predicates = predicates;
            return this;
        }
        public String getPredicates() {
            return this.predicates;
        }

        public DeleteGatewayRouteResponseBodyData setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public DeleteGatewayRouteResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
