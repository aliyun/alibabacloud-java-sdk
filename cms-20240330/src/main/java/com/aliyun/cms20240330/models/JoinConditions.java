// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class JoinConditions extends TeaModel {
    @NameInMap("lhsField")
    public String lhsField;

    @NameInMap("operator")
    public String operator;

    @NameInMap("rhsField")
    public String rhsField;

    public static JoinConditions build(java.util.Map<String, ?> map) throws Exception {
        JoinConditions self = new JoinConditions();
        return TeaModel.build(map, self);
    }

    public JoinConditions setLhsField(String lhsField) {
        this.lhsField = lhsField;
        return this;
    }
    public String getLhsField() {
        return this.lhsField;
    }

    public JoinConditions setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public JoinConditions setRhsField(String rhsField) {
        this.rhsField = rhsField;
        return this;
    }
    public String getRhsField() {
        return this.rhsField;
    }

}
