// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailRequest extends TeaModel {
    /**
     * <p>The details of the sensitive field.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The name of the field.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a logical database.</p>
     * <p>*   **false**: The database is a physical database.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListSensitiveColumnsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsDetailRequest self = new ListSensitiveColumnsDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsDetailRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListSensitiveColumnsDetailRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListSensitiveColumnsDetailRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListSensitiveColumnsDetailRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ListSensitiveColumnsDetailRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListSensitiveColumnsDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
