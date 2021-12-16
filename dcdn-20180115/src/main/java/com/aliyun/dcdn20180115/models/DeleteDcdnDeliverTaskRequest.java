// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDeliverTaskRequest extends TeaModel {
    @NameInMap("DeliverId")
    public Long deliverId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDeliverTaskRequest self = new DeleteDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public DeleteDcdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
