// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class JoinConditions extends TeaModel {
    /**
     * <p>The left field in the format $<query_idx>.<field>, such as $0.hostIp.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("lhsField")
    public String lhsField;

    /**
     * <p>The comparison operator. Valid values: == / != / &lt; / &gt; / &lt;= / &gt;=.</p>
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
