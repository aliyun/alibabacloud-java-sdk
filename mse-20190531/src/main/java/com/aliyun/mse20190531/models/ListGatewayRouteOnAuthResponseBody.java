// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteOnAuthResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListGatewayRouteOnAuthResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayRouteOnAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteOnAuthResponseBody self = new ListGatewayRouteOnAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteOnAuthResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayRouteOnAuthResponseBody setData(java.util.List<ListGatewayRouteOnAuthResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGatewayRouteOnAuthResponseBodyData> getData() {
        return this.data;
    }

    public ListGatewayRouteOnAuthResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayRouteOnAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayRouteOnAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayRouteOnAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates self = new ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayRouteOnAuthResponseBodyDataRoutePredicates extends TeaModel {
        @NameInMap("PathPredicates")
        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        public static ListGatewayRouteOnAuthResponseBodyDataRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteOnAuthResponseBodyDataRoutePredicates self = new ListGatewayRouteOnAuthResponseBodyDataRoutePredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicates setPathPredicates(ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

    }

    public static class ListGatewayRouteOnAuthResponseBodyData extends TeaModel {
        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RoutePredicates")
        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicates routePredicates;

        public static ListGatewayRouteOnAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteOnAuthResponseBodyData self = new ListGatewayRouteOnAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteOnAuthResponseBodyData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public ListGatewayRouteOnAuthResponseBodyData setDomainIdList(java.util.List<Long> domainIdList) {
            this.domainIdList = domainIdList;
            return this;
        }
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        public ListGatewayRouteOnAuthResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGatewayRouteOnAuthResponseBodyData setDomainNameList(java.util.List<String> domainNameList) {
            this.domainNameList = domainNameList;
            return this;
        }
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        public ListGatewayRouteOnAuthResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayRouteOnAuthResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayRouteOnAuthResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListGatewayRouteOnAuthResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteOnAuthResponseBodyData setRoutePredicates(ListGatewayRouteOnAuthResponseBodyDataRoutePredicates routePredicates) {
            this.routePredicates = routePredicates;
            return this;
        }
        public ListGatewayRouteOnAuthResponseBodyDataRoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

    }

}
