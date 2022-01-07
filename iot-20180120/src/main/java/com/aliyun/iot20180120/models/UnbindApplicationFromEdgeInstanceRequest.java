// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindApplicationFromEdgeInstanceRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static UnbindApplicationFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindApplicationFromEdgeInstanceRequest self = new UnbindApplicationFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindApplicationFromEdgeInstanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UnbindApplicationFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindApplicationFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
