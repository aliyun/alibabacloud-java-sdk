// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessageCampaignShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>239**</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <strong>example:</strong>
     * <p>233**</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <strong>example:</strong>
     * <p>test-campaign</p>
     */
    @NameInMap("CampaignName")
    public String campaignName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public String pageShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239***</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListMessageCampaignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageCampaignShrinkRequest self = new ListMessageCampaignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageCampaignShrinkRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public ListMessageCampaignShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListMessageCampaignShrinkRequest setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }
    public String getCampaignName() {
        return this.campaignName;
    }

    public ListMessageCampaignShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListMessageCampaignShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListMessageCampaignShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListMessageCampaignShrinkRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListMessageCampaignShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMessageCampaignShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListMessageCampaignShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
