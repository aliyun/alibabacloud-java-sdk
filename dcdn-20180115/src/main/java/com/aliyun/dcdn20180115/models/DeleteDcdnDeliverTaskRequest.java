// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The IDs of the tracking tasks that you want to delete. You can call the [DescribeCdnDeliverList](~~270043~~) operation to query task IDs.</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

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

}
