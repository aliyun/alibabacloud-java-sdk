// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupRequest extends TeaModel {
    /**
     * <p>The delivery group ID. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The persistent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The list of user group IDs to be authorized.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizeUserGroupIds")
    public java.util.List<String> authorizeUserGroupIds;

    /**
     * <p>The list of usernames to be authorized for the delivery group. You can specify 1 to 100 usernames.</p>
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
     * <p>The list of user group IDs to be deauthorized.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UnAuthorizeUserGroupIds")
    public java.util.List<String> unAuthorizeUserGroupIds;

    /**
     * <p>The list of usernames to be deauthorized from the delivery group. You can specify 1 to 100 usernames.</p>
     */
    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("UserMeta")
    public AuthorizeInstanceGroupRequestUserMeta userMeta;

    public static AuthorizeInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceGroupRequest self = new AuthorizeInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public AuthorizeInstanceGroupRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public AuthorizeInstanceGroupRequest setAuthorizeUserGroupIds(java.util.List<String> authorizeUserGroupIds) {
        this.authorizeUserGroupIds = authorizeUserGroupIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserGroupIds() {
        return this.authorizeUserGroupIds;
    }

    public AuthorizeInstanceGroupRequest setAuthorizeUserIds(java.util.List<String> authorizeUserIds) {
        this.authorizeUserIds = authorizeUserIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    public AuthorizeInstanceGroupRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public AuthorizeInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AuthorizeInstanceGroupRequest setUnAuthorizeUserGroupIds(java.util.List<String> unAuthorizeUserGroupIds) {
        this.unAuthorizeUserGroupIds = unAuthorizeUserGroupIds;
        return this;
    }
    public java.util.List<String> getUnAuthorizeUserGroupIds() {
        return this.unAuthorizeUserGroupIds;
    }

    public AuthorizeInstanceGroupRequest setUnAuthorizeUserIds(java.util.List<String> unAuthorizeUserIds) {
        this.unAuthorizeUserIds = unAuthorizeUserIds;
        return this;
    }
    public java.util.List<String> getUnAuthorizeUserIds() {
        return this.unAuthorizeUserIds;
    }

    public AuthorizeInstanceGroupRequest setUserMeta(AuthorizeInstanceGroupRequestUserMeta userMeta) {
        this.userMeta = userMeta;
        return this;
    }
    public AuthorizeInstanceGroupRequestUserMeta getUserMeta() {
        return this.userMeta;
    }

    public static class AuthorizeInstanceGroupRequestUserMeta extends TeaModel {
        /**
         * <p>The AD domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("AdDomain")
        public String adDomain;

        /**
         * <p>The user type.</p>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Type")
        public String type;

        public static AuthorizeInstanceGroupRequestUserMeta build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeInstanceGroupRequestUserMeta self = new AuthorizeInstanceGroupRequestUserMeta();
            return TeaModel.build(map, self);
        }

        public AuthorizeInstanceGroupRequestUserMeta setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public AuthorizeInstanceGroupRequestUserMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
