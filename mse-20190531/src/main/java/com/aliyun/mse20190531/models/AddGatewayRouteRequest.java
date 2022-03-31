// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DirectResponseJSON")
    public AddGatewayRouteRequestDirectResponseJSON directResponseJSON;

    @NameInMap("DomainId")
    public Long domainId;

    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Predicates")
    public AddGatewayRouteRequestPredicates predicates;

    @NameInMap("RedirectJSON")
    public AddGatewayRouteRequestRedirectJSON redirectJSON;

    @NameInMap("RouteOrder")
    public Integer routeOrder;

    @NameInMap("Services")
    public java.util.List<AddGatewayRouteRequestServices> services;

    public static AddGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRouteRequest self = new AddGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayRouteRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public AddGatewayRouteRequest setDirectResponseJSON(AddGatewayRouteRequestDirectResponseJSON directResponseJSON) {
        this.directResponseJSON = directResponseJSON;
        return this;
    }
    public AddGatewayRouteRequestDirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    public AddGatewayRouteRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddGatewayRouteRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    public AddGatewayRouteRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public AddGatewayRouteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public AddGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayRouteRequest setPredicates(AddGatewayRouteRequestPredicates predicates) {
        this.predicates = predicates;
        return this;
    }
    public AddGatewayRouteRequestPredicates getPredicates() {
        return this.predicates;
    }

    public AddGatewayRouteRequest setRedirectJSON(AddGatewayRouteRequestRedirectJSON redirectJSON) {
        this.redirectJSON = redirectJSON;
        return this;
    }
    public AddGatewayRouteRequestRedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    public AddGatewayRouteRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public AddGatewayRouteRequest setServices(java.util.List<AddGatewayRouteRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<AddGatewayRouteRequestServices> getServices() {
        return this.services;
    }

    public static class AddGatewayRouteRequestDirectResponseJSON extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Code")
        public Long code;

        public static AddGatewayRouteRequestDirectResponseJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestDirectResponseJSON self = new AddGatewayRouteRequestDirectResponseJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestDirectResponseJSON setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public AddGatewayRouteRequestDirectResponseJSON setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

    }

    public static class AddGatewayRouteRequestPredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static AddGatewayRouteRequestPredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesHeaderPredicates self = new AddGatewayRouteRequestPredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGatewayRouteRequestPredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static AddGatewayRouteRequestPredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesPathPredicates self = new AddGatewayRouteRequestPredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddGatewayRouteRequestPredicatesQueryPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static AddGatewayRouteRequestPredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesQueryPredicates self = new AddGatewayRouteRequestPredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGatewayRouteRequestPredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public AddGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> queryPredicates;

        public static AddGatewayRouteRequestPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicates self = new AddGatewayRouteRequestPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicates setHeaderPredicates(java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public AddGatewayRouteRequestPredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public AddGatewayRouteRequestPredicates setPathPredicates(AddGatewayRouteRequestPredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public AddGatewayRouteRequestPredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public AddGatewayRouteRequestPredicates setQueryPredicates(java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class AddGatewayRouteRequestRedirectJSON extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        public static AddGatewayRouteRequestRedirectJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestRedirectJSON self = new AddGatewayRouteRequestRedirectJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestRedirectJSON setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AddGatewayRouteRequestRedirectJSON setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddGatewayRouteRequestRedirectJSON setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class AddGatewayRouteRequestServices extends TeaModel {
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

        public static AddGatewayRouteRequestServices build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestServices self = new AddGatewayRouteRequestServices();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public AddGatewayRouteRequestServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddGatewayRouteRequestServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public AddGatewayRouteRequestServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public AddGatewayRouteRequestServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public AddGatewayRouteRequestServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public AddGatewayRouteRequestServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
