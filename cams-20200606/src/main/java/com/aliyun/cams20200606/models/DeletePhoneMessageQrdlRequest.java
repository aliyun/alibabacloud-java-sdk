// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeletePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
     * 
     * <strong>example:</strong>
     * <p>883873773</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number. Add the country code before the phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>QR code encoding.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29338838</p>
     */
    @NameInMap("QrdlCode")
    public String qrdlCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeletePhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneMessageQrdlRequest self = new DeletePhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeletePhoneMessageQrdlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeletePhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public DeletePhoneMessageQrdlRequest setQrdlCode(String qrdlCode) {
        this.qrdlCode = qrdlCode;
        return this;
    }
    public String getQrdlCode() {
        return this.qrdlCode;
    }

    public DeletePhoneMessageQrdlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeletePhoneMessageQrdlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
