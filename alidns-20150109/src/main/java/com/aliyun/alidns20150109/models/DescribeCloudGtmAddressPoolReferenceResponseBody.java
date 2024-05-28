// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolReferenceResponseBody extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("AddressPoolName")
    public String addressPoolName;

    @NameInMap("InstanceConfigs")
    public DescribeCloudGtmAddressPoolReferenceResponseBodyInstanceConfigs instanceConfigs;

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
        @NameInMap("AddressPoolLbStrategy")
        public String addressPoolLbStrategy;

        @NameInMap("AvailableStatus")
        public String availableStatus;

        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        @NameInMap("ScheduleHostname")
        public String scheduleHostname;

        @NameInMap("ScheduleRrType")
        public String scheduleRrType;

        @NameInMap("ScheduleZoneName")
        public String scheduleZoneName;

        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        @NameInMap("Ttl")
        public Integer ttl;

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
