// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbRequest extends TeaModel {
    @NameInMap("CkPassword")
    public String ckPassword;

    @NameInMap("CkUserName")
    public String ckUserName;

    @NameInMap("ClickhousePort")
    public Long clickhousePort;

    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("LimitUpper")
    public Long limitUpper;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RdsId")
    public String rdsId;

    @NameInMap("RdsPassword")
    public String rdsPassword;

    @NameInMap("RdsPort")
    public Long rdsPort;

    @NameInMap("RdsUserName")
    public String rdsUserName;

    @NameInMap("RdsVpcId")
    public String rdsVpcId;

    @NameInMap("RdsVpcUrl")
    public String rdsVpcUrl;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SkipUnsupported")
    public Boolean skipUnsupported;

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
