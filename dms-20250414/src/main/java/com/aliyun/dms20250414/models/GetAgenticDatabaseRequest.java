// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticDatabaseRequest extends TeaModel {
    /**
     * <p>The UUID of the database. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    public static GetAgenticDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticDatabaseRequest self = new GetAgenticDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticDatabaseRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

}
