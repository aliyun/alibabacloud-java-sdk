// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachDestinationRequest extends TeaModel {
    /**
     * <p>The ID of the data destination. You can call the <a href="https://help.aliyun.com/document_detail/433025.html">ListDestination</a> operation to query data destinations and obtain the ID of the <strong>data destination</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("DestinationId")
    public Long destinationId;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the parser. You can call the <a href="https://help.aliyun.com/document_detail/444814.html">ListParser</a> operation to query parsers and obtain the ID of the <strong>parser</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
