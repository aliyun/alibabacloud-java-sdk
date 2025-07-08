// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsProductForChannelCustRequest extends TeaModel {
    @NameInMap("ChannelId")
    public Integer channelId;

    @NameInMap("OnlyCheckOpened")
    public Boolean onlyCheckOpened;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSmsProductForChannelCustRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsProductForChannelCustRequest self = new CreateSmsProductForChannelCustRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsProductForChannelCustRequest setChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }
    public Integer getChannelId() {
        return this.channelId;
    }

    public CreateSmsProductForChannelCustRequest setOnlyCheckOpened(Boolean onlyCheckOpened) {
        this.onlyCheckOpened = onlyCheckOpened;
        return this;
    }
    public Boolean getOnlyCheckOpened() {
        return this.onlyCheckOpened;
    }

    public CreateSmsProductForChannelCustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsProductForChannelCustRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsProductForChannelCustRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsProductForChannelCustRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
