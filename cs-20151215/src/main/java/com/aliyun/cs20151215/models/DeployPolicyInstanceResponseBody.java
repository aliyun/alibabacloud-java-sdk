// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceResponseBody extends TeaModel {
    /**
     * <p>The policy instances that are deployed.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    public static DeployPolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceResponseBody self = new DeployPolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceResponseBody setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

}
