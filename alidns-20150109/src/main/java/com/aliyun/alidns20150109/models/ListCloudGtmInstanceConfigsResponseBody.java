// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstanceConfigsResponseBody extends TeaModel {
    @NameInMap("InstanceConfigs")
    public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs instanceConfigs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListCloudGtmInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmInstanceConfigsResponseBody self = new ListCloudGtmInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmInstanceConfigsResponseBody setInstanceConfigs(ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs instanceConfigs) {
        this.instanceConfigs = instanceConfigs;
        return this;
    }
    public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
    }

    public ListCloudGtmInstanceConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmInstanceConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmInstanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmInstanceConfigsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmInstanceConfigsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource self = new ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        /**
         * <strong>example:</strong>
         * <p>pool-89528023225442**16</p>
         */
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        /**
         * <strong>example:</strong>
         * <p>AddressPool-1</p>
         */
        @NameInMap("AddressPoolName")
        public String addressPoolName;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressPoolType")
        public String addressPoolType;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

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
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("RequestSource")
        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource requestSource;

        @NameInMap("SeqNonPreemptiveSchedule")
        public Boolean seqNonPreemptiveSchedule;

        /**
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WeightValue")
        public Integer weightValue;

        public static ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool self = new ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setRequestSource(ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPoolRequestSource getRequestSource() {
            return this.requestSource;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> addressPool;

        public static ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools self = new ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools setAddressPool(java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

    public static class ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressPoolLbStrategy")
        public String addressPoolLbStrategy;

        @NameInMap("AddressPools")
        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools addressPools;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <strong>example:</strong>
         * <p>dns_gtm_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>Config-000**11</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

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
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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
         * <p>custom</p>
         */
        @NameInMap("ScheduleZoneMode")
        public String scheduleZoneMode;

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
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig self = new ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAddressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAddressPools(ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }
        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfigAddressPools getAddressPools() {
            return this.addressPools;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleZoneMode(String scheduleZoneMode) {
            this.scheduleZoneMode = scheduleZoneMode;
            return this;
        }
        public String getScheduleZoneMode() {
            return this.scheduleZoneMode;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setScheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs extends TeaModel {
        @NameInMap("InstanceConfig")
        public java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> instanceConfig;

        public static ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs self = new ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstanceConfigsResponseBodyInstanceConfigs setInstanceConfig(java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public java.util.List<ListCloudGtmInstanceConfigsResponseBodyInstanceConfigsInstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

    }

}
