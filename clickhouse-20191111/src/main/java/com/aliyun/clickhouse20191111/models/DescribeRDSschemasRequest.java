// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSschemasRequest extends TeaModel {
    @NameInMap("DbClusterId")
    public String dbClusterId;

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

    @NameInMap("RdsVpcUrl")
    public String rdsVpcUrl;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeRDSschemasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSschemasRequest self = new DescribeRDSschemasRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRDSschemasRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public DescribeRDSschemasRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRDSschemasRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRDSschemasRequest setRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }
    public String getRdsId() {
        return this.rdsId;
    }

    public DescribeRDSschemasRequest setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    public DescribeRDSschemasRequest setRdsPort(Long rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }
    public Long getRdsPort() {
        return this.rdsPort;
    }

    public DescribeRDSschemasRequest setRdsUserName(String rdsUserName) {
        this.rdsUserName = rdsUserName;
        return this;
    }
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    public DescribeRDSschemasRequest setRdsVpcUrl(String rdsVpcUrl) {
        this.rdsVpcUrl = rdsVpcUrl;
        return this;
    }
    public String getRdsVpcUrl() {
        return this.rdsVpcUrl;
    }

    public DescribeRDSschemasRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRDSschemasRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
