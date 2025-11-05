// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantSchemaPermissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>db_demo</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    @NameInMap("privileges")
    public java.util.List<String> privileges;

    /**
     * <strong>example:</strong>
     * <p>my_schema</p>
     */
    @NameInMap("schemaName")
    public String schemaName;

    /**
     * <strong>example:</strong>
     * <p>p4_134xxx</p>
     */
    @NameInMap("userName")
    public String userName;

    public static GrantSchemaPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantSchemaPermissionRequest self = new GrantSchemaPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantSchemaPermissionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GrantSchemaPermissionRequest setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    public GrantSchemaPermissionRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GrantSchemaPermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
