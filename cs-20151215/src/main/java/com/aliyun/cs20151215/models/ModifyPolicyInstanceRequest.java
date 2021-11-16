// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyPolicyInstanceRequest extends TeaModel {
    // 规则治理动作
    @NameInMap("action")
    public String action;

    // 策略规则实例id
    @NameInMap("instance_name")
    public String instanceName;

    // 策略实例实施范围
    @NameInMap("namespace")
    public String namespace;

    // 当前规则实例的配置参数
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

    public ModifyPolicyInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyPolicyInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
