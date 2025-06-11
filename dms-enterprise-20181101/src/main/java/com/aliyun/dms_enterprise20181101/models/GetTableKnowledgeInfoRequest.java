// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableKnowledgeInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableSchemaName")
    public String tableSchemaName;

    public static GetTableKnowledgeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableKnowledgeInfoRequest self = new GetTableKnowledgeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTableKnowledgeInfoRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetTableKnowledgeInfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetTableKnowledgeInfoRequest setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

}
