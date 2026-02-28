// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachDestinationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParserId")
    public Long parserId;

    public static DetachDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDestinationRequest self = new DetachDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DetachDestinationRequest setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public Long getDestinationId() {
        return this.destinationId;
    }

    public DetachDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DetachDestinationRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}
