// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class OpenCommonProductRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static OpenCommonProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCommonProductRequest self = new OpenCommonProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenCommonProductRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenCommonProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public OpenCommonProductRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public OpenCommonProductRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OpenCommonProductRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
