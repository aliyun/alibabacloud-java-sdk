// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInput extends TeaModel {
    @NameInMap("filterValues")
    public java.util.List<AlertRuleAlertMetricInputFilterValue> filterValues;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("metricId")
    public String metricId;

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
