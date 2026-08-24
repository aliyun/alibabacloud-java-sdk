// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanScheduledStrategiesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of scheduled virus scan policies.</p>
     */
    @NameInMap("Strategies")
    public java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategies> strategies;

    /**
     * <p>The total number of scheduled virus scan policies.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListVirusScanScheduledStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanScheduledStrategiesResponseBody self = new ListVirusScanScheduledStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanScheduledStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusScanScheduledStrategiesResponseBody setStrategies(java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public ListVirusScanScheduledStrategiesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup extends TeaModel {
        /**
         * <p>The collection of organizational structure nodes.</p>
         */
        @NameInMap("Group")
        public java.util.List<String> group;

        /**
         * <p>The identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-7c3f9a2e5b18****</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        public static ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup self = new ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup();
            return TeaModel.build(map, self);
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

    }

    public static class ListVirusScanScheduledStrategiesResponseBodyStrategies extends TeaModel {
        /**
         * <p>The time when the policy was created, in the format of yyyy-MM-dd HH:mm:ss. The time is in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The effective scope specified by organizational structure.</p>
         */
        @NameInMap("CustomMatchGroup")
        public java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> customMatchGroup;

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quarantine</p>
         */
        @NameInMap("HighRiskOperation")
        public String highRiskOperation;

        /**
         * <p>The time when the policy last triggered a scan, in the format of yyyy-MM-dd HH:mm:ss. The time is in UTC+8. An empty string is returned if the policy has never been triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 01:00:03</p>
         */
        @NameInMap("LastTriggerTime")
        public String lastTriggerTime;

        /**
         * <p>The action to take on low-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * <li><strong>None</strong>: Take no action.</li>
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
         * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups.</li>
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
         * <p>The maximum percentage of terminal CPU usage allowed during scanning.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxCpuUsage")
        public Long maxCpuUsage;

        /**
         * <p>The action to take on medium-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Report an alert only without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        @NameInMap("MidRiskOperation")
        public String midRiskOperation;

        /**
         * <p>The scan performance schema pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: Security first. The default CPU usage upper limit is 50%.</li>
         * <li><strong>Balance</strong>: Balanced. The default CPU usage upper limit is 30%.</li>
         * <li><strong>ExperienceFirst</strong>: Experience first. The default CPU usage upper limit is 15%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        @NameInMap("PerformanceMode")
        public String performanceMode;

        /**
         * <p>The policy priority. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The start hour during which the scan can be triggered. The value is a whole hour number ranging from 0 to 23, inclusive. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanBeginTime")
        public Integer scanBeginTime;

        /**
         * <p>The end hour during which the scan can be triggered. The value is a whole hour number ranging from 1 to 24, exclusive of the specified hour, and must be greater than ScanBeginTime. The scan task generated by each trigger expires at this hour on the same day. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ScanEndTime")
        public Integer scanEndTime;

        /**
         * <p>The unit of the trigger cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: By day.</li>
         * <li><strong>week</strong>: By week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("ScanFrequency")
        public String scanFrequency;

        /**
         * <p>The interval number of the trigger cycle. This parameter works together with ScanFrequency to determine the trigger cycle. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is triggered once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanInterval")
        public Integer scanInterval;

        /**
         * <p>The scan path scope. Valid values:</p>
         * <ul>
         * <li><strong>Quick</strong>: Quick scan. Only critical system directories and common risk locations are scanned.</li>
         * <li><strong>Full</strong>: Full disk scan.</li>
         * <li><strong>Custom</strong>: Custom path scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quick</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The collection of custom scan paths.</p>
         */
        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        /**
         * <p>The collection of virus types to be handled in this scan.</p>
         */
        @NameInMap("ScanTargets")
        public java.util.List<String> scanTargets;

        /**
         * <p>The enabled status. Valid values:</p>
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
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Full disk scan on R&amp;D department terminals every Sunday at midnight</p>
         */
        @NameInMap("StrategyDescription")
        public String strategyDescription;

        /**
         * <p>The ID of the scheduled virus scan policy.</p>
         * 
         * <strong>example:</strong>
         * <p>vc-strategy-8a3f6c2e91b7****</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly_Scan_DevTeam</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The list of exempted users. Users in this list are excluded from the scan performed by this policy. An empty list is returned if no exemptions are configured.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListVirusScanScheduledStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanScheduledStrategiesResponseBodyStrategies self = new ListVirusScanScheduledStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setCustomMatchGroup(java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }
        public java.util.List<ListVirusScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setHighRiskOperation(String highRiskOperation) {
            this.highRiskOperation = highRiskOperation;
            return this;
        }
        public String getHighRiskOperation() {
            return this.highRiskOperation;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setLastTriggerTime(String lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }
        public String getLastTriggerTime() {
            return this.lastTriggerTime;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setLowRiskOperation(String lowRiskOperation) {
            this.lowRiskOperation = lowRiskOperation;
            return this;
        }
        public String getLowRiskOperation() {
            return this.lowRiskOperation;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setMatchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setMaxCpuUsage(Long maxCpuUsage) {
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }
        public Long getMaxCpuUsage() {
            return this.maxCpuUsage;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setMidRiskOperation(String midRiskOperation) {
            this.midRiskOperation = midRiskOperation;
            return this;
        }
        public String getMidRiskOperation() {
            return this.midRiskOperation;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setPerformanceMode(String performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }
        public String getPerformanceMode() {
            return this.performanceMode;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanBeginTime(Integer scanBeginTime) {
            this.scanBeginTime = scanBeginTime;
            return this;
        }
        public Integer getScanBeginTime() {
            return this.scanBeginTime;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanEndTime(Integer scanEndTime) {
            this.scanEndTime = scanEndTime;
            return this;
        }
        public Integer getScanEndTime() {
            return this.scanEndTime;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanFrequency(String scanFrequency) {
            this.scanFrequency = scanFrequency;
            return this;
        }
        public String getScanFrequency() {
            return this.scanFrequency;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanInterval(Integer scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }
        public Integer getScanInterval() {
            return this.scanInterval;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setScanTargets(java.util.List<String> scanTargets) {
            this.scanTargets = scanTargets;
            return this;
        }
        public java.util.List<String> getScanTargets() {
            return this.scanTargets;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListVirusScanScheduledStrategiesResponseBodyStrategies setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
