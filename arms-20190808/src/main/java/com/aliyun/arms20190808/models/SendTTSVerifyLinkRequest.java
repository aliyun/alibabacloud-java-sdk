// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("Phone")
    public String phone;

    public static SendTTSVerifyLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTTSVerifyLinkRequest self = new SendTTSVerifyLinkRequest();
        return TeaModel.build(map, self);
    }

    public SendTTSVerifyLinkRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public SendTTSVerifyLinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
