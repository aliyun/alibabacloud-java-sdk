// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateBuildConfig extends TeaModel {
    /**
     * <p>The image copy action configuration.</p>
     */
    @NameInMap("copy")
    public PublicUpdateTemplateCopyAction copy;

    /**
     * <p>The envd injection action configuration.</p>
     */
    @NameInMap("envdInject")
    public PublicUpdateTemplateEnvdInjectAction envdInject;

    public static PublicUpdateTemplateBuildConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateBuildConfig self = new PublicUpdateTemplateBuildConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateBuildConfig setCopy(PublicUpdateTemplateCopyAction copy) {
        this.copy = copy;
        return this;
    }
    public PublicUpdateTemplateCopyAction getCopy() {
        return this.copy;
    }

    public PublicUpdateTemplateBuildConfig setEnvdInject(PublicUpdateTemplateEnvdInjectAction envdInject) {
        this.envdInject = envdInject;
        return this;
    }
    public PublicUpdateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

}
