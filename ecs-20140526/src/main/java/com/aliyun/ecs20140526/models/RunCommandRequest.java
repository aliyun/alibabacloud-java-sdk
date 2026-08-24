// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command content. The command content can be plaintext or Base64-encoded. Note the following:</p>
     * <ul>
     * <li><p>The size of the command content after Base64 encoding cannot exceed 24 KB. You can use <code>KeepCommand</code> to specify whether to retain the command.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, set <code>ContentEncoding=Base64</code>.</p>
     * </li>
     * <li><p>Set <code>EnableParameter=true</code> to enable custom parameters in the command content:</p>
     * <ul>
     * <li>Custom parameters are defined by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter name within <code>{{}}</code> are ignored.</li>
     * <li>A maximum of 20 custom parameters are supported.</li>
     * <li>Custom parameter names can contain only a-z, A-Z, 0-9, hyphens (-), and underscores (_). The acs:: prefix for specifying non-built-in environment parameters is not supported. Other characters are not supported. Parameter names are case-insensitive.</li>
     * <li>Each custom parameter name cannot exceed 64 bytes.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters. When the command is run, Cloud Assistant automatically replaces the parameters with the corresponding values in the environment without manual assignment. The following built-in environment parameters are supported:</p>
     * <ul>
     * <li><code>{{ACS::RegionId}}</code>: The region ID.</li>
     * <li><code>{{ACS::AccountId}}</code>: The UID of the Alibaba Cloud account.</li>
     * <li><code>{{ACS::InstanceId}}</code>: The instance ID. When the command is sent to multiple instances and you want to use <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InstanceName}}</code>: The instance name. When the command is sent to multiple instances and you want to use <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:<ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InvokeId}}</code>: The command execution ID. To use <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::CommandId}}</code>: The command ID. When you call this operation to run a command and want to use <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:<ul>
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
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. The <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix can be added to specify the container runtime.</p>
     * <p>Precautions:</p>
     * <ul>
     * <li>If this parameter is specified, Cloud Assistant runs the script in the specified container of the instance.</li>
     * <li>If this parameter is specified, the script can run only on Linux instances whose Cloud Assistant Agent version is 2.2.3.344 or later.</li>
     * <li>If this parameter is specified, the specified <code>Username</code> and <code>WorkingDir</code> parameters do not take effect. Commands can be run only by using the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>In Linux containers, only shell scripts are supported. You cannot use a command such as <code>#!/usr/bin/python</code> at the beginning of a script to specify the interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * <li>If this parameter is specified, Cloud Assistant runs the script in the specified container of the instance.</li>
     * <li>If this parameter is specified, the script can run only on Linux instances whose Cloud Assistant Agent version is 2.2.3.344 or later.</li>
     * <li>If this parameter is specified, the Username and WorkingDir parameters do not take effect. Commands can be run only by using the default user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.<blockquote>
     * <p>In Linux containers, only shell scripts can be run. You cannot specify an interpreter for the script content by adding a command such as <code>#!/usr/bin/python</code> to the beginning of the script. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The command description. The description supports all character sets and can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the command contains custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The execution time for scheduled command execution. Three scheduling methods are supported: fixed interval execution (based on Rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on Cron expressions).</p>
     * <ul>
     * <li><p>Fixed interval execution: Based on Rate expressions, commands are executed at the specified time interval. The time interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This method is suitable for scenarios that require task execution at fixed intervals. The format is <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to execute a command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to fixed interval execution:</p>
     * <ul>
     * <li>The specified interval cannot exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
     * <li>The execution interval is based on a fixed frequency and is independent of the actual execution time of the task. For example, if a command is set to execute every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed.</li>
     * <li>The task is not executed immediately upon creation. For example, if a command is set to execute every 5 minutes, the command is not executed immediately when the task is created. Instead, execution starts 5 minutes after the task is created.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: The command is executed once at the specified time and time zone. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If no time zone is specified, the default is UTC. The following three time zone formats are supported:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>GMT offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (UTC+8) or <code>GMT-7:00</code> (UTC-7). When using the GMT format, leading zeros are not supported for the hour value.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute a command once at 13:15:30 on June 6, 2022 in China/Shanghai time, use <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To execute a command once at 13:15:30 on June 6, 2022 in UTC-7, use <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduled execution (based on Cron expressions): Based on Cron expressions, commands are executed according to the scheduled task settings. The format is <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which is <code>&lt;Cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the default is the internal system time zone of the instance that runs the scheduled task. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The following three time zone formats are supported:</p>
     * <ul>
     * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>GMT offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (UTC+8) or <code>GMT-7:00</code> (UTC-7). When using the GMT format, leading zeros are not supported for the hour value.</li>
     * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute a command once at 10:15 every day in 2022 in China/Shanghai time, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To execute a command every 30 minutes from 10:00 to 11:30 every day in 2022 in UTC+8, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To execute a command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in UTC, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</p>
     * <blockquote>
     * <p>The minimum time interval must be greater than or equal to the timeout period of the scheduled task and no less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The ECS instance ID array. Array length: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6neg****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after it is run. Valid values:</p>
     * <ul>
     * <li>true: The command is retained. You can run it again by calling InvokeCommand. The command counts against the Cloud Assistant command quota.</li>
     * <li>false: The command is not retained. It is automatically deleted after execution and does not count against the Cloud Assistant command quota.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The bootstrap program for script execution. The value can be up to 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The command name. The name supports all character sets and can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS delivery configuration for command execution output.</p>
     * <ul>
     * <li>Format: oss://${BucketName}/${Prefix}, where ${BucketName} is the name of the destination OSS bucket and ${Prefix} is the directory prefix of the destination.</li>
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
     * <p>The key-value pairs of custom parameters to pass in when the command contains custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can use the <code>Parameter</code> parameter to pass in the key-value pair <code>{&quot;name&quot;:&quot;Jack&quot;}</code>. The custom parameter automatically replaces the variable value <code>name</code>, and the command that is actually run is <code>echo Jack</code>.</p>
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
     * <li>Once: immediately executes the command.</li>
     * <li>Period: executes the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: automatically executes the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically executes the command every time the instance starts.</li>
     * <li>DryRun: performs only a dry run of the request without actually executing the command. The dry run checks items such as request parameters, instance execution environment, and Cloud Assistant Agent status.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If the <code>Frequency</code> parameter is not specified, the default value is <code>Once</code>.</li>
     * <li>If the <code>Frequency</code> parameter is specified, the command is executed as <code>Period</code> regardless of whether this parameter is set.</li>
     * </ul>
     * <p>Precautions:</p>
     * <ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> to stop a pending or scheduled command.</li>
     * <li>If this parameter is set to <code>Period</code> or <code>EveryReboot</code>, you can call <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> and specify <code>IncludeHistory=true</code> to view the historical records of scheduled command executions.</li>
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
     * <li><p>If the ECS instance specified by InstanceId belongs to a non-default resource group, the ECS instance must belong to this resource group.</p>
     * </li>
     * <li><p>You can filter command execution results by specifying this parameter when you call <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a>.</p>
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
     * <p>The tags that are used to filter instances. Array length: 0 to 20. You can run commands on instances that have the same tags in batches without specifying InstanceId.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<RunCommandRequestResourceTag> resourceTag;

    /**
     * <p>The tags. Array length: 0 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandRequestTag> tag;

    /**
     * <p>The mode in which the task is stopped (manually stopped or interrupted due to timeout). Valid values:</p>
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
     * <p>A timeout occurs when the command cannot run due to process issues, missing modules, or missing Cloud Assistant Agent. After a timeout, the command process is forcefully terminated.</p>
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
     * <li>RunBatScript: Bat command for Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell command for Windows instances.</li>
     * <li>RunShellScript: Shell command for Linux instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username that is used to run the command on the ECS instance. The username can be up to 255 characters in length.</p>
     * <ul>
     * <li>For Linux ECS instances, the command is run by the root user by default.</li>
     * <li>For Windows ECS instances, the command is run by the System user by default.</li>
     * </ul>
     * <p>You can also specify another existing user of the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a regular user</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password for the user who runs the command on a Windows instance. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory of the command on the ECS instance. Maximum length: 200 characters.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>For Linux instances, the default directory is the home directory of the root user, which is <code>/root</code>.</li>
     * <li>For Windows instances, the default directory is the directory where the Cloud Assistant Agent process resides, such as <code>C:\\Windows\\System32</code>.</li>
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
         * <p>The tag key that is used to filter instances.</p>
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
         * <p>The tag key of the command execution. If this value is specified, it cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. The value can be an empty string.</p>
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
