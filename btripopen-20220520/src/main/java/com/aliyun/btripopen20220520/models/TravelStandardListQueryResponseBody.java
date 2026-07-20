// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardListQueryResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The response data. Returned by the server. An empty value is returned if no results are found or an exception occurs.</p>
     */
    @NameInMap("module")
    public TravelStandardListQueryResponseBodyModule module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05F9C201-1B53-5905-94AB-0D7444D8466A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041aa317070996148671005d0a0b</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TravelStandardListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardListQueryResponseBody self = new TravelStandardListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TravelStandardListQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TravelStandardListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TravelStandardListQueryResponseBody setModule(TravelStandardListQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TravelStandardListQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TravelStandardListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TravelStandardListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TravelStandardListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TravelStandardListQueryResponseBodyModuleItemsMainReserveRule extends TeaModel {
        /**
         * <p>The list of enabled service categories.</p>
         */
        @NameInMap("open_service_type_list")
        public java.util.List<String> openServiceTypeList;

        /**
         * <p>The personnel rule code.</p>
         * 
         * <strong>example:</strong>
         * <p>2006516571</p>
         */
        @NameInMap("rule_code")
        public Long ruleCode;

        /**
         * <p>The description of the travel standard.</p>
         * 
         * <strong>example:</strong>
         * <p>普通员工规则的描述</p>
         */
        @NameInMap("rule_desc")
        public String ruleDesc;

        /**
         * <p>The ID of the primary travel standard.</p>
         * 
         * <strong>example:</strong>
         * <p>6516571</p>
         */
        @NameInMap("rule_id")
        public Long ruleId;

        /**
         * <p>The name of the travel standard.</p>
         * 
         * <strong>example:</strong>
         * <p>普通员工规则</p>
         */
        @NameInMap("rule_name")
        public String ruleName;

        public static TravelStandardListQueryResponseBodyModuleItemsMainReserveRule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardListQueryResponseBodyModuleItemsMainReserveRule self = new TravelStandardListQueryResponseBodyModuleItemsMainReserveRule();
            return TeaModel.build(map, self);
        }

        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule setOpenServiceTypeList(java.util.List<String> openServiceTypeList) {
            this.openServiceTypeList = openServiceTypeList;
            return this;
        }
        public java.util.List<String> getOpenServiceTypeList() {
            return this.openServiceTypeList;
        }

        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList extends TeaModel {
        /**
         * <p>The travel standard description item.</p>
         * 
         * <strong>example:</strong>
         * <p>舱等</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the travel standard description item.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱,超级经济舱,公务舱,头等舱</p>
         */
        @NameInMap("value")
        public String value;

        public static TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList self = new TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList();
            return TeaModel.build(map, self);
        }

        public TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc extends TeaModel {
        /**
         * <p>The description of the travel standard.</p>
         */
        @NameInMap("data_list")
        public java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList> dataList;

        /**
         * <p>The title of the travel standard detail.</p>
         * 
         * <strong>example:</strong>
         * <p>普通员工规则</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The category of the travel standard detail.</p>
         * 
         * <strong>example:</strong>
         * <p>flight</p>
         */
        @NameInMap("type")
        public String type;

        public static TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc self = new TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc();
            return TeaModel.build(map, self);
        }

        public TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc setDataList(java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDescDataList> getDataList() {
            return this.dataList;
        }

        public TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class TravelStandardListQueryResponseBodyModuleItems extends TeaModel {
        /**
         * <p>The primary travel standard information.</p>
         */
        @NameInMap("main_reserve_rule")
        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule mainReserveRule;

        /**
         * <p>The description of the travel standard.</p>
         */
        @NameInMap("reserve_rule_desc")
        public java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc> reserveRuleDesc;

        /**
         * <p>The applicable personnel scope of the travel standard.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scope")
        public Integer scope;

        public static TravelStandardListQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardListQueryResponseBodyModuleItems self = new TravelStandardListQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public TravelStandardListQueryResponseBodyModuleItems setMainReserveRule(TravelStandardListQueryResponseBodyModuleItemsMainReserveRule mainReserveRule) {
            this.mainReserveRule = mainReserveRule;
            return this;
        }
        public TravelStandardListQueryResponseBodyModuleItemsMainReserveRule getMainReserveRule() {
            return this.mainReserveRule;
        }

        public TravelStandardListQueryResponseBodyModuleItems setReserveRuleDesc(java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc> reserveRuleDesc) {
            this.reserveRuleDesc = reserveRuleDesc;
            return this;
        }
        public java.util.List<TravelStandardListQueryResponseBodyModuleItemsReserveRuleDesc> getReserveRuleDesc() {
            return this.reserveRuleDesc;
        }

        public TravelStandardListQueryResponseBodyModuleItems setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
        }

    }

    public static class TravelStandardListQueryResponseBodyModule extends TeaModel {
        /**
         * <p>The list of travel standards.</p>
         */
        @NameInMap("items")
        public java.util.List<TravelStandardListQueryResponseBodyModuleItems> items;

        /**
         * <p>The total number of travel standards.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("total_size")
        public Integer totalSize;

        public static TravelStandardListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardListQueryResponseBodyModule self = new TravelStandardListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TravelStandardListQueryResponseBodyModule setItems(java.util.List<TravelStandardListQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<TravelStandardListQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public TravelStandardListQueryResponseBodyModule setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
