// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TravelStandardQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210bcc3a16583004579056128d33d7</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TravelStandardQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardQueryResponseBody self = new TravelStandardQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TravelStandardQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TravelStandardQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TravelStandardQueryResponseBody setModule(TravelStandardQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TravelStandardQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TravelStandardQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TravelStandardQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TravelStandardQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule extends TeaModel {
        @NameInMap("open_service_type_list")
        public java.util.List<String> openServiceTypeList;

        /**
         * <strong>example:</strong>
         * <p>2006517149</p>
         */
        @NameInMap("rule_code")
        public Long ruleCode;

        @NameInMap("rule_desc")
        public String ruleDesc;

        /**
         * <strong>example:</strong>
         * <p>6517149</p>
         */
        @NameInMap("rule_id")
        public Long ruleId;

        @NameInMap("rule_name")
        public String ruleName;

        public static TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule self = new TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule();
            return TeaModel.build(map, self);
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule setOpenServiceTypeList(java.util.List<String> openServiceTypeList) {
            this.openServiceTypeList = openServiceTypeList;
            return this;
        }
        public java.util.List<String> getOpenServiceTypeList() {
            return this.openServiceTypeList;
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FLIGHT_ADVANCE_BUY_DAY</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("value")
        public String value;

        public static TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList self = new TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList();
            return TeaModel.build(map, self);
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TravelStandardQueryResponseBodyModuleReserveRule extends TeaModel {
        @NameInMap("main_reserve_rule")
        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule mainReserveRule;

        @NameInMap("module_config_list")
        public java.util.List<TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList> moduleConfigList;

        public static TravelStandardQueryResponseBodyModuleReserveRule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardQueryResponseBodyModuleReserveRule self = new TravelStandardQueryResponseBodyModuleReserveRule();
            return TeaModel.build(map, self);
        }

        public TravelStandardQueryResponseBodyModuleReserveRule setMainReserveRule(TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule mainReserveRule) {
            this.mainReserveRule = mainReserveRule;
            return this;
        }
        public TravelStandardQueryResponseBodyModuleReserveRuleMainReserveRule getMainReserveRule() {
            return this.mainReserveRule;
        }

        public TravelStandardQueryResponseBodyModuleReserveRule setModuleConfigList(java.util.List<TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList> moduleConfigList) {
            this.moduleConfigList = moduleConfigList;
            return this;
        }
        public java.util.List<TravelStandardQueryResponseBodyModuleReserveRuleModuleConfigList> getModuleConfigList() {
            return this.moduleConfigList;
        }

    }

    public static class TravelStandardQueryResponseBodyModule extends TeaModel {
        @NameInMap("activated_service_type_list")
        public java.util.List<String> activatedServiceTypeList;

        @NameInMap("reserve_rule")
        public TravelStandardQueryResponseBodyModuleReserveRule reserveRule;

        public static TravelStandardQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardQueryResponseBodyModule self = new TravelStandardQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TravelStandardQueryResponseBodyModule setActivatedServiceTypeList(java.util.List<String> activatedServiceTypeList) {
            this.activatedServiceTypeList = activatedServiceTypeList;
            return this;
        }
        public java.util.List<String> getActivatedServiceTypeList() {
            return this.activatedServiceTypeList;
        }

        public TravelStandardQueryResponseBodyModule setReserveRule(TravelStandardQueryResponseBodyModuleReserveRule reserveRule) {
            this.reserveRule = reserveRule;
            return this;
        }
        public TravelStandardQueryResponseBodyModuleReserveRule getReserveRule() {
            return this.reserveRule;
        }

    }

}
