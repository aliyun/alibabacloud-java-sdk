// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetAntiVirusRealTimeDefenceStrategyResponseBody extends TeaModel {
    /**
     * <p>The action taken on high-risk virus files. Valid values:</p>
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
     * <p>The action taken on low-risk virus files. Valid values:</p>
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
     * <p>The matching mode of the effective scope. Valid values:</p>
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
     * <p>The collection of user group IDs to which the policy applies. An empty list is returned when MatchMode is set to UserGroupAll.</p>
     */
    @NameInMap("MatchTargetIds")
    public java.util.List<String> matchTargetIds;

    /**
     * <p>The maximum percentage of endpoint CPU that real-time defense can use. The default value 30 is returned if a policy has been configured but this parameter is not separately set. 0 is returned if no real-time defense policy has been configured.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxCpuUsage")
    public Long maxCpuUsage;

    /**
     * <p>The action taken on medium-risk virus files. Valid values:</p>
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
     * <p>The collection of virus types that the real-time defense handles. An empty list is returned if no real-time defense policy has been configured.</p>
     */
    @NameInMap("ScanTargets")
    public java.util.List<String> scanTargets;

    /**
     * <p>The enabling status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled. Disabled is returned if no real-time defense policy has been configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the real-time defense policy. An empty string is returned if no real-time defense policy has been configured.</p>
     * 
     * <strong>example:</strong>
     * <p>av-rtd-2f5c8e1a7b94****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>The list of exempted usernames. Users in this list are not subject to real-time defense. An empty list is returned if no exemption is configured.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static GetAntiVirusRealTimeDefenceStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAntiVirusRealTimeDefenceStrategyResponseBody self = new GetAntiVirusRealTimeDefenceStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setHighRiskOperation(String highRiskOperation) {
        this.highRiskOperation = highRiskOperation;
        return this;
    }
    public String getHighRiskOperation() {
        return this.highRiskOperation;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setLowRiskOperation(String lowRiskOperation) {
        this.lowRiskOperation = lowRiskOperation;
        return this;
    }
    public String getLowRiskOperation() {
        return this.lowRiskOperation;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setMatchTargetIds(java.util.List<String> matchTargetIds) {
        this.matchTargetIds = matchTargetIds;
        return this;
    }
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setMaxCpuUsage(Long maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
        return this;
    }
    public Long getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setMidRiskOperation(String midRiskOperation) {
        this.midRiskOperation = midRiskOperation;
        return this;
    }
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setScanTargets(java.util.List<String> scanTargets) {
        this.scanTargets = scanTargets;
        return this;
    }
    public java.util.List<String> getScanTargets() {
        return this.scanTargets;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponseBody setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
