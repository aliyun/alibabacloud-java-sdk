// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    /**
     * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of connected subscription cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("OnlinePrePaidDesktopsCount")
    public Integer onlinePrePaidDesktopsCount;

    /**
     * <p>A list of subscription cloud desktops.</p>
     */
    @NameInMap("PaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPaidDesktops> paidDesktops;

    /**
     * <p>The total number of subscription cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PaidDesktopsCount")
    public Integer paidDesktopsCount;

    /**
     * <p>A list of pay-as-you-go cloud desktops.</p>
     */
    @NameInMap("PostPaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPostPaidDesktops> postPaidDesktops;

    /**
     * <p>The total number of pay-as-you-go cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PostPaidDesktopsCount")
    public Integer postPaidDesktopsCount;

    /**
     * <p>The total billed amount for the pay-as-you-go cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("PostPaidDesktopsTotalAmount")
    public Integer postPaidDesktopsTotalAmount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of running subscription cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RunningPrePaidDesktopsCount")
    public Integer runningPrePaidDesktopsCount;

    /**
     * <p>Deprecated. This parameter is misspelled. Use <code>StoppedPrePaidDesktopsCount</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StopedPrePaidDesktopsCount")
    public Integer stopedPrePaidDesktopsCount;

    /**
     * <p>The number of stopped subscription cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StoppedPrePaidDesktopsCount")
    public Integer stoppedPrePaidDesktopsCount;

    public static DescribeDesktopsInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsInGroupResponseBody self = new DescribeDesktopsInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsInGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsInGroupResponseBody setOnlinePrePaidDesktopsCount(Integer onlinePrePaidDesktopsCount) {
        this.onlinePrePaidDesktopsCount = onlinePrePaidDesktopsCount;
        return this;
    }
    public Integer getOnlinePrePaidDesktopsCount() {
        return this.onlinePrePaidDesktopsCount;
    }

    public DescribeDesktopsInGroupResponseBody setPaidDesktops(java.util.List<DescribeDesktopsInGroupResponseBodyPaidDesktops> paidDesktops) {
        this.paidDesktops = paidDesktops;
        return this;
    }
    public java.util.List<DescribeDesktopsInGroupResponseBodyPaidDesktops> getPaidDesktops() {
        return this.paidDesktops;
    }

    public DescribeDesktopsInGroupResponseBody setPaidDesktopsCount(Integer paidDesktopsCount) {
        this.paidDesktopsCount = paidDesktopsCount;
        return this;
    }
    public Integer getPaidDesktopsCount() {
        return this.paidDesktopsCount;
    }

    public DescribeDesktopsInGroupResponseBody setPostPaidDesktops(java.util.List<DescribeDesktopsInGroupResponseBodyPostPaidDesktops> postPaidDesktops) {
        this.postPaidDesktops = postPaidDesktops;
        return this;
    }
    public java.util.List<DescribeDesktopsInGroupResponseBodyPostPaidDesktops> getPostPaidDesktops() {
        return this.postPaidDesktops;
    }

    public DescribeDesktopsInGroupResponseBody setPostPaidDesktopsCount(Integer postPaidDesktopsCount) {
        this.postPaidDesktopsCount = postPaidDesktopsCount;
        return this;
    }
    public Integer getPostPaidDesktopsCount() {
        return this.postPaidDesktopsCount;
    }

    public DescribeDesktopsInGroupResponseBody setPostPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
        this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
        return this;
    }
    public Integer getPostPaidDesktopsTotalAmount() {
        return this.postPaidDesktopsTotalAmount;
    }

    public DescribeDesktopsInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopsInGroupResponseBody setRunningPrePaidDesktopsCount(Integer runningPrePaidDesktopsCount) {
        this.runningPrePaidDesktopsCount = runningPrePaidDesktopsCount;
        return this;
    }
    public Integer getRunningPrePaidDesktopsCount() {
        return this.runningPrePaidDesktopsCount;
    }

    public DescribeDesktopsInGroupResponseBody setStopedPrePaidDesktopsCount(Integer stopedPrePaidDesktopsCount) {
        this.stopedPrePaidDesktopsCount = stopedPrePaidDesktopsCount;
        return this;
    }
    public Integer getStopedPrePaidDesktopsCount() {
        return this.stopedPrePaidDesktopsCount;
    }

    public DescribeDesktopsInGroupResponseBody setStoppedPrePaidDesktopsCount(Integer stoppedPrePaidDesktopsCount) {
        this.stoppedPrePaidDesktopsCount = stoppedPrePaidDesktopsCount;
        return this;
    }
    public Integer getStoppedPrePaidDesktopsCount() {
        return this.stoppedPrePaidDesktopsCount;
    }

    public static class DescribeDesktopsInGroupResponseBodyPaidDesktops extends TeaModel {
        /**
         * <p>The connection status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ud-7ftf5b6yu77b0****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the authorized end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The IDs of end users connected to the cloud desktop. If no end user is connected, the array is empty.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The name of the authorized end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserName")
        public String endUserName;

        /**
         * <p>The usernames of end users connected to the cloud desktop. If no end user is connected, the array is empty.</p>
         */
        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        /**
         * <p>The expiration time of the subscription cloud desktop.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-R-20220914.17****</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The GPU driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-hn5v2mmk0****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Win10_ZC</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The management flag.</p>
         * 
         * <strong>example:</strong>
         * <p>NoFlag</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The management flags.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The IP address of the secondary elastic network interface of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

        /**
         * <p>The type of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The IP address of the primary network interface of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrimaryEniIp")
        public String primaryEniIp;

        /**
         * <p>The session protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The time when the cloud desktop was last reset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-03 08:48:08</p>
         */
        @NameInMap("ResetTime")
        public String resetTime;

        /**
         * <p>The size of the system disk, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopsInGroupResponseBodyPaidDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsInGroupResponseBodyPaidDesktops self = new DescribeDesktopsInGroupResponseBodyPaidDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setEndUserName(String endUserName) {
            this.endUserName = endUserName;
            return this;
        }
        public String getEndUserName() {
            return this.endUserName;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setEndUserNames(java.util.List<String> endUserNames) {
            this.endUserNames = endUserNames;
            return this;
        }
        public java.util.List<String> getEndUserNames() {
            return this.endUserNames;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setMemberEniIp(String memberEniIp) {
            this.memberEniIp = memberEniIp;
            return this;
        }
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setPrimaryEniIp(String primaryEniIp) {
            this.primaryEniIp = primaryEniIp;
            return this;
        }
        public String getPrimaryEniIp() {
            return this.primaryEniIp;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setResetTime(String resetTime) {
            this.resetTime = resetTime;
            return this;
        }
        public String getResetTime() {
            return this.resetTime;
        }

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeDesktopsInGroupResponseBodyPostPaidDesktops extends TeaModel {
        /**
         * <p>The connection status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The retention period of the cloud desktop, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4153958447</p>
         */
        @NameInMap("CreateDuration")
        public String createDuration;

        /**
         * <p>The creation time of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-21T06:34:57Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ud-2i8qxpv6t1a07****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the authorized end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The IDs of end users connected to the cloud desktop. If no end user is connected, the array is empty.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The name of the authorized end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserName")
        public String endUserName;

        /**
         * <p>The usernames of end users connected to the cloud desktop. If no end user is connected, the array is empty.</p>
         */
        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-R-20220914.17****</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The GPU driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-hn5v2mmk0****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Win10_ZC</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The management flag.</p>
         * 
         * <strong>example:</strong>
         * <p>NoFlag</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The management flags.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The IP address of the secondary elastic network interface of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

        /**
         * <p>The type of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The IP address of the primary network interface of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrimaryEniIp")
        public String primaryEniIp;

        /**
         * <p>The session protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HDX</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The release time of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-21T16:34:57Z</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The time when the cloud desktop was last reset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-03 08:48:08</p>
         */
        @NameInMap("ResetTime")
        public String resetTime;

        /**
         * <p>The size of the system disk, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopsInGroupResponseBodyPostPaidDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsInGroupResponseBodyPostPaidDesktops self = new DescribeDesktopsInGroupResponseBodyPostPaidDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setCreateDuration(String createDuration) {
            this.createDuration = createDuration;
            return this;
        }
        public String getCreateDuration() {
            return this.createDuration;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setEndUserName(String endUserName) {
            this.endUserName = endUserName;
            return this;
        }
        public String getEndUserName() {
            return this.endUserName;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setEndUserNames(java.util.List<String> endUserNames) {
            this.endUserNames = endUserNames;
            return this;
        }
        public java.util.List<String> getEndUserNames() {
            return this.endUserNames;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setMemberEniIp(String memberEniIp) {
            this.memberEniIp = memberEniIp;
            return this;
        }
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setPrimaryEniIp(String primaryEniIp) {
            this.primaryEniIp = primaryEniIp;
            return this;
        }
        public String getPrimaryEniIp() {
            return this.primaryEniIp;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setResetTime(String resetTime) {
            this.resetTime = resetTime;
            return this;
        }
        public String getResetTime() {
            return this.resetTime;
        }

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
