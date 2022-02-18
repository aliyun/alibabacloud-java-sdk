// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DirectResponseJSON")
    public UpdateGatewayRouteRequestDirectResponseJSON directResponseJSON;

    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Predicates")
    public UpdateGatewayRouteRequestPredicates predicates;

    @NameInMap("RedirectJSON")
    public UpdateGatewayRouteRequestRedirectJSON redirectJSON;

    @NameInMap("RouteOrder")
    public Integer routeOrder;

    @NameInMap("Services")
    public java.util.List<UpdateGatewayRouteRequestServices> services;

    public static UpdateGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRequest self = new UpdateGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateGatewayRouteRequest setDirectResponseJSON(UpdateGatewayRouteRequestDirectResponseJSON directResponseJSON) {
        this.directResponseJSON = directResponseJSON;
        return this;
    }
    public UpdateGatewayRouteRequestDirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    public UpdateGatewayRouteRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    public UpdateGatewayRouteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRouteRequest setPredicates(UpdateGatewayRouteRequestPredicates predicates) {
        this.predicates = predicates;
        return this;
    }
    public UpdateGatewayRouteRequestPredicates getPredicates() {
        return this.predicates;
    }

    public UpdateGatewayRouteRequest setRedirectJSON(UpdateGatewayRouteRequestRedirectJSON redirectJSON) {
        this.redirectJSON = redirectJSON;
        return this;
    }
    public UpdateGatewayRouteRequestRedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    public UpdateGatewayRouteRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public UpdateGatewayRouteRequest setServices(java.util.List<UpdateGatewayRouteRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<UpdateGatewayRouteRequestServices> getServices() {
        return this.services;
    }

    public static class UpdateGatewayRouteRequestDirectResponseJSON extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Code")
        public Long code;

        public static UpdateGatewayRouteRequestDirectResponseJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestDirectResponseJSON self = new UpdateGatewayRouteRequestDirectResponseJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestDirectResponseJSON setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public UpdateGatewayRouteRequestDirectResponseJSON setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteRequestPredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesHeaderPredicates self = new UpdateGatewayRouteRequestPredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static UpdateGatewayRouteRequestPredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesPathPredicates self = new UpdateGatewayRouteRequestPredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesQueryPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteRequestPredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesQueryPredicates self = new UpdateGatewayRouteRequestPredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteRequestPredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public UpdateGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> queryPredicates;

        public static UpdateGatewayRouteRequestPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicates self = new UpdateGatewayRouteRequestPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicates setHeaderPredicates(java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setPathPredicates(UpdateGatewayRouteRequestPredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public UpdateGatewayRouteRequestPredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setQueryPredicates(java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class UpdateGatewayRouteRequestRedirectJSON extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        public static UpdateGatewayRouteRequestRedirectJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestRedirectJSON self = new UpdateGatewayRouteRequestRedirectJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestRedirectJSON setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public UpdateGatewayRouteRequestRedirectJSON setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGatewayRouteRequestRedirectJSON setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateGatewayRouteRequestServices extends TeaModel {
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

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Version")
        public String version;

        public static UpdateGatewayRouteRequestServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestServices self = new UpdateGatewayRouteRequestServices();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGatewayRouteRequestServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayRouteRequestServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateGatewayRouteRequestServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public UpdateGatewayRouteRequestServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateGatewayRouteRequestServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateGatewayRouteRequestServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
