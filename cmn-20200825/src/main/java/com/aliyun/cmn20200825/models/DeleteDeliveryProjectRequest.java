// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryProjectRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeliveryProjectId")
    public String deliveryProjectId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDeliveryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryProjectRequest self = new DeleteDeliveryProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryProjectRequest setDeliveryProjectId(String deliveryProjectId) {
        this.deliveryProjectId = deliveryProjectId;
        return this;
    }
    public String getDeliveryProjectId() {
        return this.deliveryProjectId;
    }

    public DeleteDeliveryProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
