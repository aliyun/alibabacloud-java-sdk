// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateRealtimeTaskRequest extends TeaModel {
    // token
    @NameInMap("ClientToken")
    public String clientToken;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 模板执行脚本
    @NameInMap("Script")
    public String script;

    public static CreateRealtimeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtimeTaskRequest self = new CreateRealtimeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtimeTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRealtimeTaskRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateRealtimeTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRealtimeTaskRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
