// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the policy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>allowed-repos-mqdsf</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    public static DeletePolicyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceRequest self = new DeletePolicyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
