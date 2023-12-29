// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthorizationUrlRequest extends TeaModel {
    /**
     * <p>The authorization end date, which is in the yyyy-MM-dd format. This parameter is required for services of contract type.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the authorization scenario. You can view the ID of the authorization scenario on the **Authorization Scenario Management** page in the **Phone Number Verification Service console**.</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    public static GetAuthorizationUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationUrlRequest self = new GetAuthorizationUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationUrlRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetAuthorizationUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetAuthorizationUrlRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public GetAuthorizationUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetAuthorizationUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAuthorizationUrlRequest setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

}
