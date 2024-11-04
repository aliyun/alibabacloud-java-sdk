// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricFilterDef extends TeaModel {
    @NameInMap("dim")
    public String dim;

    @NameInMap("displayNameCn")
    public String displayNameCn;

    @NameInMap("displayNameEn")
    public String displayNameEn;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("opt")
    public String opt;

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
        @NameInMap("displayNameCn")
        public String displayNameCn;

        @NameInMap("displayNameEn")
        public String displayNameEn;

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
