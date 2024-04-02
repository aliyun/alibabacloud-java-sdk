// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBagRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static RefundCdiBagRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBagRequest self = new RefundCdiBagRequest();
        return TeaModel.build(map, self);
    }

    public RefundCdiBagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundCdiBagRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
