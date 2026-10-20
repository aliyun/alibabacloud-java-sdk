// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyPolicyInstanceRequest extends TeaModel {
    /**
     * <p>The governance action of the rule. Valid values:</p>
     * <ul>
     * <li><code>deny</code>: blocks non-compliant deployments.</li>
     * <li><code>warn</code>: generates alerts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The instance ID of the policy rule instance.</p>
     * 
     * <strong>example:</strong>
     * <p>allowed-repos-cbhhb</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    /**
     * <p>The namespaces to which the policy applies. An empty value indicates all namespaces.</p>
     */
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The configuration parameters of the current rule instance. For more information about parameter settings rules, see <a href="https://help.aliyun.com/document_detail/359819.html">Container Security Policy Rule Library</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;restrictedNamespaces&quot;: [ &quot;test&quot; ]</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static ModifyPolicyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyInstanceRequest self = new ModifyPolicyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyInstanceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ModifyPolicyInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyPolicyInstanceRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public ModifyPolicyInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
