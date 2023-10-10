// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponseBody extends TeaModel {
    /**
     * <p>A list of policy instances.</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    public static DeletePolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponseBody self = new DeletePolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponseBody setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

}
