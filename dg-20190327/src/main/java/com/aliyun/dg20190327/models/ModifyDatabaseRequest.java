// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class ModifyDatabaseRequest extends TeaModel {
    @NameInMap("DbDescription")
    public String dbDescription;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbPassword")
    public String dbPassword;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("DbUserName")
    public String dbUserName;

    @NameInMap("Host")
    public String host;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Port")
    public Integer port;

    public static ModifyDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseRequest self = new ModifyDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public ModifyDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyDatabaseRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public ModifyDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ModifyDatabaseRequest setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }
    public String getDbUserName() {
        return this.dbUserName;
    }

    public ModifyDatabaseRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ModifyDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
