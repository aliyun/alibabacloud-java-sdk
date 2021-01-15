// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateRealtimeTaskRequest extends TeaModel {
    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 模板执行脚本
    @NameInMap("Script")
    public String script;

    public static CreateRealtimeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtimeTaskRequest self = new CreateRealtimeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtimeTaskRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateRealtimeTaskRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
