// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabaseObject extends TeaModel {
    @NameInMap("DatabaseQualifiedName")
    public String databaseQualifiedName;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("DdlSql")
    public String ddlSql;

    @NameInMap("ObjectName")
    public String objectName;

    @NameInMap("ObjectQualifiedName")
    public String objectQualifiedName;

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
