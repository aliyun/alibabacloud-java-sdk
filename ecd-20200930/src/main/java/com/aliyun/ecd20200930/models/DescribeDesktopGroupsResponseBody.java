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
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The status of the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Stopped</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Starting</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Rebuilding</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Stopping</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Expired</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Deleted</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Pending</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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

    public static class DescribeDesktopGroupsResponseBodyDesktopGroups extends TeaModel {
        /**
         * <p>The number of concurrent sessions that is allowed for each cloud computer pool in a multi-session cloud computer pool.</p>
         */
        @NameInMap("BindAmount")
        public Long bindAmount;

        /**
         * <p>*   This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter specifies the number of cloud computers to purchase in the pool. Valid values: 0 to 200.</p>
         * <p>*   For a pay-as-you-go pool, this parameter specifies the minimum number of cloud computers to create in the pool. Valid values: 0 to `MaxDesktopsCount`. Default value: 1.</p>
         */
        @NameInMap("BuyDesktopsCount")
        public Integer buyDesktopsCount;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum period of time during which a session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds.</p>
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
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the cloud computer pool was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Alibaba Cloud account that creates the cloud computer pool.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The category of the user disk.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The user disk capacity. Unit: GiB.</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The number of cloud computers that are created.</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The ID of the cloud computer pool.</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the cloud computer pool.</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The cloud computer type. You can call the [DescribeDesktopTypes](~~188882~~) operation to query the IDs of the cloud computer types supported by WUYING Workspace.</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The number of users that are granted permissions to use the cloud computer pool.</p>
         */
        @NameInMap("EndUserCount")
        public Integer endUserCount;

        /**
         * <p>The time when the subscription cloud computer pool expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The version of the GPU driver.</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The GPU memory.</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The period of time after which a session is closed. After an end user connects to a cloud computer, the session is established. If the system does not detect inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds.</p>
         */
        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The keep-alive duration of a session after the session is disconnected. Valid values: 180000 (3 minutes) to 345600000 (4 days). Unit: milliseconds. If you set this parameter to 0, the session is permanently retained after it is disconnected.</p>
         * <br>
         * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can continue to access data of the session.</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session cloud computer pool.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0: depth-first</p>
         * <p>*   1: breadth-first</p>
         */
        @NameInMap("LoadPolicy")
        public Long loadPolicy;

        /**
         * <p>The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool.</p>
         */
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        /**
         * <p>The memory size. Unit: MiB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool.</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The name of the office network in which the cloud computer pool resides.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The ID of the office network to which the cloud computer pool belongs.</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account type of the office network.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PERSONAL: individual office network</p>
         * <p>*   SIMPLE: convenience office network</p>
         * <p>*   AD_CONNECTOR: enterprise Active Directory (AD) office network</p>
         * <p>*   RAM: Resource Access Management (RAM)-based office network</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The OS.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Linux</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Windows</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the cloud computer template.</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the cloud computer template.</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The type of the cloud computer pool.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0: individual (single session)</p>
         * <p>*   1: shared (multiple sessions)</p>
         */
        @NameInMap("OwnType")
        public Long ownType;

        /**
         * <p>The billing method of the cloud computer pool.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PostPaid: pay-as-you-go</p>
         * <p>*   PrePaid: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the policy that is associated with the cloud computer pool.</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The name of the policy that is associated with the cloud computer pool.</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The protocol type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   HDX</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ASP</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter indicates the condition that triggers auto scaling in a multi-session cloud computer pool. The ratio of connected sessions is calculated by using the following formula:</p>
         * <br>
         * <p>`Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%`.</p>
         * <br>
         * <p>When the specified threshold is reached, new cloud computers are automatically created. When the specified threshold is not reached, idle cloud computers are released.</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The disk reset type of the cloud computer pool.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0: does not reset disks</p>
         * <p>*   1: resets only the system disks</p>
         * <p>*   2: resets only the user disks</p>
         * <p>*   3: resets the system disks and user disks</p>
         */
        @NameInMap("ResetType")
        public Long resetType;

        /**
         * <p>The payment status of the cloud computer pool.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0: unpaid</p>
         * <p>*   1: paid</p>
         * <p>*   2: overdue or expired</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The period of time after which an idle cloud computer is stopped. When the specified period of time is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer is automatically started. Unit: milliseconds.</p>
         */
        @NameInMap("StopDuration")
        public Long stopDuration;

        /**
         * <p>The ID of the subnet.</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The category of the system disk.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The system disk capacity. Unit: GiB.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The version number of the cloud computer pool.</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key for disk encryption.</p>
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
