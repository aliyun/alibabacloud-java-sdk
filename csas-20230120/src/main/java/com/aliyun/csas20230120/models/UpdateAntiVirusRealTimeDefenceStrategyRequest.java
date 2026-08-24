// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateAntiVirusRealTimeDefenceStrategyRequest extends TeaModel {
    /**
     * <p>The action to take on high-risk virus files. Required when configuring the real-time defense policy for the first time. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Quarantine</p>
     */
    @NameInMap("HighRiskOperation")
    public String highRiskOperation;

    /**
     * <p>The action to take on low-risk virus files. Required when configuring the real-time defense policy for the first time. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file.</li>
     * <li><strong>None</strong>: Takes no action.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("LowRiskOperation")
    public String lowRiskOperation;

    /**
     * <p>The matching mode for the effective scope. Required when configuring the real-time defense policy for the first time. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups. UserGroupIds is required in this case.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The maximum percentage of endpoint CPU that real-time defense can consume. Valid values: 0 to 100. When configuring for the first time, the value is stored as 0 but takes effect as 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxCpuUsage")
    public Long maxCpuUsage;

    /**
     * <p>The action to take on medium-risk virus files. Required when configuring the real-time defense policy for the first time. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Notify</p>
     */
    @NameInMap("MidRiskOperation")
    public String midRiskOperation;

    /**
     * <p>The collection of virus types to be handled by real-time defense. Duplicates are not allowed. Required when configuring the real-time defense policy for the first time. When the policy already exists, this parameter performs a full replacement. The collection you pass in replaces the existing configuration.</p>
     */
    @NameInMap("ScanTargets")
    public java.util.List<String> scanTargets;

    /**
     * <p>The enabling status. Required when configuring the real-time defense policy for the first time. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The collection of user group IDs to which the policy applies. Required when MatchMode is set to UserGroupNormal. Not allowed when MatchMode is set to UserGroupAll. At least 1 and at most 100 entries are allowed. Duplicates are not allowed. When MatchMode is UserGroupNormal, you must pass in the complete user group collection on every call, even when modifying only other parameters.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The exception user list. Users in this list are excluded from real-time defense. A maximum of 1000 entries are allowed. Duplicates are not allowed. This parameter performs a full replacement. The list you pass in replaces the existing list.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static UpdateAntiVirusRealTimeDefenceStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntiVirusRealTimeDefenceStrategyRequest self = new UpdateAntiVirusRealTimeDefenceStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setHighRiskOperation(String highRiskOperation) {
        this.highRiskOperation = highRiskOperation;
        return this;
    }
    public String getHighRiskOperation() {
        return this.highRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setLowRiskOperation(String lowRiskOperation) {
        this.lowRiskOperation = lowRiskOperation;
        return this;
    }
    public String getLowRiskOperation() {
        return this.lowRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setMaxCpuUsage(Long maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
        return this;
    }
    public Long getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setMidRiskOperation(String midRiskOperation) {
        this.midRiskOperation = midRiskOperation;
        return this;
    }
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setScanTargets(java.util.List<String> scanTargets) {
        this.scanTargets = scanTargets;
        return this;
    }
    public java.util.List<String> getScanTargets() {
        return this.scanTargets;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
