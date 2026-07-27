// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsJoinCondition extends TeaModel {
    @NameInMap("lhsField")
    public String lhsField;

    @NameInMap("operator")
    public String operator;

    @NameInMap("rhsField")
    public String rhsField;

    public static SlsJoinCondition build(java.util.Map<String, ?> map) throws Exception {
        SlsJoinCondition self = new SlsJoinCondition();
        return TeaModel.build(map, self);
    }

    public SlsJoinCondition setLhsField(String lhsField) {
        this.lhsField = lhsField;
        return this;
    }
    public String getLhsField() {
        return this.lhsField;
    }

    public SlsJoinCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SlsJoinCondition setRhsField(String rhsField) {
        this.rhsField = rhsField;
        return this;
    }
    public String getRhsField() {
        return this.rhsField;
    }

}
