// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcResSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FullNodesSummary")
    public DescribeCcResSummaryResponseBodyFullNodesSummary fullNodesSummary;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcResSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcResSummaryResponseBody self = new DescribeCcResSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcResSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcResSummaryResponseBody setFullNodesSummary(DescribeCcResSummaryResponseBodyFullNodesSummary fullNodesSummary) {
        this.fullNodesSummary = fullNodesSummary;
        return this;
    }
    public DescribeCcResSummaryResponseBodyFullNodesSummary getFullNodesSummary() {
        return this.fullNodesSummary;
    }

    public DescribeCcResSummaryResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("UsedQps")
        public Integer usedQps;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizId")
        public String bizId;

        public static DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList self = new DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList setUsedQps(Integer usedQps) {
            this.usedQps = usedQps;
            return this;
        }
        public Integer getUsedQps() {
            return this.usedQps;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

    public static class DescribeCcResSummaryResponseBodyFullNodesSummary extends TeaModel {
        @NameInMap("UnUsedQps")
        public Integer unUsedQps;

        @NameInMap("UsedQps")
        public Integer usedQps;

        @NameInMap("TotalQps")
        public Integer totalQps;

        @NameInMap("NGResInfoList")
        public java.util.List<DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList> NGResInfoList;

        public static DescribeCcResSummaryResponseBodyFullNodesSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcResSummaryResponseBodyFullNodesSummary self = new DescribeCcResSummaryResponseBodyFullNodesSummary();
            return TeaModel.build(map, self);
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummary setUnUsedQps(Integer unUsedQps) {
            this.unUsedQps = unUsedQps;
            return this;
        }
        public Integer getUnUsedQps() {
            return this.unUsedQps;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummary setUsedQps(Integer usedQps) {
            this.usedQps = usedQps;
            return this;
        }
        public Integer getUsedQps() {
            return this.usedQps;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummary setTotalQps(Integer totalQps) {
            this.totalQps = totalQps;
            return this;
        }
        public Integer getTotalQps() {
            return this.totalQps;
        }

        public DescribeCcResSummaryResponseBodyFullNodesSummary setNGResInfoList(java.util.List<DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList> NGResInfoList) {
            this.NGResInfoList = NGResInfoList;
            return this;
        }
        public java.util.List<DescribeCcResSummaryResponseBodyFullNodesSummaryNGResInfoList> getNGResInfoList() {
            return this.NGResInfoList;
        }

    }

}
