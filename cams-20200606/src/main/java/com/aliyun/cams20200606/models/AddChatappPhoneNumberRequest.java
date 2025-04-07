// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatappPhoneNumberRequest extends TeaModel {
    /**
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>Adds a phone number for a WhatsApp Business account (WABA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93928389****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>AddChatappPhoneNumber</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1380000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>cams:ChatappPhoneNumberRegister</p>
     * 
     * <strong>example:</strong>
     * <p>1020****</p>
     */
    @NameInMap("PreValidateId")
    @Deprecated
    public String preValidateId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Private</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("VerifiedName")
    public String verifiedName;

    public static AddChatappPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChatappPhoneNumberRequest self = new AddChatappPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public AddChatappPhoneNumberRequest setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public AddChatappPhoneNumberRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddChatappPhoneNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddChatappPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Deprecated
    public AddChatappPhoneNumberRequest setPreValidateId(String preValidateId) {
        this.preValidateId = preValidateId;
        return this;
    }
    public String getPreValidateId() {
        return this.preValidateId;
    }

    public AddChatappPhoneNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddChatappPhoneNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddChatappPhoneNumberRequest setVerifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
        return this;
    }
    public String getVerifiedName() {
        return this.verifiedName;
    }

}
