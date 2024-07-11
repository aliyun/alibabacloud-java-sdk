// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetMetadataAmountRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9n***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMetadataAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetadataAmountRequest self = new GetMetadataAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetMetadataAmountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
