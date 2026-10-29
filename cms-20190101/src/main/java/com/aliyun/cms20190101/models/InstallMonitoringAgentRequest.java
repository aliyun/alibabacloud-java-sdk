// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class InstallMonitoringAgentRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run on the request. The dry run includes checks on permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. After the request passes the check, the name and description of the route table are directly modified.</li>
     * <li><strong>true</strong>: Sends a dry run request. Only checks are performed, and the name and description of the route table are not modified. Check items include whether required parameters are specified and the request format. If the check fails, an error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcibly install the CloudMonitor agent. Valid values:</p>
     * <ul>
     * <li>true (default): Forcibly installs the agent.</li>
     * <li>false: Does not forcibly install the agent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Installs the CloudMonitor agent on all Alibaba Cloud hosts within the current Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><p>onlyInstallNotHasAgent: Installs the latest version of the agent only on Alibaba Cloud hosts on which the CloudMonitor agent is not installed.</p>
     * </li>
     * <li><p>onlyUpgradeAgent: Upgrades the agent only on Alibaba Cloud hosts on which a non-latest version of the CloudMonitor agent is installed.</p>
     * </li>
     * <li><p>installAndUpgrade: Installs the latest version of the agent on Alibaba Cloud hosts on which the CloudMonitor agent is not installed, and upgrades the agent on Alibaba Cloud hosts on which a non-latest version of the CloudMonitor agent is installed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify this parameter, the InstanceIds parameter becomes invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>onlyInstallNotHasAgent</p>
     */
    @NameInMap("InstallCommand")
    public String installCommand;

    /**
     * <p>The ID of the Alibaba Cloud host.</p>
     * <p>Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either InstallCommand or InstanceIds.</p>
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

    public InstallMonitoringAgentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
