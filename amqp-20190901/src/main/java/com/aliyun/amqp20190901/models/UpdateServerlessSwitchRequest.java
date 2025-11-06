// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpdateServerlessSwitchRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerlessSwitch")
    public Boolean serverlessSwitch;

    public static UpdateServerlessSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerlessSwitchRequest self = new UpdateServerlessSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerlessSwitchRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public UpdateServerlessSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateServerlessSwitchRequest setServerlessSwitch(Boolean serverlessSwitch) {
        this.serverlessSwitch = serverlessSwitch;
        return this;
    }
    public Boolean getServerlessSwitch() {
        return this.serverlessSwitch;
    }

}
