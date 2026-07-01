// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class RequiredPhoneCodeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The administrator\&quot;s phone number that receives the verification code.</p>
     * <ul>
     * <li>The account that <strong>calls this operation to send the verification code must be the same account that submits the qualification</strong>. Otherwise, the call fails.</li>
     * <li>Phone number format: +/+86/0086/86 or a mobile phone number without any prefix, for example 1390000****.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****1234</p>
     */
    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RequiredPhoneCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RequiredPhoneCodeRequest self = new RequiredPhoneCodeRequest();
        return TeaModel.build(map, self);
    }

    public RequiredPhoneCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RequiredPhoneCodeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public RequiredPhoneCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RequiredPhoneCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
