// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyRemoteADBDataSourceRequest extends TeaModel {
    /**
     * <p>Service ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specified dataSourceName.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The ID of the local data instance being used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-test</p>
     */
    @NameInMap("LocalDBInstanceId")
    public String localDBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>New user name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>newUserName</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>New user password, which must be transmitted in encrypted form.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>newUserPassword</p>
     */
    @NameInMap("UserPassword")
    public String userPassword;

    public static ModifyRemoteADBDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemoteADBDataSourceRequest self = new ModifyRemoteADBDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRemoteADBDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ModifyRemoteADBDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ModifyRemoteADBDataSourceRequest setLocalDBInstanceId(String localDBInstanceId) {
        this.localDBInstanceId = localDBInstanceId;
        return this;
    }
    public String getLocalDBInstanceId() {
        return this.localDBInstanceId;
    }

    public ModifyRemoteADBDataSourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRemoteADBDataSourceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyRemoteADBDataSourceRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

}
