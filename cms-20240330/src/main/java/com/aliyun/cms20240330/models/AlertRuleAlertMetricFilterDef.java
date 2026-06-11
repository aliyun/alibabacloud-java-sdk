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
     * <p>If set to \<code>true\\</code>, the filter item does not appear in the \<code>group by\\</code> clause of a PromQL query.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dimDisabled")
    public Boolean dimDisabled;

    /**
     * <p>The display name in Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>应用状态</p>
     */
    @NameInMap("displayNameCn")
    public String displayNameCn;

    /**
     * <p>The display name in English.</p>
     * 
     * <strong>example:</strong>
     * <p>Application Status</p>
     */
    @NameInMap("displayNameEn")
    public String displayNameEn;

    /**
     * <p>Specifies whether to hide the filter. If hidden, the filter does not appear in the frontend UI. However, its value can be uploaded when rendering a PromQL query. For example, in an Application Performance Management (APM) scenario, the pid filter is typically hidden from the configuration UI. The frontend displays it as a separate application search list.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>If set to \<code>true\\</code>, the filter item does not appear in the label filter of a PromQL query.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("labelDisabled")
    public Boolean labelDisabled;

    /**
     * <p>The operator for the filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("opt")
    public String opt;

    /**
     * <p>A list of supported options.</p>
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
         * <p>The display name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>在线</p>
         */
        @NameInMap("displayNameCn")
        public String displayNameCn;

        /**
         * <p>The display name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("displayNameEn")
        public String displayNameEn;

        /**
         * <p>The matching value.</p>
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
