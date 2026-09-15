// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRegistryCertConfig extends TeaModel {
    /**
     * <p>Specifies whether to skip the repository certificate check.</p>
     */
    @NameInMap("insecure")
    public Boolean insecure;

    public static PublicUpdateTemplateRegistryCertConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateRegistryCertConfig self = new PublicUpdateTemplateRegistryCertConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateRegistryCertConfig setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }
    public Boolean getInsecure() {
        return this.insecure;
    }

}
