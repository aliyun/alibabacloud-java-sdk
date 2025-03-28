// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentBaseline extends TeaModel {
    @NameInMap("servicesInstances")
    public java.util.Map<String, ServiceInstance> servicesInstances;

    @NameInMap("variables")
    public java.util.Map<String, Variable> variables;

    public static EnvironmentBaseline build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentBaseline self = new EnvironmentBaseline();
        return TeaModel.build(map, self);
    }

    public EnvironmentBaseline setServicesInstances(java.util.Map<String, ServiceInstance> servicesInstances) {
        this.servicesInstances = servicesInstances;
        return this;
    }
    public java.util.Map<String, ServiceInstance> getServicesInstances() {
        return this.servicesInstances;
    }

    public EnvironmentBaseline setVariables(java.util.Map<String, Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

}
