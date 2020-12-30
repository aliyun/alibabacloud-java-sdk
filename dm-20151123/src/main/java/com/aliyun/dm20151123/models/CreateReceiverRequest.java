// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateReceiverRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ReceiversName")
    public String receiversName;

    @NameInMap("ReceiversAlias")
    public String receiversAlias;

    @NameInMap("Desc")
    public String desc;

    public static CreateReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReceiverRequest self = new CreateReceiverRequest();
        return TeaModel.build(map, self);
    }

    public CreateReceiverRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReceiverRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateReceiverRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateReceiverRequest setReceiversName(String receiversName) {
        this.receiversName = receiversName;
        return this;
    }
    public String getReceiversName() {
        return this.receiversName;
    }

    public CreateReceiverRequest setReceiversAlias(String receiversAlias) {
        this.receiversAlias = receiversAlias;
        return this;
    }
    public String getReceiversAlias() {
        return this.receiversAlias;
    }

    public CreateReceiverRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
