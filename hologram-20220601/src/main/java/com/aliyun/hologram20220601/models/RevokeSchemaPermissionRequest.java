// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeSchemaPermissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_db</p>
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
     * <p>p4_1234xxxx</p>
     */
    @NameInMap("userName")
    public String userName;

    public static RevokeSchemaPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSchemaPermissionRequest self = new RevokeSchemaPermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSchemaPermissionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public RevokeSchemaPermissionRequest setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    public RevokeSchemaPermissionRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public RevokeSchemaPermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
