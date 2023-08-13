// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class KillInstanceAllSessionRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static KillInstanceAllSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        KillInstanceAllSessionRequest self = new KillInstanceAllSessionRequest();
        return TeaModel.build(map, self);
    }

    public KillInstanceAllSessionRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public KillInstanceAllSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
