// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateSavedQueryRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SavedQueryId")
    public String savedQueryId;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedQueryRequest self = new CreateSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavedQueryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSavedQueryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSavedQueryRequest setSavedQueryId(String savedQueryId) {
        this.savedQueryId = savedQueryId;
        return this;
    }
    public String getSavedQueryId() {
        return this.savedQueryId;
    }

    public CreateSavedQueryRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public CreateSavedQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
