// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMigrationTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMigrationTasksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019FB5FB-615B-52AB-A92F-D40A3193DA96</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMigrationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationTasksResponseBody self = new ListMigrationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMigrationTasksResponseBody setData(ListMigrationTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMigrationTasksResponseBodyData getData() {
        return this.data;
    }

    public ListMigrationTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMigrationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMigrationTasksResponseBodyDataItemsIngressConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static ListMigrationTasksResponseBodyDataItemsIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationTasksResponseBodyDataItemsIngressConfig self = new ListMigrationTasksResponseBodyDataItemsIngressConfig();
            return TeaModel.build(map, self);
        }

        public ListMigrationTasksResponseBodyDataItemsIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public ListMigrationTasksResponseBodyDataItemsIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class ListMigrationTasksResponseBodyDataItemsVirtualServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
         * <strong>example:</strong>
         * <p>80-tcp</p>
         */
        @NameInMap("virtualServiceGroupName")
        public String virtualServiceGroupName;

        public static ListMigrationTasksResponseBodyDataItemsVirtualServices build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationTasksResponseBodyDataItemsVirtualServices self = new ListMigrationTasksResponseBodyDataItemsVirtualServices();
            return TeaModel.build(map, self);
        }

        public ListMigrationTasksResponseBodyDataItemsVirtualServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListMigrationTasksResponseBodyDataItemsVirtualServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMigrationTasksResponseBodyDataItemsVirtualServices setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public ListMigrationTasksResponseBodyDataItemsVirtualServices setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

    public static class ListMigrationTasksResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <strong>example:</strong>
         * <p>api-name</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>c-xxxxxx</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("clusterNamespace")
        public String clusterNamespace;

        /**
         * <strong>example:</strong>
         * <p>1756262400</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>迁移测试</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>env-xxxx</p>
         */
        @NameInMap("envId")
        public String envId;

        /**
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>prod-gateway</p>
         */
        @NameInMap("gatewayName")
        public String gatewayName;

        @NameInMap("ingressConfig")
        public ListMigrationTasksResponseBodyDataItemsIngressConfig ingressConfig;

        /**
         * <strong>example:</strong>
         * <p>Nginx Ingress</p>
         */
        @NameInMap("migrationType")
        public String migrationType;

        /**
         * <strong>example:</strong>
         * <p>nginx-ingress-lb</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>lb-bp1xxxx</p>
         */
        @NameInMap("slbId")
        public String slbId;

        /**
         * <strong>example:</strong>
         * <p>FlowSwitch</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        @NameInMap("switchType")
        public String switchType;

        /**
         * <strong>example:</strong>
         * <p>mt-xxxxxxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("virtualServices")
        public java.util.List<ListMigrationTasksResponseBodyDataItemsVirtualServices> virtualServices;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static ListMigrationTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationTasksResponseBodyDataItems self = new ListMigrationTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListMigrationTasksResponseBodyDataItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListMigrationTasksResponseBodyDataItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListMigrationTasksResponseBodyDataItems setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListMigrationTasksResponseBodyDataItems setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListMigrationTasksResponseBodyDataItems setClusterNamespace(String clusterNamespace) {
            this.clusterNamespace = clusterNamespace;
            return this;
        }
        public String getClusterNamespace() {
            return this.clusterNamespace;
        }

        public ListMigrationTasksResponseBodyDataItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMigrationTasksResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMigrationTasksResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListMigrationTasksResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListMigrationTasksResponseBodyDataItems setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public ListMigrationTasksResponseBodyDataItems setIngressConfig(ListMigrationTasksResponseBodyDataItemsIngressConfig ingressConfig) {
            this.ingressConfig = ingressConfig;
            return this;
        }
        public ListMigrationTasksResponseBodyDataItemsIngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        public ListMigrationTasksResponseBodyDataItems setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public ListMigrationTasksResponseBodyDataItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListMigrationTasksResponseBodyDataItems setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListMigrationTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMigrationTasksResponseBodyDataItems setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public ListMigrationTasksResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListMigrationTasksResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListMigrationTasksResponseBodyDataItems setVirtualServices(java.util.List<ListMigrationTasksResponseBodyDataItemsVirtualServices> virtualServices) {
            this.virtualServices = virtualServices;
            return this;
        }
        public java.util.List<ListMigrationTasksResponseBodyDataItemsVirtualServices> getVirtualServices() {
            return this.virtualServices;
        }

        public ListMigrationTasksResponseBodyDataItems setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListMigrationTasksResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListMigrationTasksResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListMigrationTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationTasksResponseBodyData self = new ListMigrationTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationTasksResponseBodyData setItems(java.util.List<ListMigrationTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListMigrationTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListMigrationTasksResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMigrationTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMigrationTasksResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
