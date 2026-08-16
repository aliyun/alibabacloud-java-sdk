// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupRequest extends TeaModel {
    /**
     * <p>交付群組 ID。可呼叫 <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> 介面取得。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>持續性工作階段 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>授權使用者群組 ID 清單。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizeUserGroupIds")
    public java.util.List<String> authorizeUserGroupIds;

    /**
     * <p>要新增交付群組授權的使用者名稱清單。可設定 1\~100 個。</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <p>使用者分身 ID。</p>
     * <blockquote>
     * <p>此參數未開放使用。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AvatarId")
    public String avatarId;

    /**
     * <p>產品類型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>取消授權使用者群組 ID 清單。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UnAuthorizeUserGroupIds")
    public java.util.List<String> unAuthorizeUserGroupIds;

    /**
     * <p>要移除交付群組授權的使用者名稱清單。可設定 1\~100 個。</p>
     */
    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

    /**
     * <p>使用者資訊。</p>
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
         * <p>AD 網域名稱。</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("AdDomain")
        public String adDomain;

        /**
         * <p>使用者類型。</p>
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
