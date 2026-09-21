// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The delivery group ID. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group set ID. You must specify either AppInstanceGroupSetId or AppInstanceGroupId, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The persistent session ID.</p>
     * <blockquote>
     * <p>Metric description</p>
     * <ul>
     * <li>This parameter is required when the authorization mode of the delivery group is Session. You can call the ListPersistentAppInstances operation to obtain a valid ID.</li>
     * <li>This parameter is required when ProductType is set to WuyingServer. You can call the ListPersistentAppInstances operation to obtain a valid ID.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The list of authorized user group IDs to grant authorization.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizeUserGroupIds")
    public java.util.List<String> authorizeUserGroupIds;

    /**
     * <p>The list of usernames to add to the delivery group authorization. You can specify 1 to 100 usernames.</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <p>The user avatar ID.</p>
     * <blockquote>
     * <p>This parameter is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AvatarId")
    public String avatarId;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of authorized user group IDs to revoke authorization.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UnAuthorizeUserGroupIds")
    public java.util.List<String> unAuthorizeUserGroupIds;

    /**
     * <p>The list of usernames to remove from the delivery group authorization. You can specify 1 to 100 usernames.</p>
     */
    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("UserMeta")
    public String userMetaShrink;

    public static AuthorizeInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceGroupShrinkRequest self = new AuthorizeInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceGroupShrinkRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public AuthorizeInstanceGroupShrinkRequest setAppInstanceGroupSetId(String appInstanceGroupSetId) {
        this.appInstanceGroupSetId = appInstanceGroupSetId;
        return this;
    }
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    public AuthorizeInstanceGroupShrinkRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public AuthorizeInstanceGroupShrinkRequest setAuthorizeUserGroupIds(java.util.List<String> authorizeUserGroupIds) {
        this.authorizeUserGroupIds = authorizeUserGroupIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserGroupIds() {
        return this.authorizeUserGroupIds;
    }

    public AuthorizeInstanceGroupShrinkRequest setAuthorizeUserIds(java.util.List<String> authorizeUserIds) {
        this.authorizeUserIds = authorizeUserIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    public AuthorizeInstanceGroupShrinkRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public AuthorizeInstanceGroupShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AuthorizeInstanceGroupShrinkRequest setUnAuthorizeUserGroupIds(java.util.List<String> unAuthorizeUserGroupIds) {
        this.unAuthorizeUserGroupIds = unAuthorizeUserGroupIds;
        return this;
    }
    public java.util.List<String> getUnAuthorizeUserGroupIds() {
        return this.unAuthorizeUserGroupIds;
    }

    public AuthorizeInstanceGroupShrinkRequest setUnAuthorizeUserIds(java.util.List<String> unAuthorizeUserIds) {
        this.unAuthorizeUserIds = unAuthorizeUserIds;
        return this;
    }
    public java.util.List<String> getUnAuthorizeUserIds() {
        return this.unAuthorizeUserIds;
    }

    public AuthorizeInstanceGroupShrinkRequest setUserMetaShrink(String userMetaShrink) {
        this.userMetaShrink = userMetaShrink;
        return this;
    }
    public String getUserMetaShrink() {
        return this.userMetaShrink;
    }

}
