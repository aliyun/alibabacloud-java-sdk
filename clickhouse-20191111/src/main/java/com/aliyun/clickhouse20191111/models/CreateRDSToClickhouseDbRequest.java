// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbRequest extends TeaModel {
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
     * <p>cc-2ze5zeyl72188****</p>
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
     * <p>rm-8vb989qj9roh0****</p>
     */
    @NameInMap("RdsId")
    public String rdsId;

    /**
     * <p>The password of the account that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
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
     * <p>The ID of the virtual private cloud (VPC) to which the ApsaraDB RDS for MySQL instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zen93xryil99jsfy****</p>
     */
    @NameInMap("RdsVpcId")
    public String rdsVpcId;

    /**
     * <p>The private endpoint of the ApsaraDB RDS for MySQL instance.</p>
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

    /**
     * <p>Specifies whether to ignore the table schemas that do not support synchronization. Valid values:</p>
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

    /**
     * <p>The tables whose data you want to synchronize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Schema&quot;:&quot;recommend&quot;,&quot;Tables&quot;:[&quot;mr_platform_cpm&quot;,&quot;mr_platform_ecpm&quot;,&quot;p_monitor_record&quot;]}]</p>
     */
    @NameInMap("SynDbTables")
    public String synDbTables;

    public static CreateRDSToClickhouseDbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRDSToClickhouseDbRequest self = new CreateRDSToClickhouseDbRequest();
        return TeaModel.build(map, self);
    }

    public CreateRDSToClickhouseDbRequest setCkPassword(String ckPassword) {
        this.ckPassword = ckPassword;
        return this;
    }
    public String getCkPassword() {
        return this.ckPassword;
    }

    public CreateRDSToClickhouseDbRequest setCkUserName(String ckUserName) {
        this.ckUserName = ckUserName;
        return this;
    }
    public String getCkUserName() {
        return this.ckUserName;
    }

    public CreateRDSToClickhouseDbRequest setClickhousePort(Long clickhousePort) {
        this.clickhousePort = clickhousePort;
        return this;
    }
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    public CreateRDSToClickhouseDbRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public CreateRDSToClickhouseDbRequest setLimitUpper(Long limitUpper) {
        this.limitUpper = limitUpper;
        return this;
    }
    public Long getLimitUpper() {
        return this.limitUpper;
    }

    public CreateRDSToClickhouseDbRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRDSToClickhouseDbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRDSToClickhouseDbRequest setRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }
    public String getRdsId() {
        return this.rdsId;
    }

    public CreateRDSToClickhouseDbRequest setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    public CreateRDSToClickhouseDbRequest setRdsPort(Long rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }
    public Long getRdsPort() {
        return this.rdsPort;
    }

    public CreateRDSToClickhouseDbRequest setRdsUserName(String rdsUserName) {
        this.rdsUserName = rdsUserName;
        return this;
    }
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    public CreateRDSToClickhouseDbRequest setRdsVpcId(String rdsVpcId) {
        this.rdsVpcId = rdsVpcId;
        return this;
    }
    public String getRdsVpcId() {
        return this.rdsVpcId;
    }

    public CreateRDSToClickhouseDbRequest setRdsVpcUrl(String rdsVpcUrl) {
        this.rdsVpcUrl = rdsVpcUrl;
        return this;
    }
    public String getRdsVpcUrl() {
        return this.rdsVpcUrl;
    }

    public CreateRDSToClickhouseDbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRDSToClickhouseDbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRDSToClickhouseDbRequest setSkipUnsupported(Boolean skipUnsupported) {
        this.skipUnsupported = skipUnsupported;
        return this;
    }
    public Boolean getSkipUnsupported() {
        return this.skipUnsupported;
    }

    public CreateRDSToClickhouseDbRequest setSynDbTables(String synDbTables) {
        this.synDbTables = synDbTables;
        return this;
    }
    public String getSynDbTables() {
        return this.synDbTables;
    }

}
