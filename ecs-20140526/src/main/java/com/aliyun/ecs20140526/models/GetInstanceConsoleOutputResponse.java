// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ConsoleOutput")
    @Validation(required = true)
    public String consoleOutput;

    @NameInMap("LastUpdateTime")
    @Validation(required = true)
    public String lastUpdateTime;

    public static GetInstanceConsoleOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputResponse self = new GetInstanceConsoleOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceConsoleOutputResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceConsoleOutputResponse setConsoleOutput(String consoleOutput) {
        this.consoleOutput = consoleOutput;
        return this;
    }
    public String getConsoleOutput() {
        return this.consoleOutput;
    }

    public GetInstanceConsoleOutputResponse setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

}
