// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMigrationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMigrationTaskResponseBodyData data;

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
     * <p>42EAF9DB-9082-5F11-8EE1-C2357906DA0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationTaskResponseBody self = new GetMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMigrationTaskResponseBody setData(GetMigrationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrationTaskResponseBodyData getData() {
        return this.data;
    }

    public GetMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMigrationTaskResponseBodyDataIngressConfig extends TeaModel {
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

        public static GetMigrationTaskResponseBodyDataIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationTaskResponseBodyDataIngressConfig self = new GetMigrationTaskResponseBodyDataIngressConfig();
            return TeaModel.build(map, self);
        }

        public GetMigrationTaskResponseBodyDataIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public GetMigrationTaskResponseBodyDataIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class GetMigrationTaskResponseBodyDataVirtualServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
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

        public static GetMigrationTaskResponseBodyDataVirtualServices build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationTaskResponseBodyDataVirtualServices self = new GetMigrationTaskResponseBodyDataVirtualServices();
            return TeaModel.build(map, self);
        }

        public GetMigrationTaskResponseBodyDataVirtualServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetMigrationTaskResponseBodyDataVirtualServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMigrationTaskResponseBodyDataVirtualServices setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public GetMigrationTaskResponseBodyDataVirtualServices setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

    public static class GetMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <strong>example:</strong>
         * <p>ingress-api</p>
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
         * <p>my-cluster</p>
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
         * <p>workspace api monitor test</p>
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
         * <p>my-gateway</p>
         */
        @NameInMap("gatewayName")
        public String gatewayName;

        @NameInMap("ingressConfig")
        public GetMigrationTaskResponseBodyDataIngressConfig ingressConfig;

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
        public java.util.List<GetMigrationTaskResponseBodyDataVirtualServices> virtualServices;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static GetMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationTaskResponseBodyData self = new GetMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationTaskResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetMigrationTaskResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetMigrationTaskResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMigrationTaskResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetMigrationTaskResponseBodyData setClusterNamespace(String clusterNamespace) {
            this.clusterNamespace = clusterNamespace;
            return this;
        }
        public String getClusterNamespace() {
            return this.clusterNamespace;
        }

        public GetMigrationTaskResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMigrationTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMigrationTaskResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetMigrationTaskResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetMigrationTaskResponseBodyData setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public GetMigrationTaskResponseBodyData setIngressConfig(GetMigrationTaskResponseBodyDataIngressConfig ingressConfig) {
            this.ingressConfig = ingressConfig;
            return this;
        }
        public GetMigrationTaskResponseBodyDataIngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        public GetMigrationTaskResponseBodyData setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public GetMigrationTaskResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetMigrationTaskResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public GetMigrationTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMigrationTaskResponseBodyData setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public GetMigrationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMigrationTaskResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetMigrationTaskResponseBodyData setVirtualServices(java.util.List<GetMigrationTaskResponseBodyDataVirtualServices> virtualServices) {
            this.virtualServices = virtualServices;
            return this;
        }
        public java.util.List<GetMigrationTaskResponseBodyDataVirtualServices> getVirtualServices() {
            return this.virtualServices;
        }

        public GetMigrationTaskResponseBodyData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
