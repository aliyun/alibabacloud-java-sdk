// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command content. The command content can be plaintext or Base64-encoded. Note the following items:</p>
     * <ul>
     * <li><p>The command content cannot exceed 24 KB after Base64 encoding. You can use <code>KeepCommand</code> to specify whether to retain the command.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, you must set <code>ContentEncoding=Base64</code>.</p>
     * </li>
     * <li><p>When <code>EnableParameter=true</code> is specified, the custom parameter feature is enabled in the command content:</p>
     * <ul>
     * <li>Define custom parameters by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter name within <code>{{}}</code> are ignored.</li>
     * <li>The number of custom parameters cannot exceed 20.</li>
     * <li>Custom parameter names can contain a-zA-Z0-9-_ combinations. The acs:: prefix for specifying non-built-in environment parameters is not supported. Other characters are not supported. Parameter names are case-insensitive.</li>
     * <li>Each custom parameter name cannot exceed 64 bytes.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters. When running the command, you do not need to manually assign values to these parameters because Cloud Assistant automatically replaces them with the corresponding values. The following built-in environment parameters are supported:</p>
     * <ul>
     * <li><code>{{ACS::RegionId}}</code>: The region ID.</li>
     * <li><code>{{ACS::AccountId}}</code>: The Alibaba Cloud account ID.</li>
     * <li><code>{{ACS::InstanceId}}</code>: The instance ID. When a command is sent to multiple instances and you want to use <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is no earlier than:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InstanceName}}</code>: The instance name. When a command is sent to multiple instances and you want to use <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is no earlier than:<ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InvokeId}}</code>: The invocation ID. To use <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is no earlier than:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::CommandId}}</code>: The command ID. When running a command by calling this operation and you want to use <code>{{ACS::CommandId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is no earlier than: <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyAxMjM=</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. The <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix can be used to explicitly specify the container runtime.</p>
     * <p>Precautions:</p>
     * <ul>
     * <li>If this parameter is specified, Cloud Assistant runs the script in the specified container on the instance.</li>
     * <li>If this parameter is specified, the command can only be run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</li>
     * <li>If this parameter is specified, the <code>Username</code> and <code>WorkingDir</code> parameters do not take effect. The command is run only as the default container user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>Only Shell scripts are supported in Linux containers. Specifying an interpreter at the beginning of the script in the format of <code>#!/usr/bin/python</code> is not supported. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </blockquote>
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
     * <li>If this parameter is specified, Cloud Assistant runs the script in the specified container on the instance.</li>
     * <li>If this parameter is specified, the command can only be run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</li>
     * <li>If this parameter is specified, the <code>Username</code> and <code>WorkingDir</code> parameters do not take effect. The command is run only as the default container user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>Only Shell scripts are supported in Linux containers. Specifying an interpreter at the beginning of the script in the format of <code>#!/usr/bin/python</code> is not supported. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The encoding method of the command content (<code>CommandContent</code>). Valid values (case-insensitive):</p>
     * <ul>
     * <li>PlainText: no encoding. The content is transmitted in plaintext.</li>
     * <li>Base64: Base64 encoding.</li>
     * </ul>
     * <p>Default value: PlainText. Invalid values are treated as PlainText.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The command description. All character sets are supported. The description cannot exceed 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the command contains custom parameters.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The schedule for running the command. Three scheduling methods are supported: execution at fixed intervals (based on Rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on Cron expressions).</p>
     * <ul>
     * <li><p>Execution at fixed intervals: Based on Rate expressions, the command is run at the specified interval. The interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This method is applicable to scenarios where tasks are run at fixed intervals. Format: <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to run a command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to fixed-interval execution:</p>
     * <ul>
     * <li>The interval must be no greater than 7 days and no less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The interval is based on a fixed frequency and is not related to the actual execution time of the task. For example, if a command is set to run every 5 minutes and the task takes 2 minutes to complete, the next round starts 3 minutes after the task is completed.</li>
     * <li>The task is not run immediately upon creation. For example, if a command is set to run every 5 minutes, the command is not run immediately when the task is created. Instead, execution starts 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: The command is run once at the specified time zone and time point. Format: <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If no time zone is specified, UTC is used by default. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Full time zone name: such as <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using the GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to run a command once at 13:15:30 on June 6, 2022 in China/Shanghai time, use: <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To run a command once at 13:15:30 on June 6, 2022 in the West 7th time zone, use: <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduled execution (based on Cron expressions): Based on Cron expressions, the command is run according to the scheduled task settings. Format: <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, i.e., <code>&lt;Cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the system time zone of the instance running the scheduled task is used by default. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Full time zone name: such as <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using the GMT format, leading zeros are not supported in the hour field.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.
     * For example, to run a command once every day at 10:15 AM in China/Shanghai time in 2022, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run a command every 30 minutes from 10:00 AM to 11:30 AM every day in the East 8th time zone in 2022, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run a command every 5 minutes from 2:00 PM to 2:55 PM every day in October every two years starting from 2022 in UTC, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
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
     * <p>The instance ID array of ECS instances. Array length: 1 to 100.</p>
     * <p>If any of the specified instances does not meet the execution conditions, you must reselect the instances.</p>
     * <p>You can also request a quota increase in Quota Center (quota name: Maximum number of instances supported for command execute).</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6neg****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after execution. Valid values:</p>
     * <ul>
     * <li>true: retains the command. The command can be run again by calling InvokeCommand. This counts toward the Cloud Assistant command retention quota.</li>
     * <li>false: does not retain the command. The command is automatically deleted after execution and does not count toward the Cloud Assistant command retention quota.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The bootstrap program for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The command name. All character sets are supported. The name cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>The key-value pairs of custom parameters to pass in when running a command that contains custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can pass in the key-value pair <code>{&quot;name&quot;:&quot;Jack&quot;}</code> through the Parameter parameter. The custom parameter automatically replaces the variable value <code>name</code>, and the actual command executed is <code>echo Jack</code>.</p>
     * <p>The number of custom parameters ranges from 0 to 10. Note the following items:</p>
     * <ul>
     * <li>Keys cannot be empty strings and can contain up to 64 characters.</li>
     * <li>Values can be empty strings.</li>
     * <li>After custom parameters and the original command content are Base64-encoded, the total size cannot exceed 24 KB. You can use <code>KeepCommand</code> to specify whether to retain the command.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed in, you can use empty strings as substitutes.</li>
     * </ul>
     * <p>Default value: empty, which disables custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI*************&quot;}</p>
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
     * <li>Once: immediately runs the command.</li>
     * <li>Period: runs the command on a schedule. When this parameter is set to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: automatically runs the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically runs the command every time the instance starts.</li>
     * <li>DryRun: performs a dry run of the request without actually running the command. Checks include request parameters, instance execution environment, and Cloud Assistant Agent running status.</li>
     * </ul>
     * <p>Default values:</p>
     * <ul>
     * <li>When the <code>Frequency</code> parameter is not specified, the default value is <code>Once</code>.</li>
     * <li>When the <code>Frequency</code> parameter is specified, the command is processed as <code>Period</code> regardless of whether this parameter is set.</li>
     * </ul>
     * <p>Precautions:</p>
     * <ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> to stop a pending or scheduled command.</li>
     * <li>When this parameter is set to <code>Period</code> or <code>EveryReboot</code>, you can call <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> and specify <code>IncludeHistory=true</code> to view the execution history of the scheduled command.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The resource group ID for the command execution. When this parameter is specified:</p>
     * <ul>
     * <li><p>If the ECS instance corresponding to InstanceId belongs to a non-default resource group, the ECS instance must belong to this resource group.</p>
     * </li>
     * <li><p>You can filter the corresponding command execution results by specifying this parameter (by calling <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a>).</p>
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
     * <p>The tags used to filter instances. Array length: 0 to 20. You can run commands in batches on instances with the same tags without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<RunCommandRequestResourceTag> resourceTag;

    /**
     * <p>The tag pairs. Array length: 0 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandRequestTag> tag;

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
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. Passing in this parameter has no effect.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for command execution. Unit: seconds.</p>
     * <p>A timeout occurs when a command cannot be run because of process issues, missing modules, or missing Cloud Assistant Agent. When a timeout occurs, the command process is forcefully terminated.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: Bat commands for Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell commands for Windows instances.</li>
     * <li>RunShellScript: Shell commands for Linux instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username for running the command on the ECS instance. The value cannot exceed 255 characters in length.</p>
     * <ul>
     * <li>For Linux ECS instances, commands are run as the root user by default.</li>
     * <li>For Windows ECS instances, commands are run as the System user by default.</li>
     * </ul>
     * <p>You can also specify another existing user on the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password for the user who executes the command on a Windows instance. The value cannot exceed 255 characters in length.</p>
     * <p>When you want to execute a command as a non-default user (System) on a Windows instance, you must specify both <code>Username</code> and this parameter. To reduce the risk of password leaks, store the plaintext password in the parameter repository of operations management, and pass in only the password name here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for a regular user to execute Cloud Assistant commands</a>.</p>
     * <blockquote>
     * <p>This parameter is not required when you execute commands as the root user on a Linux instance or the System user on a Windows instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory of the command on the ECS instance. The value cannot exceed 200 characters in length.</p>
     * <p>Default values:</p>
     * <ul>
     * <li>For Linux instances, the default directory is the home directory of the root user, which is <code>/root</code>.</li>
     * <li>For Windows instances, the default directory is the directory where the Cloud Assistant Agent process is located, such as <code>C:\\Windows\\System32</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/home/user</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public RunCommandRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public RunCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunCommandRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public RunCommandRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public RunCommandRequest setKeepCommand(Boolean keepCommand) {
        this.keepCommand = keepCommand;
        return this;
    }
    public Boolean getKeepCommand() {
        return this.keepCommand;
    }

    public RunCommandRequest setLauncher(String launcher) {
        this.launcher = launcher;
        return this;
    }
    public String getLauncher() {
        return this.launcher;
    }

    public RunCommandRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandRequest setOssOutputDelivery(String ossOutputDelivery) {
        this.ossOutputDelivery = ossOutputDelivery;
        return this;
    }
    public String getOssOutputDelivery() {
        return this.ossOutputDelivery;
    }

    public RunCommandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunCommandRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public RunCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public RunCommandRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunCommandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunCommandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunCommandRequest setResourceTag(java.util.List<RunCommandRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<RunCommandRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public RunCommandRequest setTag(java.util.List<RunCommandRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunCommandRequestTag> getTag() {
        return this.tag;
    }

    public RunCommandRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
    }

    public RunCommandRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public RunCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public RunCommandRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RunCommandRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public RunCommandRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public RunCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class RunCommandRequestResourceTag extends TeaModel {
        /**
         * <p>The tag key used to filter instances.</p>
         * <p>Precautions:</p>
         * <ul>
         * <li><p>This parameter conflicts with the InstanceId parameter. They cannot be specified at the same time.</p>
         * </li>
         * <li><p>If this value is specified, it cannot be an empty string.</p>
         * </li>
         * <li><p>The number of instances under the tag cannot exceed the quantity limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
         * </li>
         * <li><p>The key can be up to 64 characters in length and cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
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
         * <li>The value can be an empty string.</li>
         * <li>The value can be up to 128 characters in length and cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunCommandRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            RunCommandRequestResourceTag self = new RunCommandRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public RunCommandRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunCommandRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RunCommandRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command execute. If this value is specified, it cannot be an empty string.</p>
         * <p>When you use a single tag to filter resources, the resource count under that tag cannot exceed 1,000. When you use multiple tags to filter resources, the resource count of resources that are attached to all specified tags cannot exceed 1,000. If the resource count exceeds 1,000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. The value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunCommandRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunCommandRequestTag self = new RunCommandRequestTag();
            return TeaModel.build(map, self);
        }

        public RunCommandRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunCommandRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
