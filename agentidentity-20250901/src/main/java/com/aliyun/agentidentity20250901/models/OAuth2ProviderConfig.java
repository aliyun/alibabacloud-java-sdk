// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class OAuth2ProviderConfig extends TeaModel {
    @NameInMap("CustomOAuth2ProviderConfig")
    public CustomOAuth2ProviderConfig customOAuth2ProviderConfig;

    @NameInMap("IncludedOAuth2ProviderConfig")
    public IncludedOAuth2ProviderConfig includedOAuth2ProviderConfig;

    public static OAuth2ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
        OAuth2ProviderConfig self = new OAuth2ProviderConfig();
        return TeaModel.build(map, self);
    }

    public OAuth2ProviderConfig setCustomOAuth2ProviderConfig(CustomOAuth2ProviderConfig customOAuth2ProviderConfig) {
        this.customOAuth2ProviderConfig = customOAuth2ProviderConfig;
        return this;
    }
    public CustomOAuth2ProviderConfig getCustomOAuth2ProviderConfig() {
        return this.customOAuth2ProviderConfig;
    }

    public OAuth2ProviderConfig setIncludedOAuth2ProviderConfig(IncludedOAuth2ProviderConfig includedOAuth2ProviderConfig) {
        this.includedOAuth2ProviderConfig = includedOAuth2ProviderConfig;
        return this;
    }
    public IncludedOAuth2ProviderConfig getIncludedOAuth2ProviderConfig() {
        return this.includedOAuth2ProviderConfig;
    }

}
