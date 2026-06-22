// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddCustomAudienceUserRequest extends TeaModel {
    /**
     * <p>The ID of the Meta ad account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3939**</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <p>Indicates whether this is the last batch of data.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BatchLastFlag")
    public Boolean batchLastFlag;

    /**
     * <p>The space ID of the Independent Software Vendor (ISV) sub-customer or the instance ID of a direct customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the custom audience.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>399**</p>
     */
    @NameInMap("CustomAudienceId")
    public String customAudienceId;

    /**
     * <p>The estimated total number of users.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("EstimatedNumTotal")
    public Long estimatedNumTotal;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The Page ID for Messenger.</p>
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
     * <p>A list of users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<AddCustomAudienceUserRequestUsers> users;

    public static AddCustomAudienceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAudienceUserRequest self = new AddCustomAudienceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAudienceUserRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
    }

    public AddCustomAudienceUserRequest setBatchLastFlag(Boolean batchLastFlag) {
        this.batchLastFlag = batchLastFlag;
        return this;
    }
    public Boolean getBatchLastFlag() {
        return this.batchLastFlag;
    }

    public AddCustomAudienceUserRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddCustomAudienceUserRequest setCustomAudienceId(String customAudienceId) {
        this.customAudienceId = customAudienceId;
        return this;
    }
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    public AddCustomAudienceUserRequest setEstimatedNumTotal(Long estimatedNumTotal) {
        this.estimatedNumTotal = estimatedNumTotal;
        return this;
    }
    public Long getEstimatedNumTotal() {
        return this.estimatedNumTotal;
    }

    public AddCustomAudienceUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCustomAudienceUserRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public AddCustomAudienceUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddCustomAudienceUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddCustomAudienceUserRequest setUsers(java.util.List<AddCustomAudienceUserRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<AddCustomAudienceUserRequestUsers> getUsers() {
        return this.users;
    }

    public static class AddCustomAudienceUserRequestUsers extends TeaModel {
        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("Phone")
        public String phone;

        public static AddCustomAudienceUserRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            AddCustomAudienceUserRequestUsers self = new AddCustomAudienceUserRequestUsers();
            return TeaModel.build(map, self);
        }

        public AddCustomAudienceUserRequestUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddCustomAudienceUserRequestUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
