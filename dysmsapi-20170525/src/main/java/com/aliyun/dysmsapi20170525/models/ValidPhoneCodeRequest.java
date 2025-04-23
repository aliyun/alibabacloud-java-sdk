// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ValidPhoneCodeRequest extends TeaModel {
    /**
     * <p>验证码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("CertifyCode")
    public String certifyCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>手机号</p>
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

    public static ValidPhoneCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidPhoneCodeRequest self = new ValidPhoneCodeRequest();
        return TeaModel.build(map, self);
    }

    public ValidPhoneCodeRequest setCertifyCode(String certifyCode) {
        this.certifyCode = certifyCode;
        return this;
    }
    public String getCertifyCode() {
        return this.certifyCode;
    }

    public ValidPhoneCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ValidPhoneCodeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public ValidPhoneCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ValidPhoneCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
