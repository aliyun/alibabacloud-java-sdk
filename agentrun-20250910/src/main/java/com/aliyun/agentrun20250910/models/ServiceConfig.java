// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ServiceConfig extends TeaModel {
    @NameInMap("aiServiceConfig")
    public AiServiceConfig aiServiceConfig;

    @NameInMap("name")
    public String name;

    public static ServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        ServiceConfig self = new ServiceConfig();
        return TeaModel.build(map, self);
    }

    public ServiceConfig setAiServiceConfig(AiServiceConfig aiServiceConfig) {
        this.aiServiceConfig = aiServiceConfig;
        return this;
    }
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    public ServiceConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
