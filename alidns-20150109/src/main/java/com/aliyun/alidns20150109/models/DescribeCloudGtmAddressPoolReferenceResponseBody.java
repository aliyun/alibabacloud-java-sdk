// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolReferenceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AddressPoolName")
    public String addressPoolName;

    @NameInMap("InstanceConfigs")
    public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs instanceConfigs;

    /**
     * <strong>example:</strong>
     * <p>853805EA-3D47-47D5-9A1A-A45C24313ABD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmAddressPoolReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolReferenceResponseBody self = new DescribeCloudGtmAddressPoolReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolReferenceResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public DescribeCloudGtmAddressPoolReferenceResponseBody setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public DescribeCloudGtmAddressPoolReferenceResponseBody setInstanceConfigs(DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs instanceConfigs) {
        this.instanceConfigs = instanceConfigs;
        return this;
    }
    public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
    }

    public DescribeCloudGtmAddressPoolReferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressPoolLbStrategy")
        public String addressPoolLbStrategy;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <strong>example:</strong>
         * <p>config-000**1</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <strong>example:</strong>
         * <p>gtm-cn-jmp3qnw**03</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        /**
         * <strong>example:</strong>
         * <p>www</p>
         */
        @NameInMap("ScheduleHostname")
        public String scheduleHostname;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("ScheduleRrType")
        public String scheduleRrType;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ScheduleZoneName")
        public String scheduleZoneName;

        /**
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig self = new DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setAddressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setScheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setScheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setScheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs extends TeaModel {
        @NameInMap("InstanceConfig")
        public java.util.List<DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig> instanceConfig;

        public static DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs self = new DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs setInstanceConfig(java.util.List<DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig> instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigsInstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

    }

}
