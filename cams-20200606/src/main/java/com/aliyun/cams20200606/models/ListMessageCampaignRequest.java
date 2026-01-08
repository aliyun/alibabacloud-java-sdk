// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessageCampaignRequest extends TeaModel {
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
    public ListMessageCampaignRequestPage page;

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

    public static ListMessageCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageCampaignRequest self = new ListMessageCampaignRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageCampaignRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public ListMessageCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListMessageCampaignRequest setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }
    public String getCampaignName() {
        return this.campaignName;
    }

    public ListMessageCampaignRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListMessageCampaignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListMessageCampaignRequest setPage(ListMessageCampaignRequestPage page) {
        this.page = page;
        return this;
    }
    public ListMessageCampaignRequestPage getPage() {
        return this.page;
    }

    public ListMessageCampaignRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListMessageCampaignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMessageCampaignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListMessageCampaignRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListMessageCampaignRequestPage extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListMessageCampaignRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListMessageCampaignRequestPage self = new ListMessageCampaignRequestPage();
            return TeaModel.build(map, self);
        }

        public ListMessageCampaignRequestPage setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListMessageCampaignRequestPage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
