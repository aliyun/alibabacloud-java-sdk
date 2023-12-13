// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the process.</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The user who launches the process.</p>
     */
    @NameInMap("ProcessUser")
    public String processUser;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringAgentProcessRequest self = new CreateMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringAgentProcessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateMonitoringAgentProcessRequest setProcessUser(String processUser) {
        this.processUser = processUser;
        return this;
    }
    public String getProcessUser() {
        return this.processUser;
    }

    public CreateMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
