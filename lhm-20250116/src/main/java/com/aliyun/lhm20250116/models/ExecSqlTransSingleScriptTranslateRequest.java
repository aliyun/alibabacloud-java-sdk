// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecSqlTransSingleScriptTranslateRequest extends TeaModel {
    /**
     * <p>The source SQL dialect type.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("sourceDialect")
    public String sourceDialect;

    /**
     * <p>The source script content. It must be Base64-encoded before being passed in. The server decodes the content before performing the conversion.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM t;</p>
     */
    @NameInMap("sourceSqlScript")
    public String sourceSqlScript;

    /**
     * <p>The table name mapping. In string format, the source table and target table are separated by a comma (,).</p>
     */
    @NameInMap("tableMapping")
    public java.util.List<String> tableMapping;

    /**
     * <p>The target SQL dialect type.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("targetDialect")
    public String targetDialect;

    public static ExecSqlTransSingleScriptTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSqlTransSingleScriptTranslateRequest self = new ExecSqlTransSingleScriptTranslateRequest();
        return TeaModel.build(map, self);
    }

    public ExecSqlTransSingleScriptTranslateRequest setSourceDialect(String sourceDialect) {
        this.sourceDialect = sourceDialect;
        return this;
    }
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    public ExecSqlTransSingleScriptTranslateRequest setSourceSqlScript(String sourceSqlScript) {
        this.sourceSqlScript = sourceSqlScript;
        return this;
    }
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    public ExecSqlTransSingleScriptTranslateRequest setTableMapping(java.util.List<String> tableMapping) {
        this.tableMapping = tableMapping;
        return this;
    }
    public java.util.List<String> getTableMapping() {
        return this.tableMapping;
    }

    public ExecSqlTransSingleScriptTranslateRequest setTargetDialect(String targetDialect) {
        this.targetDialect = targetDialect;
        return this;
    }
    public String getTargetDialect() {
        return this.targetDialect;
    }

}
