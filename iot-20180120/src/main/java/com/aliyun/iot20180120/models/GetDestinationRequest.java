// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDestinationRequest extends TeaModel {
    @NameInMap("DestinationId")
    public Long destinationId;

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
