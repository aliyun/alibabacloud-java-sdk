// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The IDs of the tracking tasks that you want to delete. You can call the [DescribeCdnDeliverList](~~270877~~) operation to query task IDs.</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

    public static DeleteCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDeliverTaskRequest self = new DeleteCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

}
