// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>round_robin</p>
     */
    @NameInMap("AddressLbStrategy")
    public String addressLbStrategy;

    /**
     * <strong>example:</strong>
     * <p>pool-89564674533755**96</p>
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

    @NameInMap("Addresses")
    public DescribeCloudGtmAddressPoolResponseBodyAddresses addresses;

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
     * <p>any_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>preemptive</p>
     */
    @NameInMap("SequenceLbStrategyMode")
    public String sequenceLbStrategyMode;

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

    public static DescribeCloudGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolResponseBody self = new DescribeCloudGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolResponseBody setAddressLbStrategy(String addressLbStrategy) {
        this.addressLbStrategy = addressLbStrategy;
        return this;
    }
    public String getAddressLbStrategy() {
        return this.addressLbStrategy;
    }

    public DescribeCloudGtmAddressPoolResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public DescribeCloudGtmAddressPoolResponseBody setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public DescribeCloudGtmAddressPoolResponseBody setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public DescribeCloudGtmAddressPoolResponseBody setAddresses(DescribeCloudGtmAddressPoolResponseBodyAddresses addresses) {
        this.addresses = addresses;
        return this;
    }
    public DescribeCloudGtmAddressPoolResponseBodyAddresses getAddresses() {
        return this.addresses;
    }

    public DescribeCloudGtmAddressPoolResponseBody setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public DescribeCloudGtmAddressPoolResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCloudGtmAddressPoolResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCloudGtmAddressPoolResponseBody setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public DescribeCloudGtmAddressPoolResponseBody setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public DescribeCloudGtmAddressPoolResponseBody setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeCloudGtmAddressPoolResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCloudGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmAddressPoolResponseBody setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
        this.sequenceLbStrategyMode = sequenceLbStrategyMode;
        return this;
    }
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

    public DescribeCloudGtmAddressPoolResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCloudGtmAddressPoolResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask extends TeaModel {
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
         * <p>IPv4-Ping</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask self = new DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks extends TeaModel {
        @NameInMap("HealthTask")
        public java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask> healthTask;

        public static DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks self = new DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks setHealthTask(java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask> healthTask) {
            this.healthTask = healthTask;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasksHealthTask> getHealthTask() {
            return this.healthTask;
        }

    }

    public static class DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource extends TeaModel {
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        public static DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource self = new DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

    }

    public static class DescribeCloudGtmAddressPoolResponseBodyAddressesAddress extends TeaModel {
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
         * <p>any_ok</p>
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
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks healthTasks;

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

        @NameInMap("RequestSource")
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource requestSource;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SeqNonPreemptiveSchedule")
        public Boolean seqNonPreemptiveSchedule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("Type")
        public String type;

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

        public static DescribeCloudGtmAddressPoolResponseBodyAddressesAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolResponseBodyAddressesAddress self = new DescribeCloudGtmAddressPoolResponseBodyAddressesAddress();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setAvailableMode(String availableMode) {
            this.availableMode = availableMode;
            return this;
        }
        public String getAvailableMode() {
            return this.availableMode;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setHealthTasks(DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks healthTasks) {
            this.healthTasks = healthTasks;
            return this;
        }
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks getHealthTasks() {
            return this.healthTasks;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setManualAvailableStatus(String manualAvailableStatus) {
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setRequestSource(DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource getRequestSource() {
            return this.requestSource;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setSeqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
            this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
            return this;
        }
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddress setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

    public static class DescribeCloudGtmAddressPoolResponseBodyAddresses extends TeaModel {
        @NameInMap("Address")
        public java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddress> address;

        public static DescribeCloudGtmAddressPoolResponseBodyAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressPoolResponseBodyAddresses self = new DescribeCloudGtmAddressPoolResponseBodyAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressPoolResponseBodyAddresses setAddress(java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressPoolResponseBodyAddressesAddress> getAddress() {
            return this.address;
        }

    }

}
