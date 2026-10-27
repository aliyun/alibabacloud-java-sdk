// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceRequest extends TeaModel {
    /**
     * <p>The governance action of the rule. Valid values:</p>
     * <ul>
     * <li><code>deny</code>: Blocks non-compliant deployments.</li>
     * <li><code>warn</code>: Generates an alert.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The namespaces where the policy is enforced. If this parameter is left empty, the policy is enforced in all namespaces.</p>
     */
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The parameter settings of the current rule instance. For more information about the parameters supported by each policy governance rule and the corresponding metric description, see <a href="https://www.alibabacloud.com/help/doc-detail/359819.html">Container security policy rule library</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;repos&quot;: [     &quot;registry-vpc.cn-hangzhou.aliyuncs.com/acs/&quot;,     &quot;registry.cn-hangzhou.aliyuncs.com/acs/&quot;   ] }</p>
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
