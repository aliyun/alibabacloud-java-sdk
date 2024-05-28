// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressPoolsResponseBody extends TeaModel {
    @NameInMap("AddressPools")
    public ListCloudGtmAddressPoolsResponseBodyAddressPools addressPools;

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

    public static ListCloudGtmAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressPoolsResponseBody self = new ListCloudGtmAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressPoolsResponseBody setAddressPools(ListCloudGtmAddressPoolsResponseBodyAddressPools addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public ListCloudGtmAddressPoolsResponseBodyAddressPools getAddressPools() {
        return this.addressPools;
    }

    public ListCloudGtmAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAddressPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> healthTask;

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks setHealthTask(java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress extends TeaModel {
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
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks healthTasks;

        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RequestSource")
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource requestSource;

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

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setHealthTasks(ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks getHealthTasks() {
            return this.healthTasks;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setRequestSource(ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource getRequestSource() {
            return this.requestSource;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> address;

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses setAddress(java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddress> getAddress() {
            return this.address;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool extends TeaModel {
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("AddressPoolName")
        public String addressPoolName;

        @NameInMap("AddressPoolType")
        public String addressPoolType;

        @NameInMap("Addresses")
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses addresses;

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

        public static ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool self = new ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAddresses(ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses addresses) {
            this.addresses = addresses;
            return this;
        }
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses getAddresses() {
            return this.addresses;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListCloudGtmAddressPoolsResponseBodyAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> addressPool;

        public static ListCloudGtmAddressPoolsResponseBodyAddressPools build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressPoolsResponseBodyAddressPools self = new ListCloudGtmAddressPoolsResponseBodyAddressPools();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressPoolsResponseBodyAddressPools setAddressPool(java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

}
