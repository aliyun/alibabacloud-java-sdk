// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateRequest extends TeaModel {
    /**
     * <p>The country code of a phone number.</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The space ID of the user under the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number without the country code.</p>
     */
    @NameInMap("MobileNumber")
    public String mobileNumber;

    public static CreateChatappMigrationInitiateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappMigrationInitiateRequest self = new CreateChatappMigrationInitiateRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatappMigrationInitiateRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateChatappMigrationInitiateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateChatappMigrationInitiateRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

}
