// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The task expiration time, in seconds-level UNIX timestamp. After this time, endpoints no longer pull and execute this task. If this parameter is not specified or the specified time is earlier than the current time, the value defaults to the current time plus 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>1786377600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The action to take on high-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
     * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarantine</p>
     */
    @NameInMap("HighRiskOperation")
    public String highRiskOperation;

    /**
     * <p>The action to take on low-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
     * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
     * <li><strong>None</strong>: take no action.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("LowRiskOperation")
    public String lowRiskOperation;

    /**
     * <p>The matching mode for the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: applies only to users in specified user groups. UserGroupIds is required when this value is specified.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The maximum percentage of endpoint CPU usage during scanning. Valid values: 0 to 100. If this parameter is not specified or is set to 0, the default value is determined by PerformanceMode: 50 for SecurityFirst, 30 for Balance, and 15 for ExperienceFirst.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxCpuUsage")
    public Long maxCpuUsage;

    /**
     * <p>The action to take on medium-risk virus files. Valid values:</p>
     * <ul>
     * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
     * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Notify</p>
     */
    @NameInMap("MidRiskOperation")
    public String midRiskOperation;

    /**
     * <p>The scan performance pattern. Valid values:</p>
     * <ul>
     * <li><strong>SecurityFirst</strong>: security first. The default CPU usage limit is 50%.</li>
     * <li><strong>Balance</strong>: balanced. The default CPU usage limit is 30%.</li>
     * <li><strong>ExperienceFirst</strong>: experience first. The default CPU usage limit is 15%.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Balance</p>
     */
    @NameInMap("PerformanceMode")
    public String performanceMode;

    /**
     * <p>The scan path scope. Valid values:</p>
     * <ul>
     * <li><strong>Quick</strong>: quick scan. Only system critical directories and common risk locations are scanned.</li>
     * <li><strong>Full</strong>: full disk scan.</li>
     * <li><strong>Custom</strong>: custom path scan. ScanPath is required when this value is specified.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Quick</p>
     */
    @NameInMap("ScanMode")
    public String scanMode;

    /**
     * <p>The collection of custom scan paths. This parameter is required when ScanMode is set to Custom and cannot be specified when ScanMode is set to Quick or Full. A maximum of 100 paths can be specified. Duplicate values are not allowed.</p>
     */
    @NameInMap("ScanPath")
    public java.util.List<String> scanPath;

    /**
     * <p>The collection of virus types to be handled in this scan. At least one type must be specified. Duplicate values are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScanTargets")
    public java.util.List<String> scanTargets;

    /**
     * <p>The task description. The description can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), commas (,), semicolons (;), forward slashes (/), at signs (@), hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Full scan for R&amp;D department</p>
     */
    @NameInMap("TaskDescription")
    public String taskDescription;

    /**
     * <p>The collection of user group IDs to which the task applies. This parameter is required when MatchMode is set to UserGroupNormal and cannot be specified when MatchMode is set to UserGroupAll. At least 1 and at most 100 IDs can be specified. Duplicate values are not allowed.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of exempt users. Users in this list do not execute this scan task. A maximum of 1000 users can be specified. Duplicate values are not allowed.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static CreateVirusScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanTaskRequest self = new CreateVirusScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateVirusScanTaskRequest setHighRiskOperation(String highRiskOperation) {
        this.highRiskOperation = highRiskOperation;
        return this;
    }
    public String getHighRiskOperation() {
        return this.highRiskOperation;
    }

    public CreateVirusScanTaskRequest setLowRiskOperation(String lowRiskOperation) {
        this.lowRiskOperation = lowRiskOperation;
        return this;
    }
    public String getLowRiskOperation() {
        return this.lowRiskOperation;
    }

    public CreateVirusScanTaskRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateVirusScanTaskRequest setMaxCpuUsage(Long maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
        return this;
    }
    public Long getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    public CreateVirusScanTaskRequest setMidRiskOperation(String midRiskOperation) {
        this.midRiskOperation = midRiskOperation;
        return this;
    }
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    public CreateVirusScanTaskRequest setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
        return this;
    }
    public String getPerformanceMode() {
        return this.performanceMode;
    }

    public CreateVirusScanTaskRequest setScanMode(String scanMode) {
        this.scanMode = scanMode;
        return this;
    }
    public String getScanMode() {
        return this.scanMode;
    }

    public CreateVirusScanTaskRequest setScanPath(java.util.List<String> scanPath) {
        this.scanPath = scanPath;
        return this;
    }
    public java.util.List<String> getScanPath() {
        return this.scanPath;
    }

    public CreateVirusScanTaskRequest setScanTargets(java.util.List<String> scanTargets) {
        this.scanTargets = scanTargets;
        return this;
    }
    public java.util.List<String> getScanTargets() {
        return this.scanTargets;
    }

    public CreateVirusScanTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public CreateVirusScanTaskRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateVirusScanTaskRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
