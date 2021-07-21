// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessUser")
    public String processUser;

    public static CreateMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringAgentProcessRequest self = new CreateMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateMonitoringAgentProcessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitoringAgentProcessRequest setProcessUser(String processUser) {
        this.processUser = processUser;
        return this;
    }
    public String getProcessUser() {
        return this.processUser;
    }

}
