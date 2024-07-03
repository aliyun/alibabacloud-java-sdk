// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRedisAllSessionRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-2zemyfd1sh1u2i****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRedisAllSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRedisAllSessionRequest self = new GetRedisAllSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetRedisAllSessionRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetRedisAllSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
