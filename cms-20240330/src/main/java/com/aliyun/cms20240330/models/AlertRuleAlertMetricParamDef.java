// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricParamDef extends TeaModel {
    /**
     * <p>输入框的最大宽度，仅对SELECT_PARAM、INPUT_PARAM生效</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("maxWidth")
    public Integer maxWidth;

    /**
     * <p>输入框的最小宽度，仅对SELECT_PARAM、INPUT_PARAM生效</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("minWidth")
    public Integer minWidth;

    /**
     * <p>名称</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>仅对INPUT_PARAM有效。用于前端展示的中文展位符</p>
     * 
     * <strong>example:</strong>
     * <p>请输入值</p>
     */
    @NameInMap("placeholderCn")
    public String placeholderCn;

    /**
     * <p>仅对INPUT_PARAM有效。用于前端展示的英文展位符</p>
     * 
     * <strong>example:</strong>
     * <p>Enter value</p>
     */
    @NameInMap("placeholderEn")
    public String placeholderEn;

    /**
     * <p>● TEXT_PARAM: 只读文本参数，由后台定义，前端不显示用户输入控件
     * ● INPUT_PARAM：输入框参数
     * ● SELECT_PARAM：选择框参数</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT_PARAM</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>值</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>仅对SELECT_PARAM有效。  下拉列表的可选值列表。</p>
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
         * <p>选项的中文显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试环境</p>
         */
        @NameInMap("labelCn")
        public String labelCn;

        /**
         * <p>选项的英文显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>Staging</p>
         */
        @NameInMap("labelEn")
        public String labelEn;

        /**
         * <p>值</p>
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
