// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVulScanScheduledStrategyRequest extends TeaModel {
    /**
     * <p>The matching mode for the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups. If this value is specified, UserGroupIds is required.</li>
     * </ul>
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
     * <p>The start hour when a scan can be triggered. The value must be an integer on the hour. Valid values: 0 to 23, inclusive. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanBeginTime")
    public String scanBeginTime;

    /**
     * <p>The end hour when a scan can be triggered. The value must be an integer on the hour. Valid values: 1 to 24, exclusive. The value must be greater than the value of ScanBeginTime. This field is not a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ScanEndTime")
    public String scanEndTime;

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
     * <p>Execute vulnerability scanning on R&amp;D department endpoints every Sunday morning</p>
     */
    @NameInMap("StrategyDescription")
    public String strategyDescription;

    /**
     * <p>The ID of the scheduled vulnerability scan policy to be modified. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: Queries scheduled vulnerability scan policies.</li>
     * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: Creates a scheduled vulnerability scan policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>The policy name. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly vulnerability scanning for the R&amp;D department</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The IDs of the user groups to which the policy applies. This parameter is required when MatchMode is set to UserGroupNormal and cannot be specified when MatchMode is set to UserGroupAll. You can specify 1 to 100 user group IDs, and the IDs cannot be duplicated. The specified IDs overwrite the existing user groups of the policy.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The user whitelist. Users in the whitelist are excluded from the scan of this policy. The whitelist can contain up to 1,000 users and cannot contain duplicates. This parameter overwrites the existing whitelist of the policy.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static UpdateVulScanScheduledStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVulScanScheduledStrategyRequest self = new UpdateVulScanScheduledStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVulScanScheduledStrategyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateVulScanScheduledStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateVulScanScheduledStrategyRequest setScanBeginTime(String scanBeginTime) {
        this.scanBeginTime = scanBeginTime;
        return this;
    }
    public String getScanBeginTime() {
        return this.scanBeginTime;
    }

    public UpdateVulScanScheduledStrategyRequest setScanEndTime(String scanEndTime) {
        this.scanEndTime = scanEndTime;
        return this;
    }
    public String getScanEndTime() {
        return this.scanEndTime;
    }

    public UpdateVulScanScheduledStrategyRequest setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
        return this;
    }
    public String getScanFrequency() {
        return this.scanFrequency;
    }

    public UpdateVulScanScheduledStrategyRequest setScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }
    public String getScanInterval() {
        return this.scanInterval;
    }

    public UpdateVulScanScheduledStrategyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateVulScanScheduledStrategyRequest setStrategyDescription(String strategyDescription) {
        this.strategyDescription = strategyDescription;
        return this;
    }
    public String getStrategyDescription() {
        return this.strategyDescription;
    }

    public UpdateVulScanScheduledStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateVulScanScheduledStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public UpdateVulScanScheduledStrategyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateVulScanScheduledStrategyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
