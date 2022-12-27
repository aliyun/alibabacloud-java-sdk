// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputResponseBody extends TeaModel {
    // The Base64-encoded command output of the instance.
    @NameInMap("ConsoleOutput")
    public String consoleOutput;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The time when the instance was last started, restarted, or shut down. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceConsoleOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputResponseBody self = new GetInstanceConsoleOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputResponseBody setConsoleOutput(String consoleOutput) {
        this.consoleOutput = consoleOutput;
        return this;
    }
    public String getConsoleOutput() {
        return this.consoleOutput;
    }

    public GetInstanceConsoleOutputResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
