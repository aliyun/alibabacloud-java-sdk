// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class RetryDatabaseRequest extends TeaModel {
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

    public static RetryDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDatabaseRequest self = new RetryDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public RetryDatabaseRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RetryDatabaseRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public RetryDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public RetryDatabaseRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public RetryDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public RetryDatabaseRequest setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }
    public String getDbUserName() {
        return this.dbUserName;
    }

    public RetryDatabaseRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RetryDatabaseRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public RetryDatabaseRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public RetryDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
