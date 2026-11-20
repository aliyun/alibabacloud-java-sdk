// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>my_db</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>The permission model. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/security-and-compliance/hologres-permission-model/">Hologres permission model</a>. Default value: Standard.</p>
     * 
     * <strong>example:</strong>
     * <p>SPM</p>
     */
    @NameInMap("permissionModel")
    public String permissionModel;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseRequest setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }
    public String getPermissionModel() {
        return this.permissionModel;
    }

}
