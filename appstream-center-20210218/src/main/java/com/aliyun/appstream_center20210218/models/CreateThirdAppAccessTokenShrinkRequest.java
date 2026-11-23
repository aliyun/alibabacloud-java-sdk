// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class CreateThirdAppAccessTokenShrinkRequest extends TeaModel {
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
    public String resourceShrink;

    public static CreateThirdAppAccessTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdAppAccessTokenShrinkRequest self = new CreateThirdAppAccessTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateThirdAppAccessTokenShrinkRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public CreateThirdAppAccessTokenShrinkRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public CreateThirdAppAccessTokenShrinkRequest setExpiration(Integer expiration) {
        this.expiration = expiration;
        return this;
    }
    public Integer getExpiration() {
        return this.expiration;
    }

    public CreateThirdAppAccessTokenShrinkRequest setResourceShrink(String resourceShrink) {
        this.resourceShrink = resourceShrink;
        return this;
    }
    public String getResourceShrink() {
        return this.resourceShrink;
    }

}
