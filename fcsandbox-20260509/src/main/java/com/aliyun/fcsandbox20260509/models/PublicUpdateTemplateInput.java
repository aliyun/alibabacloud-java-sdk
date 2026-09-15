// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateInput extends TeaModel {
    /**
     * <p>The build configuration.</p>
     */
    @NameInMap("buildConfig")
    public PublicUpdateTemplateBuildConfig buildConfig;

    /**
     * <p>The runtime configuration.</p>
     */
    @NameInMap("runtimeConfig")
    public PublicUpdateTemplateRuntimeConfig runtimeConfig;

    public static PublicUpdateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateInput self = new PublicUpdateTemplateInput();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateInput setBuildConfig(PublicUpdateTemplateBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public PublicUpdateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public PublicUpdateTemplateInput setRuntimeConfig(PublicUpdateTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicUpdateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

}
