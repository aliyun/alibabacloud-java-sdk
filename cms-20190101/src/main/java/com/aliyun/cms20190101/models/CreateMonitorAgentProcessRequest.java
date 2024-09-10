// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorAgentProcessRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze2d6j5uhg20x47****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliYunDun</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The user who launches the process.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("ProcessUser")
    public String processUser;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMonitorAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAgentProcessRequest self = new CreateMonitorAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAgentProcessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitorAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateMonitorAgentProcessRequest setProcessUser(String processUser) {
        this.processUser = processUser;
        return this;
    }
    public String getProcessUser() {
        return this.processUser;
    }

    public CreateMonitorAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
