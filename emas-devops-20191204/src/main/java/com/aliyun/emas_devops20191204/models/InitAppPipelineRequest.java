// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class InitAppPipelineRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("EnvVariables")
    public String envVariables;

    public static InitAppPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAppPipelineRequest self = new InitAppPipelineRequest();
        return TeaModel.build(map, self);
    }

    public InitAppPipelineRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public InitAppPipelineRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public InitAppPipelineRequest setEnvVariables(String envVariables) {
        this.envVariables = envVariables;
        return this;
    }
    public String getEnvVariables() {
        return this.envVariables;
    }

}
