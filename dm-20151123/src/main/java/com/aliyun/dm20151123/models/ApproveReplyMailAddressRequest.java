// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveReplyMailAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static ApproveReplyMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveReplyMailAddressRequest self = new ApproveReplyMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public ApproveReplyMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApproveReplyMailAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ApproveReplyMailAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ApproveReplyMailAddressRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
