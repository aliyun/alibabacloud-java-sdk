// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    @NameInMap("agentServiceConfig")
    public AgentServiceConfig agentServiceConfig;

    @NameInMap("aiServiceConfig")
    public AiServiceConfig aiServiceConfig;

    @NameInMap("dnsServers")
    public java.util.List<String> dnsServers;

    @NameInMap("healthCheckConfig")
    public UpdateServiceRequestHealthCheckConfig healthCheckConfig;

    @NameInMap("healthyPanicThreshold")
    public Float healthyPanicThreshold;

    @NameInMap("outlierDetectionConfig")
    public UpdateServiceRequestOutlierDetectionConfig outlierDetectionConfig;

    @NameInMap("ports")
    public java.util.List<UpdateServiceRequestPorts> ports;

    /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("expectedStatuses")
        public java.util.List<String> expectedStatuses;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <strong>example:</strong>
         * <p>dev.itemcener.com</p>
         */
        @NameInMap("httpHost")
        public String httpHost;

        /**
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("httpPath")
        public String httpPath;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
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
        @NameInMap("baseEjectionTime")
        public Integer baseEjectionTime;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("failurePercentageMinimumHosts")
        public Integer failurePercentageMinimumHosts;

        @NameInMap("failurePercentageThreshold")
        public Integer failurePercentageThreshold;

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
        @NameInMap("name")
        public String name;

        @NameInMap("port")
        public Integer port;

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
