// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeMianLiuResSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeMianLiuResSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeMianLiuResSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMianLiuResSummaryResponseBody self = new DescribeMianLiuResSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMianLiuResSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMianLiuResSummaryResponseBody setFullNodesSummary(DescribeMianLiuResSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeMianLiuResSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeMianLiuResSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes extends TeaModel {
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

        public static DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes self = new DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes();
            return TeaModel.build(map, self);
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setInUse(Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Integer getInUse() {
            return this.inUse;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setDdosStatus(Integer ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public Integer getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

    public static class DescribeMianLiuResSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes> nodes;

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

        public static DescribeMianLiuResSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeMianLiuResSummaryResponseBodyFullNodesSummary self = new DescribeMianLiuResSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setNodes(java.util.List<DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeMianLiuResSummaryResponseBodyFullNodesSummaryNodes> getNodes() {
            return this.nodes;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setCleanCount(Integer cleanCount) {
            this.cleanCount = cleanCount;
            return this;
        }
        public Integer getCleanCount() {
            return this.cleanCount;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setHoleCount(Integer holeCount) {
            this.holeCount = holeCount;
            return this;
        }
        public Integer getHoleCount() {
            return this.holeCount;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setUnUsedCount(Integer unUsedCount) {
            this.unUsedCount = unUsedCount;
            return this;
        }
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        public DescribeMianLiuResSummaryResponseBodyFullNodesSummary setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
