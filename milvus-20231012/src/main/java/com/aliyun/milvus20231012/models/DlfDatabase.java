// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DlfDatabase extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>my_database</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>Test database</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The number of tables in the database. Read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("tableCount")
    public Integer tableCount;

    public static DlfDatabase build(java.util.Map<String, ?> map) throws Exception {
        DlfDatabase self = new DlfDatabase();
        return TeaModel.build(map, self);
    }

    public DlfDatabase setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DlfDatabase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DlfDatabase setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }
    public Integer getTableCount() {
        return this.tableCount;
    }

}
