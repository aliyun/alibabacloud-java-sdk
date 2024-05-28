// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressPoolsResponseBody extends TeaModel {
    @NameInMap("AddressPools")
    public SearchCloudGtmAddressPoolsResponseBodyAddressPools addressPools;

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

    public static SearchCloudGtmAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressPoolsResponseBody self = new SearchCloudGtmAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressPoolsResponseBody setAddressPools(SearchCloudGtmAddressPoolsResponseBodyAddressPools addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public SearchCloudGtmAddressPoolsResponseBodyAddressPools getAddressPools() {
        return this.addressPools;
    }

    public SearchCloudGtmAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmAddressPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCloudGtmAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCloudGtmAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask self = new SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> healthTask;

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks self = new SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks setHealthTask(java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress extends TeaModel {
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

        @NameInMap("HealthTasks")
        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks healthTasks;

        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RequestSource")
        public String requestSource;

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

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress self = new SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthTasks(SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }
        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks getHealthTasks() {
            return this.healthTasks;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setRequestSource(String requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public String getRequestSource() {
            return this.requestSource;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> address;

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses self = new SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses setAddress(java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> getAddress() {
            return this.address;
        }

    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool extends TeaModel {
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("AddressPoolName")
        public String addressPoolName;

        @NameInMap("AddressPoolType")
        public String addressPoolType;

        @NameInMap("Addresses")
        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses addresses;

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

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool self = new SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddresses(SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses addresses) {
            this.addresses = addresses;
            return this;
        }
        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses getAddresses() {
            return this.addresses;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class SearchCloudGtmAddressPoolsResponseBodyAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> addressPool;

        public static SearchCloudGtmAddressPoolsResponseBodyAddressPools build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressPoolsResponseBodyAddressPools self = new SearchCloudGtmAddressPoolsResponseBodyAddressPools();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressPoolsResponseBodyAddressPools setAddressPool(java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<SearchCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

}
