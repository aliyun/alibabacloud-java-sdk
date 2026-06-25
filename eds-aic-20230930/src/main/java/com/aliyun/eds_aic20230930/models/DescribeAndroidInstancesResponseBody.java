// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesResponseBody extends TeaModel {
    /**
     * <p>The instance information.</p>
     */
    @NameInMap("InstanceModel")
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel;

    /**
     * <p>The pagination token that indicates the position to which the current call has read. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmma/xxE9WtwL/ADvZ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAndroidInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstancesResponseBody self = new DescribeAndroidInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstancesResponseBody setInstanceModel(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel) {
        this.instanceModel = instanceModel;
        return this;
    }
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> getInstanceModel() {
        return this.instanceModel;
    }

    public DescribeAndroidInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAndroidInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy extends TeaModel {
        /**
         * <p>The application management policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amp-dgiavcvibfdds****</p>
         */
        @NameInMap("AppManagePolicyId")
        public String appManagePolicyId;

        /**
         * <p>The name of the application management policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Application group 1</p>
         */
        @NameInMap("AppManagePolicyName")
        public String appManagePolicyName;

        public static DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy self = new DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy setAppManagePolicyId(String appManagePolicyId) {
            this.appManagePolicyId = appManagePolicyId;
            return this;
        }
        public String getAppManagePolicyId() {
            return this.appManagePolicyId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy setAppManagePolicyName(String appManagePolicyName) {
            this.appManagePolicyName = appManagePolicyName;
            return this;
        }
        public String getAppManagePolicyName() {
            return this.appManagePolicyName;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelBizTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>releaseFlag</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAndroidInstancesResponseBodyInstanceModelBizTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelBizTags self = new DescribeAndroidInstancesResponseBodyInstanceModelBizTags();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelBizTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelBizTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelDisks extends TeaModel {
        /**
         * <p>The disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        public static DescribeAndroidInstancesResponseBodyInstanceModelDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelDisks self = new DescribeAndroidInstancesResponseBodyInstanceModelDisks();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig extends TeaModel {
        /**
         * <p>DPI。</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Dpi")
        public Integer dpi;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <p>Indicates whether the resolution is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        /**
         * <p>The height of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The width of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        public static DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig self = new DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig setDpi(Integer dpi) {
            this.dpi = dpi;
            return this;
        }
        public Integer getDpi() {
            return this.dpi;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig setLockResolution(String lockResolution) {
            this.lockResolution = lockResolution;
            return this;
        }
        public String getLockResolution() {
            return this.lockResolution;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo extends TeaModel {
        /**
         * <p>The independent device storage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-sbcudgidbhb****</p>
         */
        @NameInMap("PhoneDataId")
        public String phoneDataId;

        /**
         * <p>The capacity of the independent device storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PhoneDataVolume")
        public Integer phoneDataVolume;

        public static DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo self = new DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo setPhoneDataId(String phoneDataId) {
            this.phoneDataId = phoneDataId;
            return this;
        }
        public String getPhoneDataId() {
            return this.phoneDataId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo setPhoneDataVolume(Integer phoneDataVolume) {
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }
        public Integer getPhoneDataVolume() {
            return this.phoneDataVolume;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAndroidInstancesResponseBodyInstanceModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelTags self = new DescribeAndroidInstancesResponseBodyInstanceModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModel extends TeaModel {
        /**
         * <p>The ID of the instance group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-ayyhomlal7po****</p>
         */
        @NameInMap("AndroidInstanceGroupId")
        public String androidInstanceGroupId;

        /**
         * <p>The instance group name.</p>
         * 
         * <strong>example:</strong>
         * <p>AndroidInstanceGroupName</p>
         */
        @NameInMap("AndroidInstanceGroupName")
        public String androidInstanceGroupName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-8at8h6ejkadjh****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AndroidInstanceStatus")
        public String androidInstanceStatus;

        /**
         * <p>The delivery group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-i7yv6tkn7kh8dv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The physical instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-9ey6io0q58rcd****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <p>The application management policy information. This corresponds to the blacklists and whitelists management of application management policies in the console.</p>
         */
        @NameInMap("AppManagePolicy")
        public DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy appManagePolicy;

        /**
         * <p>The assigned user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthorizedUserId")
        public String authorizedUserId;

        /**
         * <p>The bandwidth package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np-0q6ixs7vpxcizp***</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The bandwidth type.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp_ecd</p>
         */
        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        /**
         * <p>The bound user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BindUserId")
        public String bindUserId;

        @NameInMap("BizImageType")
        public String bizImageType;

        /**
         * <p>The tag array.</p>
         */
        @NameInMap("BizTags")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> bizTags;

        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The billing type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disk information.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> disks;

        /**
         * <p>The display settings.</p>
         */
        @NameInMap("DisplayConfig")
        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig displayConfig;

        /**
         * <p>The downstream bandwidth throttling. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DownBandwidthLimit")
        public Integer downBandwidthLimit;

        /**
         * <p>The error reason for instance data backup failure or recovery failure.</p>
         * 
         * <strong>example:</strong>
         * <p>FilePathNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time of the subscription instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-15T02:03:33Z</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3.867</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetStatus")
        public String internetStatus;

        /**
         * <p>The key pair ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-5hh431emkpucs****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The IP address of the network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.22.48</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NetworkInterfaceIpv6Address")
        public String networkInterfaceIpv6Address;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>network_pro_ecd</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The network ID. This corresponds to the network selected during creation in the console (basic shared network or advanced shared network).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-211620****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The persistent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0btrd5zj8epo****</p>
         */
        @NameInMap("PersistentAppInstanceId")
        public String persistentAppInstanceId;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The independent device storage information of the cloud phone matrix edition instance.
         * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
         */
        @NameInMap("PhoneDataInfo")
        public DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo phoneDataInfo;

        /**
         * <p>The policy group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0bszojpu0seql****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.32.1.41</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("PublicIpv6Address")
        public String publicIpv6Address;

        /**
         * <p>The public network rate limiting rule ID (applies only to premium bandwidth).</p>
         * 
         * <strong>example:</strong>
         * <p>qos-5605u0gelk200****</p>
         */
        @NameInMap("QosRuleId")
        public String qosRuleId;

        /**
         * <p>The progress of instance data backup or recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The rendering type.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("RenderingType")
        public String renderingType;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The matrix status.
         * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ServerStatus")
        public String serverStatus;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The cloud phone matrix specification.
         * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gx7.10xlarge</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The session connection status.</p>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The streaming mode of instances in the cloud phone matrix.
         * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamMode")
        public Integer streamMode;

        /**
         * <p>The Android system version.</p>
         * 
         * <strong>example:</strong>
         * <p>Android 11</p>
         */
        @NameInMap("SystemVersion")
        public String systemVersion;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> tags;

        /**
         * <p>The upstream bandwidth throttling. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UpBandwidthLimit")
        public Integer upBandwidthLimit;

        /**
         * <p>The vSwitch ID in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zepmau2hsbhos42****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAndroidInstancesResponseBodyInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModel self = new DescribeAndroidInstancesResponseBodyInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceGroupId(String androidInstanceGroupId) {
            this.androidInstanceGroupId = androidInstanceGroupId;
            return this;
        }
        public String getAndroidInstanceGroupId() {
            return this.androidInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceGroupName(String androidInstanceGroupName) {
            this.androidInstanceGroupName = androidInstanceGroupName;
            return this;
        }
        public String getAndroidInstanceGroupName() {
            return this.androidInstanceGroupName;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceName(String androidInstanceName) {
            this.androidInstanceName = androidInstanceName;
            return this;
        }
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceStatus(String androidInstanceStatus) {
            this.androidInstanceStatus = androidInstanceStatus;
            return this;
        }
        public String getAndroidInstanceStatus() {
            return this.androidInstanceStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppManagePolicy(DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy appManagePolicy) {
            this.appManagePolicy = appManagePolicy;
            return this;
        }
        public DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy getAppManagePolicy() {
            return this.appManagePolicy;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAuthorizedUserId(String authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBindUserId(String bindUserId) {
            this.bindUserId = bindUserId;
            return this;
        }
        public String getBindUserId() {
            return this.bindUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBizImageType(String bizImageType) {
            this.bizImageType = bizImageType;
            return this;
        }
        public String getBizImageType() {
            return this.bizImageType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBizTags(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> getBizTags() {
            return this.bizTags;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setDisks(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> getDisks() {
            return this.disks;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setDisplayConfig(DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig displayConfig) {
            this.displayConfig = displayConfig;
            return this;
        }
        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig getDisplayConfig() {
            return this.displayConfig;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setDownBandwidthLimit(Integer downBandwidthLimit) {
            this.downBandwidthLimit = downBandwidthLimit;
            return this;
        }
        public Integer getDownBandwidthLimit() {
            return this.downBandwidthLimit;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setInternetStatus(String internetStatus) {
            this.internetStatus = internetStatus;
            return this;
        }
        public String getInternetStatus() {
            return this.internetStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkInterfaceIpv6Address(String networkInterfaceIpv6Address) {
            this.networkInterfaceIpv6Address = networkInterfaceIpv6Address;
            return this;
        }
        public String getNetworkInterfaceIpv6Address() {
            return this.networkInterfaceIpv6Address;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPersistentAppInstanceId(String persistentAppInstanceId) {
            this.persistentAppInstanceId = persistentAppInstanceId;
            return this;
        }
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPhoneDataInfo(DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo phoneDataInfo) {
            this.phoneDataInfo = phoneDataInfo;
            return this;
        }
        public DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo getPhoneDataInfo() {
            return this.phoneDataInfo;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPublicIpv6Address(String publicIpv6Address) {
            this.publicIpv6Address = publicIpv6Address;
            return this;
        }
        public String getPublicIpv6Address() {
            return this.publicIpv6Address;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setQosRuleId(String qosRuleId) {
            this.qosRuleId = qosRuleId;
            return this;
        }
        public String getQosRuleId() {
            return this.qosRuleId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRenderingType(String renderingType) {
            this.renderingType = renderingType;
            return this;
        }
        public String getRenderingType() {
            return this.renderingType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setServerStatus(String serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public String getServerStatus() {
            return this.serverStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setStreamMode(Integer streamMode) {
            this.streamMode = streamMode;
            return this;
        }
        public Integer getStreamMode() {
            return this.streamMode;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setTags(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> getTags() {
            return this.tags;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setUpBandwidthLimit(Integer upBandwidthLimit) {
            this.upBandwidthLimit = upBandwidthLimit;
            return this;
        }
        public Integer getUpBandwidthLimit() {
            return this.upBandwidthLimit;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
