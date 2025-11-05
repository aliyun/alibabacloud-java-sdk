// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantDatabasePermissionRequest extends TeaModel {
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
     * <p>p4_123444xxx</p>
     */
    @NameInMap("userName")
    public String userName;

    public static GrantDatabasePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantDatabasePermissionRequest self = new GrantDatabasePermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantDatabasePermissionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GrantDatabasePermissionRequest setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    public GrantDatabasePermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
