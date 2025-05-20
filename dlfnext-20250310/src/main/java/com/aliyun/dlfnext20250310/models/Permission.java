// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Permission extends TeaModel {
    @NameInMap("access")
    public String access;

    @NameInMap("database")
    public String database;

    @NameInMap("principal")
    public String principal;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("table")
    public String table;

    public static Permission build(java.util.Map<String, ?> map) throws Exception {
        Permission self = new Permission();
        return TeaModel.build(map, self);
    }

    public Permission setAccess(String access) {
        this.access = access;
        return this;
    }
    public String getAccess() {
        return this.access;
    }

    public Permission setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public Permission setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }
    public String getPrincipal() {
        return this.principal;
    }

    public Permission setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Permission setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
