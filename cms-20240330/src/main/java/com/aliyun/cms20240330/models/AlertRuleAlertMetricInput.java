// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInput extends TeaModel {
    /**
     * <p>A list of filter conditions. Call the ListAlertMetrics operation to query the lists of parameters and filter conditions that the metric supports.</p>
     */
    @NameInMap("filterValues")
    public java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues;

    /**
     * <p>The key of the metric group.</p>
     * 
     * <strong>example:</strong>
     * <p>apm.jvm</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The key of the predefined metric.</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.jvm.GcPsMarkSweepCount</p>
     */
    @NameInMap("metricId")
    public String metricId;

    /**
     * <p>A list of parameters. Call the ListAlertMetrics operation to query the lists of parameters and filter conditions that the metric supports.</p>
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
