// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateRequest extends TeaModel {
    /**
     * <p>The code of the country or region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The space ID of the user within the ISV account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The mobile number without the country code or region code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001234</p>
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
