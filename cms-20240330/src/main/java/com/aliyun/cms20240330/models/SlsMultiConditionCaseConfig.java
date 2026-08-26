// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsMultiConditionCaseConfig extends TeaModel {
    /**
     * <p>The match expression (corresponds to V1 condition, preserved as-is without structured parsing).</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>The count match expression (corresponds to V1 countCondition, preserved as-is without structured parsing).</p>
     */
    @NameInMap("countCondition")
    public String countCondition;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use countCondition instead.</p>
     */
    @NameInMap("countOperator")
    @Deprecated
    public String countOperator;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use countCondition instead.</p>
     */
    @NameInMap("countThreshold")
    @Deprecated
    public Long countThreshold;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
     */
    @NameInMap("matchField")
    @Deprecated
    public String matchField;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
     */
    @NameInMap("matchOperator")
    @Deprecated
    public String matchOperator;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
     */
    @NameInMap("matchValue")
    @Deprecated
    public String matchValue;

    /**
     * <p>The detection operator (aligned with V1 caseList.type): HAS_DATA / HAS_DATA_COUNT / HAS_DATA_MATCH / HAS_DATA_MATCH_COUNT.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
     */
    @NameInMap("rawCondition")
    @Deprecated
    public String rawCondition;

    /**
     * <p>The severity level (corresponds to V1 level).</p>
     */
    @NameInMap("severity")
    public String severity;

    public static SlsMultiConditionCaseConfig build(java.util.Map<String, ?> map) throws Exception {
        SlsMultiConditionCaseConfig self = new SlsMultiConditionCaseConfig();
        return TeaModel.build(map, self);
    }

    public SlsMultiConditionCaseConfig setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public SlsMultiConditionCaseConfig setCountCondition(String countCondition) {
        this.countCondition = countCondition;
        return this;
    }
    public String getCountCondition() {
        return this.countCondition;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setCountThreshold(Long countThreshold) {
        this.countThreshold = countThreshold;
        return this;
    }
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

    public SlsMultiConditionCaseConfig setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    @Deprecated
    public SlsMultiConditionCaseConfig setRawCondition(String rawCondition) {
        this.rawCondition = rawCondition;
        return this;
    }
    public String getRawCondition() {
        return this.rawCondition;
    }

    public SlsMultiConditionCaseConfig setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
