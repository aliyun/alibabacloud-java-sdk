// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSRequest extends TeaModel {
    /**
     * <p>The password of the account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("CkPassword")
    public String ckPassword;

    /**
     * <p>The account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("CkUserName")
    public String ckUserName;

    /**
     * <p>The port number of the ApsaraDB for ClickHouse cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>8123</p>
     */
    @NameInMap("ClickhousePort")
    public Long clickhousePort;

    /**
     * <p>The ID of the ApsaraDB for ClickHouse cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2zeyy362b5sbm****</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp13v4bnwlu8j****</p>
     */
    @NameInMap("RdsId")
    public String rdsId;

    /**
     * <p>The password of the account that is used to log on to the database in the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Rr</p>
     */
    @NameInMap("RdsPassword")
    public String rdsPassword;

    /**
     * <p>The port number of the ApsaraDB RDS for MySQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("RdsPort")
    public Long rdsPort;

    /**
     * <p>The account that is used to log on to the database in the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user2</p>
     */
    @NameInMap("RdsUserName")
    public String rdsUserName;

    /**
     * <p>The ID of the VPC in which the ApsaraDB RDS for MySQL instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9mm0qka0winfl47****</p>
     */
    @NameInMap("RdsVpcId")
    public String rdsVpcId;

    /**
     * <p>The internal endpoint of the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp16t9h3999xb0a7****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("RdsVpcUrl")
    public String rdsVpcUrl;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckClickhouseToRDSRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckClickhouseToRDSRequest self = new CheckClickhouseToRDSRequest();
        return TeaModel.build(map, self);
    }

    public CheckClickhouseToRDSRequest setCkPassword(String ckPassword) {
        this.ckPassword = ckPassword;
        return this;
    }
    public String getCkPassword() {
        return this.ckPassword;
    }

    public CheckClickhouseToRDSRequest setCkUserName(String ckUserName) {
        this.ckUserName = ckUserName;
        return this;
    }
    public String getCkUserName() {
        return this.ckUserName;
    }

    public CheckClickhouseToRDSRequest setClickhousePort(Long clickhousePort) {
        this.clickhousePort = clickhousePort;
        return this;
    }
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    public CheckClickhouseToRDSRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public CheckClickhouseToRDSRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckClickhouseToRDSRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckClickhouseToRDSRequest setRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }
    public String getRdsId() {
        return this.rdsId;
    }

    public CheckClickhouseToRDSRequest setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    public CheckClickhouseToRDSRequest setRdsPort(Long rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }
    public Long getRdsPort() {
        return this.rdsPort;
    }

    public CheckClickhouseToRDSRequest setRdsUserName(String rdsUserName) {
        this.rdsUserName = rdsUserName;
        return this;
    }
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    public CheckClickhouseToRDSRequest setRdsVpcId(String rdsVpcId) {
        this.rdsVpcId = rdsVpcId;
        return this;
    }
    public String getRdsVpcId() {
        return this.rdsVpcId;
    }

    public CheckClickhouseToRDSRequest setRdsVpcUrl(String rdsVpcUrl) {
        this.rdsVpcUrl = rdsVpcUrl;
        return this;
    }
    public String getRdsVpcUrl() {
        return this.rdsVpcUrl;
    }

    public CheckClickhouseToRDSRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckClickhouseToRDSRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
