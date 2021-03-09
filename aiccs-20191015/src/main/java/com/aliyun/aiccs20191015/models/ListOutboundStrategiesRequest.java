// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("BuId")
    public Long buId;

    @NameInMap("Keyword")
    public String keyword;

    public static ListOutboundStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesRequest self = new ListOutboundStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public ListOutboundStrategiesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListOutboundStrategiesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListOutboundStrategiesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListOutboundStrategiesRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListOutboundStrategiesRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public ListOutboundStrategiesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
