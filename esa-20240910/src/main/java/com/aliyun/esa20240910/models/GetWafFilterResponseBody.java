// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafFilterResponseBody extends TeaModel {
    @NameInMap("Filter")
    public GetWafFilterResponseBodyFilter filter;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>Enter a valid expression</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Length")
        public WafQuotaInteger length;

        /**
         * <strong>example:</strong>
         * <p>^example$</p>
         */
        @NameInMap("Pattern")
        public String pattern;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attributes")
        public Integer attributes;

        /**
         * <strong>example:</strong>
         * <p>input:single</p>
         */
        @NameInMap("Kind")
        public String kind;

        @NameInMap("Negative")
        public Boolean negative;

        /**
         * <strong>example:</strong>
         * <p>Does not equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Symbol")
        public String symbol;

        /**
         * <strong>example:</strong>
         * <p>e.g. image/jpeg</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

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

        public GetWafFilterResponseBodyFilterFieldsLogics setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
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
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
        @NameInMap("Data")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsSelectorData> data;

        /**
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

    public static class GetWafFilterResponseBodyFilterFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http.request.headers</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Label")
        public String label;

        @NameInMap("Logics")
        public java.util.List<GetWafFilterResponseBodyFilterFieldsLogics> logics;

        @NameInMap("Selector")
        public GetWafFilterResponseBodyFilterFieldsSelector selector;

        @NameInMap("Sub")
        public Boolean sub;

        /**
         * <strong>example:</strong>
         * <p>e.g. Content-Type</p>
         */
        @NameInMap("SubTip")
        public String subTip;

        public static GetWafFilterResponseBodyFilterFields build(java.util.Map<String, ?> map) throws Exception {
            GetWafFilterResponseBodyFilterFields self = new GetWafFilterResponseBodyFilterFields();
            return TeaModel.build(map, self);
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

    }

    public static class GetWafFilterResponseBodyFilter extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<GetWafFilterResponseBodyFilterFields> fields;

        /**
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>characteristics</p>
         */
        @NameInMap("Target")
        public String target;

        /**
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
