// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSqlStatementRequest extends TeaModel {
    @NameInMap("codeContent")
    public String codeContent;

    @NameInMap("defaultCatalog")
    public String defaultCatalog;

    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("sqlComputeId")
    public String sqlComputeId;

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
