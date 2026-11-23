// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetLatestThirdAppAccessTokenRequest extends TeaModel {
    /**
     * <p>The WyId of the user used when the token was created. It must correspond to the current account and the target cloud desktop, and cannot be replaced by a username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1e2d3c4b5a6****</p>
     */
    @NameInMap("AuthorizerId")
    public String authorizerId;

    /**
     * <p>The business channel. Valid values: Enterprise and Business. The value is case-insensitive. If omitted, the default value is Enterprise. If an empty string or other value is explicitly passed, a parameter error is returned. This parameter does not replace user identity verification.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The target single cloud desktop resource. You must provide this object along with ResourceType and ResourceId when calling this operation. Pass it as a JSON object to specify only one cloud desktop. Wildcards or authorization for all cloud desktops are not supported.</p>
     */
    @NameInMap("Resource")
    public GetLatestThirdAppAccessTokenRequestResource resource;

    public static GetLatestThirdAppAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestThirdAppAccessTokenRequest self = new GetLatestThirdAppAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestThirdAppAccessTokenRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public GetLatestThirdAppAccessTokenRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public GetLatestThirdAppAccessTokenRequest setResource(GetLatestThirdAppAccessTokenRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public GetLatestThirdAppAccessTokenRequestResource getResource() {
        return this.resource;
    }

    public static class GetLatestThirdAppAccessTokenRequestResource extends TeaModel {
        /**
         * <p>The ID of the cloud desktop specified when the token was created. You must provide a non-empty value that is consistent with the value used during creation. Asterisks (*) are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7a8b9c0d****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. This parameter is required. Valid value: DESKTOP, which indicates a cloud desktop. The value is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetLatestThirdAppAccessTokenRequestResource build(java.util.Map<String, ?> map) throws Exception {
            GetLatestThirdAppAccessTokenRequestResource self = new GetLatestThirdAppAccessTokenRequestResource();
            return TeaModel.build(map, self);
        }

        public GetLatestThirdAppAccessTokenRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetLatestThirdAppAccessTokenRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
