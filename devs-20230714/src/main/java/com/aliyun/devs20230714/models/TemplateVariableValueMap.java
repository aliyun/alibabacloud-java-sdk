// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateVariableValueMap extends TeaModel {
    @NameInMap("services")
    public java.util.Map<String, java.util.Map<String, ?>> services;

    /**
     * <strong>example:</strong>
     * <p>{&quot;TEST_KEY&quot;:&quot;new_value&quot;}</p>
     */
    @NameInMap("shared")
    public java.util.Map<String, ?> shared;

    public static TemplateVariableValueMap build(java.util.Map<String, ?> map) throws Exception {
        TemplateVariableValueMap self = new TemplateVariableValueMap();
        return TeaModel.build(map, self);
    }

    public TemplateVariableValueMap setServices(java.util.Map<String, java.util.Map<String, ?>> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getServices() {
        return this.services;
    }

    public TemplateVariableValueMap setShared(java.util.Map<String, ?> shared) {
        this.shared = shared;
        return this;
    }
    public java.util.Map<String, ?> getShared() {
        return this.shared;
    }

}
