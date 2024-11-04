// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricParamDef extends TeaModel {
    @NameInMap("maxWidth")
    public Integer maxWidth;

    @NameInMap("minWidth")
    public Integer minWidth;

    @NameInMap("name")
    public String name;

    @NameInMap("placeholderCn")
    public String placeholderCn;

    @NameInMap("placeholderEn")
    public String placeholderEn;

    @NameInMap("type")
    public String type;

    @NameInMap("value")
    public String value;

    @NameInMap("values")
    public java.util.List<AlertRuleAlertMetricParamDefValues> values;

    public static AlertRuleAlertMetricParamDef build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAlertMetricParamDef self = new AlertRuleAlertMetricParamDef();
        return TeaModel.build(map, self);
    }

    public AlertRuleAlertMetricParamDef setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }
    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    public AlertRuleAlertMetricParamDef setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
        return this;
    }
    public Integer getMinWidth() {
        return this.minWidth;
    }

    public AlertRuleAlertMetricParamDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlertRuleAlertMetricParamDef setPlaceholderCn(String placeholderCn) {
        this.placeholderCn = placeholderCn;
        return this;
    }
    public String getPlaceholderCn() {
        return this.placeholderCn;
    }

    public AlertRuleAlertMetricParamDef setPlaceholderEn(String placeholderEn) {
        this.placeholderEn = placeholderEn;
        return this;
    }
    public String getPlaceholderEn() {
        return this.placeholderEn;
    }

    public AlertRuleAlertMetricParamDef setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AlertRuleAlertMetricParamDef setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AlertRuleAlertMetricParamDef setValues(java.util.List<AlertRuleAlertMetricParamDefValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<AlertRuleAlertMetricParamDefValues> getValues() {
        return this.values;
    }

    public static class AlertRuleAlertMetricParamDefValues extends TeaModel {
        @NameInMap("labelCn")
        public String labelCn;

        @NameInMap("labelEn")
        public String labelEn;

        @NameInMap("value")
        public String value;

        public static AlertRuleAlertMetricParamDefValues build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleAlertMetricParamDefValues self = new AlertRuleAlertMetricParamDefValues();
            return TeaModel.build(map, self);
        }

        public AlertRuleAlertMetricParamDefValues setLabelCn(String labelCn) {
            this.labelCn = labelCn;
            return this;
        }
        public String getLabelCn() {
            return this.labelCn;
        }

        public AlertRuleAlertMetricParamDefValues setLabelEn(String labelEn) {
            this.labelEn = labelEn;
            return this;
        }
        public String getLabelEn() {
            return this.labelEn;
        }

        public AlertRuleAlertMetricParamDefValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
