// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafFilterResponseBody extends TeaModel {
    /**
     * <p>The matching engine configuration information returned.</p>
     */
    @NameInMap("Filter")
    public GetWafFilterResponseBodyFilter filter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWafFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWafFilterResponseBody self = new GetWafFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWafFilterResponseBody setFilter(GetWafFilterResponseBodyFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetWafFilterResponseBodyFilter getFilter() {
        return this.filter;
    }

    public GetWafFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWafFilterResponseBodyFilterFieldsLogicsValidator extends TeaModel {
        /**
         * <p>The error message returned when validation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Enter a valid expression</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The length limit of the value.</p>
         */
        @NameInMap("Length")
        public WafQuotaInteger length;

        /**
         * <p>The regular expression pattern for the value, used for string validation.</p>
         * 
         * <strong>example:</strong>
         * <p>^example$</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The numeric range of the value, used for number validation.</p>
         */
        @NameInMap("Range")
        public WafQuotaInteger range;

        public static GetWafFilterResponseBodyFilterFieldsLogicsValidator build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsLogicsValidator self = new GetWafFilterResponseBodyFilterFieldsLogicsValidator();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsLogicsValidator setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetWafFilterResponseBodyFilterFieldsLogicsValidator setLength(WafQuotaInteger length) {
            this.length = length;
            return this;
        }
        public WafQuotaInteger getLength() {
            return this.length;
        }

        public GetWafFilterResponseBodyFilterFieldsLogicsValidator setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetWafFilterResponseBodyFilterFieldsLogicsValidator setRange(WafQuotaInteger range) {
            this.range = range;
            return this;
        }
        public WafQuotaInteger getRange() {
            return this.range;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsLogics extends TeaModel {
        /**
         * <p>The configurable attributes, such as whether the match is case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attributes")
        public Integer attributes;

        /**
         * <p>Indicates whether the current plan supports this match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The type of the value input field. Valid values:</p>
         * <ul>
         * <li>select:single: single-select input field</li>
         * <li>select:multi: multi-select input field</li>
         * <li>input:single: single input field</li>
         * <li>input:multi: multi input field</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>input:single</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The minimum plan that supports this match operator, displayed when the current plan does not support it.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MinPlan")
        public String minPlan;

        /**
         * <p>Indicates whether the match result is negated.</p>
         */
        @NameInMap("Negative")
        public Boolean negative;

        /**
         * <p>The display label of the match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Does not equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parameter of the match operator used internally by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Symbol")
        public String symbol;

        /**
         * <p>The input hint that helps users provide valid values required by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>e.g. image/jpeg</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>The type of the value. Valid values:</p>
         * <ul>
         * <li>integer: integer</li>
         * <li>integer_slice: integer array</li>
         * <li>string: string</li>
         * <li>string_slice: string array</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The validator object that defines the validation rules for values.</p>
         */
        @NameInMap("Validator")
        public GetWafFilterResponseBodyFilterFieldsLogicsValidator validator;

        public static GetWafFilterResponseBodyFilterFieldsLogics build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsLogics self = new GetWafFilterResponseBodyFilterFieldsLogics();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setAttributes(Integer attributes) {
            this.attributes = attributes;
            return this;
        }
        public Integer getAttributes() {
            return this.attributes;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setMinPlan(String minPlan) {
            this.minPlan = minPlan;
            return this;
        }
        public String getMinPlan() {
            return this.minPlan;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setNegative(Boolean negative) {
            this.negative = negative;
            return this;
        }
        public Boolean getNegative() {
            return this.negative;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWafFilterResponseBodyFilterFieldsLogics setValidator(GetWafFilterResponseBodyFilterFieldsLogicsValidator validator) {
            this.validator = validator;
            return this;
        }
        public GetWafFilterResponseBodyFilterFieldsLogicsValidator getValidator() {
            return this.validator;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsSelectorData extends TeaModel {
        /**
         * <p>The display label of the available data.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The parameter value of the available data.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetWafFilterResponseBodyFilterFieldsSelectorData build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsSelectorData self = new GetWafFilterResponseBodyFilterFieldsSelectorData();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsSelectorData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWafFilterResponseBodyFilterFieldsSelectorData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsSelector extends TeaModel {
        /**
         * <p>The list of available data when the selector kind is data.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSelectorData> data;

        /**
         * <p>The kind of the selector, such as whether it is used for selecting data items or other purposes.</p>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("Kind")
        public String kind;

        public static GetWafFilterResponseBodyFilterFieldsSelector build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsSelector self = new GetWafFilterResponseBodyFilterFieldsSelector();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsSelector setData(java.util.List<GetWafFilterResponseBodyFilterFieldsSelectorData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSelectorData> getData() {
            return this.data;
        }

        public GetWafFilterResponseBodyFilterFieldsSelector setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator extends TeaModel {
        /**
         * <p>The error message returned when validation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Enter a valid expression</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The length limit of the value.</p>
         */
        @NameInMap("Length")
        public WafQuotaInteger length;

        /**
         * <p>The regular expression pattern for the value, used for string validation.</p>
         * 
         * <strong>example:</strong>
         * <p>^example$</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The numeric range of the value, used for number validation.</p>
         */
        @NameInMap("Range")
        public WafQuotaInteger range;

        public static GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator self = new GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator setLength(WafQuotaInteger length) {
            this.length = length;
            return this;
        }
        public WafQuotaInteger getLength() {
            return this.length;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator setRange(WafQuotaInteger range) {
            this.range = range;
            return this;
        }
        public WafQuotaInteger getRange() {
            return this.range;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsSubsLogics extends TeaModel {
        /**
         * <p>The field attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Attributes")
        public Integer attributes;

        /**
         * <p>Indicates whether the current plan supports this match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The type of the value input field. Valid values:</p>
         * <ul>
         * <li>select:single: single-select input field</li>
         * <li>select:multi: multi-select input field</li>
         * <li>input:single: single input field</li>
         * <li>input:multi: multi input field</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select:single</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The minimum plan that supports this match operator, displayed when the current plan does not support it.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MinPlan")
        public String minPlan;

        /**
         * <p>Indicates whether the match result is negated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Negative")
        public Boolean negative;

        /**
         * <p>The display label of the match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parameter of the match operator used internally by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Symbol")
        public String symbol;

        /**
         * <p>The input hint that helps users provide valid values required by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>e.g. image/jpeg</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>The type of the value. Valid values:</p>
         * <ul>
         * <li>integer: integer</li>
         * <li>integer_slice: integer array</li>
         * <li>string: string</li>
         * <li>string_slice: string array</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The validator object that defines the validation rules for values.</p>
         */
        @NameInMap("Validator")
        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator validator;

        public static GetWafFilterResponseBodyFilterFieldsSubsLogics build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsSubsLogics self = new GetWafFilterResponseBodyFilterFieldsSubsLogics();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setAttributes(Integer attributes) {
            this.attributes = attributes;
            return this;
        }
        public Integer getAttributes() {
            return this.attributes;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setMinPlan(String minPlan) {
            this.minPlan = minPlan;
            return this;
        }
        public String getMinPlan() {
            return this.minPlan;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setNegative(Boolean negative) {
            this.negative = negative;
            return this;
        }
        public Boolean getNegative() {
            return this.negative;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWafFilterResponseBodyFilterFieldsSubsLogics setValidator(GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator validator) {
            this.validator = validator;
            return this;
        }
        public GetWafFilterResponseBodyFilterFieldsSubsLogicsValidator getValidator() {
            return this.validator;
        }

    }

    public static class GetWafFilterResponseBodyFilterFieldsSubs extends TeaModel {
        /**
         * <p>Indicates whether the current plan supports this match object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The parameter of the sub-item match object.</p>
         * 
         * <strong>example:</strong>
         * <p>ali.websdk.umid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display label of the sub-item match object.</p>
         * 
         * <strong>example:</strong>
         * <p>Web UMID</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The list of logical operator properties applicable to the sub-item (same structure as the parent Logics).</p>
         */
        @NameInMap("Logics")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSubsLogics> logics;

        /**
         * <p>The minimum plan that supports this match object, displayed when the current plan does not support it.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MinPlan")
        public String minPlan;

        public static GetWafFilterResponseBodyFilterFieldsSubs build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFieldsSubs self = new GetWafFilterResponseBodyFilterFieldsSubs();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFieldsSubs setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafFilterResponseBodyFilterFieldsSubs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetWafFilterResponseBodyFilterFieldsSubs setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWafFilterResponseBodyFilterFieldsSubs setLogics(java.util.List<GetWafFilterResponseBodyFilterFieldsSubsLogics> logics) {
            this.logics = logics;
            return this;
        }
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSubsLogics> getLogics() {
            return this.logics;
        }

        public GetWafFilterResponseBodyFilterFieldsSubs setMinPlan(String minPlan) {
            this.minPlan = minPlan;
            return this;
        }
        public String getMinPlan() {
            return this.minPlan;
        }

    }

    public static class GetWafFilterResponseBodyFilterFields extends TeaModel {
        /**
         * <p>Indicates whether the current plan supports this match object.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The parameter of the match object used internally by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>http.request.headers</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display label of the match object.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The list of logical operator properties that define the logical conditions used for matching.</p>
         */
        @NameInMap("Logics")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsLogics> logics;

        /**
         * <p>The minimum plan that supports this match object, displayed when the current plan does not support it.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MinPlan")
        public String minPlan;

        /**
         * <p>The selector object that defines how to select the match object.</p>
         */
        @NameInMap("Selector")
        public GetWafFilterResponseBodyFilterFieldsSelector selector;

        /**
         * <p>Indicates whether the match object contains subfields.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sub")
        public Boolean sub;

        /**
         * <p>The hint provided to users about how to enter subfields.</p>
         * 
         * <strong>example:</strong>
         * <p>e.g. Content-Type</p>
         */
        @NameInMap("SubTip")
        public String subTip;

        /**
         * <p>The enumerated sub-item list (dropdown subfields for grouped fields such as ali.websdk). Top-level match objects populate this list. Sub-items that are flat fields can be used directly as the left-hand side of an expression.</p>
         */
        @NameInMap("Subs")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSubs> subs;

        public static GetWafFilterResponseBodyFilterFields build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFields self = new GetWafFilterResponseBodyFilterFields();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilterFields setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetWafFilterResponseBodyFilterFields setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetWafFilterResponseBodyFilterFields setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWafFilterResponseBodyFilterFields setLogics(java.util.List<GetWafFilterResponseBodyFilterFieldsLogics> logics) {
            this.logics = logics;
            return this;
        }
        public java.util.List<GetWafFilterResponseBodyFilterFieldsLogics> getLogics() {
            return this.logics;
        }

        public GetWafFilterResponseBodyFilterFields setMinPlan(String minPlan) {
            this.minPlan = minPlan;
            return this;
        }
        public String getMinPlan() {
            return this.minPlan;
        }

        public GetWafFilterResponseBodyFilterFields setSelector(GetWafFilterResponseBodyFilterFieldsSelector selector) {
            this.selector = selector;
            return this;
        }
        public GetWafFilterResponseBodyFilterFieldsSelector getSelector() {
            return this.selector;
        }

        public GetWafFilterResponseBodyFilterFields setSub(Boolean sub) {
            this.sub = sub;
            return this;
        }
        public Boolean getSub() {
            return this.sub;
        }

        public GetWafFilterResponseBodyFilterFields setSubTip(String subTip) {
            this.subTip = subTip;
            return this;
        }
        public String getSubTip() {
            return this.subTip;
        }

        public GetWafFilterResponseBodyFilterFields setSubs(java.util.List<GetWafFilterResponseBodyFilterFieldsSubs> subs) {
            this.subs = subs;
            return this;
        }
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSubs> getSubs() {
            return this.subs;
        }

    }

    public static class GetWafFilterResponseBodyFilter extends TeaModel {
        /**
         * <p>The list that describes match objects and their properties.</p>
         */
        @NameInMap("Fields")
        public java.util.List<GetWafFilterResponseBodyFilterFields> fields;

        /**
         * <p>The phase in which WAF processes the request.</p>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The target value of the matching engine.</p>
         * 
         * <strong>example:</strong>
         * <p>characteristics</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom_cc</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetWafFilterResponseBodyFilter build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilter self = new GetWafFilterResponseBodyFilter();
            return TeaModel.build(map, self);
        }

        public GetWafFilterResponseBodyFilter setFields(java.util.List<GetWafFilterResponseBodyFilterFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<GetWafFilterResponseBodyFilterFields> getFields() {
            return this.fields;
        }

        public GetWafFilterResponseBodyFilter setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetWafFilterResponseBodyFilter setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetWafFilterResponseBodyFilter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
