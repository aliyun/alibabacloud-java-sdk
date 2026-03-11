// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Identifier extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>database_name</p>
     */
    @NameInMap("database")
    public String database;

    /**
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("object")
    public String object;

    public static Identifier build(java.util.Map<String, ?> map) throws Exception {
        Identifier self = new Identifier();
        return TeaModel.build(map, self);
    }

    public Identifier setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public Identifier setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

}
