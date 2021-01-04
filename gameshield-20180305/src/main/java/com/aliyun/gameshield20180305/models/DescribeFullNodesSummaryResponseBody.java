// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFullNodesSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeFullNodesSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeFullNodesSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullNodesSummaryResponseBody self = new DescribeFullNodesSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFullNodesSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFullNodesSummaryResponseBody setFullNodesSummary(DescribeFullNodesSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeFullNodesSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeFullNodesSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("InUse")
        public Integer inUse;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("DdosStatus")
        public Integer ddosStatus;

        @NameInMap("IsDisabled")
        public Boolean isDisabled;

        @NameInMap("Threshold")
        public Integer threshold;

        @NameInMap("EsnBizId")
        public String esnBizId;

        public static DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes self = new DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("InUse")
        public Integer inUse;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("DdosStatus")
        public Integer ddosStatus;

        @NameInMap("IsDisabled")
        public Boolean isDisabled;

        @NameInMap("Threshold")
        public Integer threshold;

        @NameInMap("EsnBizId")
        public String esnBizId;

        public static DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes self = new DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeFullNodesSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("CleanCount")
        public Integer cleanCount;

        @NameInMap("HolingNodes")
        public java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes> holingNodes;

        @NameInMap("HoleCount")
        public Integer holeCount;

        @NameInMap("CleaningNodes")
        public java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes> cleaningNodes;

        @NameInMap("UsedCount")
        public Integer usedCount;

        @NameInMap("UnUsedCount")
        public Integer unUsedCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeFullNodesSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullNodesSummaryResponseBodyFullNodesSummary self = new DescribeFullNodesSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setCleanCount(Integer cleanCount) {
            this.cleanCount = cleanCount;
            return this;
        }
        public Integer getCleanCount() {
            return this.cleanCount;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setHolingNodes(java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes> holingNodes) {
            this.holingNodes = holingNodes;
            return this;
        }
        public java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryHolingNodes> getHolingNodes() {
            return this.holingNodes;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setHoleCount(Integer holeCount) {
            this.holeCount = holeCount;
            return this;
        }
        public Integer getHoleCount() {
            return this.holeCount;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setCleaningNodes(java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes> cleaningNodes) {
            this.cleaningNodes = cleaningNodes;
            return this;
        }
        public java.util.List<DescribeFullNodesSummaryResponseBodyFullNodesSummaryCleaningNodes> getCleaningNodes() {
            return this.cleaningNodes;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public DescribeFullNodesSummaryResponseBodyFullNodesSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
