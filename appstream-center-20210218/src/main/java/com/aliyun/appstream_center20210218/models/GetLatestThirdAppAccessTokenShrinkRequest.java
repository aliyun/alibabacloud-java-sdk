// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetLatestThirdAppAccessTokenShrinkRequest extends TeaModel {
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
    public String resourceShrink;

    public static GetLatestThirdAppAccessTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestThirdAppAccessTokenShrinkRequest self = new GetLatestThirdAppAccessTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestThirdAppAccessTokenShrinkRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public GetLatestThirdAppAccessTokenShrinkRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public GetLatestThirdAppAccessTokenShrinkRequest setResourceShrink(String resourceShrink) {
        this.resourceShrink = resourceShrink;
        return this;
    }
    public String getResourceShrink() {
        return this.resourceShrink;
    }

}
