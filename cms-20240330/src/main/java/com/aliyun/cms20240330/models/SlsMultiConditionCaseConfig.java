// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsMultiConditionCaseConfig extends TeaModel {
    /**
     * <p>The count comparison operator. Valid values: GTE, GT, EQ, LTE, LT.</p>
     */
    @NameInMap("countOperator")
    public String countOperator;

    /**
     * <p>The count threshold. The alert is triggered when this threshold is met.</p>
     */
    @NameInMap("countThreshold")
    public Long countThreshold;

    /**
     * <p>The log field name. Required when matchOperator is set to CONTAINS, EQUALS, or REGEX. Specify the field name when matchOperator is set to PRESENT or NOT_PRESENT.</p>
     */
    @NameInMap("matchField")
    public String matchField;

    /**
     * <p>The log matching operator. Valid values: PRESENT (field exists), NOT_PRESENT (field does not exist), CONTAINS (contains), EQUALS (equals), REGEX (regular expression). If left empty, any data matches.</p>
     */
    @NameInMap("matchOperator")
    public String matchOperator;

    /**
     * <p>The log match value. Required when matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    /**
     * <p>The severity level.</p>
     */
    @NameInMap("severity")
    public String severity;

    public static SlsMultiConditionCaseConfig build(java.util.Map<String, ?> map) throws Exception {
        SlsMultiConditionCaseConfig self = new SlsMultiConditionCaseConfig();
        return TeaModel.build(map, self);
    }

    public SlsMultiConditionCaseConfig setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    public SlsMultiConditionCaseConfig setCountThreshold(Long countThreshold) {
        this.countThreshold = countThreshold;
        return this;
    }
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    public SlsMultiConditionCaseConfig setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    public SlsMultiConditionCaseConfig setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public SlsMultiConditionCaseConfig setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

    public SlsMultiConditionCaseConfig setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
