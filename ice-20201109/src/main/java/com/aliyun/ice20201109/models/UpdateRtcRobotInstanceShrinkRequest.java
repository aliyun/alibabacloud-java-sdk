// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateRtcRobotInstanceShrinkRequest extends TeaModel {
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>727dc0e296014bb58670940a3da95592</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateRtcRobotInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcRobotInstanceShrinkRequest self = new UpdateRtcRobotInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtcRobotInstanceShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public UpdateRtcRobotInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
