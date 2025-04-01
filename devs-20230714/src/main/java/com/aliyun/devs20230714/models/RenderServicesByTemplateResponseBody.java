// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RenderServicesByTemplateResponseBody extends TeaModel {
    @NameInMap("changedServiceNames")
    public java.util.Map<String, String> changedServiceNames;

    @NameInMap("services")
    public java.util.Map<String, ServiceConfig> services;

    @NameInMap("variables")
    public java.util.Map<String, Variable> variables;

    public static RenderServicesByTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderServicesByTemplateResponseBody self = new RenderServicesByTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderServicesByTemplateResponseBody setChangedServiceNames(java.util.Map<String, String> changedServiceNames) {
        this.changedServiceNames = changedServiceNames;
        return this;
    }
    public java.util.Map<String, String> getChangedServiceNames() {
        return this.changedServiceNames;
    }

    public RenderServicesByTemplateResponseBody setServices(java.util.Map<String, ServiceConfig> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, ServiceConfig> getServices() {
        return this.services;
    }

    public RenderServicesByTemplateResponseBody setVariables(java.util.Map<String, Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

}
