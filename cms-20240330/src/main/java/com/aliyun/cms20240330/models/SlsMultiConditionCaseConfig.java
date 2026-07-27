// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsMultiConditionCaseConfig extends TeaModel {
    @NameInMap("countOperator")
    public String countOperator;

    @NameInMap("countThreshold")
    public Long countThreshold;

    @NameInMap("matchField")
    public String matchField;

    @NameInMap("matchOperator")
    public String matchOperator;

    @NameInMap("matchValue")
    public String matchValue;

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
