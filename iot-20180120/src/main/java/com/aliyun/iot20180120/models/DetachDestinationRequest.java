// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachDestinationRequest extends TeaModel {
    /**
     * <p>The ID of the data destination. You can call the [ListDestination](~~433025~~) operation to query data destinations and obtain the ID of the **data destination**.</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the parser. You can call the [ListParser](~~444814~~) operation to query parsers and obtain the ID of the **parser**.</p>
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
