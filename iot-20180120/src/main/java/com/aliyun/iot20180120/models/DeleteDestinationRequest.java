// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDestinationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1003</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    /**
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDestinationRequest self = new DeleteDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDestinationRequest setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public Long getDestinationId() {
        return this.destinationId;
    }

    public DeleteDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
