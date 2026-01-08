// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPledgeTemplateAddressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cams-x***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>it</p>
     */
    @NameInMap("IndustryType")
    public String industryType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetPledgeTemplateAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPledgeTemplateAddressRequest self = new GetPledgeTemplateAddressRequest();
        return TeaModel.build(map, self);
    }

    public GetPledgeTemplateAddressRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetPledgeTemplateAddressRequest setIndustryType(String industryType) {
        this.industryType = industryType;
        return this;
    }
    public String getIndustryType() {
        return this.industryType;
    }

    public GetPledgeTemplateAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetPledgeTemplateAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetPledgeTemplateAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
