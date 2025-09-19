// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class FixSqlByMetaAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <strong>example:</strong>
     * <p>unknown column col</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>正确字段是啥？</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table where col = 1</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static FixSqlByMetaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        FixSqlByMetaAgentRequest self = new FixSqlByMetaAgentRequest();
        return TeaModel.build(map, self);
    }

    public FixSqlByMetaAgentRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public FixSqlByMetaAgentRequest setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public FixSqlByMetaAgentRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public FixSqlByMetaAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public FixSqlByMetaAgentRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
