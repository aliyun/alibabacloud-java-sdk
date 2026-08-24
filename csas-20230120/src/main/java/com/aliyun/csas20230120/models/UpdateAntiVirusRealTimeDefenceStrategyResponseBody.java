// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateAntiVirusRealTimeDefenceStrategyResponseBody extends TeaModel {
    /**
     * <p>The action to take on high-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file. Quarantine is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Quarantine</p>
     */
    @NameInMap("HighRiskOperation")
    public String highRiskOperation;

    /**
     * <p>The action to take on low-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file.</li>
     * <li><strong>None</strong>: Takes no action. None is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("LowRiskOperation")
    public String lowRiskOperation;

    /**
     * <p>The matching mode for the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups. An empty string is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The action to take on medium-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
     * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file. Notify is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Notify</p>
     */
    @NameInMap("MidRiskOperation")
    public String midRiskOperation;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of virus types to be handled by real-time defense. An empty list is returned if no real-time defense policy has been configured.</p>
     */
    @NameInMap("ScanTargets")
    public java.util.List<String> scanTargets;

    /**
     * <p>The enabling status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled. This value is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The real-time defense policy ID. An empty string is returned if no real-time defense policy has been configured.</p>
     * 
     * <strong>example:</strong>
     * <p>av-rtd-2f5c8e1a7b94****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>The collection of user group IDs to which the policy applies. An empty list is returned when MatchMode is set to UserGroupAll.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The exception user list. Users in this list are excluded from real-time defense. An empty list is returned if no exception users are configured.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static UpdateAntiVirusRealTimeDefenceStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntiVirusRealTimeDefenceStrategyResponseBody self = new UpdateAntiVirusRealTimeDefenceStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setHighRiskOperation(String highRiskOperation) {
        this.highRiskOperation = highRiskOperation;
        return this;
    }
    public String getHighRiskOperation() {
        return this.highRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setLowRiskOperation(String lowRiskOperation) {
        this.lowRiskOperation = lowRiskOperation;
        return this;
    }
    public String getLowRiskOperation() {
        return this.lowRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setMidRiskOperation(String midRiskOperation) {
        this.midRiskOperation = midRiskOperation;
        return this;
    }
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setScanTargets(java.util.List<String> scanTargets) {
        this.scanTargets = scanTargets;
        return this;
    }
    public java.util.List<String> getScanTargets() {
        return this.scanTargets;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
