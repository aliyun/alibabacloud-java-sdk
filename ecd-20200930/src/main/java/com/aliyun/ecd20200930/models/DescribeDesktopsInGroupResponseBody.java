// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of subscription cloud computers that are in the Connected state.</p>
     */
    @NameInMap("OnlinePrePaidDesktopsCount")
    public Integer onlinePrePaidDesktopsCount;

    /**
     * <p>The details about subscription cloud computers.</p>
     */
    @NameInMap("PaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPaidDesktops> paidDesktops;

    /**
     * <p>The total number of queried subscription cloud computers.</p>
     */
    @NameInMap("PaidDesktopsCount")
    public Integer paidDesktopsCount;

    /**
     * <p>The details about pay-as-you-go cloud computers.</p>
     */
    @NameInMap("PostPaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPostPaidDesktops> postPaidDesktops;

    /**
     * <p>The total number of queried pay-as-you-go cloud computers.</p>
     */
    @NameInMap("PostPaidDesktopsCount")
    public Integer postPaidDesktopsCount;

    /**
     * <p>The total amount of bills for pay-as-you-go cloud computers.</p>
     */
    @NameInMap("PostPaidDesktopsTotalAmount")
    public Integer postPaidDesktopsTotalAmount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of subscription cloud computers that are in the Running state.</p>
     */
    @NameInMap("RunningPrePaidDesktopsCount")
    public Integer runningPrePaidDesktopsCount;

    /**
     * <p>The number of subscription cloud computers that are in the Stopped state.</p>
     */
    @NameInMap("StopedPrePaidDesktopsCount")
    public Integer stopedPrePaidDesktopsCount;

    /**
     * <p>The number of subscription cloud computers that are in the Stopped state.</p>
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
         * <p>The connection status of the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Unknown</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Connected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Disconnected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The ID of the cloud computer.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

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
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The type of the disk.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SYSTEM: system disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DATA: data disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the authorized user of the cloud computer.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The username of the authorized user.</p>
         */
        @NameInMap("EndUserName")
        public String endUserName;

        /**
         * <p>The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
         */
        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        /**
         * <p>The image version.</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The version of the GPU driver.</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The flag that is used to manage the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Updating: The configurations of the cloud computer are being updated.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoFlag: No flags are attached to the cloud computer.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The flags that are used to manage the cloud computers.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The IP address of the member network interface controller (NIC) of the instance.</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

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
         * <p>The IP address of the primary NIC of the instance.</p>
         */
        @NameInMap("PrimaryEniIp")
        public String primaryEniIp;

        /**
         * <p>The protocol.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   HDX: High-definition Experience (HDX) protocol</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ASP: Adaptive Streaming Protocol (ASP) protocol provided by Alibaba Cloud</p>
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
         * <p>The time when the cloud computer was reset.</p>
         */
        @NameInMap("ResetTime")
        public String resetTime;

        /**
         * <p>The system disk size. Unit: GiB.</p>
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
         * <p>The connection status of the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Unknown</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Connected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Disconnected</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The retention period of the cloud computer.</p>
         */
        @NameInMap("CreateDuration")
        public String createDuration;

        /**
         * <p>The time when the cloud computer was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the cloud computer.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

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
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The type of the disk.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SYSTEM: system disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DATA: data disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the authorized user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The IDs of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The username of the authorized user.</p>
         */
        @NameInMap("EndUserName")
        public String endUserName;

        /**
         * <p>The usernames of the end users who are connected to the cloud computers in the cloud computer pool. If no end users are connected, no values are returned for this parameter.</p>
         */
        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        /**
         * <p>The image version.</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The version of the GPU driver.</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The flag that is used to manage the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Updating: The configurations of the cloud computer are being updated.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoFlag: No flags are attached to the cloud computer.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The flags that are used to manage the cloud computers.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The IP address of the member NIC of the instance.</p>
         */
        @NameInMap("MemberEniIp")
        public String memberEniIp;

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
         * <p>The IP address of the primary NIC of the instance.</p>
         */
        @NameInMap("PrimaryEniIp")
        public String primaryEniIp;

        /**
         * <p>The protocol.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   HDX: HDX protocol</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ASP: ASP protocol provided by Alibaba Cloud</p>
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
         * <p>The time when the cloud computer was released.</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The time when the cloud computer was reset.</p>
         */
        @NameInMap("ResetTime")
        public String resetTime;

        /**
         * <p>The system disk size. Unit: GiB.</p>
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
