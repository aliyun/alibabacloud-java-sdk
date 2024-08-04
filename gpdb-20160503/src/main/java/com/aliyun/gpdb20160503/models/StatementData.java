// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class StatementData extends TeaModel {
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Database")
    public String database;

    @NameInMap("Id")
    public String id;

    @NameInMap("Parameters")
    public java.util.List<String> parameters;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("Sqls")
    public java.util.List<String> sqls;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static StatementData build(java.util.Map<String, ?> map) throws Exception {
        StatementData self = new StatementData();
        return TeaModel.build(map, self);
    }

    public StatementData setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public StatementData setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public StatementData setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StatementData setParameters(java.util.List<String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<String> getParameters() {
        return this.parameters;
    }

    public StatementData setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public StatementData setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public StatementData setSqls(java.util.List<String> sqls) {
        this.sqls = sqls;
        return this;
    }
    public java.util.List<String> getSqls() {
        return this.sqls;
    }

    public StatementData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StatementData setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
