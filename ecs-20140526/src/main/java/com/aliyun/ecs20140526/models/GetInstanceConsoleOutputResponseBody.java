// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputResponseBody extends TeaModel {
    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConsoleOutput")
    public String consoleOutput;

    public static GetInstanceConsoleOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputResponseBody self = new GetInstanceConsoleOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputResponseBody setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public GetInstanceConsoleOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceConsoleOutputResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceConsoleOutputResponseBody setConsoleOutput(String consoleOutput) {
        this.consoleOutput = consoleOutput;
        return this;
    }
    public String getConsoleOutput() {
        return this.consoleOutput;
    }

}
