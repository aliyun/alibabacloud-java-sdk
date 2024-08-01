// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressesResponseBody extends TeaModel {
    @NameInMap("Addresses")
    public ListCloudGtmAddressesResponseBodyAddresses addresses;

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
     * <p>30</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListCloudGtmAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressesResponseBody self = new ListCloudGtmAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressesResponseBody setAddresses(ListCloudGtmAddressesResponseBodyAddresses addresses) {
        this.addresses = addresses;
        return this;
    }
    public ListCloudGtmAddressesResponseBodyAddresses getAddresses() {
        return this.addresses;
    }

    public ListCloudGtmAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmAddressesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmAddressesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask extends TeaModel {
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
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>Ping-IPv4</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask self = new ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> healthTask;

        public static ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks self = new ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks setHealthTask(java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

    public static class ListCloudGtmAddressesResponseBodyAddressesAddress extends TeaModel {
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
        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks healthTasks;

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
         * <p>app</p>
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
         * <p>1527690824357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static ListCloudGtmAddressesResponseBodyAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressesResponseBodyAddressesAddress self = new ListCloudGtmAddressesResponseBodyAddressesAddress();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setHealthTasks(ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }
        public ListCloudGtmAddressesResponseBodyAddressesAddressHealthTasks getHealthTasks() {
            return this.healthTasks;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmAddressesResponseBodyAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListCloudGtmAddressesResponseBodyAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddress> address;

        public static ListCloudGtmAddressesResponseBodyAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAddressesResponseBodyAddresses self = new ListCloudGtmAddressesResponseBodyAddresses();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAddressesResponseBodyAddresses setAddress(java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<ListCloudGtmAddressesResponseBodyAddressesAddress> getAddress() {
            return this.address;
        }

    }

}
