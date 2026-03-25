// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretReferencesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListSecretReferencesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CE857A85-251D-5018-8103-A38957D71***</p>
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
        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The plug-in type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-xxxxxxxx</p>
         */
        @NameInMap("pluginClassId")
        public String pluginClassId;

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-d4ijk56m1hkhxxxxxxxx</p>
         */
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
        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>myService</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cvgbtcmm1hkmxxxxxxxx</p>
         */
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
        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d0iltnem1hkhxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>myconsumer</p>
         */
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
        /**
         * <p>The HTTP API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-d2vv43em201hxxxxxxxx</p>
         */
        @NameInMap("httpApiId")
        public String httpApiId;

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cv0i5oum1hkhxxxxxxxx</p>
         */
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
        /**
         * <p>The information about the plug-in that references the current key.</p>
         */
        @NameInMap("PluginConfig")
        public ListSecretReferencesResponseBodyDataItemsPluginConfig pluginConfig;

        /**
         * <p>The service information that references the current key.</p>
         */
        @NameInMap("ServiceConfig")
        public ListSecretReferencesResponseBodyDataItemsServiceConfig serviceConfig;

        /**
         * <p>The consumer information that references the current key.</p>
         */
        @NameInMap("consumerConfig")
        public ListSecretReferencesResponseBodyDataItemsConsumerConfig consumerConfig;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>MCP service information that references the current key.</p>
         */
        @NameInMap("mcpServerConfig")
        public ListSecretReferencesResponseBodyDataItemsMcpServerConfig mcpServerConfig;

        /**
         * <p>The type of resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Plugin</p>
         */
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
        /**
         * <p>The list of reference details.</p>
         */
        @NameInMap("items")
        public java.util.List<ListSecretReferencesResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
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
