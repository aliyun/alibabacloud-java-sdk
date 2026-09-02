// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsMetric extends TeaModel {
    /**
     * <p>The usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>Use totalPrice to calculate total sales for sales performance comparison</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the SQL expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TotalSales</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The SQL expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUM(sales_transactions.totalPrice)</p>
     */
    @NameInMap("SQLExpression")
    public String SQLExpression;

    /**
     * <p>The list of synonyms. A maximum of 10 items are supported. Each item can contain up to 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Sales&quot;,&quot;Revenue&quot;,&quot;GMV&quot;]</p>
     */
    @NameInMap("Synonyms")
    public java.util.List<String> synonyms;

    /**
     * <p>The type of the SQL expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>measure</p>
     */
    @NameInMap("Type")
    public String type;

    public static AgentDataSemanticsMetric build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsMetric self = new AgentDataSemanticsMetric();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsMetric setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentDataSemanticsMetric setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentDataSemanticsMetric setSQLExpression(String SQLExpression) {
        this.SQLExpression = SQLExpression;
        return this;
    }
    public String getSQLExpression() {
        return this.SQLExpression;
    }

    public AgentDataSemanticsMetric setSynonyms(java.util.List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }
    public java.util.List<String> getSynonyms() {
        return this.synonyms;
    }

    public AgentDataSemanticsMetric setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
