// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class AddDatabaseRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("RegionId")
    public String regionId;

    public static AddDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatabaseRequest self = new AddDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public AddDatabaseRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDatabaseRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public AddDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddDatabaseRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public AddDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public AddDatabaseRequest setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }
    public String getDbUserName() {
        return this.dbUserName;
    }

    public AddDatabaseRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public AddDatabaseRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public AddDatabaseRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AddDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
