// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafFilterInfoResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContent> content;

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
        @NameInMap("ErrMsg")
        public String errMsg;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("MaxLength")
        public Integer maxLength;

        @NameInMap("Regexp")
        public DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbolRegexp regexp;

        @NameInMap("Symbol")
        public String symbol;

        @NameInMap("Tip")
        public String tip;

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
        @NameInMap("ExtendField")
        public String extendField;

        @NameInMap("LogicalSymbol")
        public java.util.List<DescribeDcdnWafFilterInfoResponseBodyContentFieldsLogicalSymbol> logicalSymbol;

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
        @NameInMap("DefenseScene")
        public String defenseScene;

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
