// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibDistributeTaskRequest extends TeaModel {
    /**
     * <p>The collection of terminal device IDs. Duplicate values are not allowed. Each ID must not exceed 1000 characters in length. This parameter is required when MatchMode is set to DevTagNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected.</p>
     */
    @NameInMap("DevTags")
    public java.util.List<String> devTags;

    /**
     * <p>The collection of device group IDs. Duplicate values are not allowed. This parameter is required when MatchMode is set to DeviceGroupNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected. You can call <a href="~~ListDeviceGroups~~">ListDeviceGroups</a> to obtain the values.</p>
     */
    @NameInMap("DeviceGroupIds")
    public java.util.List<String> deviceGroupIds;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li><strong>Once</strong>: immediate execution.</li>
     * <li><strong>Schedule</strong>: scheduled execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>The scheduling execution parameters in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;template_code&quot;: &quot;software_install&quot;,
     *     &quot;software_url&quot;: &quot;https://****&quot;,
     *     &quot;md5&quot;: &quot;87ccfcce1956e9f2385137f690d7fb64&quot;,
     *     &quot;install_check_switch&quot;: false,
     *     &quot;software_name&quot;: &quot;&quot;,
     *     &quot;software_name_en&quot;: &quot;&quot;,
     *     &quot;speed_limit&quot;: 0,
     *     &quot;software_id&quot;: &quot;softwarelib-software-18a2417da2779e65&quot;
     * }</p>
     */
    @NameInMap("ExecuteParameters")
    public String executeParameters;

    /**
     * <p>The task execution cycle in JSON format. The validType field specifies the cycle type. Valid values:</p>
     * <ul>
     * <li><strong>Once</strong>: one-time execution.</li>
     * <li><strong>Interval</strong>: execution at intervals.</li>
     * <li><strong>Weekly</strong>: weekly execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;validType&quot;:&quot;Once&quot;}</p>
     */
    @NameInMap("ExecutePeriod")
    public String executePeriod;

    /**
     * <p>The expiration type. Valid values:</p>
     * <ul>
     * <li><strong>Expire</strong>: expires at the time specified by GmtExpired.</li>
     * <li><strong>Never</strong>: never expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Expire</p>
     */
    @NameInMap("ExpireMode")
    public String expireMode;

    /**
     * <p>The task expiration time as a millisecond-level UNIX timestamp. This parameter takes effect only when ExpireMode is set to Expire.</p>
     * 
     * <strong>example:</strong>
     * <p>1786945543000</p>
     */
    @NameInMap("GmtExpired")
    public String gmtExpired;

    /**
     * <p>The policy matching target type. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: all users.</li>
     * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
     * <li><strong>DevTagNormal</strong>: specified devices.</li>
     * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
     * <li><strong>DevTagAll</strong>: all devices.</li>
     * <li><strong>None</strong>: not configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The task name. The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of retries after a task failure.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RetryTimes")
    public String retryTimes;

    /**
     * <p>The administrator account name used to run the task on Windows. The name must not exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("RunAsAccount")
    public String runAsAccount;

    /**
     * <p>The software ID in the software library. You can call <a href="~~ListSoftwarelibSoftware~~">ListSoftwarelibSoftware</a> to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-software-9f9de7b5a16f****</p>
     */
    @NameInMap("SoftwareId")
    public String softwareId;

    /**
     * <p>The software name. The name must not exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test software</p>
     */
    @NameInMap("SoftwareName")
    public String softwareName;

    /**
     * <p>The operating system to which the task applies. Only a single value is supported. Valid values:</p>
     * <ul>
     * <li><strong>Windows</strong>: Windows.</li>
     * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
     * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Mac(Apple)</p>
     */
    @NameInMap("SupportOs")
    public String supportOs;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>server</strong>: a task delivered from the console.</li>
     * <li><strong>client</strong>: a task initiated from the client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>server</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The task execution timeout period. Unit: seconds. For example, a value of 3600 indicates 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public String timeout;

    /**
     * <p>The collection of user group IDs. Duplicate values are not allowed. This parameter is required and must contain at least one value when MatchMode is set to UserGroupNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected. You can call <a href="~~ListUserGroups~~">ListUserGroups</a> to obtain the values.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The ID of the software version to distribute. You can call <a href="~~ListSoftwarelibVersion~~">ListSoftwarelibVersion</a> to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-version-30925615d2e4****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateSoftwarelibDistributeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibDistributeTaskRequest self = new CreateSoftwarelibDistributeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibDistributeTaskRequest setDevTags(java.util.List<String> devTags) {
        this.devTags = devTags;
        return this;
    }
    public java.util.List<String> getDevTags() {
        return this.devTags;
    }

    public CreateSoftwarelibDistributeTaskRequest setDeviceGroupIds(java.util.List<String> deviceGroupIds) {
        this.deviceGroupIds = deviceGroupIds;
        return this;
    }
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

    public CreateSoftwarelibDistributeTaskRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public CreateSoftwarelibDistributeTaskRequest setExecuteParameters(String executeParameters) {
        this.executeParameters = executeParameters;
        return this;
    }
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    public CreateSoftwarelibDistributeTaskRequest setExecutePeriod(String executePeriod) {
        this.executePeriod = executePeriod;
        return this;
    }
    public String getExecutePeriod() {
        return this.executePeriod;
    }

    public CreateSoftwarelibDistributeTaskRequest setExpireMode(String expireMode) {
        this.expireMode = expireMode;
        return this;
    }
    public String getExpireMode() {
        return this.expireMode;
    }

    public CreateSoftwarelibDistributeTaskRequest setGmtExpired(String gmtExpired) {
        this.gmtExpired = gmtExpired;
        return this;
    }
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    public CreateSoftwarelibDistributeTaskRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateSoftwarelibDistributeTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSoftwarelibDistributeTaskRequest setRetryTimes(String retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public String getRetryTimes() {
        return this.retryTimes;
    }

    public CreateSoftwarelibDistributeTaskRequest setRunAsAccount(String runAsAccount) {
        this.runAsAccount = runAsAccount;
        return this;
    }
    public String getRunAsAccount() {
        return this.runAsAccount;
    }

    public CreateSoftwarelibDistributeTaskRequest setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
        return this;
    }
    public String getSoftwareId() {
        return this.softwareId;
    }

    public CreateSoftwarelibDistributeTaskRequest setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }
    public String getSoftwareName() {
        return this.softwareName;
    }

    public CreateSoftwarelibDistributeTaskRequest setSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }
    public String getSupportOs() {
        return this.supportOs;
    }

    public CreateSoftwarelibDistributeTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateSoftwarelibDistributeTaskRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public CreateSoftwarelibDistributeTaskRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateSoftwarelibDistributeTaskRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
