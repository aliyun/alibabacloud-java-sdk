// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    /**
     * <p>聚合函数（APM_SIMPLE_CONDITION）</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>多条比较（APM_COMPOSITE_CONDITION）</p>
     */
    @NameInMap("compareList")
    public java.util.List<ApmCompositeCompareConfig> compareList;

    /**
     * <p>持续时间（秒），PROMETHEUS_SIMPLE / UMODEL_METRICSET 使用</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>比较操作符（UMODEL_METRICSET_CONDITION 或 APM_SIMPLE_CONDITION）</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>条件间逻辑关系（APM_COMPOSITE_CONDITION）</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>严重等级（UMODEL / PROMETHEUS_SIMPLE / APM_COMPOSITE）</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>阈值（UMODEL_METRICSET_CONDITION）</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    /**
     * <p>多阈值列表（APM_SIMPLE_CONDITION）</p>
     */
    @NameInMap("thresholdList")
    public java.util.List<ApmThresholdConfig> thresholdList;

    /**
     * <p>检测条件类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static ConditionConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        ConditionConfigUnified self = new ConditionConfigUnified();
        return TeaModel.build(map, self);
    }

    public ConditionConfigUnified setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ConditionConfigUnified setCompareList(java.util.List<ApmCompositeCompareConfig> compareList) {
        this.compareList = compareList;
        return this;
    }
    public java.util.List<ApmCompositeCompareConfig> getCompareList() {
        return this.compareList;
    }

    public ConditionConfigUnified setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public ConditionConfigUnified setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConditionConfigUnified setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public ConditionConfigUnified setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ConditionConfigUnified setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public ConditionConfigUnified setThresholdList(java.util.List<ApmThresholdConfig> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }
    public java.util.List<ApmThresholdConfig> getThresholdList() {
        return this.thresholdList;
    }

    public ConditionConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
