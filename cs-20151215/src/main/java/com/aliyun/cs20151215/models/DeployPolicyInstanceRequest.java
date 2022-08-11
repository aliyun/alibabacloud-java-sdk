// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static DeployPolicyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceRequest self = new DeployPolicyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DeployPolicyInstanceRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public DeployPolicyInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
