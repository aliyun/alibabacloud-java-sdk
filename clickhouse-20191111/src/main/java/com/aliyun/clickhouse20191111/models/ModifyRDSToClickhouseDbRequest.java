// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyRDSToClickhouseDbRequest extends TeaModel {
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
     * <p>cc-bp158i5wvj436****</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    /**
     * <p>The maximum number of rows that can be synchronized per second.</p>
     * 
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("LimitUpper")
    public Long limitUpper;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6x3qq4t90ok****</p>
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
     * <p>The database in the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("RdsSynDb")
    public String rdsSynDb;

    /**
     * <p>The table in the ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("RdsSynTables")
    public String rdsSynTables;

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
     * <p>The ID of the virtual private cloud (VPC) to which the ApsaraDB RDS for MySQL instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1v9dtwmqqjhwwg****</p>
     */
    @NameInMap("RdsVpcId")
    public String rdsVpcId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to ignore databases that do not support synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipUnsupported")
    public Boolean skipUnsupported;

    public static ModifyRDSToClickhouseDbRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRDSToClickhouseDbRequest self = new ModifyRDSToClickhouseDbRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRDSToClickhouseDbRequest setCkPassword(String ckPassword) {
        this.ckPassword = ckPassword;
        return this;
    }
    public String getCkPassword() {
        return this.ckPassword;
    }

    public ModifyRDSToClickhouseDbRequest setCkUserName(String ckUserName) {
        this.ckUserName = ckUserName;
        return this;
    }
    public String getCkUserName() {
        return this.ckUserName;
    }

    public ModifyRDSToClickhouseDbRequest setClickhousePort(Long clickhousePort) {
        this.clickhousePort = clickhousePort;
        return this;
    }
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    public ModifyRDSToClickhouseDbRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public ModifyRDSToClickhouseDbRequest setLimitUpper(Long limitUpper) {
        this.limitUpper = limitUpper;
        return this;
    }
    public Long getLimitUpper() {
        return this.limitUpper;
    }

    public ModifyRDSToClickhouseDbRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRDSToClickhouseDbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRDSToClickhouseDbRequest setRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }
    public String getRdsId() {
        return this.rdsId;
    }

    public ModifyRDSToClickhouseDbRequest setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    public ModifyRDSToClickhouseDbRequest setRdsPort(Long rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }
    public Long getRdsPort() {
        return this.rdsPort;
    }

    public ModifyRDSToClickhouseDbRequest setRdsSynDb(String rdsSynDb) {
        this.rdsSynDb = rdsSynDb;
        return this;
    }
    public String getRdsSynDb() {
        return this.rdsSynDb;
    }

    public ModifyRDSToClickhouseDbRequest setRdsSynTables(String rdsSynTables) {
        this.rdsSynTables = rdsSynTables;
        return this;
    }
    public String getRdsSynTables() {
        return this.rdsSynTables;
    }

    public ModifyRDSToClickhouseDbRequest setRdsUserName(String rdsUserName) {
        this.rdsUserName = rdsUserName;
        return this;
    }
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    public ModifyRDSToClickhouseDbRequest setRdsVpcId(String rdsVpcId) {
        this.rdsVpcId = rdsVpcId;
        return this;
    }
    public String getRdsVpcId() {
        return this.rdsVpcId;
    }

    public ModifyRDSToClickhouseDbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRDSToClickhouseDbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRDSToClickhouseDbRequest setSkipUnsupported(Boolean skipUnsupported) {
        this.skipUnsupported = skipUnsupported;
        return this;
    }
    public Boolean getSkipUnsupported() {
        return this.skipUnsupported;
    }

}
