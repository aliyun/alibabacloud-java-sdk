// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingRules")
    public DescribeScalingRulesResponseBodyScalingRules scalingRules;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesResponseBody self = new DescribeScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingRulesResponseBody setScalingRules(DescribeScalingRulesResponseBodyScalingRules scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public DescribeScalingRulesResponseBodyScalingRules getScalingRules() {
        return this.scalingRules;
    }

    public DescribeScalingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingRulesResponseBodyScalingRulesScalingRule extends TeaModel {
        @NameInMap("AdjustmentType")
        public String adjustmentType;

        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        @NameInMap("Cooldown")
        public Integer cooldown;

        @NameInMap("MaxSize")
        public Integer maxSize;

        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScalingRuleAri")
        public String scalingRuleAri;

        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        public static DescribeScalingRulesResponseBodyScalingRulesScalingRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRulesScalingRule self = new DescribeScalingRulesResponseBodyScalingRulesScalingRule();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setCooldown(Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        public Integer getCooldown() {
            return this.cooldown;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleAri(String scalingRuleAri) {
            this.scalingRuleAri = scalingRuleAri;
            return this;
        }
        public String getScalingRuleAri() {
            return this.scalingRuleAri;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public DescribeScalingRulesResponseBodyScalingRulesScalingRule setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

    }

    public static class DescribeScalingRulesResponseBodyScalingRules extends TeaModel {
        @NameInMap("ScalingRule")
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> scalingRule;

        public static DescribeScalingRulesResponseBodyScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRulesResponseBodyScalingRules self = new DescribeScalingRulesResponseBodyScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRulesResponseBodyScalingRules setScalingRule(java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> scalingRule) {
            this.scalingRule = scalingRule;
            return this;
        }
        public java.util.List<DescribeScalingRulesResponseBodyScalingRulesScalingRule> getScalingRule() {
            return this.scalingRule;
        }

    }

}
