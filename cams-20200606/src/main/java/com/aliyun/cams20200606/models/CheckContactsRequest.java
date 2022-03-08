// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckContactsRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("Contacts")
    public String contacts;

    @NameInMap("From")
    public String from;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckContactsRequest self = new CheckContactsRequest();
        return TeaModel.build(map, self);
    }

    public CheckContactsRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CheckContactsRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public CheckContactsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CheckContactsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckContactsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckContactsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
