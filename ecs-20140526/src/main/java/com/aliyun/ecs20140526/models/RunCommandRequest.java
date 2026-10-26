// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command content. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <ul>
     * <li><p>The size of the Base64-encoded command content cannot exceed 24 KB. You can use the <code>KeepCommand</code> parameter to specify whether to retain the command.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, you must set <code>ContentEncoding</code> to Base64.</p>
     * </li>
     * <li><p>If you set <code>EnableParameter</code> to true, you can use custom parameters in the command content:</p>
     * <ul>
     * <li>Use <code>{{}}</code> to enclose custom parameters. Spaces and line breaks before and after the parameter names within <code>{{}}</code> are ignored.</li>
     * <li>You can define up to 20 custom parameters.</li>
     * <li>A custom parameter name can contain letters, digits, hyphens (-), and underscores (_). The <code>acs::</code> prefix cannot be used to specify non-built-in environment variables. Other characters are not supported. Parameter names are not case-sensitive.</li>
     * <li>A single custom parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment variables as custom parameters. When the command is run, you do not need to manually assign values to the parameters. Cloud Assistant automatically replaces them with the corresponding values in the environment. The following built-in environment variables are supported:</p>
     * <ul>
     * <li><code>{{ACS::RegionId}}</code>: the region ID.</li>
     * <li><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</li>
     * <li><code>{{ACS::InstanceId}}</code>: the instance ID. If the command is delivered to multiple instances and you want to specify <code>{{ACS::InstanceId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent is of the following versions or later:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InstanceName}}</code>: the instance name. If the command is delivered to multiple instances and you want to specify <code>{{ACS::InstanceName}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent is of the following versions or later:<ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InvokeId}}</code>: the invocation ID. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent is of the following versions or later:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::CommandId}}</code>: the command ID. If you call this operation to run a command and want to specify <code>{{ACS::CommandId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent is of the following versions or later: <ul>
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
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. The <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix is allowed to explicitly specify the container runtime.</p>
     * <p>Precautions:</p>
     * <ul>
     * <li>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</li>
     * <li>If you specify this parameter, it is only supported on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</li>
     * <li>If you specify this parameter, the specified <code>Username</code> and <code>WorkingDir</code> parameters do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>Only Shell scripts can be run in Linux containers. You cannot use a command similar to <code>#!/usr/bin/python</code> at the beginning of the script to specify the interpreter for the script content. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * <li>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</li>
     * <li>If you specify this parameter, it is only supported on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</li>
     * <li>If you specify this parameter, the specified <code>Username</code> and <code>WorkingDir</code> parameters do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>Only Shell scripts can be run in Linux containers. You cannot use a command similar to <code>#!/usr/bin/python</code> at the beginning of the script to specify the interpreter for the script content. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * <p>The encoding mode of the command content (<code>CommandContent</code>). Valid values (case-insensitive):</p>
     * <ul>
     * <li>PlainText: no encoding. The command content is transmitted in plaintext.</li>
     * <li>Base64: Base64 encoding.</li>
     * </ul>
     * <p>Default value: PlainText. If you enter an invalid value, it is processed as PlainText.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The command description. It supports all character sets and can be up to 512 characters in length.</p>
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
     * <p>The execution time of the scheduled command. Three scheduled execution modes are supported: execution at fixed time intervals (based on rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on cron expressions).</p>
     * <ul>
     * <li><p>Execution at fixed time intervals: runs the command at the specified time interval based on a rate expression. The time interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This mode is suitable for scenarios where tasks are run at fixed time intervals. The format is <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to run the command every 5 minutes, the format is <code>rate(5m)</code>. The following limits apply to execution at fixed time intervals:</p>
     * <ul>
     * <li>The specified time interval must not exceed 7 days, must not be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The execution interval is based only on the fixed frequency and is independent of the actual time required to run the task. For example, if you set the command to run every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed.</li>
     * <li>The task is not run immediately when it is created. For example, if you set the command to run every 5 minutes, the command is not run immediately when the task is created. Instead, it starts to run 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: runs the command once at the specified time zone and execution time. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>, which is <code>at(year-month-day hour:minute:second &lt;time zone&gt;)</code>. If you do not specify a time zone, the UTC time zone is used by default. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: such as <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) and <code>GMT-7:00</code> (West 7th time zone). When you use the GMT format, leading zeros are not supported for the hour digit.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to run the command once at 13:15:30 on June 6, 2022 in the China/Shanghai time zone, the format is <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To run the command once at 13:15:30 on June 6, 2022 in the West 7th time zone, the format is <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduled execution (based on cron expressions): runs the command based on a cron expression. The format is <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which is <code>&lt;cron expression&gt; &lt;time zone&gt;</code>. In the specified time zone, the scheduled task execution time is calculated based on the cron expression and the task is run. If you do not specify a time zone, the internal system time zone of the instance that runs the scheduled task is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: such as <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) and <code>GMT-7:00</code> (West 7th time zone). When you use the GMT format, leading zeros are not supported for the hour digit.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.
     * For example, to run the command once at 10:15 every day in 2022 in the China/Shanghai time zone, the format is <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run the command every half hour from 10:00 to 11:30 every day in 2022 in the East 8th time zone, the format is <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in the UTC time zone, the format is <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <blockquote>
     * <p>The minimum time interval must be greater than or equal to the timeout period of the scheduled task and must not be less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The array of ECS instance IDs. Array length: 1 to 100.</p>
     * <p>If you specify multiple instances and one of the instances does not meet the execution conditions, you must reselect the instances.</p>
     * <p>You can also apply for a quota increase in Quota Center. The quota name is the maximum number of instances that support command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6neg****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after it is run. Valid values:</p>
     * <ul>
     * <li>true: retains the command. You can call the InvokeCommand operation to run the command again. This consumes the quota for retained Cloud Assistant commands.</li>
     * <li>false: does not retain the command. The command is automatically deleted after it is run and does not consume the quota for retained Cloud Assistant commands.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The bootstrap program for script execution. It cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The command name. It supports all character sets and can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS delivery configuration for the command execution output.</p>
     * <ul>
     * <li>Format: oss://${BucketName}/${Prefix}. ${BucketName} is the name of the OSS bucket to which the output is delivered, and ${Prefix} is the directory prefix to which the output is delivered.</li>
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
     * <p>The key-value pairs of custom parameters that are passed in when the command is run, if the command contains custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can pass in the key-value pair <code>{&quot;name&quot;:&quot;Jack&quot;}</code> by using the <code>Parameter</code> parameter. The custom parameter automatically replaces the variable value <code>name</code>, and a new command is generated. The actual command that is run is <code>echo Jack</code>.</p>
     * <p>The number of custom parameters ranges from 0 to 10. Take note of the following items:</p>
     * <ul>
     * <li>The key cannot be an empty string and can be up to 64 characters in length.</li>
     * <li>The value can be an empty string.</li>
     * <li>After the custom parameters and the original command content are Base64-encoded, the size of the Base64-encoded command content cannot exceed 24 KB. You can use the <code>KeepCommand</code> parameter to specify whether to retain the command.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command is created. For parameters that are not passed in, you can use empty strings instead.</li>
     * </ul>
     * <p>The default value is empty, which indicates that this parameter is not set and the custom parameter feature is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI*************&quot;}</p>
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
     * <li>DryRun: prechecks the request only. The command is not actually run. The check items include the request parameters, instance execution environment, and Cloud Assistant Agent running status.</li>
     * </ul>
     * <p>Default values:</p>
     * <ul>
     * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
     * <li>If you specify the <code>Frequency</code> parameter, the value is processed as <code>Period</code> regardless of whether this parameter is set.</li>
     * </ul>
     * <p>Precautions:</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop a pending command or a scheduled command.</li>
     * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation and set <code>IncludeHistory</code> to true to view the historical records of the scheduled command execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which the command execution belongs. When you specify this parameter:</p>
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
     * <p>The array of tags used to filter instances. Array length: 0 to 20. You can run the command on multiple instances that have the same tags without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<RunCommandRequestResourceTag> resourceTag;

    /**
     * <p>The array of tags. Array length: 0 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandRequestTag> tag;

    /**
     * <p>The mode used when the task is stopped (manually stopped or interrupted due to execution timeout). Valid values:</p>
     * <ul>
     * <li>Process: stops the current script process.</li>
     * <li>ProcessTree: stops the current process tree (the set of the script process and all child processes created by it).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <blockquote>
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for running the command. Unit: seconds.</p>
     * <p>If the command cannot be run because of process issues, missing modules, or a missing Cloud Assistant Agent, a timeout occurs. After a timeout, the command process is forcefully terminated.</p>
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
     * <p>The username that is used to run the command on the ECS instance. It can be up to 255 characters in length.</p>
     * <ul>
     * <li>For Linux ECS instances, the command is run by the root user by default.</li>
     * <li>For Windows ECS instances, the command is run by the System user by default.</li>
     * </ul>
     * <p>You can also specify another existing user on the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The password name of the user that is used to execute the command on the Windows instance. It can be up to 255 characters in length.</p>
     * <p>If you want to execute the command as a non-default user (System) on a Windows instance, you must specify both <code>Username</code> and this parameter. To reduce the risk of password leakage, you must host the plaintext password in the parameter repository of CloudOps Orchestration Service and pass in only the password name here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encrypt parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for regular users to execute Cloud Assistant commands</a>.</p>
     * <blockquote>
     * <p>You do not need to pass in this parameter when you execute the command as the root user on a Linux instance or the System user on a Windows instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The running directory of the command on the ECS instance. It can be up to 200 characters in length.</p>
     * <p>Default values:</p>
     * <ul>
     * <li>For Linux instances, the default running directory is the home directory of the root user, which is <code>/root</code>.</li>
     * <li>For Windows instances, the default running directory is the directory where the Cloud Assistant Agent process resides, such as <code>C:\\Windows\\System32</code>.</li>
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
         * <li><p>This parameter conflicts with the InstanceId parameter and they cannot be specified at the same time.</p>
         * </li>
         * <li><p>It cannot be an empty string once specified.</p>
         * </li>
         * <li><p>The number of instances under the tag cannot exceed the limit on the number of InstanceId.N parameters. If the number of instances exceeds the limit, we recommend that you control the number of instances by adding batch tags, such as batch: b1.</p>
         * </li>
         * <li><p>It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
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
         * <li>It can be an empty string.</li>
         * <li>It can be up to 128 characters in length and cannot contain http:// or https://.</li>
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
         * <p>The tag key of the command to execute. It cannot be an empty string once specified.</p>
         * <p>If you use a single tag to filter resources, the resource count under the tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that are attached to all the specified tags cannot exceed 1,000. If the resource count exceeds 1,000, you must use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>It can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. It can be an empty string.</p>
         * <p>It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
