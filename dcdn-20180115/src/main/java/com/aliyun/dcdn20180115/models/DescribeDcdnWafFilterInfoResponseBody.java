// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoResponseBody extends TeaModel {
    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContent> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafFilterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafFilterInfoResponseBody self = new DescribeDcdnWafFilterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafFilterInfoResponseBody setContent(java.util.List<DescribeDcdnWafFilterInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDcdnWafFilterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp extends TeaModel {
        /**
         * <p>The error message returned because no items match the regular expression.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The regular expression.</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        public static DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp self = new DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol extends TeaModel {
        /**
         * <p>The logical symbol that is displayed in the Dynamic Content Delivery Network (DCDN) console.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of match contents that can be returned. The value of this parameter varies based on the value of the Type parameter. Valid values:</p>
         * <br>
         * <p>*   If **multi** is returned for the Type parameter, the value of this parameter indicates the maximum number of match contents.</p>
         * <p>*   If **single** is returned for the Type parameter, the value of this parameter is 1.</p>
         * <p>*   If **none** is returned for the Type parameter, the value of this parameter is 0.</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>The regular expression.</p>
         */
        @NameInMap("Regexp")
        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp regexp;

        /**
         * <p>The logical symbol that is passed to the backend.</p>
         */
        @NameInMap("Symbol")
        public String symbol;

        /**
         * <p>The tips that are displayed in the match content.</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>The number of match contents. Valid values:</p>
         * <br>
         * <p>*   multi: multiple match contents</p>
         * <p>*   single: one match content</p>
         * <p>*   none: no match contents</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol self = new DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setRegexp(DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp regexp) {
            this.regexp = regexp;
            return this;
        }
        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp getRegexp() {
            return this.regexp;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDcdnWafFilterInfoResponseBodyContentFields extends TeaModel {
        /**
         * <p>The description of the match field. This parameter is not returned or is empty if no match fields are found.</p>
         */
        @NameInMap("ExtendField")
        public String extendField;

        /**
         * <p>The logical operator.</p>
         */
        @NameInMap("LogicalSymbol")
        public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol> logicalSymbol;

        /**
         * <p>The match field.</p>
         */
        @NameInMap("MatchField")
        public String matchField;

        public static DescribeDcdnWafFilterInfoResponseBodyContentFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafFilterInfoResponseBodyContentFields self = new DescribeDcdnWafFilterInfoResponseBodyContentFields();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFields setExtendField(String extendField) {
            this.extendField = extendField;
            return this;
        }
        public String getExtendField() {
            return this.extendField;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFields setLogicalSymbol(java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol> logicalSymbol) {
            this.logicalSymbol = logicalSymbol;
            return this;
        }
        public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol> getLogicalSymbol() {
            return this.logicalSymbol;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContentFields setMatchField(String matchField) {
            this.matchField = matchField;
            return this;
        }
        public String getMatchField() {
            return this.matchField;
        }

    }

    public static class DescribeDcdnWafFilterInfoResponseBodyContent extends TeaModel {
        /**
         * <p>The type of the protection policy. The value of this parameter is the same as that of the DefenseScenes parameter in the request.</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The information about the match condition.</p>
         */
        @NameInMap("Fields")
        public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFields> fields;

        public static DescribeDcdnWafFilterInfoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafFilterInfoResponseBodyContent self = new DescribeDcdnWafFilterInfoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafFilterInfoResponseBodyContent setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafFilterInfoResponseBodyContent setFields(java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFields> getFields() {
            return this.fields;
        }

    }

}
