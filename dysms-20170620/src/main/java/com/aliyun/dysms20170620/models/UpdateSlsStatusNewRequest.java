// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UpdateSlsStatusNewRequest extends TeaModel {
    @NameInMap("AuthStatus")
    public Boolean authStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SaveTime")
    public Integer saveTime;

    public static UpdateSlsStatusNewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsStatusNewRequest self = new UpdateSlsStatusNewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlsStatusNewRequest setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    public UpdateSlsStatusNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSlsStatusNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public UpdateSlsStatusNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSlsStatusNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSlsStatusNewRequest setSaveTime(Integer saveTime) {
        this.saveTime = saveTime;
        return this;
    }
    public Integer getSaveTime() {
        return this.saveTime;
    }

}
