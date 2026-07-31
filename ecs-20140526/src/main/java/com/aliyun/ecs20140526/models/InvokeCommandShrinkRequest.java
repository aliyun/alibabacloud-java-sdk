// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandShrinkRequest extends TeaModel {
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
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> are supported to specify the container runtime.</p>
     * <p>Usage notes:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container of the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can be run only on Linux instances that have Cloud Assistant Agent 2.2.3.344 or later installed.</p>
     * <ul>
     * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>To upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command is run only by the default user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of a script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * <p>Usage notes:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container of the instance.</p>
     * </li>
     * <li><p>If you specify this parameter, the command can be run only on Linux instances that have Cloud Assistant Agent 2.2.3.344 or later installed.</p>
     * <ul>
     * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>To upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command is run only by the default user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of a script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule on which the command is run. Three types of scheduled execution are supported: fixed interval (Rate expression-based), one-time execution at a specified time, and clock-based scheduling (Cron expression-based).</p>
     * <ul>
     * <li><p>Fixed interval execution: Based on a Rate expression, the command is run at a set interval. The interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This is suitable for scenarios that require execution at fixed intervals. Format: <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to run the command every 5 minutes, use <code>rate(5m)</code>. Fixed interval execution has the following limits:</p>
     * <ul>
     * <li>The interval must not exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The interval is based on a fixed frequency and is unrelated to the actual execution time of the task. For example, if the command is set to run every 5 minutes and the task takes 2 minutes to complete, the next round starts 3 minutes after the task completes.</li>
     * <li>The task is not run immediately upon creation. For example, if the command is set to run every 5 minutes, it does not run immediately when the task is created. Instead, it starts running 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: The command is run once at the specified time zone and time. Format: <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If no time zone is specified, UTC is used by default. The time zone can be specified in the following formats:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> or <code>America/Los_Angeles</code>.</li>
     * <li>GMT offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> or <code>GMT-7:00</code>. When using the GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to run the command once at 13:15:30 on June 6, 2022 in the Asia/Shanghai time zone, use: <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To run the command once at 13:15:30 on June 6, 2022 in GMT-7:00, use: <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduling (Cron expression-based): Based on a Cron expression, the command is run according to the specified schedule. Format: <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>. The scheduled execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the system time zone of the instance running the scheduled task is used. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone can be specified in the following formats:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> or <code>America/Los_Angeles</code>.</li>
     * <li>GMT offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> or <code>GMT-7:00</code>. When using the GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.
     * For example, to run the command once a day at 10:15 in the Asia/Shanghai time zone in 2022, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run the command every 30 minutes from 10:00 to 11:30 every day in GMT+8:00 in 2022, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in UTC, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
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
     * <p>The list of instances on which to run the command. You can specify up to 100 instance IDs. Valid values of N: 1 to 100.</p>
     * <p>You can also apply for a quota increase in Quota Center (quota name: Maximum number of instances supported for command execution).</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6n****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The bootstrap program for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The OSS delivery configuration for command execution output.</p>
     * <ul>
     * <li>Format: oss://${BucketName}/${Prefix}, where ${BucketName} is the name of the destination OSS bucket and ${Prefix} is the directory prefix for delivery.</li>
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
     * <p>The key-value pairs of custom parameters to pass in when the custom parameter feature is enabled. The number of custom parameters ranges from 0 to 10.</p>
     * <ul>
     * <li>Map keys cannot be empty strings and can be up to 64 characters in length.</li>
     * <li>Map values can be empty strings.</li>
     * <li>After Base64 encoding, the total length of the custom parameters and the original command content cannot exceed 18 KB.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed in, you can use empty strings as substitutes.</li>
     * </ul>
     * <p>You can unset this parameter to disable custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI************&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

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
     * <li>Once: immediately runs the command.</li>
     * <li>Period: runs the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: automatically runs the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically runs the command every time the instance starts.</li>
     * <li>DryRun: performs a dry run of the request without actually running the command. The dry run checks request parameters, instance execution environment, and Cloud Assistant Agent status.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
     * <li>If you specify the <code>Frequency</code> parameter, the command is run on a schedule regardless of whether you set this parameter. The value is treated as <code>Period</code>.</li>
     * </ul>
     * <p>Usage notes:</p>
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
     * <p>The tags used to filter instances. You can run a command in batches on instances that have the same tag without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<InvokeCommandShrinkRequestResourceTag> resourceTag;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandShrinkRequestTag> tag;

    /**
     * <p>The mode in which the task is stopped (manually stopped or interrupted due to timeout). Valid values:</p>
     * <ul>
     * <li>Process: stops the current script process.</li>
     * <li>ProcessTree: stops the current process tree (the script process and all child processes it created).</li>
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
     * <li><p>The value must be at least 10 seconds.</p>
     * </li>
     * <li><p>If the command cannot be run due to process issues, missing modules, or missing Cloud Assistant Agent, a timeout occurs. When a timeout occurs, the command process is forcefully terminated.</p>
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
     * <p>The username used to run the command on the ECS instance. The username can be up to 255 characters in length.</p>
     * <ul>
     * <li>For Linux instances, the root user is used by default.</li>
     * <li>For Windows instances, the System user is used by default.</li>
     * </ul>
     * <p>You can also specify another existing user on the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password for the user who executes the command on a Windows instance. The name can be up to 255 characters in length.</p>
     * <p>To execute a command as a non-default user (System) on a Windows instance, you must specify both <code>Username</code> and this parameter. To reduce the risk of password leaks, store the plaintext password in the parameter repository of operations management, and pass in only the password name here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to execute Cloud Assistant commands</a>.</p>
     * <blockquote>
     * <p>This parameter is not required when you use the root user on a Linux instance or the System user on a Windows instance to execute the command.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The directory in which the command is run on the ECS instance. The value can be up to 200 characters in length.</p>
     * <ul>
     * <li>If you do not specify this parameter, the working directory specified when the command was created is used.</li>
     * <li>This value applies only to the current command execution and does not change the working directory of the command itself.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/home/user</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static InvokeCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandShrinkRequest self = new InvokeCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvokeCommandShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InvokeCommandShrinkRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public InvokeCommandShrinkRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public InvokeCommandShrinkRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public InvokeCommandShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public InvokeCommandShrinkRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public InvokeCommandShrinkRequest setLauncher(String launcher) {
        this.launcher = launcher;
        return this;
    }
    public String getLauncher() {
        return this.launcher;
    }

    public InvokeCommandShrinkRequest setOssOutputDelivery(String ossOutputDelivery) {
        this.ossOutputDelivery = ossOutputDelivery;
        return this;
    }
    public String getOssOutputDelivery() {
        return this.ossOutputDelivery;
    }

    public InvokeCommandShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public InvokeCommandShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public InvokeCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public InvokeCommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InvokeCommandShrinkRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public InvokeCommandShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InvokeCommandShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public InvokeCommandShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public InvokeCommandShrinkRequest setResourceTag(java.util.List<InvokeCommandShrinkRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<InvokeCommandShrinkRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public InvokeCommandShrinkRequest setTag(java.util.List<InvokeCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InvokeCommandShrinkRequestTag> getTag() {
        return this.tag;
    }

    public InvokeCommandShrinkRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
    }

    public InvokeCommandShrinkRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public InvokeCommandShrinkRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public InvokeCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public InvokeCommandShrinkRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public InvokeCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class InvokeCommandShrinkRequestResourceTag extends TeaModel {
        /**
         * <p>The tag key used to filter instances.</p>
         * <p>Usage notes:</p>
         * <ul>
         * <li><p>This parameter conflicts with the InstanceId parameter. You cannot specify both parameters at the same time.</p>
         * </li>
         * <li><p>Valid values of N: 1 to 10. The tag key cannot be an empty string once specified.</p>
         * </li>
         * <li><p>The number of instances with the specified tag cannot exceed the limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
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
         * <p>Usage notes:</p>
         * <ul>
         * <li>Valid values of N: 1 to 10.</li>
         * <li>The tag value can be an empty string.</li>
         * <li>The tag value can be up to 128 characters in length and cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static InvokeCommandShrinkRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            InvokeCommandShrinkRequestResourceTag self = new InvokeCommandShrinkRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public InvokeCommandShrinkRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InvokeCommandShrinkRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeCommandShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command execution. Valid values of N: 1 to 20. The tag key cannot be an empty string once specified.</p>
         * <p>If you use a single tag to filter resources, the number of resources with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the number of resources that are attached with all specified tags cannot exceed 1,000. If the number of resources exceeds 1,000, execute the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static InvokeCommandShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            InvokeCommandShrinkRequestTag self = new InvokeCommandShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public InvokeCommandShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InvokeCommandShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
