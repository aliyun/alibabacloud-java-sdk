// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class InstallMonitoringAgentRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly install the CloudMonitor agent. Valid values:</p>
     * <ul>
     * <li><p>true (default): Forcibly installs the agent.</p>
     * </li>
     * <li><p>false: Does not forcibly install the agent.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The installation command. This command installs the CloudMonitor agent on all Alibaba Cloud hosts that belong to your Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><p><code>onlyInstallNotHasAgent</code>: Installs the latest version of the CloudMonitor agent only on Alibaba Cloud hosts where the agent is not installed.</p>
     * </li>
     * <li><p><code>onlyUpgradeAgent</code>: Upgrades the CloudMonitor agent only on Alibaba Cloud hosts where an earlier version of the agent is installed.</p>
     * </li>
     * <li><p><code>installAndUpgrade</code>: Installs the latest version of the CloudMonitor agent on Alibaba Cloud hosts where the agent is not installed, and upgrades the agent on Alibaba Cloud hosts where an earlier version of the agent is installed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter, the <code>InstanceIds</code> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>onlyInstallNotHasAgent</p>
     */
    @NameInMap("InstallCommand")
    public String installCommand;

    /**
     * <p>The IDs of the Alibaba Cloud hosts.</p>
     * <p>You can specify from 1 to 10 instance IDs.</p>
     * <blockquote>
     * <p>You must specify either <code>InstallCommand</code> or <code>InstanceIds</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-m5e0k0bexac8tykr****</p>
     */
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
