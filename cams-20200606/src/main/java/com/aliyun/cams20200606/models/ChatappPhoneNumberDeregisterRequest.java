// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappPhoneNumberDeregisterRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
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

    public static ChatappPhoneNumberDeregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappPhoneNumberDeregisterRequest self = new ChatappPhoneNumberDeregisterRequest();
        return TeaModel.build(map, self);
    }

    public ChatappPhoneNumberDeregisterRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappPhoneNumberDeregisterRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
