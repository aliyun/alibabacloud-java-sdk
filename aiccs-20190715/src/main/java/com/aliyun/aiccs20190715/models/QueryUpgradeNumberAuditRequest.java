// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryUpgradeNumberAuditRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealNameInsId")
    public Long realNameInsId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryUpgradeNumberAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUpgradeNumberAuditRequest self = new QueryUpgradeNumberAuditRequest();
        return TeaModel.build(map, self);
    }

    public QueryUpgradeNumberAuditRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryUpgradeNumberAuditRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryUpgradeNumberAuditRequest setRealNameInsId(Long realNameInsId) {
        this.realNameInsId = realNameInsId;
        return this;
    }
    public Long getRealNameInsId() {
        return this.realNameInsId;
    }

    public QueryUpgradeNumberAuditRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryUpgradeNumberAuditRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
