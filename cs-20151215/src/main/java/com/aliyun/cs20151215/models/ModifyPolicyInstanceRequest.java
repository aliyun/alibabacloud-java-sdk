// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyPolicyInstanceRequest extends TeaModel {
    /**
     * <p>The action of the policy. Valid values:</p>
     * <br>
     * <p>*   `deny`: Deployments that match the policy are denied.</p>
     * <p>*   `warn`: Alerts are generated for deployments that match the policy.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The ID of the policy instance.</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    /**
     * <p>The namespaces to which the policy is applied. The policy is applied to all namespaces if this parameter is left empty.</p>
     */
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The parameters of the policy instance. For more information, see [Predefined security policies of ACK](https://help.aliyun.com/document_detail/359819.html).</p>
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
