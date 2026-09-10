// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTableLineageRequest extends TeaModel {
    /**
     * <p>The default schema (database) name, which is used to complete table references in the SQL script that do not explicitly specify a database name.</p>
     * 
     * <strong>example:</strong>
     * <p>db_demo</p>
     */
    @NameInMap("defaultSchema")
    public String defaultSchema;

    /**
     * <p>The SQL dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("dialect")
    public String dialect;

    /**
     * <p>The source script content, Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>U0VMRUNUICogRlJPTSB0Ow==</p>
     */
    @NameInMap("sourceSqlScriptBase64")
    public String sourceSqlScriptBase64;

    public static GetSqlTableLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTableLineageRequest self = new GetSqlTableLineageRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlTableLineageRequest setDefaultSchema(String defaultSchema) {
        this.defaultSchema = defaultSchema;
        return this;
    }
    public String getDefaultSchema() {
        return this.defaultSchema;
    }

    public GetSqlTableLineageRequest setDialect(String dialect) {
        this.dialect = dialect;
        return this;
    }
    public String getDialect() {
        return this.dialect;
    }

    public GetSqlTableLineageRequest setSourceSqlScriptBase64(String sourceSqlScriptBase64) {
        this.sourceSqlScriptBase64 = sourceSqlScriptBase64;
        return this;
    }
    public String getSourceSqlScriptBase64() {
        return this.sourceSqlScriptBase64;
    }

}
