// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance for which you want to update the name.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the instance. No limits are imposed on the value. We recommend that you set this parameter to a maximum of 64 characters in length.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static UpdateInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameRequest self = new UpdateInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
