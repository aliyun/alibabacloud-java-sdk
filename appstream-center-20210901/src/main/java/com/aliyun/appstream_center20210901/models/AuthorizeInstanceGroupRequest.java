// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupRequest extends TeaModel {
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
     * <p>The IDs of the users that you want to add to the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The IDs of the users that you want to remove from the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
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

    public AuthorizeInstanceGroupRequest setAuthorizeUserIds(java.util.List<String> authorizeUserIds) {
        this.authorizeUserIds = authorizeUserIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    public AuthorizeInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
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
         * <p>Valid values:</p>
         * <ul>
         * <li>ad: Active Directory (AD) account</li>
         * <li>simple: convenience account</li>
         * </ul>
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
