// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesResponseBody extends TeaModel {
    /**
     * <p>The cloud phone instances.</p>
     */
    @NameInMap("InstanceModel")
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmma/xxE9WtwL/ADvZ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
        @NameInMap("AppManagePolicyId")
        public String appManagePolicyId;

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
        @NameInMap("Key")
        public String key;

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
         * <p>The type of the disk.</p>
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
        @NameInMap("Dpi")
        public Integer dpi;

        @NameInMap("Fps")
        public Integer fps;

        @NameInMap("LockResolution")
        public String lockResolution;

        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

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
        @NameInMap("PhoneDataId")
        public String phoneDataId;

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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-ayyhomlal7po****</p>
         */
        @NameInMap("AndroidInstanceGroupId")
        public String androidInstanceGroupId;

        /**
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>AndroidInstanceGroupName</p>
         */
        @NameInMap("AndroidInstanceGroupName")
        public String androidInstanceGroupName;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-8at8h6ejkadjh****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <p>The state of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AndroidInstanceStatus")
        public String androidInstanceStatus;

        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-i7yv6tkn7kh8dv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The ID of the physical instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-9ey6io0q58rcd****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("AppManagePolicy")
        public DescribeAndroidInstancesResponseBodyInstanceModelAppManagePolicy appManagePolicy;

        /**
         * <p>The ID of the user to whom the instance is assigned.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthorizedUserId")
        public String authorizedUserId;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        /**
         * <p>The ID of the bound user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BindUserId")
        public String bindUserId;

        @NameInMap("BizTags")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> bizTags;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> disks;

        @NameInMap("DisplayConfig")
        public DescribeAndroidInstancesResponseBodyInstanceModelDisplayConfig displayConfig;

        @NameInMap("DownBandwidthLimit")
        public Integer downBandwidthLimit;

        /**
         * <p>The cause of the instance data backup failure or restoration failure.</p>
         * 
         * <strong>example:</strong>
         * <p>FilePathNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the subscription instance group expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-15T02:03:33Z</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the instance was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3.867</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the key pair.</p>
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
         * <p>The IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.22.48</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NetworkInterfaceIpv6Address")
        public String networkInterfaceIpv6Address;

        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-211620****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The ID of the persistent session.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0btrd5zj8epo****</p>
         */
        @NameInMap("PersistentAppInstanceId")
        public String persistentAppInstanceId;

        @NameInMap("PhoneDataInfo")
        public DescribeAndroidInstancesResponseBodyInstanceModelPhoneDataInfo phoneDataInfo;

        /**
         * <p>The ID of the policy.</p>
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
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("PublicIpv6Address")
        public String publicIpv6Address;

        @NameInMap("QosRuleId")
        public String qosRuleId;

        /**
         * <p>The progress of instance data backup or restoration.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The region ID of the instance.</p>
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

        @NameInMap("ServerStatus")
        public String serverStatus;

        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The session status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>disConnect: The session is disconnected.</li>
         * <li>connect: The session is connected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("StreamMode")
        public Integer streamMode;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> tags;

        @NameInMap("UpBandwidthLimit")
        public Integer upBandwidthLimit;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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

        public DescribeAndroidInstancesResponseBodyInstanceModel setBizTags(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelBizTags> getBizTags() {
            return this.bizTags;
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
