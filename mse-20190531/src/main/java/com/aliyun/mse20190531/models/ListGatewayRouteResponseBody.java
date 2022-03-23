// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListGatewayRouteResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteResponseBody self = new ListGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayRouteResponseBody setData(ListGatewayRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayRouteResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayRouteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayRouteResponseBodyDataResultComment extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static ListGatewayRouteResponseBodyDataResultComment build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultComment self = new ListGatewayRouteResponseBodyDataResultComment();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultComment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultDirectResponse extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Code")
        public Integer code;

        public static ListGatewayRouteResponseBodyDataResultDirectResponse build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultDirectResponse self = new ListGatewayRouteResponseBodyDataResultDirectResponse();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultDirectResponse setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListGatewayRouteResponseBodyDataResultDirectResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRedirect extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        public static ListGatewayRouteResponseBodyDataResultRedirect build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRedirect self = new ListGatewayRouteResponseBodyDataResultRedirect();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListGatewayRouteResponseBodyDataResultRedirect setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> queryPredicates;

        public static ListGatewayRouteResponseBodyDataResultRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRoutePredicates self = new ListGatewayRouteResponseBodyDataResultRoutePredicates();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setHeaderPredicates(java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setPathPredicates(ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public ListGatewayRouteResponseBodyDataResultRoutePredicates setQueryPredicates(java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRoutePredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResultRouteServices extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Version")
        public String version;

        public static ListGatewayRouteResponseBodyDataResultRouteServices build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResultRouteServices self = new ListGatewayRouteResponseBodyDataResultRouteServices();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListGatewayRouteResponseBodyDataResultRouteServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListGatewayRouteResponseBodyDataResult extends TeaModel {
        @NameInMap("Comment")
        public ListGatewayRouteResponseBodyDataResultComment comment;

        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("DirectResponse")
        public ListGatewayRouteResponseBodyDataResultDirectResponse directResponse;

        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Predicates")
        public String predicates;

        @NameInMap("Redirect")
        public ListGatewayRouteResponseBodyDataResultRedirect redirect;

        @NameInMap("RouteOrder")
        public Integer routeOrder;

        @NameInMap("RoutePredicates")
        public ListGatewayRouteResponseBodyDataResultRoutePredicates routePredicates;

        @NameInMap("RouteServices")
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> routeServices;

        @NameInMap("Services")
        public String services;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        public static ListGatewayRouteResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyDataResult self = new ListGatewayRouteResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyDataResult setComment(ListGatewayRouteResponseBodyDataResultComment comment) {
            this.comment = comment;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultComment getComment() {
            return this.comment;
        }

        public ListGatewayRouteResponseBodyDataResult setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public ListGatewayRouteResponseBodyDataResult setDefaultServiceName(String defaultServiceName) {
            this.defaultServiceName = defaultServiceName;
            return this;
        }
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        public ListGatewayRouteResponseBodyDataResult setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListGatewayRouteResponseBodyDataResult setDirectResponse(ListGatewayRouteResponseBodyDataResultDirectResponse directResponse) {
            this.directResponse = directResponse;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultDirectResponse getDirectResponse() {
            return this.directResponse;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainIdList(java.util.List<Long> domainIdList) {
            this.domainIdList = domainIdList;
            return this;
        }
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGatewayRouteResponseBodyDataResult setDomainNameList(java.util.List<String> domainNameList) {
            this.domainNameList = domainNameList;
            return this;
        }
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        public ListGatewayRouteResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayRouteResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayRouteResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayRouteResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayRouteResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayRouteResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteResponseBodyDataResult setPredicates(String predicates) {
            this.predicates = predicates;
            return this;
        }
        public String getPredicates() {
            return this.predicates;
        }

        public ListGatewayRouteResponseBodyDataResult setRedirect(ListGatewayRouteResponseBodyDataResultRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRedirect getRedirect() {
            return this.redirect;
        }

        public ListGatewayRouteResponseBodyDataResult setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public ListGatewayRouteResponseBodyDataResult setRoutePredicates(ListGatewayRouteResponseBodyDataResultRoutePredicates routePredicates) {
            this.routePredicates = routePredicates;
            return this;
        }
        public ListGatewayRouteResponseBodyDataResultRoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        public ListGatewayRouteResponseBodyDataResult setRouteServices(java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> routeServices) {
            this.routeServices = routeServices;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResultRouteServices> getRouteServices() {
            return this.routeServices;
        }

        public ListGatewayRouteResponseBodyDataResult setServices(String services) {
            this.services = services;
            return this;
        }
        public String getServices() {
            return this.services;
        }

        public ListGatewayRouteResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayRouteResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayRouteResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGatewayRouteResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteResponseBodyData self = new ListGatewayRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayRouteResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayRouteResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayRouteResponseBodyData setResult(java.util.List<ListGatewayRouteResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayRouteResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayRouteResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
