// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <ul>
     * <li><p>If you want to retain the command, make sure that the size of the Base64-encoded command content does not exceed 18 KB. If you do not want to retain the command, make sure that the size of the Base64-encoded command content does not exceed 24 KB. You can set <code>KeepCommand</code> to specify whether to retain the command.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, set <code>ContentEncoding</code> to Base64.</p>
     * </li>
     * <li><p>If you specify <code>EnableParameter</code> to true, the custom parameter feature is enable. You can configure custom parameters based on the following rules:</p>
     * <ul>
     * <li>Specify custom parameters in the <code>{{}}</code> format. The spaces and line feeds before and after the parameter names within <code>{{}}</code> are ignored.</li>
     * <li>You can specify up to 20 custom parameters.</li>
     * <li>A custom parameter name can contain letters, digits, underscores (_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</li>
     * <li>Each custom parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters. When you run a command, the parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:</p>
     * <ul>
     * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
     * </li>
     * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InvokeId}}</code>: the task ID. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::CommandId}}</code>: the command ID. If you want to specify <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
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
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> can be used as the prefix of the container ID to specify the container runtime.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If you specify this parameter, Cloud Assistant runs the command in the specified container of the instances.</li>
     * <li>If you specify this parameter, make sure that the Cloud Assistant Agent version installed on Linux instances is 2.2.3.344 or later.</li>
     * <li>If you specify this parameter, <code>Username</code> and <code>WorkingDir</code> do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</li>
     * </ul>
     * <blockquote>
     * <p> Only shell scripts can run in Linux containers. You cannot add a command whose format is similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The container name.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If you specify this parameter, Cloud Assistant runs the command in the specified container of the instances.</li>
     * <li>If you specify this parameter, make sure that the Cloud Assistant Agent version installed on Linux instances is 2.2.3.344 or later.</li>
     * <li>If you specify this parameter, <code>Username</code> and <code>WorkingDir</code> do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</li>
     * </ul>
     * <blockquote>
     * <p> Only shell scripts can run in Linux containers. You cannot add a command whose format is similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The encoding mode of command content (<code>CommandContent</code>). The valid values are case-insensitive. Valid values:</p>
     * <ul>
     * <li>PlainText: The command content is not encoded.</li>
     * <li>Base64: The command content is encoded in Base64.</li>
     * </ul>
     * <p>Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to include custom parameters in the command.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified time, or run at designated times based on a cron expression.</p>
     * <ul>
     * <li><p>To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: <code>rate(&lt;Execution interval value&gt; &lt;Execution interval unit&gt;)</code>. For example, specify <code>rate(5m)</code> to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
     * <ul>
     * <li>The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</li>
     * <li>The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system runs the command again.</li>
     * <li>A task is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.</li>
     * </ul>
     * </li>
     * <li><p>To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the <code>at(yyyy-MM-dd HH:mm:ss &lt;Time zone&gt;)</code> format, which indicates <code>at(Year-Month-Day Hour:Minute:Second &lt;Time zone&gt;)</code>. If you do not specify a time zone, the UTC time zone is used by default. You can specify the time zone in the following forms:</p>
     * <ul>
     * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
     * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
     * <li>The time zone abbreviation. Only UTC is supported.</li>
     * </ul>
     * <p>For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the <code>&lt;Cron expression&gt; &lt;Time zone&gt;</code> format. The cron expression is in the <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of the month&gt; &lt;month&gt; &lt;day of the week&gt; &lt;year (optional)&gt;</code> format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. You can specify the time zone in the following forms:</p>
     * <ul>
     * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
     * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
     * <li>The time zone abbreviation. Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Note</strong> The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of instances on which to create and run the command. Specify at least one instance ID. You can specify up to 100 instance IDs.</p>
     * <p>If one of the specified instances does not meet the conditions for running the command, the call fails. To ensure that the call is successful, specify only the IDs of instances that meet the conditions.</p>
     * <p>You can request a quota increase in the Quota Center console. The quota name is Maximum number of instances supported for command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6neg****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after the command is run. Valid values:</p>
     * <ul>
     * <li>true: retains the command. Then, you can call the InvokeCommand operation to rerun the command. The retained command counts against the quota of Cloud Assistant commands.</li>
     * <li>false: does not retain the command. The command is automatically deleted after it is run and does not count against the quota of Cloud Assistant commands.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The name of the command. The name supports all character sets and can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of the custom parameters that are passed in when the command that can include custom parameters is run. For example, assume that the command content is <code>echo {{name}}</code>. The <code>Parameter</code> parameter can be used to pass in the <code>{&quot;name&quot;:&quot;Jack&quot;}</code> key-value pair. The <code>name</code> key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the <code>echo Jack</code> command is run.</p>
     * <p>You can specify up to 10 custom parameters. Take note of the following items:</p>
     * <ul>
     * <li>The key cannot be an empty string. It can be up to 64 characters in length.</li>
     * <li>The value can be an empty string.</li>
     * <li>If you want to retain the command, make sure that the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB in size. If you do not want to retain the command, make sure that the command after Base64-encoding does not exceed 24 KB in size. You can set <code>KeepCommand</code> to specify whether to retain the command.</li>
     * <li>The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</li>
     * </ul>
     * <p>This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies how to run the command. Valid values:</p>
     * <ul>
     * <li>Once: immediately runs the command.</li>
     * <li>Period: runs the command based on a schedule. If you set this parameter to <code>Period</code>, you must specify <code>Frequency</code>.</li>
     * <li>NextRebootOnly: runs the command the next time the instances start.</li>
     * <li>EveryReboot: runs the command every time the instances start.</li>
     * <li>DryRun: performs only a dry run, without running the actual command. The system checks the request parameters, the execution environments on the instances, and the status of Cloud Assistant Agent.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify <code>Frequency</code>, the default value is <code>Once</code>.</li>
     * <li>If you specify <code>Frequency</code>, RepeatMode is set to <code>Period</code> regardless of whether a value is already specified for RepeatMode.</li>
     * </ul>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop the pending or scheduled executions of the command.</li>
     * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation with <code>IncludeHistory</code> set to true to query the historical scheduled executions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which to assign the command executions. When you set this parameter, take note of the following items:</p>
     * <ul>
     * <li>The instances specified by InstanceId.N must belong to the specified resource group.</li>
     * <li>After the command is run, you can set this parameter to call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation to query the execution results in the specified resource group.</li>
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
     * <p>The tags of the instance. You can leave this parameter empty or specify up to 20 tags. If you do not specify InstanceId, the command is run on instances that have the specified tags.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<RunCommandRequestResourceTag> resourceTag;

    /**
     * <p>The tags to add to the command task. You can leave this parameter empty or specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandRequestTag> tag;

    /**
     * <p>Specifies how to stop the command task when a command execution is manually stopped or times out. Valid values:</p>
     * <ul>
     * <li>Process: stops the process of the command.</li>
     * <li>ProcessTree: stops the process tree of the command. In this case, the process of the command and all subprocesses of the process are stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <blockquote>
     * <p> This parameter is no longer used and does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command execution. Unit: seconds.</p>
     * <p>A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When an execution times out, the command process is forcefully terminated.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The type of the command. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch command, applicable to Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
     * <li>RunShellScript: shell command, applicable to Linux instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username to use to run the command on the ECS instances. The username cannot exceed 255 characters in length.</p>
     * <ul>
     * <li>For Linux instances, the root username is used by default.</li>
     * <li>For Windows instances, the System username is used by default.</li>
     * </ul>
     * <p>You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a regular user</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password to use to run the command on a Windows instance. The name cannot exceed 255 characters in length.</p>
     * <p>If you do not want to use the default System user to run the command on Windows instances, specify both WindowsPasswordName and <code>Username</code>. To mitigate the risk of password leaks, the password is stored in plaintext in CloudOps Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Manage encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a regular user</a>.</p>
     * <blockquote>
     * <p> If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify WindowsPasswordName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory of the command on the instance. The value can be up to 200 characters in length.</p>
     * <p>Default values:</p>
     * <ul>
     * <li>For Linux instances, the default value is <code>/root</code>, which is the home directory of the administrator (the root user).</li>
     * <li>For Windows instances, the default value is the directory where the Cloud Assistant Agent process resides, such as <code>C:\\Windows\\System32</code>.</li>
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
         * <p>The key of tag N of the instance.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter and InstanceId.N are mutually exclusive.</li>
         * <li>The tag key cannot be an empty string.</li>
         * <li>The number of instances that have the specified tags cannot exceed 100. Otherwise, we recommend that you use batch tags, such as batch: b1, to group the instances into batches of up to 100 instances.</li>
         * <li>The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instance.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The tag value can be an empty string.</li>
         * <li>The tag value can be up to 128 characters in length and cannot contain http:// or https://.</li>
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
         * <p>The key of tag N to add to the command task. The tag key cannot be an empty string.</p>
         * <p>If a tag is specified to query resources, up to 1,000 resources that have this tag can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all the tags can be displayed in the response. To query more than 1,000 resources that have the specified tags, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the command task. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
