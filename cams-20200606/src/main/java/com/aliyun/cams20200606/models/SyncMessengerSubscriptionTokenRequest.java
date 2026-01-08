// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SyncMessengerSubscriptionTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xi****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>20399***</p>
     */
    @NameInMap("CustomAudienceId")
    public String customAudienceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2030***</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customAudience</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    public static SyncMessengerSubscriptionTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMessengerSubscriptionTokenRequest self = new SyncMessengerSubscriptionTokenRequest();
        return TeaModel.build(map, self);
    }

    public SyncMessengerSubscriptionTokenRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SyncMessengerSubscriptionTokenRequest setCustomAudienceId(String customAudienceId) {
        this.customAudienceId = customAudienceId;
        return this;
    }
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    public SyncMessengerSubscriptionTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SyncMessengerSubscriptionTokenRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public SyncMessengerSubscriptionTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SyncMessengerSubscriptionTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SyncMessengerSubscriptionTokenRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
