// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The process ID.</p>
     * <br>
     * <p>> You must configure either `ProcessId` or `ProcessName`.</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The process name.</p>
     * <br>
     * <p>> You must configure either `ProcessId` or `ProcessName`.</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("RegionId")
    public String regionId;

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

    public DeleteMonitoringAgentProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DeleteMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DeleteMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
