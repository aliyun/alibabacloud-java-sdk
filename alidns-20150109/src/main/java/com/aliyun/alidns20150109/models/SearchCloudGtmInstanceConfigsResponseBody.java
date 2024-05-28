// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstanceConfigsResponseBody extends TeaModel {
    @NameInMap("InstanceConfigs")
    public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs instanceConfigs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchCloudGtmInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmInstanceConfigsResponseBody self = new SearchCloudGtmInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmInstanceConfigsResponseBody setInstanceConfigs(SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs instanceConfigs) {
        this.instanceConfigs = instanceConfigs;
        return this;
    }
    public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
    }

    public SearchCloudGtmInstanceConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmInstanceConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmInstanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCloudGtmInstanceConfigsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCloudGtmInstanceConfigsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource self = new SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool extends TeaModel {
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
        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource requestSource;

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

        public static SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool self = new SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setRequestSource(SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource getRequestSource() {
            return this.requestSource;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> addressPool;

        public static SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools self = new SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools setAddressPool(java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

    public static class SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig extends TeaModel {
        @NameInMap("AddressPoolLbStrategy")
        public String addressPoolLbStrategy;

        @NameInMap("AddressPools")
        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools addressPools;

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

        @NameInMap("Remark")
        public String remark;

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

        public static SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig self = new SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAddressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAddressPools(SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }
        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools getAddressPools() {
            return this.addressPools;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleZoneMode(String scheduleZoneMode) {
            this.scheduleZoneMode = scheduleZoneMode;
            return this;
        }
        public String getScheduleZoneMode() {
            return this.scheduleZoneMode;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs extends TeaModel {
        @NameInMap("InstanceConfig")
        public java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> instanceConfig;

        public static SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs self = new SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigs setInstanceConfig(java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public java.util.List<SearchCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

    }

}
