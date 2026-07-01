// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAuthorizationLetterShrinkRequest extends TeaModel {
    /**
     * <p>The list of letter of authorization IDs.</p>
     */
    @NameInMap("AuthorizationLetterIdList")
    public String authorizationLetterIdListShrink;

    /**
     * <p>The unified social credit code of the authorizing party. The length cannot exceed 150 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>9****************A</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature name. If the authorization scope includes multiple signatures when you create the letter of authorization, the letters of authorization that contain the signature are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>菜鸟网络</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The review status of the letter of authorization, which is related to the review status of the signature. Valid values:</p>
     * <ul>
     * <li><strong>INT</strong>: Pending review. The letter of authorization has been created. After you submit a signature application, it enters the review process.</li>
     * <li><strong>PASSED</strong>: Review passed. When a signature in the authorized signature scope of the letter of authorization passes the review, the status of the letter of authorization changes to PASSED.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PASSED</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The availability status of the letter of authorization, which is related to the validity period of the letter of authorization. Valid values:</p>
     * <ul>
     * <li><strong>VALID</strong>: Available. The letter of authorization is within the validity period.</li>
     * <li><strong>INVALID</strong>: Unavailable. The letter of authorization has expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    public static QuerySmsAuthorizationLetterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAuthorizationLetterShrinkRequest self = new QuerySmsAuthorizationLetterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsAuthorizationLetterShrinkRequest setAuthorizationLetterIdListShrink(String authorizationLetterIdListShrink) {
        this.authorizationLetterIdListShrink = authorizationLetterIdListShrink;
        return this;
    }
    public String getAuthorizationLetterIdListShrink() {
        return this.authorizationLetterIdListShrink;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
