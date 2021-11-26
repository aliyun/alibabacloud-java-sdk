// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceAccount")
    public String sourceAccount;

    @NameInMap("SourcePassword")
    public String sourcePassword;

    @NameInMap("TargetAccount")
    public String targetAccount;

    @NameInMap("TargetDbClusterId")
    public String targetDbClusterId;

    @NameInMap("TargetPassword")
    public String targetPassword;

    public static TransferVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferVersionRequest self = new TransferVersionRequest();
        return TeaModel.build(map, self);
    }

    public TransferVersionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TransferVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TransferVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TransferVersionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public TransferVersionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TransferVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransferVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TransferVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TransferVersionRequest setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public TransferVersionRequest setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
        return this;
    }
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    public TransferVersionRequest setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
        return this;
    }
    public String getTargetAccount() {
        return this.targetAccount;
    }

    public TransferVersionRequest setTargetDbClusterId(String targetDbClusterId) {
        this.targetDbClusterId = targetDbClusterId;
        return this;
    }
    public String getTargetDbClusterId() {
        return this.targetDbClusterId;
    }

    public TransferVersionRequest setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }
    public String getTargetPassword() {
        return this.targetPassword;
    }

}
