// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateBuildConfig extends TeaModel {
    /**
     * <p>The image copy build action.</p>
     */
    @NameInMap("copy")
    public CreateTemplateCopyAction copy;

    /**
     * <p>The envd injection build action.</p>
     */
    @NameInMap("envdInject")
    public CreateTemplateEnvdInjectAction envdInject;

    public static CreateTemplateBuildConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateBuildConfig self = new CreateTemplateBuildConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateBuildConfig setCopy(CreateTemplateCopyAction copy) {
        this.copy = copy;
        return this;
    }
    public CreateTemplateCopyAction getCopy() {
        return this.copy;
    }

    public CreateTemplateBuildConfig setEnvdInject(CreateTemplateEnvdInjectAction envdInject) {
        this.envdInject = envdInject;
        return this;
    }
    public CreateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

}
