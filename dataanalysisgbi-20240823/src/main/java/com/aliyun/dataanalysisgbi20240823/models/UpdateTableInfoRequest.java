// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateTableInfoRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("foreignKeys")
    public java.util.List<String> foreignKeys;

    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("primaryKey")
    public String primaryKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
     */
    @NameInMap("tableIdKey")
    public String tableIdKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateTableInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableInfoRequest self = new UpdateTableInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTableInfoRequest setForeignKeys(java.util.List<String> foreignKeys) {
        this.foreignKeys = foreignKeys;
        return this;
    }
    public java.util.List<String> getForeignKeys() {
        return this.foreignKeys;
    }

    public UpdateTableInfoRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public UpdateTableInfoRequest setTableIdKey(String tableIdKey) {
        this.tableIdKey = tableIdKey;
        return this;
    }
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    public UpdateTableInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
