// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsJoinCondition extends TeaModel {
    /**
     * <p>The left field in the format $<query_idx>.<field>, such as $0.hostIp.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("lhsField")
    public String lhsField;

    /**
     * <p>The comparison operator. Valid values: ==, !=, &lt;, &gt;, &lt;=, and &gt;=.</p>
     * 
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The right field in the format $<query_idx>.<field>, such as $1.hostIp.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_id</p>
     */
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
