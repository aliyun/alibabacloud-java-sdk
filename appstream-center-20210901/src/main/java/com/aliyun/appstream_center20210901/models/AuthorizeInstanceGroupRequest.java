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

    @NameInMap("UnAuthorizeUserIds")
    public java.util.List<String> unAuthorizeUserIds;

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
        @NameInMap("AdDomain")
        public String adDomain;

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
