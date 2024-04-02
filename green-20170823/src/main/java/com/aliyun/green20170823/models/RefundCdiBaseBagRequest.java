// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBaseBagRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static RefundCdiBaseBagRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBaseBagRequest self = new RefundCdiBaseBagRequest();
        return TeaModel.build(map, self);
    }

    public RefundCdiBaseBagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundCdiBaseBagRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
