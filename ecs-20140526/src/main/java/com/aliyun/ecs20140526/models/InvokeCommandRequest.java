// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs. </p>
     * <blockquote>
     * <p>For public commands, you can run them by command name. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run Cloud Assistant public commands</a>.</p>
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
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can only be run on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</p>
     * <ul>
     * <li>For more information about how to view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
     * <li>For more information about how to upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable the upgrade of the Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify an interpreter for the script content by using a command such as <code>#!/usr/bin/python</code> at the beginning of the script. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can only be run on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</p>
     * <ul>
     * <li>For more information about how to view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
     * <li>For more information about how to upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable the upgrade of the Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify an interpreter for the script content by using a command such as <code>#!/usr/bin/python</code> at the beginning of the script. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The execution time of the scheduled command. Three scheduled execution modes are supported: execution at fixed intervals (based on rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on cron expressions).</p>
     * <ul>
     * <li><p>Execution at fixed intervals: runs the command at a specified interval based on a rate expression. The interval can be set in seconds (s), minutes (m), hours (h), or days (d). This mode is suitable for scenarios where tasks are run at fixed intervals. The format is <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to run the command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to execution at fixed intervals:</p>
     * <ul>
     * <li>The specified interval must not exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The execution interval is based only on the fixed frequency and is independent of the actual time required to run the task. For example, if you set the command to run every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed.</li>
     * <li>The task is not run immediately upon creation. For example, if you set the command to run every 5 minutes, the command is not run immediately upon task creation, but starts 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: runs the command once at the specified time zone and time point. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If you do not specify a time zone, the UTC time zone is used by default. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: for example, <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: for example, <code>GMT+8:00</code> (East 8th zone) and <code>GMT-7:00</code> (West 7th zone). When you use the GMT format, leading zeros are not supported for the hour.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to run the command once at 13:15:30 on June 6, 2022 in the China/Shanghai time zone, use <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To run the command once at 13:15:30 on June 6, 2022 in the West 7th zone, use <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduled execution (based on cron expressions): runs the command based on a cron expression. The format is <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which is <code>&lt;cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated and executed based on the cron expression in the specified time zone. If you do not specify a time zone, the internal system time zone of the instance that runs the scheduled task is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: for example, <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: for example, <code>GMT+8:00</code> (East 8th zone) and <code>GMT-7:00</code> (West 7th zone). When you use the GMT format, leading zeros are not supported for the hour.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.
     * For example, to run the command once at 10:15 every day in 2022 in the China/Shanghai time zone, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run the command every half hour from 10:00 to 11:30 every day in 2022 in the East 8th zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in the UTC time zone, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <blockquote>
     * <p>The minimum specified time interval must be greater than or equal to the timeout period of the scheduled task and not less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The list of instance IDs on which the command is run. You can specify up to 100 instance IDs. Valid values of N: 1 to 100.</p>
     * <p>You can also apply for a quota increase in Quota Center. The quota name is the maximum number of instances supported for command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp185dy2o3o6n****&quot;]</p>
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
     * <p>The OSS data shipping configuration for the command execution output.</p>
     * <ul>
     * <li>Format: <code>oss://${BucketName}/${Prefix}</code>. <code>${BucketName}</code> is the name of the OSS bucket to which the data is shipped, and <code>${Prefix}</code> is the directory prefix to which the data is shipped.</li>
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
     * <p>The key-value pairs of custom parameters passed when the command is run if the custom parameter feature is enabled. The number of custom parameters ranges from 0 to 10.</p>
     * <ul>
     * <li>The key in the map cannot be an empty string and can be up to 64 characters in length.</li>
     * <li>The value in the map can be an empty string.</li>
     * <li>The total length of the custom parameters and the original command content cannot exceed 24 KB after Base64 encoding.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed, you can use an empty string instead.</li>
     * </ul>
     * <p>You can leave this parameter unspecified to disable custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI************&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li>Once: runs the command immediately.</li>
     * <li>Period: runs the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: automatically runs the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically runs the command every time the instance starts.</li>
     * <li>DryRun: only prechecks the request. The command is not actually run. The check items include the request parameters, instance execution environment, and Cloud Assistant Agent running status.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
     * <li>If you specify the <code>Frequency</code> parameter, the value is processed as <code>Period</code> regardless of whether this parameter is set.</li>
     * </ul>
     * <p>Precautions:</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop a pending or scheduled command.</li>
     * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation and set <code>IncludeHistory</code> to <code>true</code> to view the historical records of the scheduled command execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group in which the command is run. When you specify this parameter:</p>
     * <ul>
     * <li><p>If the ECS instance specified by InstanceId belongs to a non-default resource group, the ECS instance must belong to this resource group.</p>
     * </li>
     * <li><p>You can specify this parameter to filter the corresponding command execution results by calling the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation.</p>
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
     * <p>The list of tags used to filter instances. You can run the command on instances with the same tag in batches without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<InvokeCommandRequestResourceTag> resourceTag;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandRequestTag> tag;

    /**
     * <p>The mode used when the task is stopped (manually stopped or interrupted due to execution timeout). Valid values:</p>
     * <ul>
     * <li>Process: stops the current script process.</li>
     * <li>ProcessTree: stops the current process tree, which includes the script process and all its child processes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect even if it is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for running the command. Unit: seconds.</p>
     * <ul>
     * <li><p>The value cannot be less than 10.</p>
     * </li>
     * <li><p>A timeout occurs when the command cannot be run due to process issues, missing modules, or a missing Cloud Assistant Agent. After a timeout, the command process is forcibly terminated.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the timeout period specified when the command was created is used.</p>
     * </li>
     * <li><p>This value applies only to the current command execution and does not change the timeout period of the command itself.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The name of the user that runs the command on the ECS instance. The name can be up to 255 characters in length.</p>
     * <ul>
     * <li>For ECS instances that run Linux, the command is run by the root user by default.</li>
     * <li>For ECS instances that run Windows, the command is run by the System user by default.</li>
     * </ul>
     * <p>You can also specify another existing user on the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password for the user that executes the command on a Windows instance. The name can be up to 255 characters in length.</p>
     * <p>If you want to execute the command on a Windows instance as a non-default user (other than System), you must specify both <code>Username</code> and this parameter. To reduce the risk of password leakage, the plaintext password must be hosted in the parameter repository of System Operations Management. Here, you only pass the name of the password. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encrypt parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for regular users to execute Cloud Assistant commands</a>.</p>
     * <blockquote>
     * <p>You do not need to pass this parameter when you run the command as the root user on a Linux instance or the System user on a Windows instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The directory in which the command is run on the ECS instance. The length cannot exceed 200 characters.</p>
     * <ul>
     * <li>If you do not specify this parameter, the running directory specified when the command was created is used.</li>
     * <li>This value applies only to the current command execution and does not change the running directory of the command itself.</li>
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
         * <li><p>This parameter conflicts with the InstanceId parameter and cannot be specified at the same time.</p>
         * </li>
         * <li><p>Valid values of N: 1 to 10. The value cannot be an empty string.</p>
         * </li>
         * <li><p>The number of instances under the tag cannot exceed the limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
         * </li>
         * <li><p>The value can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <li>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
         * <p>The tag key for the command to execute. Valid values of N: 1 to 20. The value cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count under the tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources attached to all the specified tags cannot exceed 1,000. If the resource count exceeds 1,000, you must use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>The value can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. Valid values of N: 1 to 20. The value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
