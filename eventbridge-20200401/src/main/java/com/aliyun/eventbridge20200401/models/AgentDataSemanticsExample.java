// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsExample extends TeaModel {
    /**
     * <p>The example usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>Use this example when a user asks about high-value customers based on weekly statistics</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The example name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>High-value customers with weekly sales exceeding 150</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The SQL example parameter list. A maximum of 20 items are supported.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<AgentDataSemanticsExampleParameter> parameters;

    /**
     * <p>The standard SQL example.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT customerID FROM sales_transactions</p>
     */
    @NameInMap("SQLExpression")
    public String SQLExpression;

    public static AgentDataSemanticsExample build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsExample self = new AgentDataSemanticsExample();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsExample setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentDataSemanticsExample setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentDataSemanticsExample setParameters(java.util.List<AgentDataSemanticsExampleParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<AgentDataSemanticsExampleParameter> getParameters() {
        return this.parameters;
    }

    public AgentDataSemanticsExample setSQLExpression(String SQLExpression) {
        this.SQLExpression = SQLExpression;
        return this;
    }
    public String getSQLExpression() {
        return this.SQLExpression;
    }

}
