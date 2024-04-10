// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCommerceSettingRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static GetCommerceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommerceSettingRequest self = new GetCommerceSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetCommerceSettingRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetCommerceSettingRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
