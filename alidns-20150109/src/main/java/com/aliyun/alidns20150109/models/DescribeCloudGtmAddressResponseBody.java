// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressResponseBody extends TeaModel {
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
    public DescribeCloudGtmAddressResponseBodyHealthTasks healthTasks;

    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

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
