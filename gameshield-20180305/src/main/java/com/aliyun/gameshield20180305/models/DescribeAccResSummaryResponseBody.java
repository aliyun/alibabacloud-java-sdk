// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAccResSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeAccResSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeAccResSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccResSummaryResponseBody self = new DescribeAccResSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccResSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccResSummaryResponseBody setFullNodesSummary(DescribeAccResSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeAccResSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeAccResSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeAccResSummaryResponseBodyFullNodesSummaryNodes extends TeaModel {
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

        public static DescribeAccResSummaryResponseBodyFullNodesSummaryNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccResSummaryResponseBodyFullNodesSummaryNodes self = new DescribeAccResSummaryResponseBodyFullNodesSummaryNodes();
            return TeaModel.build(map, self);
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummaryNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeAccResSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeAccResSummaryResponseBodyFullNodesSummaryNodes> nodes;

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

        public static DescribeAccResSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccResSummaryResponseBodyFullNodesSummary self = new DescribeAccResSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setNodes(java.util.List<DescribeAccResSummaryResponseBodyFullNodesSummaryNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeAccResSummaryResponseBodyFullNodesSummaryNodes> getNodes() {
            return this.nodes;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setCleanCount(Integer cleanCount) {
            this.cleanCount = cleanCount;
            return this;
        }
        public Integer getCleanCount() {
            return this.cleanCount;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setHoleCount(Integer holeCount) {
            this.holeCount = holeCount;
            return this;
        }
        public Integer getHoleCount() {
            return this.holeCount;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public DescribeAccResSummaryResponseBodyFullNodesSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
