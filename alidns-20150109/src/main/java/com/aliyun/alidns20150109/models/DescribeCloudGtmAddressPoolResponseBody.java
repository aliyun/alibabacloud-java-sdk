// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <p>Load balancing policy among addresses in the address pool:</p>
     * <ul>
     * <li>round_robin: Round-robin, where for any source of DNS resolution requests, all addresses are returned, with a rotation of the order for every request.</li>
     * <li>sequence: Sequential, where for any source of DNS resolution requests, the address with the lower sequence number (indicating a higher priority, the smaller the number, the higher the priority) is returned. If the address with the lower sequence number is unavailable, the next address with a lower sequence number is returned.</li>
     * <li>weight: Weighted, supporting the setting of different weight values for each address to realize returning addresses according to the weight ratio of query resolutions.</li>
     * <li>source_nearest: Source-nearest, also known as intelligent resolution, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby servers.</li>
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
     * <p>pool-89564674533755**96</p>
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

    @NameInMap("Addresses")
    public DescribeCloudGtmAddressPoolResponseBodyAddresses addresses;

    /**
     * <p>Address pool availability status:</p>
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
     * <p>Address pool status:</p>
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
     * <p>The condition for determining the health status of the address pool. Valid values:</p>
     * <ul>
     * <li>any_ok: At least one address in the address pool is available.</li>
     * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
     * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
     * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
     * <li>all_ok: All addresses in the address pool are available.</li>
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
     * <li>ok: The health state of the address pool is normal and all addresses that are referenced by the address pool are available.</li>
     * <li>ok_alert: The health state of the address pool is warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this case, only the available addresses are returned for Domain Name System (DNS) requests.</li>
     * <li>exceptional: The health state of the address pool is abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>Remarks for the address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is returned only when the policy for load balancing between addresses is sequence. Valid values:</p>
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
     * <p>The last modification time of the address pool.</p>
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
        @NameInMap("Port")
        public Integer port;

        @NameInMap("TemplateId")
        public String templateId;

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
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressHealthTasks healthTasks;

        @NameInMap("ManualAvailableStatus")
        public String manualAvailableStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RequestSource")
        public DescribeCloudGtmAddressPoolResponseBodyAddressesAddressRequestSource requestSource;

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
