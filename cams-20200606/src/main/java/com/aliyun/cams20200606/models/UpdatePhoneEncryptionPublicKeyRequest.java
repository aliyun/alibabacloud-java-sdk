// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneEncryptionPublicKeyRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("EncryptionPublicKey")
    public String encryptionPublicKey;

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
