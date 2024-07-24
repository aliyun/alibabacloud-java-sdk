// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatappPhoneNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>939283893939</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13800000000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <strong>example:</strong>
     * <p>10202020</p>
     */
    @NameInMap("PreValidateId")
    public String preValidateId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
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
