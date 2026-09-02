// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsJoin extends TeaModel {
    /**
     * <p>The join condition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Condition")
    public AgentDataSemanticsJoinCondition condition;

    /**
     * <p>The join usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>Use this join when analyzing customer attributes associated with sales transactions</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The full name of the left table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>samples.bakehouse.sales_transactions</p>
     */
    @NameInMap("LeftTable")
    public String leftTable;

    /**
     * <p>The table relationship type.</p>
     * 
     * <strong>example:</strong>
     * <p>many_to_one</p>
     */
    @NameInMap("RelationshipType")
    public String relationshipType;

    /**
     * <p>The full name of the right table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>samples.bakehouse.customers</p>
     */
    @NameInMap("RightTable")
    public String rightTable;

    public static AgentDataSemanticsJoin build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsJoin self = new AgentDataSemanticsJoin();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsJoin setCondition(AgentDataSemanticsJoinCondition condition) {
        this.condition = condition;
        return this;
    }
    public AgentDataSemanticsJoinCondition getCondition() {
        return this.condition;
    }

    public AgentDataSemanticsJoin setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentDataSemanticsJoin setLeftTable(String leftTable) {
        this.leftTable = leftTable;
        return this;
    }
    public String getLeftTable() {
        return this.leftTable;
    }

    public AgentDataSemanticsJoin setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }
    public String getRelationshipType() {
        return this.relationshipType;
    }

    public AgentDataSemanticsJoin setRightTable(String rightTable) {
        this.rightTable = rightTable;
        return this;
    }
    public String getRightTable() {
        return this.rightTable;
    }

}
