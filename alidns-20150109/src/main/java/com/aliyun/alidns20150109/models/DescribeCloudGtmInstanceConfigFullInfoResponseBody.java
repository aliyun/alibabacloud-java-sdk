// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigFullInfoResponseBody extends TeaModel {
    @NameInMap("AddressPoolLbStrategy")
    public String addressPoolLbStrategy;

    @NameInMap("AddressPools")
    public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools addressPools;

    @NameInMap("AlertConfig")
    public String alertConfig;

    @NameInMap("AlertGroup")
    public String alertGroup;

    @NameInMap("AvailableStatus")
    public String availableStatus;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleDomainName")
    public String scheduleDomainName;

    @NameInMap("ScheduleHostname")
    public String scheduleHostname;

    @NameInMap("ScheduleRrType")
    public String scheduleRrType;

    @NameInMap("ScheduleZoneMode")
    public String scheduleZoneMode;

    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    @NameInMap("SequenceLbStrategyMode")
    public String sequenceLbStrategyMode;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("VersionCode")
    public String versionCode;

    public static DescribeCloudGtmInstanceConfigFullInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmInstanceConfigFullInfoResponseBody self = new DescribeCloudGtmInstanceConfigFullInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setAddressPoolLbStrategy(String addressPoolLbStrategy) {
        this.addressPoolLbStrategy = addressPoolLbStrategy;
        return this;
    }
    public String getAddressPoolLbStrategy() {
        return this.addressPoolLbStrategy;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setAddressPools(DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools getAddressPools() {
        return this.addressPools;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setAlertConfig(String alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public String getAlertConfig() {
        return this.alertConfig;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setScheduleDomainName(String scheduleDomainName) {
        this.scheduleDomainName = scheduleDomainName;
        return this;
    }
    public String getScheduleDomainName() {
        return this.scheduleDomainName;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setScheduleHostname(String scheduleHostname) {
        this.scheduleHostname = scheduleHostname;
        return this;
    }
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setScheduleRrType(String scheduleRrType) {
        this.scheduleRrType = scheduleRrType;
        return this;
    }
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setScheduleZoneMode(String scheduleZoneMode) {
        this.scheduleZoneMode = scheduleZoneMode;
        return this;
    }
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
        this.sequenceLbStrategyMode = sequenceLbStrategyMode;
        return this;
    }
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressId")
        public String addressId;

        @NameInMap("AttributeInfo")
        public String attributeInfo;

        @NameInMap("AvailableMode")
        public String availableMode;

        @NameInMap("AvailableStatus")
        public String availableStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("HealthJudgement")
        public String healthJudgement;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RequestSource")
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource requestSource;

        @NameInMap("SeqNonPreemptiveSchedule")
        public Boolean seqNonPreemptiveSchedule;

        @NameInMap("SerialNumber")
        public Integer serialNumber;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("WeightValue")
        public Integer weightValue;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setRequestSource(DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource getRequestSource() {
            return this.requestSource;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress> address;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses setAddress(java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddressesAddress> getAddress() {
            return this.address;
        }

    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool extends TeaModel {
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("AddressPoolName")
        public String addressPoolName;

        @NameInMap("AddressPoolType")
        public String addressPoolType;

        @NameInMap("Addresses")
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses addresses;

        @NameInMap("AvailableStatus")
        public String availableStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("HealthJudgement")
        public String healthJudgement;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("RequestSource")
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource requestSource;

        @NameInMap("SeqNonPreemptiveSchedule")
        public Boolean seqNonPreemptiveSchedule;

        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        @NameInMap("SerialNumber")
        public Integer serialNumber;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("WeightValue")
        public Integer weightValue;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAddresses(DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses addresses) {
            this.addresses = addresses;
            return this;
        }
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolAddresses getAddresses() {
            return this.addresses;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setRequestSource(DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPoolRequestSource getRequestSource() {
            return this.requestSource;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool> addressPool;

        public static DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools self = new DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPools setAddressPool(java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<DescribeCloudGtmInstanceConfigFullInfoResponseBodyAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

}
