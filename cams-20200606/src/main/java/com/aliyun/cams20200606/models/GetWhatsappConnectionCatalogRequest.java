// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappConnectionCatalogRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The WABA ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static GetWhatsappConnectionCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappConnectionCatalogRequest self = new GetWhatsappConnectionCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetWhatsappConnectionCatalogRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetWhatsappConnectionCatalogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetWhatsappConnectionCatalogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetWhatsappConnectionCatalogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetWhatsappConnectionCatalogRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
