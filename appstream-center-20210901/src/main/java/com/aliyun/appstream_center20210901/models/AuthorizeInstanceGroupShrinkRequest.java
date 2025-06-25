// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>持久会话ID。</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizeUserGroupIds")
    public java.util.List<String> authorizeUserGroupIds;

    /**
     * <p>The IDs of the users that you want to add to the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AvatarId")
    public String avatarId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UnAuthorizeUserGroupIds")
    public java.util.List<String> unAuthorizeUserGroupIds;

    /**
     * <p>The IDs of the users that you want to remove from the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
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
