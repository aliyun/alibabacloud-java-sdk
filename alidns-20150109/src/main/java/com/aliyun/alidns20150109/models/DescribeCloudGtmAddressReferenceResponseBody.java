// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressReferenceResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("AddressPools")
    public DescribeCloudGtmAddressReferenceResponseBodyAddressPools addressPools;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmAddressReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressReferenceResponseBody self = new DescribeCloudGtmAddressReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddressPools(DescribeCloudGtmAddressReferenceResponseBodyAddressPools addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public DescribeCloudGtmAddressReferenceResponseBodyAddressPools getAddressPools() {
        return this.addressPools;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig extends TeaModel {
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

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setAddressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs extends TeaModel {
        @NameInMap("InstanceConfig")
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> instanceConfig;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs setInstanceConfig(java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool extends TeaModel {
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("AddressPoolName")
        public String addressPoolName;

        @NameInMap("AddressPoolType")
        public String addressPoolType;

        @NameInMap("AvailableStatus")
        public String availableStatus;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("HealthJudgement")
        public String healthJudgement;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InstanceConfigs")
        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs instanceConfigs;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setInstanceConfigs(DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs instanceConfigs) {
            this.instanceConfigs = instanceConfigs;
            return this;
        }
        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs getInstanceConfigs() {
            return this.instanceConfigs;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> addressPool;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPools self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPools();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPools setAddressPool(java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

}
