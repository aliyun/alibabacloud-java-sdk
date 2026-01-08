// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListCustomAudienceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>339**</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>239**</p>
     */
    @NameInMap("CustomAudienceId")
    public String customAudienceId;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("CustomAudienceName")
    public String customAudienceName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public ListCustomAudienceRequestPage page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3939**</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    public static ListCustomAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAudienceRequest self = new ListCustomAudienceRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAudienceRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public ListCustomAudienceRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListCustomAudienceRequest setCustomAudienceId(String customAudienceId) {
        this.customAudienceId = customAudienceId;
        return this;
    }
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    public ListCustomAudienceRequest setCustomAudienceName(String customAudienceName) {
        this.customAudienceName = customAudienceName;
        return this;
    }
    public String getCustomAudienceName() {
        return this.customAudienceName;
    }

    public ListCustomAudienceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCustomAudienceRequest setPage(ListCustomAudienceRequestPage page) {
        this.page = page;
        return this;
    }
    public ListCustomAudienceRequestPage getPage() {
        return this.page;
    }

    public ListCustomAudienceRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListCustomAudienceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCustomAudienceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCustomAudienceRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public static class ListCustomAudienceRequestPage extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListCustomAudienceRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAudienceRequestPage self = new ListCustomAudienceRequestPage();
            return TeaModel.build(map, self);
        }

        public ListCustomAudienceRequestPage setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListCustomAudienceRequestPage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
