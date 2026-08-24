// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command ID. You can call <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> to query all available command IDs. </p>
     * <blockquote>
     * <p>You can run public commands by specifying the command name. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run Cloud Assistant public commands</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-e996287206324975b5fbe1d****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. You can use the <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix to specify the container runtime.</p>
     * <p>Precautions:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant executes the script in the specified container of the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can only run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
     * <ul>
     * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>To upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be executed by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only Shell scripts can be executed in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of the script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The container name.</p>
     * <p>Precautions:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant executes the script in the specified container of the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can only run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
     * <ul>
     * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>To upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be executed by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only Shell scripts can be executed in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of the script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule on which the command is executed. Three types of scheduled execution are supported: fixed interval (based on a Rate expression), one-time execution at a specified time, and clock-based scheduling (based on a Cron expression).</p>
     * <ul>
     * <li><p>Fixed interval execution: Based on a Rate expression, the command is executed at a set interval. The interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This is suitable for scenarios that require execution at fixed intervals. Format: <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to execute every 5 minutes, use <code>rate(5m)</code>. Fixed interval execution has the following limits:</p>
     * <ul>
     * <li>The interval must not exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The execution interval is based on a fixed frequency and is unrelated to the actual execution time of the task. For example, if the command is set to execute every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task completes.</li>
     * <li>The task is not executed immediately upon creation. For example, if the command is set to execute every 5 minutes, the first execution starts 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: The command is executed once at the specified time zone and time. Format: <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If no time zone is specified, UTC is used by default. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute once at 13:15:30 on June 6, 2022 in China/Shanghai time, use: <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To execute once at 13:15:30 on June 6, 2022 in the West 7th time zone, use: <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduling (based on a Cron expression): Based on a Cron expression, the command is executed according to the scheduled task settings. Format: <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, that is, <code>&lt;Cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the system time zone of the instance running the scheduled task is used. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.
     * For example, to execute once at 10:15 every day in 2022 in China/Shanghai time, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To execute every 30 minutes from 10:00 to 11:30 every day in 2022 in the East 8th time zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To execute every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in UTC, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <blockquote>
     * <p>The minimum interval must be greater than or equal to the timeout period of the scheduled task and no less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The list of instances on which to execute the command. You can specify up to 100 instance IDs. Valid values of N: 1 to 100.</p>
     * <p>You can also apply for a quota increase in Quota Center (quota name: Maximum number of instances supported for command execution).</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6n****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The bootstrap program for script execution. The length cannot exceed 1 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The OSS delivery configuration for command execution output.</p>
     * <ul>
     * <li>Format: oss://${BucketName}/${Prefix}, where ${BucketName} is the name of the OSS bucket to deliver to, and ${Prefix} is the directory prefix to deliver to.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://testBucket/testPrefix</p>
     */
    @NameInMap("OssOutputDelivery")
    public String ossOutputDelivery;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of custom parameters to pass in when executing the command with the custom parameter feature enabled. The number of custom parameters ranges from 0 to 10.</p>
     * <ul>
     * <li>Map keys cannot be empty strings and can contain up to 64 characters.</li>
     * <li>Map values can be empty strings.</li>
     * <li>After Base64 encoding, the total length of custom parameters and the original command content cannot exceed 24 KB.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed in, you can use an empty string as a substitute.</li>
     * </ul>
     * <p>You can disable custom parameters by not setting this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI************&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution mode of the command. Valid values:</p>
     * <ul>
     * <li>Once: immediately executes the command.</li>
     * <li>Period: executes the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: automatically executes the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically executes the command every time the instance starts.</li>
     * <li>DryRun: only performs a dry run of the request. The command is not actually executed. The dry run checks request parameters, the instance execution environment, and the Cloud Assistant Agent running status.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
     * <li>If you specify the <code>Frequency</code> parameter, the command is executed as <code>Period</code> regardless of whether this parameter is set.</li>
     * </ul>
     * <p>Precautions:</p>
     * <ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> to stop a pending or scheduled command.</li>
     * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> and specify <code>IncludeHistory=true</code> to view the execution history of the scheduled command.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group for the command execution. When you specify this parameter:</p>
     * <ul>
     * <li><p>The ECS instance specified by InstanceId must belong to this resource group if the instance is not in the default resource group.</p>
     * </li>
     * <li><p>You can filter command execution results by specifying this parameter (by calling <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a>).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags used to filter instances. You can run commands in batches on instances with the same tag without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<InvokeCommandRequestResourceTag> resourceTag;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandRequestTag> tag;

    /**
     * <p>The mode for stopping the task (manual stop or timeout interruption). Valid values:</p>
     * <ul>
     * <li>Process: stops the current script process.</li>
     * <li>ProcessTree: stops the current process tree (the collection of the script process and all child processes it created).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <blockquote>
     * <p>This parameter is deprecated and has no effect if specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command execution. Unit: seconds.</p>
     * <ul>
     * <li><p>The value cannot be less than 10 seconds.</p>
     * </li>
     * <li><p>If the command cannot run due to process issues, missing modules, or missing Cloud Assistant Agent, a timeout occurs. When a timeout occurs, the command process is forcefully terminated.</p>
     * </li>
     * <li><p>If this value is not set, the timeout period specified when the command was created is used.</p>
     * </li>
     * <li><p>This value only applies as the timeout period for this command execution and does not change the timeout period of the command itself.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The username used to execute the command on the ECS instance. The length cannot exceed 255 characters.</p>
     * <ul>
     * <li>For Linux instances, the command is executed as the root user by default.</li>
     * <li>For Windows instances, the command is executed as the System user by default.</li>
     * </ul>
     * <p>You can also specify another existing user on the instance to execute the command. Executing Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password for the user who executes the command on a Windows instance. The length cannot exceed 255 characters.</p>
     * <p>When you want to execute a command as a non-default user (System) on a Windows instance, you must specify both <code>Username</code> and this parameter. To reduce the risk of password leaks, the plaintext password must be stored in the parameter repository of CloudOps Orchestration Service. Only the password name is passed in here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for a regular user to run Cloud Assistant commands</a>.</p>
     * <blockquote>
     * <p>This parameter is not required when you execute a command as the root user on a Linux instance or the System user on a Windows instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The directory in which the command is executed on the ECS instance. The length cannot exceed 200 characters.</p>
     * <ul>
     * <li>If this value is not set, the working directory specified when the command was created is used.</li>
     * <li>This value only applies as the working directory for this command execution and does not change the working directory of the command itself.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/home/user</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static InvokeCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandRequest self = new InvokeCommandRequest();
        return TeaModel.build(map, self);
    }

    public InvokeCommandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InvokeCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public InvokeCommandRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public InvokeCommandRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public InvokeCommandRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public InvokeCommandRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public InvokeCommandRequest setLauncher(String launcher) {
        this.launcher = launcher;
        return this;
    }
    public String getLauncher() {
        return this.launcher;
    }

    public InvokeCommandRequest setOssOutputDelivery(String ossOutputDelivery) {
        this.ossOutputDelivery = ossOutputDelivery;
        return this;
    }
    public String getOssOutputDelivery() {
        return this.ossOutputDelivery;
    }

    public InvokeCommandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public InvokeCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public InvokeCommandRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public InvokeCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InvokeCommandRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public InvokeCommandRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InvokeCommandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public InvokeCommandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public InvokeCommandRequest setResourceTag(java.util.List<InvokeCommandRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<InvokeCommandRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public InvokeCommandRequest setTag(java.util.List<InvokeCommandRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InvokeCommandRequestTag> getTag() {
        return this.tag;
    }

    public InvokeCommandRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
    }

    public InvokeCommandRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public InvokeCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public InvokeCommandRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public InvokeCommandRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public InvokeCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class InvokeCommandRequestResourceTag extends TeaModel {
        /**
         * <p>The tag key used to filter instances.</p>
         * <p>Precautions:</p>
         * <ul>
         * <li><p>This parameter conflicts with the InstanceId parameter. You cannot specify both parameters at the same time.</p>
         * </li>
         * <li><p>Valid values of N: 1 to 10. The tag key cannot be an empty string once specified.</p>
         * </li>
         * <li><p>The number of instances with the tag cannot exceed the limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
         * </li>
         * <li><p>The tag key can be up to 64 characters in length and cannot start with aliyun or acs:, or contain http:// or https://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value used to filter instances.</p>
         * <p>Precautions:</p>
         * <ul>
         * <li>Valid values of N: 1 to 10.</li>
         * <li>The value can be an empty string.</li>
         * <li>The tag value can be up to 128 characters in length and cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static InvokeCommandRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            InvokeCommandRequestResourceTag self = new InvokeCommandRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public InvokeCommandRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InvokeCommandRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeCommandRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command execution. Valid values of N: 1 to 20. The tag key cannot be an empty string once specified.</p>
         * <p>If you use a single tag to filter resources, the resource count with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count with all specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, execute the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. Valid values of N: 1 to 20. The value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static InvokeCommandRequestTag build(java.util.Map<String, ?> map) throws Exception {
            InvokeCommandRequestTag self = new InvokeCommandRequestTag();
            return TeaModel.build(map, self);
        }

        public InvokeCommandRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InvokeCommandRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
