// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVulScanScheduledStrategyRequest extends TeaModel {
    /**
     * <p>The matching mode for the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: The policy takes effect for all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: The policy takes effect only for users in specified user groups. In this case, UserGroupIds is required.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The policy priority. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The start hour during which the scan can be triggered. The value is an integer hour. Valid values: 0 to 23, inclusive. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanBeginTime")
    public String scanBeginTime;

    /**
     * <p>The end hour during which the scan can be triggered. The value is an integer hour. Valid values: 1 to 24, exclusive of the specified hour. The value must be greater than ScanBeginTime. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ScanEndTime")
    public String scanEndTime;

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
     * <p>The interval number of the trigger cycle, which determines the trigger cycle together with ScanFrequency. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is triggered once a week.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanInterval")
    public String scanInterval;

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
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>Execute vulnerability scanning on R&amp;D department endpoints every Sunday at midnight</p>
     */
    @NameInMap("StrategyDescription")
    public String strategyDescription;

    /**
     * <p>The policy name. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly_Vulnerability_Scanning_RD_Dept</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The IDs of the user groups for which the policy takes effect. This parameter is required when MatchMode is set to UserGroupNormal and must not be specified when MatchMode is set to UserGroupAll. The list must contain at least 1 and at most 100 entries. Duplicate entries are not allowed.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of exempt users. Users in this list are excluded from the scan of this policy. The list can contain up to 1000 entries. Duplicate entries are not allowed.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static CreateVulScanScheduledStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVulScanScheduledStrategyRequest self = new CreateVulScanScheduledStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateVulScanScheduledStrategyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateVulScanScheduledStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateVulScanScheduledStrategyRequest setScanBeginTime(String scanBeginTime) {
        this.scanBeginTime = scanBeginTime;
        return this;
    }
    public String getScanBeginTime() {
        return this.scanBeginTime;
    }

    public CreateVulScanScheduledStrategyRequest setScanEndTime(String scanEndTime) {
        this.scanEndTime = scanEndTime;
        return this;
    }
    public String getScanEndTime() {
        return this.scanEndTime;
    }

    public CreateVulScanScheduledStrategyRequest setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
        return this;
    }
    public String getScanFrequency() {
        return this.scanFrequency;
    }

    public CreateVulScanScheduledStrategyRequest setScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }
    public String getScanInterval() {
        return this.scanInterval;
    }

    public CreateVulScanScheduledStrategyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateVulScanScheduledStrategyRequest setStrategyDescription(String strategyDescription) {
        this.strategyDescription = strategyDescription;
        return this;
    }
    public String getStrategyDescription() {
        return this.strategyDescription;
    }

    public CreateVulScanScheduledStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CreateVulScanScheduledStrategyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateVulScanScheduledStrategyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
