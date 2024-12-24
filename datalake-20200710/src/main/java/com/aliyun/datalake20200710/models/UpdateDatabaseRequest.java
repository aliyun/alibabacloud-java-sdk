// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The new database</p>
     */
    @NameInMap("DatabaseInput")
    public DatabaseInput databaseInput;

    /**
     * <p>The name of the database before the modification. If the database before and after the update is the same, only other Meta is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseRequest self = new UpdateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public UpdateDatabaseRequest setDatabaseInput(DatabaseInput databaseInput) {
        this.databaseInput = databaseInput;
        return this;
    }
    public DatabaseInput getDatabaseInput() {
        return this.databaseInput;
    }

    public UpdateDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
