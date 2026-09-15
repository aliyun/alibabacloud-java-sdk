// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRegistryConfig extends TeaModel {
    /**
     * <p>The image repository authentication configuration.</p>
     */
    @NameInMap("authConfig")
    public PublicUpdateTemplateRegistryAuthConfig authConfig;

    /**
     * <p>The image repository certificate configuration.</p>
     */
    @NameInMap("certConfig")
    public PublicUpdateTemplateRegistryCertConfig certConfig;

    /**
     * <p>The image repository network configuration.</p>
     */
    @NameInMap("networkConfig")
    public PublicUpdateTemplateRegistryNetworkConfig networkConfig;

    public static PublicUpdateTemplateRegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateRegistryConfig self = new PublicUpdateTemplateRegistryConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateRegistryConfig setAuthConfig(PublicUpdateTemplateRegistryAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public PublicUpdateTemplateRegistryConfig setCertConfig(PublicUpdateTemplateRegistryCertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    public PublicUpdateTemplateRegistryConfig setNetworkConfig(PublicUpdateTemplateRegistryNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

}
