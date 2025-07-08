// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePkgThresholdNewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PackageWarningLimit")
    public String packageWarningLimit;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreatePkgThresholdNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgThresholdNewRequest self = new CreatePkgThresholdNewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePkgThresholdNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePkgThresholdNewRequest setPackageWarningLimit(String packageWarningLimit) {
        this.packageWarningLimit = packageWarningLimit;
        return this;
    }
    public String getPackageWarningLimit() {
        return this.packageWarningLimit;
    }

    public CreatePkgThresholdNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreatePkgThresholdNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePkgThresholdNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
