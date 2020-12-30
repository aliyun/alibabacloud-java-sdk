// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyAgentDeviceRequest extends TeaModel {
    @NameInMap("IsLogin")
    public Integer isLogin;

    @NameInMap("AgentDeviceId")
    public Long agentDeviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyAgentDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentDeviceRequest self = new ModifyAgentDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentDeviceRequest setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
        return this;
    }
    public Integer getIsLogin() {
        return this.isLogin;
    }

    public ModifyAgentDeviceRequest setAgentDeviceId(Long agentDeviceId) {
        this.agentDeviceId = agentDeviceId;
        return this;
    }
    public Long getAgentDeviceId() {
        return this.agentDeviceId;
    }

    public ModifyAgentDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
