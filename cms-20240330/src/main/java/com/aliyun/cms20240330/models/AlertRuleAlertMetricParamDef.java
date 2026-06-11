// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricParamDef extends TeaModel {
    /**
     * <p>The maximum width of the input control. This parameter is valid only for SELECT_PARAM and INPUT_PARAM.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("maxWidth")
    public Integer maxWidth;

    /**
     * <p>The minimum width of the input control. This parameter is valid only for SELECT_PARAM and INPUT_PARAM.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("minWidth")
    public Integer minWidth;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The Chinese placeholder text displayed on the frontend. This parameter is valid only for INPUT_PARAM.</p>
     * 
     * <strong>example:</strong>
     * <p>请输入值</p>
     */
    @NameInMap("placeholderCn")
    public String placeholderCn;

    /**
     * <p>The English placeholder text displayed on the frontend. This parameter is valid only for INPUT_PARAM.</p>
     * 
     * <strong>example:</strong>
     * <p>Enter value</p>
     */
    @NameInMap("placeholderEn")
    public String placeholderEn;

    /**
     * <p>● TEXT_PARAM: A read-only text parameter defined by the backend. No user input control is displayed on the frontend.● INPUT_PARAM: An input box parameter.● SELECT_PARAM: A selection box parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT_PARAM</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The value.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>The list of available options in the drop-down list. This parameter is valid only for SELECT_PARAM.</p>
     */
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
        /**
         * <p>The Chinese display name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>测试环境</p>
         */
        @NameInMap("labelCn")
        public String labelCn;

        /**
         * <p>The English display name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>Staging</p>
         */
        @NameInMap("labelEn")
        public String labelEn;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>staging</p>
         */
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
