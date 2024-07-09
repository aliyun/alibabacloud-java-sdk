// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSqlStatementRequest extends TeaModel {
    /**
     * <p>The SQL code. You can specify one or more SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>SHOW TABLES</p>
     */
    @NameInMap("codeContent")
    public String codeContent;

    /**
     * <p>The default Data Lake Formation (DLF) catalog ID.</p>
     * 
     * <strong>example:</strong>
     * <p>default_catalog</p>
     */
    @NameInMap("defaultCatalog")
    public String defaultCatalog;

    /**
     * <p>The name of the default database.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The SQL Compute ID. You can create an SQL Compute in the workspace created in EMR Serverless Spark.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-dfahdfjafhajd****</p>
     */
    @NameInMap("sqlComputeId")
    public String sqlComputeId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateSqlStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlStatementRequest self = new CreateSqlStatementRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlStatementRequest setCodeContent(String codeContent) {
        this.codeContent = codeContent;
        return this;
    }
    public String getCodeContent() {
        return this.codeContent;
    }

    public CreateSqlStatementRequest setDefaultCatalog(String defaultCatalog) {
        this.defaultCatalog = defaultCatalog;
        return this;
    }
    public String getDefaultCatalog() {
        return this.defaultCatalog;
    }

    public CreateSqlStatementRequest setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase;
        return this;
    }
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    public CreateSqlStatementRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public CreateSqlStatementRequest setSqlComputeId(String sqlComputeId) {
        this.sqlComputeId = sqlComputeId;
        return this;
    }
    public String getSqlComputeId() {
        return this.sqlComputeId;
    }

    public CreateSqlStatementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
