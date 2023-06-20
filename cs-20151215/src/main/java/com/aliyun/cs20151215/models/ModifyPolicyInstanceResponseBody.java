// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyPolicyInstanceResponseBody extends TeaModel {
    /**
     * <p>The policy instance that is updated.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    public static ModifyPolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyInstanceResponseBody self = new ModifyPolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyInstanceResponseBody setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

}
