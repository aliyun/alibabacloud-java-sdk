// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationVerifiedRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The verification code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static ChatappMigrationVerifiedRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationVerifiedRequest self = new ChatappMigrationVerifiedRequest();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationVerifiedRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappMigrationVerifiedRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ChatappMigrationVerifiedRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
