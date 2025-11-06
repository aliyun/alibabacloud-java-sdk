// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CancelUserSettingRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CancelUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUserSettingRequest self = new CancelUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public CancelUserSettingRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public CancelUserSettingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
