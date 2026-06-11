// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabaseObject extends TeaModel {
    /**
     * <p>The fully qualified name of the database. This name uniquely identifies the database within the system.</p>
     */
    @NameInMap("DatabaseQualifiedName")
    public String databaseQualifiedName;

    /**
     * <p>The unique identifier (UUID) of the database that contains the object.</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The Data Definition Language (DDL) SQL statement that defines the object\&quot;s structure.</p>
     */
    @NameInMap("DdlSql")
    public String ddlSql;

    /**
     * <p>The name of the database object, such as a table, view, or index.</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    /**
     * <p>The fully qualified name that uniquely identifies the object, typically formatted as <database>.<schema>.<object>.</p>
     */
    @NameInMap("ObjectQualifiedName")
    public String objectQualifiedName;

    /**
     * <p>The type of the database object. For example, <code>TABLE</code>, <code>VIEW</code>, or <code>INDEX</code>.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static AgenticDatabaseObject build(java.util.Map<String, ?> map) throws Exception {
        AgenticDatabaseObject self = new AgenticDatabaseObject();
        return TeaModel.build(map, self);
    }

    public AgenticDatabaseObject setDatabaseQualifiedName(String databaseQualifiedName) {
        this.databaseQualifiedName = databaseQualifiedName;
        return this;
    }
    public String getDatabaseQualifiedName() {
        return this.databaseQualifiedName;
    }

    public AgenticDatabaseObject setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public AgenticDatabaseObject setDdlSql(String ddlSql) {
        this.ddlSql = ddlSql;
        return this;
    }
    public String getDdlSql() {
        return this.ddlSql;
    }

    public AgenticDatabaseObject setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public AgenticDatabaseObject setObjectQualifiedName(String objectQualifiedName) {
        this.objectQualifiedName = objectQualifiedName;
        return this;
    }
    public String getObjectQualifiedName() {
        return this.objectQualifiedName;
    }

    public AgenticDatabaseObject setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
