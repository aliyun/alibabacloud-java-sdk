// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>The address pools.</p>
     */
    @NameInMap("AddressPools")
    public ListCloudGtmAddressPoolsResponseBodyAddressPools addressPools;

    /**
     * <p>Current page number, starting at <strong>1</strong>, default is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
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
     * <p>Total number of entries in the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
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
        /**
         * <p>The target service port for health checks. When the Ping protocol is selected for health checks, configuration of the service port is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the health check template.</p>
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
        /**
         * <p>IP address or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The address ID. This ID uniquely identifies the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-895182181143688192</p>
         */
        @NameInMap("AddressId")
        public String addressId;

        /**
         * <p>Address ownership information, not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>The current version does not support returning this parameter.</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
         * <ul>
         * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
         * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("AvailableMode")
        public String availableMode;

        /**
         * <p>The availability state of the address. Valid values:</p>
         * <ul>
         * <li>available: The address is available.</li>
         * <li>unavailable: The address is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <p>Address creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Address creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>Address enable status:</p>
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
         * <p>any_ok</p>
         */
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <p>The health check state of the address. Valid values:</p>
         * <ul>
         * <li>ok: The address passes all health checks of the referenced health check templates.</li>
         * <li>ok_alert: The address fails some health checks of the referenced health check templates but the address is deemed normal.</li>
         * <li>ok_no_monitor: The address does not reference any health check template and is normal.</li>
         * <li>exceptional: The address fails some or all health checks of the referenced health check templates and the address is deemed abnormal.</li>
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
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressHealthTasks healthTasks;

        /**
         * <p>The availability state of the address when AvailableMode is set to manual for the address. Valid values:</p>
         * <ul>
         * <li>available: The address is available. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is unavailable. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
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
         * <p>Address remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>List of request sources.</p>
         */
        @NameInMap("RequestSource")
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddressesAddressRequestSource requestSource;

        /**
         * <p>Indicates whether the mode of the sequence policy for load balancing between address pools is non-preemptive. This parameter is available only for the multicloud integration scenario. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SeqNonPreemptiveSchedule")
        public Boolean seqNonPreemptiveSchedule;

        /**
         * <p>Sequence number, indicating the priority of address return, where smaller numbers have higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <p>Address type:</p>
         * <ul>
         * <li>IPv4: IPv4 address</li>
         * <li>IPv6: IPv6 address</li>
         * <li>domain: Domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The last time the address was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
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

        /**
         * <p>Weight value (integer between 1 and 100), supports setting different weight values for each address, enabling resolution queries to return addresses according to the weight ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Load balancing policy among addresses in the address pool:</p>
         * <ul>
         * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned. The order of all addresses is rotated each time.</li>
         * <li>sequence: Sequential, for any source of DNS resolution requests, the address with the smaller sequence number (the sequence number indicates the priority of address returns, with smaller numbers having higher priority) is returned. If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
         * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the ratio of weights in resolution queries.</li>
         * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89528023225442**16</p>
         */
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        /**
         * <p>Address pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>AddressPool-1</p>
         */
        @NameInMap("AddressPoolName")
        public String addressPoolName;

        /**
         * <p>Address pool type:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressPoolType")
        public String addressPoolType;

        /**
         * <p>The addresses.</p>
         */
        @NameInMap("Addresses")
        public ListCloudGtmAddressPoolsResponseBodyAddressPoolsAddressPoolAddresses addresses;

        /**
         * <p>The availability state of the address pool. Valid values:</p>
         * <ul>
         * <li>Available: The address pool is available.</li>
         * <li>unavailable: The address pool is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <p>Address pool creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Address pool creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The enabling state of the address pool. Valid values:</p>
         * <ul>
         * <li>enable: The address pool is enabled.</li>
         * <li>disable: The address pool is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>The condition for determining the health state of the address. Valid values:</p>
         * <ul>
         * <li>any_ok: The health check results of at least one health check template are normal.</li>
         * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
         * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
         * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
         * <li>all_ok: The health check results of all health check templates are normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>any_ok</p>
         */
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <p>The health state of the address pool. Valid values:</p>
         * <ul>
         * <li>ok: The health state of the address pool is Normal and all addresses that are referenced by the address pool are available.</li>
         * <li>ok_alert: The health state of the address pool is Warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this state, available address pools are normally used for DNS resolution, but unavailable address pools cannot be used for DNS resolution.</li>
         * <li>exceptional: The health state of the address pool is Abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>Remark</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when AddressLbStrategy is set to sequence. Valid values:</p>
         * <ul>
         * <li>preemptive: The address with the smallest sequence number is preferentially used if this address is recovered.</li>
         * <li>non_preemptive: The current address is still used even if the address with the smallest sequence number is recovered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        /**
         * <p>Last modification time of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Last modification time of the address pool (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
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
