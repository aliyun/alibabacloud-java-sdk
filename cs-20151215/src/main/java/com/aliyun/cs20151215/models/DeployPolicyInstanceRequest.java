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
     * <p>The namespaces to which the policy applies. If you leave this parameter empty, the policy is applicable to all namespaces of the cluster.</p>
     */
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The parameter settings of the policy. For more information about the parameters supported by each policy, see [Predefined security policies of ACK](https://www.alibabacloud.com/help/doc-detail/359819.html).</p>
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
