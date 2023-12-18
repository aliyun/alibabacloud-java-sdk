// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePrePaidInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance to be deleted. You can specify only one instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleasePrePaidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePrePaidInstanceRequest self = new ReleasePrePaidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePrePaidInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
