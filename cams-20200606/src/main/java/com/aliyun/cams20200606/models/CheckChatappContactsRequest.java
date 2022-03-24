// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckChatappContactsRequest extends TeaModel {
    // 通道类型
    @NameInMap("ChannelType")
    public String channelType;

    // 需要查询的用户列表，JSON格式，单次调用最多查询10个。注意：用户号码必须加国家码
    @NameInMap("Contacts")
    public String contacts;

    // 发送号码
    @NameInMap("From")
    public String from;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckChatappContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckChatappContactsRequest self = new CheckChatappContactsRequest();
        return TeaModel.build(map, self);
    }

    public CheckChatappContactsRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CheckChatappContactsRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public CheckChatappContactsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CheckChatappContactsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckChatappContactsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckChatappContactsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
