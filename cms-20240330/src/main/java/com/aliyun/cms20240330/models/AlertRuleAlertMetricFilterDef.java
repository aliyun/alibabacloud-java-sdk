// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricFilterDef extends TeaModel {
    /**
     * <p>The dimension in APM metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("dim")
    public String dim;

    /**
     * <p>Specifies whether the filter item is excluded from the group by clause in PromQL. If set to true, the filter item does not appear in the group by clause.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dimDisabled")
    public Boolean dimDisabled;

    /**
     * <p>The Chinese display name.</p>
     * 
     * <strong>example:</strong>
     * <p>应用状态</p>
     */
    @NameInMap("displayNameCn")
    public String displayNameCn;

    /**
     * <p>The English display name.</p>
     * 
     * <strong>example:</strong>
     * <p>Application Status</p>
     */
    @NameInMap("displayNameEn")
    public String displayNameEn;

    /**
     * <p>Specifies whether the filter is hidden. If the filter is hidden, it is not displayed in the frontend, but its value can be passed when rendering PromQL. A typical example is the pid filter in APM scenarios, which is generally not displayed through configuration but shown as an independent application search list on the frontend.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>Specifies whether the filter item is excluded from the label filter in PromQL. If set to true, the filter item does not appear in the label filter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("labelDisabled")
    public Boolean labelDisabled;

    /**
     * <p>The filter condition operator.</p>
     * 
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("opt")
    public String opt;

    /**
     * <p>The list of supported options.</p>
     */
    @NameInMap("supportedOpts")
    public java.util.List<AlertRuleAlertMetricFilterDefSupportedOpts> supportedOpts;

    public static AlertRuleAlertMetricFilterDef build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAlertMetricFilterDef self = new AlertRuleAlertMetricFilterDef();
        return TeaModel.build(map, self);
    }

    public AlertRuleAlertMetricFilterDef setDim(String dim) {
        this.dim = dim;
        return this;
    }
    public String getDim() {
        return this.dim;
    }

    public AlertRuleAlertMetricFilterDef setDimDisabled(Boolean dimDisabled) {
        this.dimDisabled = dimDisabled;
        return this;
    }
    public Boolean getDimDisabled() {
        return this.dimDisabled;
    }

    public AlertRuleAlertMetricFilterDef setDisplayNameCn(String displayNameCn) {
        this.displayNameCn = displayNameCn;
        return this;
    }
    public String getDisplayNameCn() {
        return this.displayNameCn;
    }

    public AlertRuleAlertMetricFilterDef setDisplayNameEn(String displayNameEn) {
        this.displayNameEn = displayNameEn;
        return this;
    }
    public String getDisplayNameEn() {
        return this.displayNameEn;
    }

    public AlertRuleAlertMetricFilterDef setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public AlertRuleAlertMetricFilterDef setLabelDisabled(Boolean labelDisabled) {
        this.labelDisabled = labelDisabled;
        return this;
    }
    public Boolean getLabelDisabled() {
        return this.labelDisabled;
    }

    public AlertRuleAlertMetricFilterDef setOpt(String opt) {
        this.opt = opt;
        return this;
    }
    public String getOpt() {
        return this.opt;
    }

    public AlertRuleAlertMetricFilterDef setSupportedOpts(java.util.List<AlertRuleAlertMetricFilterDefSupportedOpts> supportedOpts) {
        this.supportedOpts = supportedOpts;
        return this;
    }
    public java.util.List<AlertRuleAlertMetricFilterDefSupportedOpts> getSupportedOpts() {
        return this.supportedOpts;
    }

    public static class AlertRuleAlertMetricFilterDefSupportedOpts extends TeaModel {
        /**
         * <p>The Chinese display name.</p>
         * 
         * <strong>example:</strong>
         * <p>在线</p>
         */
        @NameInMap("displayNameCn")
        public String displayNameCn;

        /**
         * <p>The English display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("displayNameEn")
        public String displayNameEn;

        /**
         * <p>The match value.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("value")
        public String value;

        public static AlertRuleAlertMetricFilterDefSupportedOpts build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleAlertMetricFilterDefSupportedOpts self = new AlertRuleAlertMetricFilterDefSupportedOpts();
            return TeaModel.build(map, self);
        }

        public AlertRuleAlertMetricFilterDefSupportedOpts setDisplayNameCn(String displayNameCn) {
            this.displayNameCn = displayNameCn;
            return this;
        }
        public String getDisplayNameCn() {
            return this.displayNameCn;
        }

        public AlertRuleAlertMetricFilterDefSupportedOpts setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public AlertRuleAlertMetricFilterDefSupportedOpts setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
