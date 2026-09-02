// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateRegistryConfig extends TeaModel {
    /**
     * <p>The network configuration of the image repository.</p>
     */
    @NameInMap("networkConfig")
    public PublicTemplateRegistryNetworkConfig networkConfig;

    public static PublicTemplateRegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateRegistryConfig self = new PublicTemplateRegistryConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateRegistryConfig setNetworkConfig(PublicTemplateRegistryNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public PublicTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

}
