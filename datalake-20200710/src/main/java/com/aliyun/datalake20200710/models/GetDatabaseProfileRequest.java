// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseProfileRequest extends TeaModel {
    /**
     * <p>CatalogId</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>DatabaseName</p>
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
