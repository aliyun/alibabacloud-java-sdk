// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryConfig extends TeaModel {
    /**
     * <p>The image repository authentication configuration.</p>
     */
    @NameInMap("authConfig")
    public CreateTemplateRegistryAuthConfig authConfig;

    /**
     * <p>The image repository certificate configuration.</p>
     */
    @NameInMap("certConfig")
    public CreateTemplateRegistryCertConfig certConfig;

    /**
     * <p>The image repository network configuration.</p>
     */
    @NameInMap("networkConfig")
    public CreateTemplateRegistryNetworkConfig networkConfig;

    public static CreateTemplateRegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryConfig self = new CreateTemplateRegistryConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryConfig setAuthConfig(CreateTemplateRegistryAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public CreateTemplateRegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public CreateTemplateRegistryConfig setCertConfig(CreateTemplateRegistryCertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CreateTemplateRegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateTemplateRegistryConfig setNetworkConfig(CreateTemplateRegistryNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public CreateTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

}
