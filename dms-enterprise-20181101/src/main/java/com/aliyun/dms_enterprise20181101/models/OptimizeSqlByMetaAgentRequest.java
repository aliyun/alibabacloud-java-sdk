// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OptimizeSqlByMetaAgentRequest extends TeaModel {
    /**
     * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The name of the selected model. You can use only Qwen series models.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>是否为慢SQL</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The SQL statement that you want to analyze.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table where col = 1</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static OptimizeSqlByMetaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        OptimizeSqlByMetaAgentRequest self = new OptimizeSqlByMetaAgentRequest();
        return TeaModel.build(map, self);
    }

    public OptimizeSqlByMetaAgentRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public OptimizeSqlByMetaAgentRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public OptimizeSqlByMetaAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public OptimizeSqlByMetaAgentRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
