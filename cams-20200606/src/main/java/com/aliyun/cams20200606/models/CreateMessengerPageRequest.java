// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateMessengerPageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AdAccountIds")
    public java.util.List<String> adAccountIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EAA****</p>
     */
    @NameInMap("AuthenticationCode")
    public String authenticationCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293***</p>
     */
    @NameInMap("BusinessId")
    public String businessId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-s***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19283***</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateMessengerPageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessengerPageRequest self = new CreateMessengerPageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessengerPageRequest setAdAccountIds(java.util.List<String> adAccountIds) {
        this.adAccountIds = adAccountIds;
        return this;
    }
    public java.util.List<String> getAdAccountIds() {
        return this.adAccountIds;
    }

    public CreateMessengerPageRequest setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
        return this;
    }
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public CreateMessengerPageRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateMessengerPageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateMessengerPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMessengerPageRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public CreateMessengerPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMessengerPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
