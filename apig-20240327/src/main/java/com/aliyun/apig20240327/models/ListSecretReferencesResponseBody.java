// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretReferencesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListSecretReferencesResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSecretReferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretReferencesResponseBody self = new ListSecretReferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretReferencesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecretReferencesResponseBody setData(ListSecretReferencesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSecretReferencesResponseBodyData getData() {
        return this.data;
    }

    public ListSecretReferencesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecretReferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecretReferencesResponseBodyDataItemsPluginConfig extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("pluginClassId")
        public String pluginClassId;

        @NameInMap("pluginId")
        public String pluginId;

        public static ListSecretReferencesResponseBodyDataItemsPluginConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyDataItemsPluginConfig self = new ListSecretReferencesResponseBodyDataItemsPluginConfig();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyDataItemsPluginConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretReferencesResponseBodyDataItemsPluginConfig setPluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }
        public String getPluginClassId() {
            return this.pluginClassId;
        }

        public ListSecretReferencesResponseBodyDataItemsPluginConfig setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

    }

    public static class ListSecretReferencesResponseBodyDataItemsServiceConfig extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("serviceId")
        public String serviceId;

        public static ListSecretReferencesResponseBodyDataItemsServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyDataItemsServiceConfig self = new ListSecretReferencesResponseBodyDataItemsServiceConfig();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyDataItemsServiceConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretReferencesResponseBodyDataItemsServiceConfig setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

    public static class ListSecretReferencesResponseBodyDataItemsConsumerConfig extends TeaModel {
        @NameInMap("consumerId")
        public String consumerId;

        @NameInMap("name")
        public String name;

        public static ListSecretReferencesResponseBodyDataItemsConsumerConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyDataItemsConsumerConfig self = new ListSecretReferencesResponseBodyDataItemsConsumerConfig();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyDataItemsConsumerConfig setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListSecretReferencesResponseBodyDataItemsConsumerConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSecretReferencesResponseBodyDataItemsMcpServerConfig extends TeaModel {
        @NameInMap("httpApiId")
        public String httpApiId;

        @NameInMap("name")
        public String name;

        @NameInMap("routeId")
        public String routeId;

        public static ListSecretReferencesResponseBodyDataItemsMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyDataItemsMcpServerConfig self = new ListSecretReferencesResponseBodyDataItemsMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig setHttpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }
        public String getHttpApiId() {
            return this.httpApiId;
        }

        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

    public static class ListSecretReferencesResponseBodyDataItems extends TeaModel {
        @NameInMap("PluginConfig")
        public ListSecretReferencesResponseBodyDataItemsPluginConfig pluginConfig;

        @NameInMap("ServiceConfig")
        public ListSecretReferencesResponseBodyDataItemsServiceConfig serviceConfig;

        @NameInMap("consumerConfig")
        public ListSecretReferencesResponseBodyDataItemsConsumerConfig consumerConfig;

        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("mcpServerConfig")
        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig mcpServerConfig;

        @NameInMap("resourceType")
        public String resourceType;

        public static ListSecretReferencesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyDataItems self = new ListSecretReferencesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyDataItems setPluginConfig(ListSecretReferencesResponseBodyDataItemsPluginConfig pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public ListSecretReferencesResponseBodyDataItemsPluginConfig getPluginConfig() {
            return this.pluginConfig;
        }

        public ListSecretReferencesResponseBodyDataItems setServiceConfig(ListSecretReferencesResponseBodyDataItemsServiceConfig serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }
        public ListSecretReferencesResponseBodyDataItemsServiceConfig getServiceConfig() {
            return this.serviceConfig;
        }

        public ListSecretReferencesResponseBodyDataItems setConsumerConfig(ListSecretReferencesResponseBodyDataItemsConsumerConfig consumerConfig) {
            this.consumerConfig = consumerConfig;
            return this;
        }
        public ListSecretReferencesResponseBodyDataItemsConsumerConfig getConsumerConfig() {
            return this.consumerConfig;
        }

        public ListSecretReferencesResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListSecretReferencesResponseBodyDataItems setMcpServerConfig(ListSecretReferencesResponseBodyDataItemsMcpServerConfig mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public ListSecretReferencesResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListSecretReferencesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListSecretReferencesResponseBodyDataItems> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListSecretReferencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecretReferencesResponseBodyData self = new ListSecretReferencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecretReferencesResponseBodyData setItems(java.util.List<ListSecretReferencesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListSecretReferencesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListSecretReferencesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSecretReferencesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecretReferencesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
