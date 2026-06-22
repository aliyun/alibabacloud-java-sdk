// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessengerSubscriptionTokenRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID. View the ID on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The custom audience ID.</p>
     * 
     * <strong>example:</strong>
     * <p>233**</p>
     */
    @NameInMap("CustomAudienceId")
    public String customAudienceId;

    /**
     * <p>The number of entries to return. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>67</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page ID for Messenger.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239***</p>
     */
    @NameInMap("PageId")
    public String pageId;

    /**
     * <p>The pagination key.</p>
     * 
     * <strong>example:</strong>
     * <p>2ie**</p>
     */
    @NameInMap("PageKey")
    public String pageKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The token type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customAudience</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    public static ListMessengerSubscriptionTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessengerSubscriptionTokenRequest self = new ListMessengerSubscriptionTokenRequest();
        return TeaModel.build(map, self);
    }

    public ListMessengerSubscriptionTokenRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListMessengerSubscriptionTokenRequest setCustomAudienceId(String customAudienceId) {
        this.customAudienceId = customAudienceId;
        return this;
    }
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    public ListMessengerSubscriptionTokenRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListMessengerSubscriptionTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListMessengerSubscriptionTokenRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListMessengerSubscriptionTokenRequest setPageKey(String pageKey) {
        this.pageKey = pageKey;
        return this;
    }
    public String getPageKey() {
        return this.pageKey;
    }

    public ListMessengerSubscriptionTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMessengerSubscriptionTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListMessengerSubscriptionTokenRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
