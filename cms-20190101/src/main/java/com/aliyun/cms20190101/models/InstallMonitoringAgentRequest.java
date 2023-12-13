// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class InstallMonitoringAgentRequest extends TeaModel {
    /**
     * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
     * <br>
     * <p>*   true (default value): yes</p>
     * <p>*   false: no</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Specifies whether to install the CloudMonitor agent on all ECS instances that belong to the current Alibaba Cloud account. Valid values:</p>
     * <br>
     * <p>*   `onlyInstallNotHasAgent`: installs the latest version of the CloudMonitor agent only on ECS instances on which the agent is not installed.</p>
     * <p>*   `onlyUpgradeAgent`: upgrades the CloudMonitor agent to the latest version only for ECS instances on which an earlier version of the agent is installed.</p>
     * <p>*   `installAndUpgrade`: installs the latest version of the CloudMonitor agent on ECS instances on which the agent is not installed, and upgrades the CloudMonitor agent to the latest version for ECS instances on which an earlier version of the agent is installed.</p>
     * <br>
     * <p>>  If you set the InstallCommand parameter, the `InstanceIds` parameter does not take effect.</p>
     */
    @NameInMap("InstallCommand")
    public String installCommand;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static InstallMonitoringAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallMonitoringAgentRequest self = new InstallMonitoringAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallMonitoringAgentRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public InstallMonitoringAgentRequest setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }
    public String getInstallCommand() {
        return this.installCommand;
    }

    public InstallMonitoringAgentRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public InstallMonitoringAgentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
