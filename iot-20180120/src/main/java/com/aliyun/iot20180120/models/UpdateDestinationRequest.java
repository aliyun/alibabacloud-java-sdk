// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDestinationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("Description")
    public String description;

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
     * <p>DataPurpose</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPUBLISH</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDestinationRequest self = new UpdateDestinationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDestinationRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public UpdateDestinationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDestinationRequest setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public Long getDestinationId() {
        return this.destinationId;
    }

    public UpdateDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateDestinationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDestinationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
