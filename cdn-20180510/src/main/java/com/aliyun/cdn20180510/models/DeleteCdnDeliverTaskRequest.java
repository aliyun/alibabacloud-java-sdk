// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The ID of the tracking task that you want to delete. You can call the <a href="https://help.aliyun.com/document_detail/270877.html">DescribeCdnDeliverList</a> operation to query task IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
