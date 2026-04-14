// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RegistryConfig extends TeaModel {
    /**
     * <p>镜像仓库的认证配置信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("authConfig")
    public RegistryAuthConfig authConfig;

    /**
     * <p>镜像仓库的证书配置信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("certConfig")
    public RegistryCertConfig certConfig;

    /**
     * <p>镜像仓库的网络配置信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
