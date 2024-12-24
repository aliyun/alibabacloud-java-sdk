// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseProfileRequest extends TeaModel {
    /**
     * <p>The ID of the data directory. By default, the ID of the primary account is entered.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The name of the metadatabase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>530_db</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    public static GetDatabaseProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseProfileRequest self = new GetDatabaseProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseProfileRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetDatabaseProfileRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

}
