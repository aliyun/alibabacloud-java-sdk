// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappVerifyAndRegisterRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29389299388383</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800001234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The verification code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223222</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static ChatappVerifyAndRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappVerifyAndRegisterRequest self = new ChatappVerifyAndRegisterRequest();
        return TeaModel.build(map, self);
    }

    public ChatappVerifyAndRegisterRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappVerifyAndRegisterRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ChatappVerifyAndRegisterRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
