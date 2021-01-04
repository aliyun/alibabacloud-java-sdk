// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBgpResSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeBgpResSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeBgpResSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpResSummaryResponseBody self = new DescribeBgpResSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpResSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpResSummaryResponseBody setFullNodesSummary(DescribeBgpResSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeBgpResSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeBgpResSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes extends TeaModel {
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

        public static DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes self = new DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes();
            return TeaModel.build(map, self);
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeBgpResSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes> nodes;

        @NameInMap("CleanCount")
        public Integer cleanCount;

        @NameInMap("HoleCount")
        public Integer holeCount;

        @NameInMap("UsedCount")
        public Integer usedCount;

        @NameInMap("UnUsedCount")
        public Integer unUsedCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBgpResSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpResSummaryResponseBodyFullNodesSummary self = new DescribeBgpResSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setNodes(java.util.List<DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeBgpResSummaryResponseBodyFullNodesSummaryNodes> getNodes() {
            return this.nodes;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setCleanCount(Integer cleanCount) {
            this.cleanCount = cleanCount;
            return this;
        }
        public Integer getCleanCount() {
            return this.cleanCount;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setHoleCount(Integer holeCount) {
            this.holeCount = holeCount;
            return this;
        }
        public Integer getHoleCount() {
            return this.holeCount;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public DescribeBgpResSummaryResponseBodyFullNodesSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
