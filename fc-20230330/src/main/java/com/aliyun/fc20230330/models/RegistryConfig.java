// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RegistryConfig extends TeaModel {
    @NameInMap("authConfig")
    public RegistryAuthConfig authConfig;

    @NameInMap("certConfig")
    public RegistryCertConfig certConfig;

    @NameInMap("networkConfig")
    public RegistryNetworkConfig networkConfig;

    public static RegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryConfig self = new RegistryConfig();
        return TeaModel.build(map, self);
    }

    public RegistryConfig setAuthConfig(RegistryAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public RegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public RegistryConfig setCertConfig(RegistryCertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public RegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    public RegistryConfig setNetworkConfig(RegistryNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public RegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

}
