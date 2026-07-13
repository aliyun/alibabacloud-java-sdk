// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressResponseBody extends TeaModel {
    /**
     * <p>The IP address or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The unique ID of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368****</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>The attribution information of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>当前版本不支持此参数，不会返回地址归属信息。</p>
     */
    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>The switchover mode for the address when a health check detects an exception:</p>
     * <ul>
     * <li><p>auto: Automatic mode. The system determines whether to stop or resume DNS resolution for the address based on health check results. DNS resolution is stopped if the address is abnormal and is resumed if the address becomes normal.</p>
     * </li>
     * <li><p>manual: Manual mode. You manually control the address status. If the address is set to abnormal, DNS resolution is stopped and is not resumed even if the health check result is normal. If the address is set to normal, DNS resolution is performed. An alert is triggered but DNS resolution is not stopped if a health check detects an exception.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    /**
     * <p>The availability status of the address:</p>
     * <ul>
     * <li><p>available: The address is available.</p>
     * </li>
     * <li><p>unavailable: The address is unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <p>The time when the address was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-23T13:09Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The UNIX timestamp when the address was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The enabled status of the address:</p>
     * <p>enable: The address is enabled.</p>
     * <p>disable: The address is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The health determination condition for the address:</p>
     * <ul>
     * <li><p>any_ok: At least one health check probe is normal.</p>
     * </li>
     * <li><p>p30_ok: At least 30% of health check probes are normal.</p>
     * </li>
     * <li><p>p50_ok: At least 50% of health check probes are normal.</p>
     * </li>
     * <li><p>p70_ok: At least 70% of health check probes are normal.</p>
     * </li>
     * <li><p>all_ok: All health check probes are normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>The health check result of the address:</p>
     * <ul>
     * <li><p>ok: All health check tasks that are associated with the address are normal.</p>
     * </li>
     * <li><p>ok_alert: Some health check tasks that are associated with the address are abnormal, but the address is still considered normal.</p>
     * </li>
     * <li><p>ok_no_monitor: The address is not associated with any health check tasks.</p>
     * </li>
     * <li><p>exceptional: Some or all health check tasks that are associated with the address are abnormal, and the address is considered abnormal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("HealthTasks")
    public DescribeCloudGtmAddressResponseBodyHealthTasks healthTasks;

    /**
     * <p>The availability status of the address that is set when the switchover mode is manual:</p>
     * <ul>
     * <li><p>available: The address is available. DNS resolution is performed for the address. If a health check detects an exception, an alert is triggered but DNS resolution is not stopped.</p>
     * </li>
     * <li><p>unavailable: The address is unavailable. DNS resolution is stopped for the address and is not resumed even if the health check result is normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    /**
     * <p>The name of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the address. Valid values:</p>
     * <ul>
     * <li><p>IPv4</p>
     * </li>
     * <li><p>IPv6</p>
     * </li>
     * <li><p>domain</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the address configuration was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-29T13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The UNIX timestamp when the address was last modified.</p>
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
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("TemplateId")
        public String templateId;

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
