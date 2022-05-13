// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OnlinePrePaidDesktopsCount")
    public Integer onlinePrePaidDesktopsCount;

    @NameInMap("PaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPaidDesktops> paidDesktops;

    @NameInMap("PaidDesktopsCount")
    public Integer paidDesktopsCount;

    @NameInMap("PostPaidDesktops")
    public java.util.List<DescribeDesktopsInGroupResponseBodyPostPaidDesktops> postPaidDesktops;

    @NameInMap("PostPaidDesktopsCount")
    public Integer postPaidDesktopsCount;

    @NameInMap("PostPaidDesktopsTotalAmount")
    public Integer postPaidDesktopsTotalAmount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningPrePaidDesktopsCount")
    public Integer runningPrePaidDesktopsCount;

    @NameInMap("StopedPrePaidDesktopsCount")
    public Integer stopedPrePaidDesktopsCount;

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

    public static class DescribeDesktopsInGroupResponseBodyPaidDesktops extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DesktopStatus")
        public String desktopStatus;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("EndUserName")
        public String endUserName;

        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ManagementFlag")
        public String managementFlag;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ResetTime")
        public String resetTime;

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

        public DescribeDesktopsInGroupResponseBodyPaidDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
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
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("CreateDuration")
        public String createDuration;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DesktopStatus")
        public String desktopStatus;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("EndUserName")
        public String endUserName;

        @NameInMap("EndUserNames")
        public java.util.List<String> endUserNames;

        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ManagementFlag")
        public String managementFlag;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("ResetTime")
        public String resetTime;

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

        public DescribeDesktopsInGroupResponseBodyPostPaidDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
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
