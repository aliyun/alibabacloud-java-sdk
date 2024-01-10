// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class ConnectDatabaseRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbPassword")
    public String dbPassword;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("DbUserName")
    public String dbUserName;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Integer port;

    public static ConnectDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectDatabaseRequest self = new ConnectDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ConnectDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ConnectDatabaseRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public ConnectDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ConnectDatabaseRequest setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }
    public String getDbUserName() {
        return this.dbUserName;
    }

    public ConnectDatabaseRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ConnectDatabaseRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ConnectDatabaseRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
