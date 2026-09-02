// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsJoinCondition extends TeaModel {
    /**
     * <p>The left table field name in form mode.</p>
     * 
     * <strong>example:</strong>
     * <p>customerID</p>
     */
    @NameInMap("LeftColumn")
    public String leftColumn;

    /**
     * <p>The conditional expression method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>form</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The right table field name in form mode.</p>
     * 
     * <strong>example:</strong>
     * <p>customerID</p>
     */
    @NameInMap("RightColumn")
    public String rightColumn;

    /**
     * <p>The join SQL expression in SQL mode.</p>
     * 
     * <strong>example:</strong>
     * <p>sales_transactions.customerID = customers.customerID</p>
     */
    @NameInMap("SQLExpression")
    public String SQLExpression;

    public static AgentDataSemanticsJoinCondition build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsJoinCondition self = new AgentDataSemanticsJoinCondition();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsJoinCondition setLeftColumn(String leftColumn) {
        this.leftColumn = leftColumn;
        return this;
    }
    public String getLeftColumn() {
        return this.leftColumn;
    }

    public AgentDataSemanticsJoinCondition setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AgentDataSemanticsJoinCondition setRightColumn(String rightColumn) {
        this.rightColumn = rightColumn;
        return this;
    }
    public String getRightColumn() {
        return this.rightColumn;
    }

    public AgentDataSemanticsJoinCondition setSQLExpression(String SQLExpression) {
        this.SQLExpression = SQLExpression;
        return this;
    }
    public String getSQLExpression() {
        return this.SQLExpression;
    }

}
