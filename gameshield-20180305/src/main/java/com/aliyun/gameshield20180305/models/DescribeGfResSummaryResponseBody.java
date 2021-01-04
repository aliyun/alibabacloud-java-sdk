// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGfResSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeGfResSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeGfResSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGfResSummaryResponseBody self = new DescribeGfResSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGfResSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGfResSummaryResponseBody setFullNodesSummary(DescribeGfResSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeGfResSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeGfResSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeGfResSummaryResponseBodyFullNodesSummaryNodes extends TeaModel {
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

        public static DescribeGfResSummaryResponseBodyFullNodesSummaryNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGfResSummaryResponseBodyFullNodesSummaryNodes self = new DescribeGfResSummaryResponseBodyFullNodesSummaryNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummaryNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeGfResSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeGfResSummaryResponseBodyFullNodesSummaryNodes> nodes;

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

        public static DescribeGfResSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeGfResSummaryResponseBodyFullNodesSummary self = new DescribeGfResSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setNodes(java.util.List<DescribeGfResSummaryResponseBodyFullNodesSummaryNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeGfResSummaryResponseBodyFullNodesSummaryNodes> getNodes() {
            return this.nodes;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setCleanCount(Integer cleanCount) {
            this.cleanCount = cleanCount;
            return this;
        }
        public Integer getCleanCount() {
            return this.cleanCount;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setHoleCount(Integer holeCount) {
            this.holeCount = holeCount;
            return this;
        }
        public Integer getHoleCount() {
            return this.holeCount;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public DescribeGfResSummaryResponseBodyFullNodesSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
