// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateReceiverRequest extends TeaModel {
    /**
     * <p>List description.</p>
     * 
     * <strong>example:</strong>
     * <p>the description</p>
     */
    @NameInMap("Desc")
    public String desc;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>List alias, an email address less than 30 characters long.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a***@example.net</p>
     */
    @NameInMap("ReceiversAlias")
    public String receiversAlias;

    /**
     * <p>List name, must be unique, with a length of 1-30 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ReceiversName")
    public String receiversName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReceiverRequest self = new CreateReceiverRequest();
        return TeaModel.build(map, self);
    }

    public CreateReceiverRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateReceiverRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReceiverRequest setReceiversAlias(String receiversAlias) {
        this.receiversAlias = receiversAlias;
        return this;
    }
    public String getReceiversAlias() {
        return this.receiversAlias;
    }

    public CreateReceiverRequest setReceiversName(String receiversName) {
        this.receiversName = receiversName;
        return this;
    }
    public String getReceiversName() {
        return this.receiversName;
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

}
