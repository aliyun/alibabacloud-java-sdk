// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessId")
    public String processId;

    public static DeleteMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitoringAgentProcessRequest self = new DeleteMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitoringAgentProcessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DeleteMonitoringAgentProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
