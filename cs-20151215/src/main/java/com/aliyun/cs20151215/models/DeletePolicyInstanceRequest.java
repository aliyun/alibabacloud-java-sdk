// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceRequest extends TeaModel {
    // 策略规则实例id
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
