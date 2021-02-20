// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeTaskBriefInfoResponseBody extends TeaModel {
    @NameInMap("RisksFacets")
    public DescribeTaskBriefInfoResponseBodyRisksFacets risksFacets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Brief")
    public DescribeTaskBriefInfoResponseBodyBrief brief;

    public static DescribeTaskBriefInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskBriefInfoResponseBody self = new DescribeTaskBriefInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskBriefInfoResponseBody setRisksFacets(DescribeTaskBriefInfoResponseBodyRisksFacets risksFacets) {
        this.risksFacets = risksFacets;
        return this;
    }
    public DescribeTaskBriefInfoResponseBodyRisksFacets getRisksFacets() {
        return this.risksFacets;
    }

    public DescribeTaskBriefInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskBriefInfoResponseBody setBrief(DescribeTaskBriefInfoResponseBodyBrief brief) {
        this.brief = brief;
        return this;
    }
    public DescribeTaskBriefInfoResponseBodyBrief getBrief() {
        return this.brief;
    }

    public static class DescribeTaskBriefInfoResponseBodyRisksFacets extends TeaModel {
        @NameInMap("Medium")
        public Integer medium;

        @NameInMap("Low")
        public Integer low;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("High")
        public Integer high;

        @NameInMap("Info")
        public Integer info;

        public static DescribeTaskBriefInfoResponseBodyRisksFacets build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskBriefInfoResponseBodyRisksFacets self = new DescribeTaskBriefInfoResponseBodyRisksFacets();
            return TeaModel.build(map, self);
        }

        public DescribeTaskBriefInfoResponseBodyRisksFacets setMedium(Integer medium) {
            this.medium = medium;
            return this;
        }
        public Integer getMedium() {
            return this.medium;
        }

        public DescribeTaskBriefInfoResponseBodyRisksFacets setLow(Integer low) {
            this.low = low;
            return this;
        }
        public Integer getLow() {
            return this.low;
        }

        public DescribeTaskBriefInfoResponseBodyRisksFacets setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeTaskBriefInfoResponseBodyRisksFacets setHigh(Integer high) {
            this.high = high;
            return this;
        }
        public Integer getHigh() {
            return this.high;
        }

        public DescribeTaskBriefInfoResponseBodyRisksFacets setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

    }

    public static class DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet extends TeaModel {
        @NameInMap("Completed")
        public Integer completed;

        @NameInMap("Total")
        public Integer total;

        public static DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet self = new DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet();
            return TeaModel.build(map, self);
        }

        public DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet setCompleted(Integer completed) {
            this.completed = completed;
            return this;
        }
        public Integer getCompleted() {
            return this.completed;
        }

        public DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeTaskBriefInfoResponseBodyBrief extends TeaModel {
        @NameInMap("FinishedAt")
        public Long finishedAt;

        @NameInMap("Progress")
        public Float progress;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("ActionRunsFacet")
        public DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet actionRunsFacet;

        public static DescribeTaskBriefInfoResponseBodyBrief build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskBriefInfoResponseBodyBrief self = new DescribeTaskBriefInfoResponseBodyBrief();
            return TeaModel.build(map, self);
        }

        public DescribeTaskBriefInfoResponseBodyBrief setFinishedAt(Long finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public Long getFinishedAt() {
            return this.finishedAt;
        }

        public DescribeTaskBriefInfoResponseBodyBrief setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeTaskBriefInfoResponseBodyBrief setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTaskBriefInfoResponseBodyBrief setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeTaskBriefInfoResponseBodyBrief setActionRunsFacet(DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet actionRunsFacet) {
            this.actionRunsFacet = actionRunsFacet;
            return this;
        }
        public DescribeTaskBriefInfoResponseBodyBriefActionRunsFacet getActionRunsFacet() {
            return this.actionRunsFacet;
        }

    }

}
