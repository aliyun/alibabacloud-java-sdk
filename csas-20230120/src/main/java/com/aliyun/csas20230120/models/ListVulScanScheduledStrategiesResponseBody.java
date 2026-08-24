// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulScanScheduledStrategiesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of scheduled vulnerability scan policies.</p>
     */
    @NameInMap("Strategies")
    public java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategies> strategies;

    /**
     * <p>The total number of scheduled vulnerability scan policies that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>37</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListVulScanScheduledStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVulScanScheduledStrategiesResponseBody self = new ListVulScanScheduledStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVulScanScheduledStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVulScanScheduledStrategiesResponseBody setStrategies(java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public ListVulScanScheduledStrategiesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup extends TeaModel {
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

        public static ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup build(java.util.Map<String, ?> map) throws Exception {
            ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup self = new ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup();
            return TeaModel.build(map, self);
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

    }

    public static class ListVulScanScheduledStrategiesResponseBodyStrategies extends TeaModel {
        /**
         * <p>The time when the policy was created, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The effective scope specified by organizational structure. An empty list is returned if the scope is not configured by organizational structure.</p>
         */
        @NameInMap("CustomMatchGroup")
        public java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> customMatchGroup;

        /**
         * <p>The time when the policy last triggered a scan, in seconds-level UNIX timestamp. The value 0 is returned if the policy has never been triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        @NameInMap("LastTriggerTime")
        public Long lastTriggerTime;

        /**
         * <p>The matching mode of the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Takes effect only for users in specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The collection of user group IDs that the policy takes effect for. An empty list is returned when MatchMode is set to UserGroupAll.</p>
         */
        @NameInMap("MatchTargetIds")
        public java.util.List<String> matchTargetIds;

        /**
         * <p>The policy priority. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The start hour during which scans can be triggered. The value is an integer representing the hour of the day. Valid values: 0 to 23 (inclusive). This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanBeginTime")
        public Integer scanBeginTime;

        /**
         * <p>The end hour during which scans can be triggered. The value is an integer representing the hour of the day. Valid values: 1 to 24 (exclusive). The value must be greater than ScanBeginTime. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ScanEndTime")
        public Integer scanEndTime;

        /**
         * <p>The unit of the trigger cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: by day.</li>
         * <li><strong>week</strong>: by week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("ScanFrequency")
        public String scanFrequency;

        /**
         * <p>The interval number of the trigger cycle. This parameter works together with ScanFrequency to determine the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is triggered once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanInterval")
        public Integer scanInterval;

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
         * <p>Execute vulnerability scanning on R&amp;D department endpoints every Sunday at midnight</p>
         */
        @NameInMap("StrategyDescription")
        public String strategyDescription;

        /**
         * <p>The ID of the scheduled vulnerability scan policy.</p>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly vulnerability scanning for R&amp;D department</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The list of exempt usernames. Users in this list are excluded from the scan of this policy. An empty list is returned if no exemptions are configured.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListVulScanScheduledStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListVulScanScheduledStrategiesResponseBodyStrategies self = new ListVulScanScheduledStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setCustomMatchGroup(java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }
        public java.util.List<ListVulScanScheduledStrategiesResponseBodyStrategiesCustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setLastTriggerTime(Long lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }
        public Long getLastTriggerTime() {
            return this.lastTriggerTime;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setMatchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setScanBeginTime(Integer scanBeginTime) {
            this.scanBeginTime = scanBeginTime;
            return this;
        }
        public Integer getScanBeginTime() {
            return this.scanBeginTime;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setScanEndTime(Integer scanEndTime) {
            this.scanEndTime = scanEndTime;
            return this;
        }
        public Integer getScanEndTime() {
            return this.scanEndTime;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setScanFrequency(String scanFrequency) {
            this.scanFrequency = scanFrequency;
            return this;
        }
        public String getScanFrequency() {
            return this.scanFrequency;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setScanInterval(Integer scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }
        public Integer getScanInterval() {
            return this.scanInterval;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListVulScanScheduledStrategiesResponseBodyStrategies setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
