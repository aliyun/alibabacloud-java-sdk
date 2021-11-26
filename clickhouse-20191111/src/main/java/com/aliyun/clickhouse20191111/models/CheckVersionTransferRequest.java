// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckVersionTransferRequest extends TeaModel {
    @NameInMap("CheckAccount")
    public Boolean checkAccount;

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

    public static CheckVersionTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVersionTransferRequest self = new CheckVersionTransferRequest();
        return TeaModel.build(map, self);
    }

    public CheckVersionTransferRequest setCheckAccount(Boolean checkAccount) {
        this.checkAccount = checkAccount;
        return this;
    }
    public Boolean getCheckAccount() {
        return this.checkAccount;
    }

    public CheckVersionTransferRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CheckVersionTransferRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckVersionTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckVersionTransferRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CheckVersionTransferRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckVersionTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckVersionTransferRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckVersionTransferRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckVersionTransferRequest setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public CheckVersionTransferRequest setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
        return this;
    }
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    public CheckVersionTransferRequest setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
        return this;
    }
    public String getTargetAccount() {
        return this.targetAccount;
    }

    public CheckVersionTransferRequest setTargetDbClusterId(String targetDbClusterId) {
        this.targetDbClusterId = targetDbClusterId;
        return this;
    }
    public String getTargetDbClusterId() {
        return this.targetDbClusterId;
    }

    public CheckVersionTransferRequest setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }
    public String getTargetPassword() {
        return this.targetPassword;
    }

}
