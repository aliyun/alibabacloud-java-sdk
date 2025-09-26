// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PolicyConfig extends TeaModel {
    @NameInMap("aiFallbackConfig")
    public AiFallbackConfig aiFallbackConfig;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("type")
    public String type;

    public static PolicyConfig build(java.util.Map<String, ?> map) throws Exception {
        PolicyConfig self = new PolicyConfig();
        return TeaModel.build(map, self);
    }

    public PolicyConfig setAiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
        this.aiFallbackConfig = aiFallbackConfig;
        return this;
    }
    public AiFallbackConfig getAiFallbackConfig() {
        return this.aiFallbackConfig;
    }

    public PolicyConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public PolicyConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
