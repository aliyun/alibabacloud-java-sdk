// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeUsersForAppRequest extends TeaModel {
    /**
     * <p>The application ID. The application must be deployed in the image used by the delivery group. You can obtain the ID from the Apps list returned by the <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
     * <p>The application specified by AppId must be deployed in the image used by this delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The list of usernames to add authorization for the application. A maximum of 100 usernames can be specified in a single request.</p>
     * <p>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified. You can also specify both. Adding authorization is subject to the authorized user quota for the application.</p>
     */
    @NameInMap("AuthorizeUserIds")
    public java.util.List<String> authorizeUserIds;

    /**
     * <p>The product type. Application-level authorization applies to WUYING Cloud Application delivery groups.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud Application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of usernames to be unauthorized for the application. A maximum of 100 usernames can be specified in a single request.</p>
     * <p>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified. You can also specify both. Removing authorizations is not subject to quota limits.</p>
     */
    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

    /**
     * <p>The account information of the authorized user, which specifies the account type corresponding to the username.</p>
     * <ul>
     * <li>If the workspace to which the delivery group belongs is an AD workspace, <strong>this parameter is required</strong>: set Type to ad and set AdDomain to the AD domain bound to the workspace.</li>
     * <li>If this parameter is not specified, the WUYING convenience account (simple) is used by default.</li>
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
         * <p>The AD domain name. Specify this parameter when Type is set to ad. The value must match the AD domain bound to the workspace of the delivery group.</p>
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
