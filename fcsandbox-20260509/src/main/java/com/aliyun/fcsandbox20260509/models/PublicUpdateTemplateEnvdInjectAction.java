// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateEnvdInjectAction extends TeaModel {
    /**
     * <p>Specifies whether envd injection is enabled.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static PublicUpdateTemplateEnvdInjectAction build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateEnvdInjectAction self = new PublicUpdateTemplateEnvdInjectAction();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateEnvdInjectAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
