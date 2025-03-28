// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentStagedConfigs extends TeaModel {
    @NameInMap("services")
    public java.util.Map<String, ServiceConfig> services;

    @NameInMap("variables")
    public java.util.Map<String, Variable> variables;

    public static EnvironmentStagedConfigs build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentStagedConfigs self = new EnvironmentStagedConfigs();
        return TeaModel.build(map, self);
    }

    public EnvironmentStagedConfigs setServices(java.util.Map<String, ServiceConfig> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, ServiceConfig> getServices() {
        return this.services;
    }

    public EnvironmentStagedConfigs setVariables(java.util.Map<String, Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

}
