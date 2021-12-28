// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsResponseBody extends TeaModel {
    @NameInMap("DesktopGroups")
    public java.util.List<DescribeDesktopGroupsResponseBodyDesktopGroups> desktopGroups;

    @NameInMap("NextToken")
    public String nextToken;

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

    public static class DescribeDesktopGroupsResponseBodyDesktopGroups extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DirectoryType")
        public String directoryType;

        @NameInMap("EndUserCount")
        public Integer endUserCount;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GpuCount")
        public Float gpuCount;

        @NameInMap("GpuSpec")
        public String gpuSpec;

        @NameInMap("KeepDuration")
        public Long keepDuration;

        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("OwnBundleId")
        public String ownBundleId;

        @NameInMap("OwnBundleName")
        public String ownBundleName;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("ResetType")
        public Long resetType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeDesktopGroupsResponseBodyDesktopGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsResponseBodyDesktopGroups self = new DescribeDesktopGroupsResponseBodyDesktopGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
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

        public DescribeDesktopGroupsResponseBodyDesktopGroups setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopGroupsResponseBodyDesktopGroups setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
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

    }

}
