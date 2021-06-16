// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDeliverTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeliverId")
    public Long deliverId;

    public static DeleteCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDeliverTaskRequest self = new DeleteCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

}
