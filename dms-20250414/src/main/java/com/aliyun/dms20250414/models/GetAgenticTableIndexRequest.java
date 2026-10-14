// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticTableIndexRequest extends TeaModel {
    /**
     * <p>The UUID of the database to which the table belongs. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The fully qualified name of the table. You can obtain this value from the QualifiedName parameter returned by ListAgenticTableBaseInfo. You must specify the full name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("TableQualifiedName")
    public String tableQualifiedName;

    public static GetAgenticTableIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticTableIndexRequest self = new GetAgenticTableIndexRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticTableIndexRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public GetAgenticTableIndexRequest setTableQualifiedName(String tableQualifiedName) {
        this.tableQualifiedName = tableQualifiedName;
        return this;
    }
    public String getTableQualifiedName() {
        return this.tableQualifiedName;
    }

}
