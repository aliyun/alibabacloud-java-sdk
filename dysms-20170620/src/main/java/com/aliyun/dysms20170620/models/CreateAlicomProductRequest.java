// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateAlicomProductRequest extends TeaModel {
    @NameInMap("BusOffer")
    public Long busOffer;

    @NameInMap("BusOffers")
    public String busOffers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProdId")
    public String prodId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateAlicomProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlicomProductRequest self = new CreateAlicomProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlicomProductRequest setBusOffer(Long busOffer) {
        this.busOffer = busOffer;
        return this;
    }
    public Long getBusOffer() {
        return this.busOffer;
    }

    public CreateAlicomProductRequest setBusOffers(String busOffers) {
        this.busOffers = busOffers;
        return this;
    }
    public String getBusOffers() {
        return this.busOffers;
    }

    public CreateAlicomProductRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAlicomProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateAlicomProductRequest setProdId(String prodId) {
        this.prodId = prodId;
        return this;
    }
    public String getProdId() {
        return this.prodId;
    }

    public CreateAlicomProductRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAlicomProductRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
