// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeUsersForAppRequest extends TeaModel {
    /**
     * <p>The ID of the application. The application must be deployed in the image used by the app instance group. You can obtain the application ID from the Apps list returned by the <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the app instance group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to query the ID.</p>
     * <p>The application specified by AppId must be deployed in the image used by the app instance group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The list of usernames of the users to be authorized for the application. You can specify up to 100 usernames in a single call.</p>
     * <p>You must specify at least one of AuthorizeUserIds and UnAuthorizeUserIds, or specify both. Adding authorization is subject to the authorized user quota limit of the application.</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <p>The product type. Application-level authorization applies to WUYING Cloud App app instance groups.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud App.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of usernames of the users whose authorization for the application is to be removed. You can specify up to 100 usernames in a single call.</p>
     * <p>You must specify at least one of AuthorizeUserIds and UnAuthorizeUserIds, or specify both. Removing authorization is not subject to quota limits.</p>
     */
    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

    /**
     * <p>The account information of the authorized user, which is used to specify the account type corresponding to the username.</p>
     * <ul>
     * <li><strong>Required</strong> if the workspace to which the app instance group belongs is an AD workspace: Set Type to ad, and set AdDomain to the AD domain bound to the workspace.</li>
     * <li>If this parameter is not specified, the default account type is WUYING convenience account (simple).</li>
     * </ul>
     */
    @NameInMap("UserMeta")
    public AuthorizeUsersForAppRequestUserMeta userMeta;

    public static AuthorizeUsersForAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeUsersForAppRequest self = new AuthorizeUsersForAppRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeUsersForAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AuthorizeUsersForAppRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public AuthorizeUsersForAppRequest setAuthorizeUserIds(java.util.List<String> authorizeUserIds) {
        this.authorizeUserIds = authorizeUserIds;
        return this;
    }
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    public AuthorizeUsersForAppRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AuthorizeUsersForAppRequest setUnAuthorizeUserIds(java.util.List<String> unAuthorizeUserIds) {
        this.unAuthorizeUserIds = unAuthorizeUserIds;
        return this;
    }
    public java.util.List<String> getUnAuthorizeUserIds() {
        return this.unAuthorizeUserIds;
    }

    public AuthorizeUsersForAppRequest setUserMeta(AuthorizeUsersForAppRequestUserMeta userMeta) {
        this.userMeta = userMeta;
        return this;
    }
    public AuthorizeUsersForAppRequestUserMeta getUserMeta() {
        return this.userMeta;
    }

    public static class AuthorizeUsersForAppRequestUserMeta extends TeaModel {
        /**
         * <p>The AD domain name. This parameter is required when Type is set to ad, and the value must be the same as the AD domain bound to the workspace to which the app instance group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("AdDomain")
        public String adDomain;

        /**
         * <p>The account type. Default value: simple.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ad: AD account.</li>
         * <li>simple: WUYING convenience account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Type")
        public String type;

        public static AuthorizeUsersForAppRequestUserMeta build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeUsersForAppRequestUserMeta self = new AuthorizeUsersForAppRequestUserMeta();
            return TeaModel.build(map, self);
        }

        public AuthorizeUsersForAppRequestUserMeta setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public AuthorizeUsersForAppRequestUserMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
