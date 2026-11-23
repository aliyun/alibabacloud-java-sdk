// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class CreateThirdAppAccessTokenRequest extends TeaModel {
    /**
     * <p>The WyId of the authorized user. The user must belong to the current calling account. This parameter is not the username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1e2d3c4b5a6****</p>
     */
    @NameInMap("AuthorizerId")
    public String authorizerId;

    /**
     * <p>The business channel. Valid values: Enterprise and Business. The value is case-insensitive. If omitted, the default value is Enterprise. If an empty string or other values are explicitly passed, a parameter error is returned. This parameter does not replace user identity verification.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The validity period of the token, in seconds. Valid values: 1 to 15552000. If omitted, the default value is 15552000, which equals 180 days. Permanent validity is not supported, and 0 cannot be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("Expiration")
    public Integer expiration;

    /**
     * <p>The target single cloud desktop resource. You must provide this object along with ResourceType and ResourceId when you call this operation. Pass this parameter as a JSON object and specify only one cloud desktop. Wildcards or authorization for all cloud desktops are not supported.</p>
     */
    @NameInMap("Resource")
    public CreateThirdAppAccessTokenRequestResource resource;

    public static CreateThirdAppAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdAppAccessTokenRequest self = new CreateThirdAppAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateThirdAppAccessTokenRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public CreateThirdAppAccessTokenRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public CreateThirdAppAccessTokenRequest setExpiration(Integer expiration) {
        this.expiration = expiration;
        return this;
    }
    public Integer getExpiration() {
        return this.expiration;
    }

    public CreateThirdAppAccessTokenRequest setResource(CreateThirdAppAccessTokenRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public CreateThirdAppAccessTokenRequestResource getResource() {
        return this.resource;
    }

    public static class CreateThirdAppAccessTokenRequestResource extends TeaModel {
        /**
         * <p>The ID of the target cloud desktop. You must provide a non-empty value when you call this operation. Asterisks (*) are not allowed. The cloud desktop must be authorized to the user specified by AuthorizerId.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7a8b9c0d****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. This parameter is required when you call this operation. Set the value to DESKTOP, which indicates a cloud desktop. The value is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateThirdAppAccessTokenRequestResource build(java.util.Map<String, ?> map) throws Exception {
            CreateThirdAppAccessTokenRequestResource self = new CreateThirdAppAccessTokenRequestResource();
            return TeaModel.build(map, self);
        }

        public CreateThirdAppAccessTokenRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateThirdAppAccessTokenRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
