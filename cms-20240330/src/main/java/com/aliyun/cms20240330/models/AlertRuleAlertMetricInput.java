// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInput extends TeaModel {
    /**
     * <p>The list of filter conditions entered by the user. You can call ListAlertMetrics to query the parameters and filter conditions supported by the metric.</p>
     */
    @NameInMap("filterValues")
    public java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues;

    /**
     * <p>The key of the metric group selected by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>apm.jvm</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The key of the predefined metric selected by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.jvm.GcPsMarkSweepCount</p>
     */
    @NameInMap("metricId")
    public String metricId;

    /**
     * <p>The list of input parameters. You can call ListAlertMetrics to query the parameters and filter conditions supported by the metric.</p>
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
