// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddCustomAudienceUserShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3939**</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BatchLastFlag")
    public Boolean batchLastFlag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>399**</p>
     */
    @NameInMap("CustomAudienceId")
    public String customAudienceId;

    /**
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("EstimatedNumTotal")
    public Long estimatedNumTotal;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239**</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public String usersShrink;

    public static AddCustomAudienceUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAudienceUserShrinkRequest self = new AddCustomAudienceUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAudienceUserShrinkRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public AddCustomAudienceUserShrinkRequest setBatchLastFlag(Boolean batchLastFlag) {
        this.batchLastFlag = batchLastFlag;
        return this;
    }
    public Boolean getBatchLastFlag() {
        return this.batchLastFlag;
    }

    public AddCustomAudienceUserShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddCustomAudienceUserShrinkRequest setCustomAudienceId(String customAudienceId) {
        this.customAudienceId = customAudienceId;
        return this;
    }
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    public AddCustomAudienceUserShrinkRequest setEstimatedNumTotal(Long estimatedNumTotal) {
        this.estimatedNumTotal = estimatedNumTotal;
        return this;
    }
    public Long getEstimatedNumTotal() {
        return this.estimatedNumTotal;
    }

    public AddCustomAudienceUserShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCustomAudienceUserShrinkRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public AddCustomAudienceUserShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddCustomAudienceUserShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddCustomAudienceUserShrinkRequest setUsersShrink(String usersShrink) {
        this.usersShrink = usersShrink;
        return this;
    }
    public String getUsersShrink() {
        return this.usersShrink;
    }

}
