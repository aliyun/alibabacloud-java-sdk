// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Permission extends TeaModel {
    @NameInMap("access")
    public String access;

    @NameInMap("columns")
    public PermissionColumns columns;

    @NameInMap("database")
    public String database;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("function")
    public String function;

    @NameInMap("principal")
    public String principal;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("rowFilter")
    public RowFilter rowFilter;

    @NameInMap("table")
    public String table;

    @NameInMap("view")
    public String view;

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

    public Permission setColumns(PermissionColumns columns) {
        this.columns = columns;
        return this;
    }
    public PermissionColumns getColumns() {
        return this.columns;
    }

    public Permission setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public Permission setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public Permission setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
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

    public Permission setRowFilter(RowFilter rowFilter) {
        this.rowFilter = rowFilter;
        return this;
    }
    public RowFilter getRowFilter() {
        return this.rowFilter;
    }

    public Permission setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public Permission setView(String view) {
        this.view = view;
        return this;
    }
    public String getView() {
        return this.view;
    }

    public static class PermissionColumns extends TeaModel {
        @NameInMap("columnNames")
        public java.util.List<String> columnNames;

        @NameInMap("excludedColumnNames")
        public java.util.List<String> excludedColumnNames;

        public static PermissionColumns build(java.util.Map<String, ?> map) throws Exception {
            PermissionColumns self = new PermissionColumns();
            return TeaModel.build(map, self);
        }

        public PermissionColumns setColumnNames(java.util.List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public java.util.List<String> getColumnNames() {
            return this.columnNames;
        }

        public PermissionColumns setExcludedColumnNames(java.util.List<String> excludedColumnNames) {
            this.excludedColumnNames = excludedColumnNames;
            return this;
        }
        public java.util.List<String> getExcludedColumnNames() {
            return this.excludedColumnNames;
        }

    }

}
