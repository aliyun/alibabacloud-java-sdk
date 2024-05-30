// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static GetPhoneEncryptionPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneEncryptionPublicKeyRequest self = new GetPhoneEncryptionPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneEncryptionPublicKeyRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetPhoneEncryptionPublicKeyRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
