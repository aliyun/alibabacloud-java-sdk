// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesResponseBody extends TeaModel {
    @NameInMap("Addresses")
    public SearchCloudGtmAddressesResponseBodyAddresses addresses;

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
     * <p>15</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchCloudGtmAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressesResponseBody self = new SearchCloudGtmAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressesResponseBody setAddresses(SearchCloudGtmAddressesResponseBodyAddresses addresses) {
        this.addresses = addresses;
        return this;
    }
    public SearchCloudGtmAddressesResponseBodyAddresses getAddresses() {
        return this.addresses;
    }

    public SearchCloudGtmAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCloudGtmAddressesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCloudGtmAddressesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>mtp-895180524251002880</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>IPv4-Ping</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask self = new SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> healthTask;

        public static SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks self = new SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks setHealthTask(java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

    public static class SearchCloudGtmAddressesResponseBodyAddressesAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        @NameInMap("AddressId")
        public String addressId;

        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("AvailableMode")
        public String availableMode;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <strong>example:</strong>
         * <p>2024-03-23T13:09Z</p>
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
         * <p>p50_ok</p>
         */
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("HealthTasks")
        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks healthTasks;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        /**
         * <strong>example:</strong>
         * <p>Address-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2024-03-29T13:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static SearchCloudGtmAddressesResponseBodyAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressesResponseBodyAddressesAddress self = new SearchCloudGtmAddressesResponseBodyAddressesAddress();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setHealthTasks(SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }
        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks getHealthTasks() {
            return this.healthTasks;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmAddressesResponseBodyAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class SearchCloudGtmAddressesResponseBodyAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddress> address;

        public static SearchCloudGtmAddressesResponseBodyAddresses build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmAddressesResponseBodyAddresses self = new SearchCloudGtmAddressesResponseBodyAddresses();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmAddressesResponseBodyAddresses setAddress(java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<SearchCloudGtmAddressesResponseBodyAddressesAddress> getAddress() {
            return this.address;
        }

    }

}
