// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of the shared cloud desktop groups.</p>
     */
    @NameInMap("DesktopGroups")
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups;

    /**
     * <p>The token used to retrieve the next page of results. If this parameter is not returned, it indicates that all results have been returned.</p>
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
         * <p>The number of cloud desktops in the specified status.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The status of the cloud desktop.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop_group_name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The number of concurrent sessions allowed per cloud desktop in a multi-session shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BindAmount")
        public Long bindAmount;

        /**
         * <p>The number of cloud desktops that you purchase. This parameter applies only to subscription shared cloud desktop groups. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyDesktopsCount")
        public Integer buyDesktopsCount;

        /**
         * <p>The comments on the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum session duration, in milliseconds. When this duration is reached, the session is automatically disconnected.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The number of cloud desktops in each status.</p>
         */
        @NameInMap("CountPerStatus")
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsCountPerStatus> countPerStatus;

        /**
         * <p>The number of vCPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the shared cloud desktop group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-17T14:51:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that created the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>1007214305******</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The type of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The data disk size in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The number of cloud desktops created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The ID of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudComputerPool01</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The desktop type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the desktop types supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.4c4g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The number of authorized users of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EndUserCount")
        public Integer endUserCount;

        @NameInMap("EntraDomainName")
        public String entraDomainName;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the subscription shared cloud desktop group expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-17T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ExpiredTimes")
        public java.util.List<String> expiredTimes;

        /**
         * <p>The number of vGPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>16 GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The amount of time, in milliseconds, that a session can remain idle. If a session remains idle for longer than this duration, it is automatically disconnected. A session is considered idle if there is no keyboard or mouse activity.</p>
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

        @NameInMap("IsLdap")
        public Boolean isLdap;

        /**
         * <p>The duration, in milliseconds, to retain a disconnected session. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * <p>When a session disconnects, the user can reconnect within this period to resume their work. If the user fails to reconnect in time, the session is terminated and unsaved data is lost.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for the multi-session shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadPolicy")
        public Long loadPolicy;

        /**
         * <ul>
         * <li><p>For a pay-as-you-go shared cloud desktop group, this parameter specifies the maximum number of cloud desktops that the group can contain.</p>
         * </li>
         * <li><p>For a subscription shared cloud desktop group, this parameter specifies the total number of cloud desktops, which is the sum of the initially purchased desktops (indicated by the <code>BuyDesktopsCount</code> parameter) and the desktops that can be automatically created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        /**
         * <p>The memory size in MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <ul>
         * <li><p>For a pay-as-you-go shared cloud desktop group, this specifies the minimum number of cloud desktops to maintain in the group.</p>
         * </li>
         * <li><p>For a subscription shared cloud desktop group, this parameter has the same value as <code>BuyDesktopsCount</code> and specifies the number of cloud desktops that you initially purchase.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-467671****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The OS.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the cloud desktop template.</p>
         * 
         * <strong>example:</strong>
         * <p>bundle_eds_general_4c8g_s8d5_win2019</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the cloud desktop template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The type of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnType")
        public Long ownType;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the policy associated with the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-53iyi2aar0nd6c8qj</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupIdList")
        public java.util.List<String> policyGroupIdList;

        /**
         * <p>The name of the policy associated with the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>All enabled policy</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("PolicyGroupNameList")
        public java.util.List<String> policyGroupNameList;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("QosRuleId")
        public String qosRuleId;

        /**
         * <p>The session utilization threshold that triggers auto scaling for a multi-session shared cloud desktop group. Session utilization is calculated by using the following formula:</p>
         * <p><code>Session utilization = Number of active sessions / (Total number of cloud desktops × Maximum number of sessions per cloud desktop) × 100%</code></p>
         * <p>When the session utilization exceeds this threshold, the system scales out by creating new cloud desktops. When the utilization falls below this threshold, the system scales in by removing idle cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The reset type of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResetType")
        public Long resetType;

        @NameInMap("SimpleUserGroupId")
        public String simpleUserGroupId;

        /**
         * <p>The status of the shared cloud desktop group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The period of inactivity, in milliseconds, after which an idle cloud desktop is automatically stopped. If a user tries to connect to a stopped desktop, the desktop is automatically started.</p>
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
         * <p>The type of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The system disk size in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags attached to the shared cloud desktop group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroupsTags> tags;

        @NameInMap("UserGroupName")
        public String userGroupName;

        /**
         * <p>The path of the organizational unit (OU).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("UserOuPath")
        public String userOuPath;

        /**
         * <p>The version number of the shared cloud desktop group.</p>
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
         * <p>The ID of the KMS key used for disk encryption.</p>
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setEntraDomainName(String entraDomainName) {
            this.entraDomainName = entraDomainName;
            return this;
        }
        public String getEntraDomainName() {
            return this.entraDomainName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setExpiredTimes(java.util.List<String> expiredTimes) {
            this.expiredTimes = expiredTimes;
            return this;
        }
        public java.util.List<String> getExpiredTimes() {
            return this.expiredTimes;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setIsLdap(Boolean isLdap) {
            this.isLdap = isLdap;
            return this;
        }
        public Boolean getIsLdap() {
            return this.isLdap;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupIdList(java.util.List<String> policyGroupIdList) {
            this.policyGroupIdList = policyGroupIdList;
            return this;
        }
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setPolicyGroupNameList(java.util.List<String> policyGroupNameList) {
            this.policyGroupNameList = policyGroupNameList;
            return this;
        }
        public java.util.List<String> getPolicyGroupNameList() {
            return this.policyGroupNameList;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setQosRuleId(String qosRuleId) {
            this.qosRuleId = qosRuleId;
            return this;
        }
        public String getQosRuleId() {
            return this.qosRuleId;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setSimpleUserGroupId(String simpleUserGroupId) {
            this.simpleUserGroupId = simpleUserGroupId;
            return this;
        }
        public String getSimpleUserGroupId() {
            return this.simpleUserGroupId;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setUserOuPath(String userOuPath) {
            this.userOuPath = userOuPath;
            return this;
        }
        public String getUserOuPath() {
            return this.userOuPath;
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
