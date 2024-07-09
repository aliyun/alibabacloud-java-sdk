// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsResponseBody extends TeaModel {
    /**
     * <p>The cloud computer pools.</p>
     */
    @NameInMap("DesktopGroups")
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsResponseBody self = new DescribeDesktopGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupsResponseBody setDesktopGroups(java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups) {
        this.desktopGroups = desktopGroups;
        return this;
    }
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> getDesktopGroups() {
        return this.desktopGroups;
    }

    public DescribeDesktopGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus extends TeaModel {
        /**
         * <p>The total number of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The status of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Stopped</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Starting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Rebuilding</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Running</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Stopping</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Expired</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Deleted</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Pending</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus self = new DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDesktopGroupsResponseBodyDesktopGroupsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop_group_name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-dq2mybjr23yw*****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDesktopGroupsResponseBodyDesktopGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsResponseBodyDesktopGroupsTags self = new DescribeDesktopGroupsResponseBodyDesktopGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDesktopGroupsResponseBodyDesktopGroups extends TeaModel {
        /**
         * <p>The number of concurrent sessions that is allowed for each cloud computer pool in a multi-session cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindAmount")
        public Long bindAmount;

        /**
         * <ul>
         * <li>This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter specifies the number of cloud computers to purchase in the pool. Valid values: 0 to 200.</li>
         * <li>For a pay-as-you-go pool, this parameter specifies the minimum number of cloud computers to create in the pool. Valid values: 0 to <code>MaxDesktopsCount</code>. Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyDesktopsCount")
        public Integer buyDesktopsCount;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum period of time during which a session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>90000</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The number of cloud computers in each state.</p>
         */
        @NameInMap("CountPerStatus")
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus> countPerStatus;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the cloud computer pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-17T14:51:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Alibaba Cloud account that creates the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1007214305******</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The category of the user disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The user disk capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The number of cloud computers that are created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The ID of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of the cloud computer types supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.4c4g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The number of users that are granted permissions to use the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EndUserCount")
        public Integer endUserCount;

        /**
         * <p>The time when the subscription cloud computer pool expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-17T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The version of the GPU driver.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The GPU memory.</p>
         * 
         * <strong>example:</strong>
         * <p>16 GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The period of time after which a session is closed. After an end user connects to a cloud computer, the session is established. If the system does not detect inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>90000</p>
         */
        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-gq15cq5ydlvwn****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The keep-alive duration of a session after the session is disconnected. Valid values: 180000 (3 minutes) to 345600000 (4 days). Unit: milliseconds. If you set this parameter to 0, the session is permanently retained after it is disconnected.</p>
         * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can continue to access data of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: depth-first</li>
         * <li>1: breadth-first</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadPolicy")
        public Long loadPolicy;

        /**
         * <p>The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The name of the office network in which the cloud computer pool resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-467671****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The ID of the office network to which the cloud computer pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PERSONAL: individual office network</li>
         * <li>SIMPLE: convenience office network</li>
         * <li>AD_CONNECTOR: enterprise Active Directory (AD) office network</li>
         * <li>RAM: Resource Access Management (RAM)-based office network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The OS.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Linux</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>bundle_eds_general_4c8g_s8d5_win2019</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The type of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: individual (single session)</li>
         * <li>1: shared (multiple sessions)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnType")
        public Long ownType;

        /**
         * <p>The billing method of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the policy that is associated with the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-53iyi2aar0nd6c8qj</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The name of the policy that is associated with the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test-policy</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>HDX</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ASP</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter indicates the condition that triggers auto scaling in a multi-session cloud computer pool. The ratio of connected sessions is calculated by using the following formula:</p>
         * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code>.</p>
         * <p>When the specified threshold is reached, new cloud computers are automatically created. When the specified threshold is not reached, idle cloud computers are released.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The disk reset type of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: does not reset disks</li>
         * <li>1: resets only the system disks</li>
         * <li>2: resets only the user disks</li>
         * <li>3: resets the system disks and user disks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResetType")
        public Long resetType;

        /**
         * <p>The payment status of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: unpaid</li>
         * <li>1: paid</li>
         * <li>2: overdue or expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The period of time after which an idle cloud computer is stopped. When the specified period of time is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer is automatically started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900000</p>
         */
        @NameInMap("StopDuration")
        public Long stopDuration;

        /**
         * <p>The ID of the subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf63bb6*****8gfytm</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The category of the system disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The system disk capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags attached to the cloud computer pool.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsTags> tags;

        /**
         * <p>The version number of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key for disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>e5409ada-xxxx-xxxx-xxxx-89e31e23e993</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeDesktopGroupsResponseBodyDesktopGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsResponseBodyDesktopGroups self = new DescribeDesktopGroupsResponseBodyDesktopGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setBindAmount(Long bindAmount) {
            this.bindAmount = bindAmount;
            return this;
        }
        public Long getBindAmount() {
            return this.bindAmount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setBuyDesktopsCount(Integer buyDesktopsCount) {
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }
        public Integer getBuyDesktopsCount() {
            return this.buyDesktopsCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setConnectDuration(Long connectDuration) {
            this.connectDuration = connectDuration;
            return this;
        }
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCountPerStatus(java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus> countPerStatus) {
            this.countPerStatus = countPerStatus;
            return this;
        }
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus> getCountPerStatus() {
            return this.countPerStatus;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setEndUserCount(Integer endUserCount) {
            this.endUserCount = endUserCount;
            return this;
        }
        public Integer getEndUserCount() {
            return this.endUserCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setIdleDisconnectDuration(Long idleDisconnectDuration) {
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }
        public Long getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setLoadPolicy(Long loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Long getLoadPolicy() {
            return this.loadPolicy;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMaxDesktopsCount(Integer maxDesktopsCount) {
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setMinDesktopsCount(Integer minDesktopsCount) {
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnBundleId(String ownBundleId) {
            this.ownBundleId = ownBundleId;
            return this;
        }
        public String getOwnBundleId() {
            return this.ownBundleId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnBundleName(String ownBundleName) {
            this.ownBundleName = ownBundleName;
            return this;
        }
        public String getOwnBundleName() {
            return this.ownBundleName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOwnType(Long ownType) {
            this.ownType = ownType;
            return this;
        }
        public Long getOwnType() {
            return this.ownType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setResetType(Long resetType) {
            this.resetType = resetType;
            return this;
        }
        public Long getResetType() {
            return this.resetType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setTags(java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsTags> getTags() {
            return this.tags;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
