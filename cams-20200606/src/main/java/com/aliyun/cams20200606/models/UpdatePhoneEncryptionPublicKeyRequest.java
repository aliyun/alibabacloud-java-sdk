// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneEncryptionPublicKeyRequest extends TeaModel {
    /**
     * <p>SpaceId/instanceId of ISV sub clients.</p>
     * 
     * <strong>example:</strong>
     * <p>399382882</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Encrypt the public key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PUBLIC KEY-----
     * AAA
     * BBB
     * CCC
     * DDD
     * EEE
     * FFF
     * GGG
     * -----END PUBLIC KEY-----</p>
     */
    @NameInMap("EncryptionPublicKey")
    public String encryptionPublicKey;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86138000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static UpdatePhoneEncryptionPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneEncryptionPublicKeyRequest self = new UpdatePhoneEncryptionPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneEncryptionPublicKeyRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setEncryptionPublicKey(String encryptionPublicKey) {
        this.encryptionPublicKey = encryptionPublicKey;
        return this;
    }
    public String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
