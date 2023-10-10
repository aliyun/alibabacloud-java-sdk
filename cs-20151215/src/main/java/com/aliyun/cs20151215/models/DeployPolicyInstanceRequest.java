// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceRequest extends TeaModel {
    /**
     * <p>The action of the policy. Valid values:</p>
     * <br>
     * <p>*   `deny`: Deployments that match the policy are denied.</p>
     * <p>*   `warn`: Alerts are generated for Deployments that match the policy.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The applicable scope of the policy instance. If you leave this parameter empty, the policy instance is applicable to all namespaces.</p>
     */
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The parameters of the policy instance.</p>
     */
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
