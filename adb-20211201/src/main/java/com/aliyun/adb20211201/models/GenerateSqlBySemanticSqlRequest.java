// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GenerateSqlBySemanticSqlRequest extends TeaModel {
    /**
     * <p>The ID of the ADB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The schema name.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The SQL statement that queries the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select sum(amount) from sv_sales</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static GenerateSqlBySemanticSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSqlBySemanticSqlRequest self = new GenerateSqlBySemanticSqlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSqlBySemanticSqlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GenerateSqlBySemanticSqlRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GenerateSqlBySemanticSqlRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
