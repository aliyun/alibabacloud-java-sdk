// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance to be deleted. You can specify only one instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleasePostPaidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceRequest self = new ReleasePostPaidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
