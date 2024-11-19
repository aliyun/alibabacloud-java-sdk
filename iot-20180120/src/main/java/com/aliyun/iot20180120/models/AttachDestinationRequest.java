// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AttachDestinationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    /**
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFailover")
    public Boolean isFailover;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ParserId")
    public Long parserId;

    public static AttachDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDestinationRequest self = new AttachDestinationRequest();
        return TeaModel.build(map, self);
    }

    public AttachDestinationRequest setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public Long getDestinationId() {
        return this.destinationId;
    }

    public AttachDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AttachDestinationRequest setIsFailover(Boolean isFailover) {
        this.isFailover = isFailover;
        return this;
    }
    public Boolean getIsFailover() {
        return this.isFailover;
    }

    public AttachDestinationRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}
