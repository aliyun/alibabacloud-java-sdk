// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryArchVersionRequest extends TeaModel {
    @NameInMap("DeliveryArchVersionId")
    public String deliveryArchVersionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDeliveryArchVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryArchVersionRequest self = new DeleteDeliveryArchVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryArchVersionRequest setDeliveryArchVersionId(String deliveryArchVersionId) {
        this.deliveryArchVersionId = deliveryArchVersionId;
        return this;
    }
    public String getDeliveryArchVersionId() {
        return this.deliveryArchVersionId;
    }

    public DeleteDeliveryArchVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
