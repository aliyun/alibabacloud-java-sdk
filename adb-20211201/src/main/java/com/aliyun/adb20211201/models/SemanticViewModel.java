// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SemanticViewModel extends TeaModel {
    /**
     * <p>The annotation for the semantic view</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个定义销售额相关指标的视图</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The YAML definition of the semantic view</p>
     * 
     * <strong>example:</strong>
     * <p>name: revenue_analysis
     * description: &quot;Semantic view for analyzing revenue across products and customers&quot;</p>
     * <p>tables:</p>
     * <ul>
     * <li><p>name: customers
     * description: &quot;Customer information&quot;
     * base_table:
     *   schema: sales_db
     *   table: customers
     * dimensions:</p>
     * <ul>
     * <li>name: customer_name
     * synonyms: [&quot;client name&quot;, &quot;customer&quot;]
     * description: &quot;Full name of the customer&quot;
     * expr: c_name
     * data_type: VARCHAR</li>
     * <li>name: customer_segment
     * synonyms: [&quot;segment&quot;, &quot;market segment&quot;]
     * description: &quot;Customer market segment&quot;
     * expr: c_mktsegment
     * data_type: VARCHAR
     * is_enum: true</li>
     * </ul>
     * </li>
     * <li><p>name: orders
     * description: &quot;Order information&quot;
     * base_table:
     *   schema: sales_db
     *   table: orders
     * dimensions:</p>
     * <ul>
     * <li>name: order_date
     * description: &quot;Date when order was placed&quot;
     * expr: o_orderdate
     * data_type: DATE</li>
     * <li>name: order_year
     * description: &quot;Year when order was placed&quot;
     * expr: YEAR(o_orderdate)
     * data_type: NUMBER
     * facts:</li>
     * <li>name: order_total
     * description: &quot;Total order amount&quot;
     * expr: o_totalprice
     * data_type: NUMBER
     * metrics:</li>
     * <li>name: total_orders
     * description: &quot;Total number of orders&quot;
     * expr: COUNT(*)</li>
     * <li>name: total_revenue
     * description: &quot;Total revenue of orders&quot;
     * expr: SUM(o_totalprice)</li>
     * <li>name: average_order_value
     * description: &quot;Average order value&quot;
     * expr: AVG(o_totalprice)</li>
     * </ul>
     * </li>
     * </ul>
     * <p>relationships:</p>
     * <ul>
     * <li>name: orders_to_customers
     * left_table: orders
     * right_table: customers
     * relationship_columns:<ul>
     * <li>left_column: o_custkey
     * right_column: c_custkey</li>
     * </ul>
     * </li>
     * </ul>
     * <p>metrics:</p>
     * <ul>
     * <li>name: revenue_per_customer
     * description: &quot;Average revenue per customer&quot;
     * expr: orders.total_revenue / customers.customer_count</li>
     * </ul>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The vector retrieval match score (defaults to 1; during retrieval queries, it is a decimal between 0 and 1 representing vector similarity)</p>
     * 
     * <strong>example:</strong>
     * <p>0.81</p>
     */
    @NameInMap("Score")
    public Double score;

    /**
     * <p>The name of the semantic view</p>
     * 
     * <strong>example:</strong>
     * <p>revenue_analysis</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    /**
     * <p>The schema where the semantic view resides</p>
     * 
     * <strong>example:</strong>
     * <p>sales_db</p>
     */
    @NameInMap("ViewSchema")
    public String viewSchema;

    public static SemanticViewModel build(java.util.Map<String, ?> map) throws Exception {
        SemanticViewModel self = new SemanticViewModel();
        return TeaModel.build(map, self);
    }

    public SemanticViewModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SemanticViewModel setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public SemanticViewModel setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public SemanticViewModel setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public SemanticViewModel setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema;
        return this;
    }
    public String getViewSchema() {
        return this.viewSchema;
    }

}
