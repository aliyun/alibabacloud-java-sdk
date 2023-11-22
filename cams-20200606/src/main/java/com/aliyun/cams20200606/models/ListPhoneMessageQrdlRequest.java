// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPhoneMessageQrdlRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static ListPhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneMessageQrdlRequest self = new ListPhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public ListPhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListPhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
