// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibDistributeTaskRequest extends TeaModel {
    /**
     * <p>The IDs of the terminal devices. Duplicate IDs are not allowed. A single ID can be up to 1,000 characters in length. This parameter is required when MatchMode is set to DevTagNormal. If MatchMode is set to other values, this parameter must not be specified. Otherwise, the request is rejected.</p>
     */
    @NameInMap("DevTags")
    public java.util.List<String> devTags;

    /**
     * <p>The IDs of the device groups. Duplicate IDs are not allowed. This parameter is required when MatchMode is set to DeviceGroupNormal. If MatchMode is set to other values, this parameter must not be specified. Otherwise, the request is rejected. You can obtain the values by calling the <a href="~~ListDeviceGroups~~">ListDeviceGroups</a> operation.</p>
     */
    @NameInMap("DeviceGroupIds")
    public java.util.List<String> deviceGroupIds;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li><strong>Once</strong>: Immediate execution.</li>
     * <li><strong>Schedule</strong>: Scheduled execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("ExecuteMode")
    public String executeMode;

    /**
     * <p>The scheduled execution parameters. The value is a JSON-formatted string.</p>
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
     * <p>The execution cycle of the task. The value is a JSON-formatted string. The validType field specifies the cycle type. Valid values:</p>
     * <ul>
     * <li><strong>Once</strong>: Single execution.</li>
     * <li><strong>Interval</strong>: Interval-based execution.</li>
     * <li><strong>Weekly</strong>: Weekly execution.</li>
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
     * <li><strong>Expire</strong>: The task expires at the time specified by GmtExpired.</li>
     * <li><strong>Never</strong>: The task never expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Expire</p>
     */
    @NameInMap("ExpireMode")
    public String expireMode;

    /**
     * <p>The expiration time of the task. The value is a UNIX timestamp in milliseconds. This parameter takes effect only when ExpireMode is set to Expire.</p>
     * 
     * <strong>example:</strong>
     * <p>1786945543000</p>
     */
    @NameInMap("GmtExpired")
    public String gmtExpired;

    /**
     * <p>The target type for policy matching. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: All users.</li>
     * <li><strong>UserGroupNormal</strong>: Specified user groups.</li>
     * <li><strong>DevTagNormal</strong>: Specified devices.</li>
     * <li><strong>DeviceGroupNormal</strong>: Specified device groups.</li>
     * <li><strong>DevTagAll</strong>: All devices.</li>
     * <li><strong>None</strong>: Not configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The name of the task. The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of retries after the task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RetryTimes")
    public String retryTimes;

    /**
     * <p>The name of the administrator account used to execute the task in Windows. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("RunAsAccount")
    public String runAsAccount;

    /**
     * <p>The ID of the software in the software library. You can obtain the value by calling the <a href="~~ListSoftwarelibSoftware~~">ListSoftwarelibSoftware</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-software-9f9de7b5a16f****</p>
     */
    @NameInMap("SoftwareId")
    public String softwareId;

    /**
     * <p>The name of the software. The name can be up to 128 characters in length.</p>
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
     * <li><strong>Mac(Apple)</strong>: macOS on Apple silicon.</li>
     * <li><strong>Mac(Intel)</strong>: macOS on Intel processors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Mac(Apple)</p>
     */
    @NameInMap("SupportOs")
    public String supportOs;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>server</strong>: Tasks delivered from the console.</li>
     * <li><strong>client</strong>: Tasks initiated by the client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>server</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The timeout period for task execution. Unit: seconds. For example, a value of 3600 indicates 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public String timeout;

    /**
     * <p>The IDs of the user groups. Duplicate IDs are not allowed. This parameter is required and must contain at least one ID when MatchMode is set to UserGroupNormal. If MatchMode is set to other values, this parameter must not be specified. Otherwise, the request is rejected. You can obtain the values by calling the <a href="~~ListUserGroups~~">ListUserGroups</a> operation.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The ID of the software version to be distributed. When you create a software version, you can obtain the value from the VersionId response parameter of the <a href="~~CreateSoftwarelibVersion~~">CreateSoftwarelibVersion</a> operation. For more information about how to view and manage software versions, see <a href="https://www.alibabacloud.com/help/en/sase/user-guide/software-management">Software management</a>.</p>
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
