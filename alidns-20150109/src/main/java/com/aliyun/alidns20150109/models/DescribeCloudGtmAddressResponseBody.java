// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressResponseBody extends TeaModel {
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
     * <p>addr-89518218114368**92</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>Address ownership information.</p>
     * 
     * <strong>example:</strong>
     * <p>The current version does not support passing this parameter, please do not input the parameter.</p>
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
     * <p>Address availability status:</p>
     * <ul>
     * <li>available: Available</li>
     * <li>unavailable: Unavailable</li>
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
     * <p>2024-03-23T13:09Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Creation time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>Indicates the current enabled status of the address:
     * enabled: enabled state
     * disabled: disabled state</p>
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
     * <li>ok_alert: The address fails some health checks of the referenced health check templates but the address is deemed normal.</li>
     * <li>ok_no_monitor: The address does not reference a health check template.</li>
     * <li>exceptional: The address fails some or all health checks of the referenced health check templates and the address is deemed abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The health check tasks referenced by the address.</p>
     */
    @NameInMap("HealthTasks")
    public DescribeCloudGtmAddressResponseBodyHealthTasks healthTasks;

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
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Address type:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * <li>domain</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The last modification time of the address configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-29T13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>Modified time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeCloudGtmAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressResponseBody self = new DescribeCloudGtmAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeCloudGtmAddressResponseBody setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public DescribeCloudGtmAddressResponseBody setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public DescribeCloudGtmAddressResponseBody setAvailableMode(String availableMode) {
        this.availableMode = availableMode;
        return this;
    }
    public String getAvailableMode() {
        return this.availableMode;
    }

    public DescribeCloudGtmAddressResponseBody setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public DescribeCloudGtmAddressResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCloudGtmAddressResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCloudGtmAddressResponseBody setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public DescribeCloudGtmAddressResponseBody setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public DescribeCloudGtmAddressResponseBody setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeCloudGtmAddressResponseBody setHealthTasks(DescribeCloudGtmAddressResponseBodyHealthTasks healthTasks) {
        this.healthTasks = healthTasks;
        return this;
    }
    public DescribeCloudGtmAddressResponseBodyHealthTasks getHealthTasks() {
        return this.healthTasks;
    }

    public DescribeCloudGtmAddressResponseBody setManualAvailableStatus(String manualAvailableStatus) {
        this.manualAvailableStatus = manualAvailableStatus;
        return this;
    }
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    public DescribeCloudGtmAddressResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudGtmAddressResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCloudGtmAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmAddressResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeCloudGtmAddressResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCloudGtmAddressResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask extends TeaModel {
        /**
         * <p>The state of the health check task. Valid values:</p>
         * <ul>
         * <li>ok: The task is normal.</li>
         * <li>alert: An alert is triggered.</li>
         * <li>no_data: No data is available. In most cases, the health check task is newly created and no data is collected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        /**
         * <p>The target service port for health checks. When the Ping protocol is selected for health checks, configuration of the service port is not supported.</p>
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
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>Ping-IPv4</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask self = new DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DescribeCloudGtmAddressResponseBodyHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask> healthTask;

        public static DescribeCloudGtmAddressResponseBodyHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressResponseBodyHealthTasks self = new DescribeCloudGtmAddressResponseBodyHealthTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressResponseBodyHealthTasks setHealthTask(java.util.List<DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressResponseBodyHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

}
