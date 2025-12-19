// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class OAuth2Discovery extends TeaModel {
    @NameInMap("AuthorizationServerMetadata")
    public AuthorizationServerMetadata authorizationServerMetadata;

    @NameInMap("DiscoveryURL")
    public String discoveryURL;

    public static OAuth2Discovery build(java.util.Map<String, ?> map) throws Exception {
        OAuth2Discovery self = new OAuth2Discovery();
        return TeaModel.build(map, self);
    }

    public OAuth2Discovery setAuthorizationServerMetadata(AuthorizationServerMetadata authorizationServerMetadata) {
        this.authorizationServerMetadata = authorizationServerMetadata;
        return this;
    }
    public AuthorizationServerMetadata getAuthorizationServerMetadata() {
        return this.authorizationServerMetadata;
    }

    public OAuth2Discovery setDiscoveryURL(String discoveryURL) {
        this.discoveryURL = discoveryURL;
        return this;
    }
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

}
