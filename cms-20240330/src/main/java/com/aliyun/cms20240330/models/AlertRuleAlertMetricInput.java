// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInput extends TeaModel {
    /**
     * <p>用户输入的过滤条件列表。指标所支持的参数列表、过滤条件列表可通过ListAlertMetrics进行查询。</p>
     */
    @NameInMap("filterValues")
    public java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues;

    /**
     * <p>用户所选指标组的key</p>
     * 
     * <strong>example:</strong>
     * <p>apm.jvm</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>用户所选预定义指标的key</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.jvm.GcPsMarkSweepCount</p>
     */
    @NameInMap("metricId")
    public String metricId;

    /**
     * <p>输入的参数列表。  指标所支持的参数列表、过滤条件列表可通过ListAlertMetrics进行查询。</p>
     */
    @NameInMap("paramValues")
    public java.util.List<AlertRuleAlertMetricInputParamValue> paramValues;

    public static AlertRuleAlertMetricInput build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAlertMetricInput self = new AlertRuleAlertMetricInput();
        return TeaModel.build(map, self);
    }

    public AlertRuleAlertMetricInput setFilterValues(java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues) {
        this.filterValues = filterValues;
        return this;
    }
    public java.util.List<AlertRuleAlertMetricInputFilterValue> getFilterValues() {
        return this.filterValues;
    }

    public AlertRuleAlertMetricInput setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AlertRuleAlertMetricInput setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public AlertRuleAlertMetricInput setParamValues(java.util.List<AlertRuleAlertMetricInputParamValue> paramValues) {
        this.paramValues = paramValues;
        return this;
    }
    public java.util.List<AlertRuleAlertMetricInputParamValue> getParamValues() {
        return this.paramValues;
    }

}
