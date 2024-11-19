// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDestinationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    /**
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDestinationRequest self = new GetDestinationRequest();
        return TeaModel.build(map, self);
    }

    public GetDestinationRequest setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public Long getDestinationId() {
        return this.destinationId;
    }

    public GetDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
