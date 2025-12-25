// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The list of domain names or fixed addresses.</p>
     */
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The agent service configurations.</p>
     */
    @NameInMap("agentServiceConfig")
    public AgentServiceConfig agentServiceConfig;

    /**
     * <p>The AI service configurations.</p>
     */
    @NameInMap("aiServiceConfig")
    public AiServiceConfig aiServiceConfig;

    /**
     * <p>A DNS service address.</p>
     */
    @NameInMap("dnsServers")
    public java.util.List<String> dnsServers;

    /**
     * <p>The health check configurations.</p>
     */
    @NameInMap("healthCheckConfig")
    public UpdateServiceRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The health check threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("healthyPanicThreshold")
    public Float healthyPanicThreshold;

    /**
     * <p>The passive health check configurations.</p>
     */
    @NameInMap("outlierDetectionConfig")
    public UpdateServiceRequestOutlierDetectionConfig outlierDetectionConfig;

    /**
     * <p>The port information.</p>
     */
    @NameInMap("ports")
    public java.util.List<UpdateServiceRequestPorts> ports;

    /**
     * <p>The service protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdateServiceRequest setAgentServiceConfig(AgentServiceConfig agentServiceConfig) {
        this.agentServiceConfig = agentServiceConfig;
        return this;
    }
    public AgentServiceConfig getAgentServiceConfig() {
        return this.agentServiceConfig;
    }

    public UpdateServiceRequest setAiServiceConfig(AiServiceConfig aiServiceConfig) {
        this.aiServiceConfig = aiServiceConfig;
        return this;
    }
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    public UpdateServiceRequest setDnsServers(java.util.List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public java.util.List<String> getDnsServers() {
        return this.dnsServers;
    }

    public UpdateServiceRequest setHealthCheckConfig(UpdateServiceRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public UpdateServiceRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public UpdateServiceRequest setHealthyPanicThreshold(Float healthyPanicThreshold) {
        this.healthyPanicThreshold = healthyPanicThreshold;
        return this;
    }
    public Float getHealthyPanicThreshold() {
        return this.healthyPanicThreshold;
    }

    public UpdateServiceRequest setOutlierDetectionConfig(UpdateServiceRequestOutlierDetectionConfig outlierDetectionConfig) {
        this.outlierDetectionConfig = outlierDetectionConfig;
        return this;
    }
    public UpdateServiceRequestOutlierDetectionConfig getOutlierDetectionConfig() {
        return this.outlierDetectionConfig;
    }

    public UpdateServiceRequest setPorts(java.util.List<UpdateServiceRequestPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<UpdateServiceRequestPorts> getPorts() {
        return this.ports;
    }

    public UpdateServiceRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public static class UpdateServiceRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The normal status codes to be returned. This parameter is required if the health check protocol is HTTP.</p>
         */
        @NameInMap("expectedStatuses")
        public java.util.List<String> expectedStatuses;

        /**
         * <p>The healthy threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The domain name that you want to use for health checks. Optional. This parameter is available if the health check protocol is HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>dev.itemcener.com</p>
         */
        @NameInMap("httpHost")
        public String httpHost;

        /**
         * <p>The request path of health checks. This parameter is required if the health check protocol is HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("httpPath")
        public String httpPath;

        /**
         * <p>The health check interval. Unit: seconds</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("interval")
        public Integer interval;

        /**
         * <p>The protocol over which the system performs health checks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>HTTP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The timeout period for a health check response. Unit: seconds</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The unhealthy threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("unhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateServiceRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestHealthCheckConfig self = new UpdateServiceRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestHealthCheckConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateServiceRequestHealthCheckConfig setExpectedStatuses(java.util.List<String> expectedStatuses) {
            this.expectedStatuses = expectedStatuses;
            return this;
        }
        public java.util.List<String> getExpectedStatuses() {
            return this.expectedStatuses;
        }

        public UpdateServiceRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateServiceRequestHealthCheckConfig setHttpHost(String httpHost) {
            this.httpHost = httpHost;
            return this;
        }
        public String getHttpHost() {
            return this.httpHost;
        }

        public UpdateServiceRequestHealthCheckConfig setHttpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public String getHttpPath() {
            return this.httpPath;
        }

        public UpdateServiceRequestHealthCheckConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public UpdateServiceRequestHealthCheckConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateServiceRequestHealthCheckConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateServiceRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class UpdateServiceRequestOutlierDetectionConfig extends TeaModel {
        /**
         * <p>The initial isolation duration after a node is isolated (e.g., 30 seconds). The isolation time is calculated as: k \* base_ejection_time (with k initially set to 1). Each subsequent isolation increases the isolation time (k is incremented by 1), while consecutive healthy checks gradually decrease the isolation time (k is decremented by 1).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("baseEjectionTime")
        public Integer baseEjectionTime;

        /**
         * <p>enable</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The panic threshold.</p>
         * <p>When the proportion of healthy nodes in the service is greater than the panic threshold, health checks take effect normally, and requests are only sent to healthy nodes, not to ejected nodes. When the proportion of healthy nodes in the service is less than or equal to the panic threshold, health checks are effectively disabled, and requests are sent to all nodes, including those that have been ejected nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failurePercentageMinimumHosts")
        public Integer failurePercentageMinimumHosts;

        /**
         * <p>When the request failure rate of a node reaches this threshold, the system triggers the isolation mechanism of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("failurePercentageThreshold")
        public Integer failurePercentageThreshold;

        /**
         * <p>The detection interval.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("interval")
        public Integer interval;

        public static UpdateServiceRequestOutlierDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestOutlierDetectionConfig self = new UpdateServiceRequestOutlierDetectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestOutlierDetectionConfig setBaseEjectionTime(Integer baseEjectionTime) {
            this.baseEjectionTime = baseEjectionTime;
            return this;
        }
        public Integer getBaseEjectionTime() {
            return this.baseEjectionTime;
        }

        public UpdateServiceRequestOutlierDetectionConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateServiceRequestOutlierDetectionConfig setFailurePercentageMinimumHosts(Integer failurePercentageMinimumHosts) {
            this.failurePercentageMinimumHosts = failurePercentageMinimumHosts;
            return this;
        }
        public Integer getFailurePercentageMinimumHosts() {
            return this.failurePercentageMinimumHosts;
        }

        public UpdateServiceRequestOutlierDetectionConfig setFailurePercentageThreshold(Integer failurePercentageThreshold) {
            this.failurePercentageThreshold = failurePercentageThreshold;
            return this;
        }
        public Integer getFailurePercentageThreshold() {
            return this.failurePercentageThreshold;
        }

        public UpdateServiceRequestOutlierDetectionConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

    }

    public static class UpdateServiceRequestPorts extends TeaModel {
        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>catalog</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP|UDP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static UpdateServiceRequestPorts build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestPorts self = new UpdateServiceRequestPorts();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestPorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceRequestPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateServiceRequestPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
