// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateRemoteADBDataSourceRequest extends TeaModel {
    /**
     * <p>Customer-specified DataSourceName.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Instance ID of the data being used (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-test1</p>
     */
    @NameInMap("LocalDBInstanceId")
    public String localDBInstanceId;

    /**
     * <p>Database name of the data being used (required)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db1</p>
     */
    @NameInMap("LocalDatabase")
    public String localDatabase;

    /**
     * <p>Management account of the data-using instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>managerAccount</p>
     */
    @NameInMap("ManagerUserName")
    public String managerUserName;

    /**
     * <p>Password of the management account of the data-using instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password2</p>
     */
    @NameInMap("ManagerUserPassword")
    public String managerUserPassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Instance ID providing the data (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-test2</p>
     */
    @NameInMap("RemoteDBInstanceId")
    public String remoteDBInstanceId;

    /**
     * <p>Database name providing the data (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db2</p>
     */
    @NameInMap("RemoteDatabase")
    public String remoteDatabase;

    /**
     * <p>Account name of the data-providing instance used for user mapping (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Password of the data-providing instance account used for user mapping.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password1</p>
     */
    @NameInMap("UserPassword")
    public String userPassword;

    public static CreateRemoteADBDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoteADBDataSourceRequest self = new CreateRemoteADBDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemoteADBDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateRemoteADBDataSourceRequest setLocalDBInstanceId(String localDBInstanceId) {
        this.localDBInstanceId = localDBInstanceId;
        return this;
    }
    public String getLocalDBInstanceId() {
        return this.localDBInstanceId;
    }

    public CreateRemoteADBDataSourceRequest setLocalDatabase(String localDatabase) {
        this.localDatabase = localDatabase;
        return this;
    }
    public String getLocalDatabase() {
        return this.localDatabase;
    }

    public CreateRemoteADBDataSourceRequest setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
        return this;
    }
    public String getManagerUserName() {
        return this.managerUserName;
    }

    public CreateRemoteADBDataSourceRequest setManagerUserPassword(String managerUserPassword) {
        this.managerUserPassword = managerUserPassword;
        return this;
    }
    public String getManagerUserPassword() {
        return this.managerUserPassword;
    }

    public CreateRemoteADBDataSourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRemoteADBDataSourceRequest setRemoteDBInstanceId(String remoteDBInstanceId) {
        this.remoteDBInstanceId = remoteDBInstanceId;
        return this;
    }
    public String getRemoteDBInstanceId() {
        return this.remoteDBInstanceId;
    }

    public CreateRemoteADBDataSourceRequest setRemoteDatabase(String remoteDatabase) {
        this.remoteDatabase = remoteDatabase;
        return this;
    }
    public String getRemoteDatabase() {
        return this.remoteDatabase;
    }

    public CreateRemoteADBDataSourceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateRemoteADBDataSourceRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

}
