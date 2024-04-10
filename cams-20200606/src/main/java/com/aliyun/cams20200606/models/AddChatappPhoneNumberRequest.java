// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatappPhoneNumberRequest extends TeaModel {
    /**
     * <p>The country code.</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number without a country code.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The ID of the pre-registered phone number.</p>
     */
    @NameInMap("PreValidateId")
    public String preValidateId;

    /**
     * <p>The display name of the phone number.</p>
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

    public AddChatappPhoneNumberRequest setVerifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
        return this;
    }
    public String getVerifiedName() {
        return this.verifiedName;
    }

}
