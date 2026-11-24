// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVulScanScheduledStrategyResponseBody extends TeaModel {
    /**
     * <p>The time when the policy was created. The value is a UNIX timestamp accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1786291200</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The effective scope specified by organizational structure. If no organizational structure is configured, an empty list is returned.</p>
     */
    @NameInMap("CustomMatchGroup")
    public java.util.List<GetVulScanScheduledStrategyResponseBodyCustomMatchGroup> customMatchGroup;

    /**
     * <p>The time when the policy last triggered a scan. The value is a UNIX timestamp accurate to seconds. If the policy has never been triggered, 0 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1786291200</p>
     */
    @NameInMap("LastTriggerTime")
    public Long lastTriggerTime;

    /**
     * <p>The matching mode for the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: Applies only to users in the specified user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The collection of effective user group IDs. If MatchMode is set to UserGroupAll, an empty list is returned.</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start hour when a scan is allowed to be triggered. The value must be an integer on the hour. Valid values: 0 to 23. The specified hour is included. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanBeginTime")
    public Integer scanBeginTime;

    /**
     * <p>The end hour when a scan is allowed to be triggered. The value must be an integer on the hour. Valid values: 1 to 24. The specified hour is excluded and must be greater than the value of ScanBeginTime. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ScanEndTime")
    public Integer scanEndTime;

    /**
     * <p>The unit of the trigger cycle. Valid values:</p>
     * <ul>
     * <li><strong>day</strong>: Day.</li>
     * <li><strong>week</strong>: Week.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>week</p>
     */
    @NameInMap("ScanFrequency")
    public String scanFrequency;

    /**
     * <p>The interval of the trigger cycle. This parameter and ScanFrequency determine the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, a scan is performed once a week.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanInterval")
    public Integer scanInterval;

    /**
     * <p>The enabling status. Valid values:</p>
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
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Execute vulnerability scanning for R&amp;D department endpoints every Sunday morning</p>
     */
    @NameInMap("StrategyDescription")
    public String strategyDescription;

    /**
     * <p>The ID of the scheduled vulnerability scanning policy.</p>
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
     * <p>Weekly vulnerability scanning for the R&amp;D department</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The whitelist of users. Scans based on this policy are not performed on the users in the whitelist. If no whitelist is configured, an empty list is returned.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static GetVulScanScheduledStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulScanScheduledStrategyResponseBody self = new GetVulScanScheduledStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulScanScheduledStrategyResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetVulScanScheduledStrategyResponseBody setCustomMatchGroup(java.util.List<GetVulScanScheduledStrategyResponseBodyCustomMatchGroup> customMatchGroup) {
        this.customMatchGroup = customMatchGroup;
        return this;
    }
    public java.util.List<GetVulScanScheduledStrategyResponseBodyCustomMatchGroup> getCustomMatchGroup() {
        return this.customMatchGroup;
    }

    public GetVulScanScheduledStrategyResponseBody setLastTriggerTime(Long lastTriggerTime) {
        this.lastTriggerTime = lastTriggerTime;
        return this;
    }
    public Long getLastTriggerTime() {
        return this.lastTriggerTime;
    }

    public GetVulScanScheduledStrategyResponseBody setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public GetVulScanScheduledStrategyResponseBody setMatchTargetIds(java.util.List<String> matchTargetIds) {
        this.matchTargetIds = matchTargetIds;
        return this;
    }
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

    public GetVulScanScheduledStrategyResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public GetVulScanScheduledStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulScanScheduledStrategyResponseBody setScanBeginTime(Integer scanBeginTime) {
        this.scanBeginTime = scanBeginTime;
        return this;
    }
    public Integer getScanBeginTime() {
        return this.scanBeginTime;
    }

    public GetVulScanScheduledStrategyResponseBody setScanEndTime(Integer scanEndTime) {
        this.scanEndTime = scanEndTime;
        return this;
    }
    public Integer getScanEndTime() {
        return this.scanEndTime;
    }

    public GetVulScanScheduledStrategyResponseBody setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
        return this;
    }
    public String getScanFrequency() {
        return this.scanFrequency;
    }

    public GetVulScanScheduledStrategyResponseBody setScanInterval(Integer scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }
    public Integer getScanInterval() {
        return this.scanInterval;
    }

    public GetVulScanScheduledStrategyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVulScanScheduledStrategyResponseBody setStrategyDescription(String strategyDescription) {
        this.strategyDescription = strategyDescription;
        return this;
    }
    public String getStrategyDescription() {
        return this.strategyDescription;
    }

    public GetVulScanScheduledStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public GetVulScanScheduledStrategyResponseBody setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public GetVulScanScheduledStrategyResponseBody setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class GetVulScanScheduledStrategyResponseBodyCustomMatchGroup extends TeaModel {
        /**
         * <p>The collection of organizational structure nodes.</p>
         */
        @NameInMap("Group")
        public java.util.List<String> group;

        /**
         * <p>The ID of the identity source.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-7c3f9a2e5b18****</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        public static GetVulScanScheduledStrategyResponseBodyCustomMatchGroup build(java.util.Map<String, ?> map) throws Exception {
            GetVulScanScheduledStrategyResponseBodyCustomMatchGroup self = new GetVulScanScheduledStrategyResponseBodyCustomMatchGroup();
            return TeaModel.build(map, self);
        }

        public GetVulScanScheduledStrategyResponseBodyCustomMatchGroup setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public GetVulScanScheduledStrategyResponseBodyCustomMatchGroup setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

    }

}
