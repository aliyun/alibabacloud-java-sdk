// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesResponseBody extends TeaModel {
    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public SearchCloudGtmAddressesResponseBodyAddresses addresses;

    /**
     * <p>Current page number, starting from <strong>1</strong>, default is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of <strong>100</strong> and a default of <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of address entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>Total number of pages.</p>
     * 
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
         * <p>The state of the health check task. Valid values:</p>
         * <ul>
         * <li>ok: The task is normal.</li>
         * <li>alert: The task has an alert.</li>
         * <li>no_data: No data is available. In most cases, the health check task is newly created and no data is collected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        /**
         * <p>The target service port for health check probes. When the health check protocol is set to Ping, configuration of the service port is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the health check template associated with the address.</p>
         * 
         * <strong>example:</strong>
         * <p>mtp-895180524251002880</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Health check template name.</p>
         * 
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
         * <p>IP address or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>ID of the address, unique identifier for the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        @NameInMap("AddressId")
        public String addressId;

        /**
         * <p>Address ownership information, not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter should be none.</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The failover method that is used if the address fails health checks. Valid values:</p>
         * <ul>
         * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
         * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for Domain Name System (DNS) requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("AvailableMode")
        public String availableMode;

        /**
         * <p>The availability state of the address when AvailableMode is set to manual. Valid values:</p>
         * <ul>
         * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <p>Creation time of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-23T13:09Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creation time of the address (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>Current activation status of the address:</p>
         * <ul>
         * <li>enable: Enabled status</li>
         * <li>disable: Disabled status</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>The condition for determining the health status of the address. Valid values:</p>
         * <ul>
         * <li>any_ok: The health check results of at least one health check template are normal.</li>
         * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
         * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
         * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
         * <li>all_ok: The health check results of all health check templates are normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>p50_ok</p>
         */
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <p>The health check state of the address. Valid values:</p>
         * <ul>
         * <li>ok: The address passes all health checks of the referenced health check templates.</li>
         * <li>ok_alert: The address fails some health checks of the referenced health check templates, but the address is deemed available.</li>
         * <li>ok_no_monitor: The address does not reference any health check template.</li>
         * <li>exceptional: The address fails some or all health checks of the referenced health check templates, and the address is deemed unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The health check tasks.</p>
         */
        @NameInMap("HealthTasks")
        public SearchCloudGtmAddressesResponseBodyAddressesAddressHealthTasks healthTasks;

        /**
         * <p>The availability state of the address when AvailableMode is set to manual. Valid values:</p>
         * <ul>
         * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        /**
         * <p>Address name.</p>
         * 
         * <strong>example:</strong>
         * <p>Address-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Address type:</p>
         * <ul>
         * <li>IPv4: ipv4 address - IPv6: ipv6 address - domain: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The last modification time of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-29T13:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The last modification time of the address (timestamp).</p>
         * 
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
