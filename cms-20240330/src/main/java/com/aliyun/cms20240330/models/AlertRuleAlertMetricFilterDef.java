// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricFilterDef extends TeaModel {
    /**
     * <p>APM指标中为维度</p>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("dim")
    public String dim;

    /**
     * <p>为true是，过滤项不出现在promQL的group by中</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dimDisabled")
    public Boolean dimDisabled;

    /**
     * <p>显示名称中文</p>
     * 
     * <strong>example:</strong>
     * <p>应用状态</p>
     */
    @NameInMap("displayNameCn")
    public String displayNameCn;

    /**
     * <p>显示名称英文</p>
     * 
     * <strong>example:</strong>
     * <p>Application Status</p>
     */
    @NameInMap("displayNameEn")
    public String displayNameEn;

    /**
     * <p>是否隐藏。 如果隐藏则在前端交互中不显示，但在渲染promQL时可将该过滤条件的值上传上来。  典型的例子是APM场景中的pid这个过滤条件，一般不会通过配置化的方式进行显示，而是前端显为独立的应用搜索列表。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hidden")
    public Boolean hidden;

    /**
     * <p>为true时，过滤项不出现在promQL的label filter中</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("labelDisabled")
    public Boolean labelDisabled;

    /**
     * <p>过滤条件操作符</p>
     * 
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("opt")
    public String opt;

    /**
     * <p>支持的选项的列表</p>
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
         * <p>显示名称中文</p>
         * 
         * <strong>example:</strong>
         * <p>在线</p>
         */
        @NameInMap("displayNameCn")
        public String displayNameCn;

        /**
         * <p>显示名称英文</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("displayNameEn")
        public String displayNameEn;

        /**
         * <p>匹配值。</p>
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
