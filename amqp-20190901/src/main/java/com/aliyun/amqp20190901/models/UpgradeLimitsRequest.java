// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpgradeLimitsRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpgradeLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLimitsRequest self = new UpgradeLimitsRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeLimitsRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public UpgradeLimitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
