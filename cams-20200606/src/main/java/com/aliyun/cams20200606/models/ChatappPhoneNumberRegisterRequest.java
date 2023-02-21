// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappPhoneNumberRegisterRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static ChatappPhoneNumberRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappPhoneNumberRegisterRequest self = new ChatappPhoneNumberRegisterRequest();
        return TeaModel.build(map, self);
    }

    public ChatappPhoneNumberRegisterRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappPhoneNumberRegisterRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
