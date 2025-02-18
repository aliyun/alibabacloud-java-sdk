// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ContainerdConfig extends TeaModel {
    @NameInMap("insecureRegistries")
    public java.util.List<String> insecureRegistries;

    @NameInMap("registryMirrors")
    public java.util.List<String> registryMirrors;

    public static ContainerdConfig build(java.util.Map<String, ?> map) throws Exception {
        ContainerdConfig self = new ContainerdConfig();
        return TeaModel.build(map, self);
    }

    public ContainerdConfig setInsecureRegistries(java.util.List<String> insecureRegistries) {
        this.insecureRegistries = insecureRegistries;
        return this;
    }
    public java.util.List<String> getInsecureRegistries() {
        return this.insecureRegistries;
    }

    public ContainerdConfig setRegistryMirrors(java.util.List<String> registryMirrors) {
        this.registryMirrors = registryMirrors;
        return this;
    }
    public java.util.List<String> getRegistryMirrors() {
        return this.registryMirrors;
    }

}
