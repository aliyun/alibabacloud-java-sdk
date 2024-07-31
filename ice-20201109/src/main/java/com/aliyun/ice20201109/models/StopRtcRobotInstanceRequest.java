// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopRtcRobotInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>727dc0e296014bb58670940a3da95592</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopRtcRobotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRtcRobotInstanceRequest self = new StopRtcRobotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopRtcRobotInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
