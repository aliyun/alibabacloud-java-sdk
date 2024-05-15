// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PolarDBMySQL**</p>
     * <p>*   **PolarDBPostgreSQL**</p>
     * <p>*   **Redis**</p>
     * <p>*   **MongoDB**</p>
     * <p>*   **PolarDBOracle**</p>
     * <p>*   **PolarDBX**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("FlushAccount")
    public String flushAccount;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The type of the instance on which the database is deployed. Valid values:</p>
     * <br>
     * <p>*   **RDS**: an Alibaba Cloud database instance.</p>
     * <p>*   **ECS**: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.</p>
     * <p>*   **IDC**: a self-managed database instance that is not deployed on Alibaba Cloud.</p>
     * <br>
     * <p>>  IDC refers to your data center.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceArea")
    public String instanceArea;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The endpoint that is used to access the instance over internal networks.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The network type of the instance.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password for the username.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to access the instance over internal networks.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The username that is used to log on to the database.</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("__context")
    public String context;

    public static AddHDMInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceRequest self = new AddHDMInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AddHDMInstanceRequest setFlushAccount(String flushAccount) {
        this.flushAccount = flushAccount;
        return this;
    }
    public String getFlushAccount() {
        return this.flushAccount;
    }

    public AddHDMInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public AddHDMInstanceRequest setInstanceArea(String instanceArea) {
        this.instanceArea = instanceArea;
        return this;
    }
    public String getInstanceArea() {
        return this.instanceArea;
    }

    public AddHDMInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHDMInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AddHDMInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public AddHDMInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddHDMInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AddHDMInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddHDMInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public AddHDMInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddHDMInstanceRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
