// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticTableColumnRequest extends TeaModel {
    /**
     * <p>The UUID of the database to which the table belongs. You can obtain the UUID by calling the ListAgenticDatabase or SearchAgenticDatabase operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The fully qualified name of the table. You can obtain the name from the QualifiedName parameter returned by the ListAgenticTableBaseInfo operation. You must specify the complete name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("TableQualifiedName")
    public String tableQualifiedName;

    public static GetAgenticTableColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticTableColumnRequest self = new GetAgenticTableColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticTableColumnRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public GetAgenticTableColumnRequest setTableQualifiedName(String tableQualifiedName) {
        this.tableQualifiedName = tableQualifiedName;
        return this;
    }
    public String getTableQualifiedName() {
        return this.tableQualifiedName;
    }

}
