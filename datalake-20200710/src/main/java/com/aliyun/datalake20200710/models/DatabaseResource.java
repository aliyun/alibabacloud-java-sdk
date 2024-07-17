// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DatabaseResource extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabaseWildcard")
    public String databaseWildcard;

    public static DatabaseResource build(java.util.Map<String, ?> map) throws Exception {
        DatabaseResource self = new DatabaseResource();
        return TeaModel.build(map, self);
    }

    public DatabaseResource setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DatabaseResource setDatabaseWildcard(String databaseWildcard) {
        this.databaseWildcard = databaseWildcard;
        return this;
    }
    public String getDatabaseWildcard() {
        return this.databaseWildcard;
    }

}
