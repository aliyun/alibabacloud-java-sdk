// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. You must make sure that the token is unique among different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command content, which can be in plaintext or Base64-encoded. Note the following:</p>
     * <ul>
     * <li><p>The size of the Base64-encoded command content is limited to 18 KB if <code>KeepCommand</code> is <code>true</code>, or 24 KB if <code>KeepCommand</code> is <code>false</code>.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, you must set <code>ContentEncoding</code> to <code>Base64</code>.</p>
     * </li>
     * <li><p>Set <code>EnableParameter</code> to <code>true</code> to enable the custom parameter feature in the command content.</p>
     * <ul>
     * <li><p>Define custom parameters by using the <code>{{}}</code> format. Spaces and line breaks before and after the parameter names within <code>{{}}</code> are ignored.</p>
     * </li>
     * <li><p>You can define up to 20 custom parameters.</p>
     * </li>
     * <li><p>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive and cannot start with <code>acs::</code>, which is reserved for built-in environment parameters.</p>
     * </li>
     * <li><p>A custom parameter name can be up to 64 bytes long.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>You can use built-in environment parameters, which Cloud Assistant automatically replaces with their corresponding values at runtime. The following built-in environment parameters are supported:</p>
     * <ul>
     * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
     * </li>
     * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. To use this parameter on multiple instances, the required Cloud Assistant Agent version is 2.2.3.309 or later for Linux instances, or 2.1.3.309 or later for Windows instances.</p>
     * <ul>
     * <li><p>Linux: 2.2.3.309</p>
     * </li>
     * <li><p>Windows: 2.1.3.309</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. To use this parameter on multiple instances, the required Cloud Assistant Agent version is 2.2.3.344 or later for Linux instances, or 2.1.3.344 or later for Windows instances.</p>
     * <ul>
     * <li><p>Linux: 2.2.3.344</p>
     * </li>
     * <li><p>Windows: 2.1.3.344</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InvokeId}}</code>: the invocation ID. To use this parameter, the required Cloud Assistant Agent version is 2.2.3.309 or later for Linux instances, or 2.1.3.309 or later for Windows instances.</p>
     * <ul>
     * <li><p>Linux: 2.2.3.309</p>
     * </li>
     * <li><p>Windows: 2.1.3.309</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::CommandId}}</code>: the command ID. To use this parameter, the required Cloud Assistant Agent version is 2.2.3.309 or later for Linux instances, or 2.1.3.309 or later for Windows instances.</p>
     * <ul>
     * <li><p>Linux: 2.2.3.309</p>
     * </li>
     * <li><p>Windows: 2.1.3.309</p>
     * </li>
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
     * <p>The ID of the container. The ID must be a 64-bit hexadecimal string. You can add the <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix to explicitly specify the container runtime.</p>
     * <p>Notes:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container of the instance.</p>
     * </li>
     * <li><p>This parameter is supported only on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
     * </li>
     * <li><p>If you specify this parameter, the specified <code>Username</code> and <code>WorkingDir</code> parameters are ignored. The command is run only by the default user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Run commands in a container by using Cloud Assistant</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>In Linux containers, you can run only Shell scripts. You cannot use commands such as <code>#!/usr/bin/python</code> at the beginning of a script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Run commands in a container by using Cloud Assistant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <p>Notes:</p>
     * <ul>
     * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container of the instance.</p>
     * </li>
     * <li><p>This parameter is supported only on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
     * </li>
     * <li><p>If you specify this parameter, the specified <code>Username</code> and <code>WorkingDir</code> parameters are ignored. The command is run only by the default user in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Run commands in a container by using Cloud Assistant</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>In Linux containers, you can run only Shell scripts. You cannot use commands such as <code>#!/usr/bin/python</code> at the beginning of a script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Run commands in a container by using Cloud Assistant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The encoding mode of the command content (<code>CommandContent</code>). Valid values (case-insensitive):</p>
     * <ul>
     * <li><p><code>PlainText</code>: The command content is not encoded and is transmitted in plaintext.</p>
     * </li>
     * <li><p><code>Base64</code>: The command content is Base64-encoded.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>PlainText</code>. If you specify an invalid value, the value is automatically set to <code>PlainText</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The description of the command. It can be up to 512 characters long and supports all character sets.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to use custom parameters in the command.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The schedule for the command. You can specify a rate expression, an at expression for one-time execution, or a cron expression.</p>
     * <ul>
     * <li><p><strong>Fixed-interval execution</strong>: Runs the command at fixed intervals defined by a rate expression. You can specify the interval in seconds (s), minutes (m), hours (h), or days (d). This method is suitable for tasks that must be run at fixed intervals. The format is <code>rate(&lt;value&gt;&lt;unit&gt;)</code>. For example, to run a command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to this method:</p>
     * <ul>
     * <li><p>The interval must be in the range of 60 seconds to 7 days, and must be longer than the timeout of the scheduled task.</p>
     * </li>
     * <li><p>The interval is fixed and starts from the beginning of the previous execution, not from its completion.</p>
     * </li>
     * <li><p>The task does not immediately run after it is created. For example, if you set an interval of 5 minutes, the first run starts 5 minutes after the task is created.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>One-time execution</strong>: Run the command once at a specified time and in a specified time zone. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time_zone&gt;)</code>. If you do not specify a time zone, UTC is used by default. The following time zone formats are supported:</p>
     * <ul>
     * <li><p>Full time zone name, such as <code>Asia/Shanghai</code> or <code>America/Los_Angeles</code>.</p>
     * </li>
     * <li><p>Offset from GMT, such as <code>GMT+8:00</code> or <code>GMT-7:00</code>. When you use the GMT format, you cannot add a leading zero to the hour.</p>
     * </li>
     * <li><p>Time zone abbreviation. Only <code>UTC</code> is supported.</p>
     * </li>
     * </ul>
     * <p>Example 1: To run a task at 13:15:30 on June 6, 2022 in the <code>Asia/Shanghai</code> time zone, use <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. Example 2: To run a task at 13:15:30 on June 6, 2022 in the <code>GMT-7:00</code> time zone, use <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p><strong>Scheduled execution based on a cron expression</strong>: Runs the command on a schedule defined by a cron expression. The format is <code>&lt;second&gt; &lt;minute&gt; &lt;hour&gt; &lt;day_of_month&gt; &lt;month&gt; &lt;day_of_week&gt; &lt;year (optional)&gt; &lt;time_zone&gt;</code>, or <code>&lt;cron_expression&gt; &lt;time_zone&gt;</code>. The task is run based on the cron expression in the specified time zone. If you do not specify a time zone, the system time zone of the instance where the task is run is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The following time zone formats are supported:</p>
     * <ul>
     * <li><p>Full time zone name, such as <code>Asia/Shanghai</code> or <code>America/Los_Angeles</code>.</p>
     * </li>
     * <li><p>Offset from GMT, such as <code>GMT+8:00</code> or <code>GMT-7:00</code>. When you use the GMT format, you cannot add a leading zero to the hour.</p>
     * </li>
     * <li><p>Time zone abbreviation. Only <code>UTC</code> is supported.
     * For example, to run a command at 10:15 every day in 2022 in the <code>Asia/Shanghai</code> time zone, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run a command every 30 minutes from 10:00 to 11:30 every day in 2022 in the <code>GMT+8:00</code> time zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run a command every 5 minutes from 14:00 to 14:55 every day in October of every two years starting from 2022 in <code>UTC</code>, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The minimum interval must be greater than or equal to the timeout of the scheduled task, and cannot be less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of the ECS instances on which to run the command. You can specify from 1 to 100 instance IDs.</p>
     * <p>If any specified instance does not meet the execution requirements, the entire operation fails.</p>
     * <p>You can apply for a quota increase in Quota Center. The quota is named Maximum number of instances supported per command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6neg****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to save the command after it is run. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Saves the command. You can then re-run it by calling InvokeCommand. Saved commands count towards your Cloud Assistant command quota.</p>
     * </li>
     * <li><p><code>false</code>: Does not save the command. The command is deleted after execution and does not count towards your quota.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The launcher that is used to run the script. The value can be up to 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The name of the command. It can be up to 128 characters long and supports all character sets.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS delivery configuration for the command output.</p>
     * <ul>
     * <li>Format: oss\://${BucketName}/${Prefix}, where ${BucketName} is the name of the destination OSS bucket and ${Prefix} is the destination prefix.</li>
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
     * <p>The key-value pairs for custom parameters. For example, if <code>CommandContent</code> is <code>echo {{name}}</code>, setting <code>Parameters</code> to <code>{&quot;name&quot;:&quot;Jack&quot;}</code> results in the command <code>echo Jack</code> being run.</p>
     * <p>You can specify 0 to 10 key-value pairs. Note the following:</p>
     * <ul>
     * <li><p>The key cannot be an empty string and can be up to 64 characters in length.</p>
     * </li>
     * <li><p>The value can be an empty string.</p>
     * </li>
     * <li><p>After Base64 encoding, the total size of the custom parameters and the original command content is limited to 18 KB if <code>KeepCommand</code> is <code>true</code>, or 24 KB if <code>KeepCommand</code> is <code>false</code>.</p>
     * </li>
     * <li><p>The set of custom parameter names that you specify must be a subset of the parameters defined in <code>CommandContent</code>. The value of an omitted parameter defaults to an empty string.</p>
     * </li>
     * </ul>
     * <p>By default, this parameter is empty, which indicates that no custom parameters are used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI*************&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest Alibaba Cloud regions.</p>
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
     * <li><p><code>Once</code>: The command is immediately run.</p>
     * </li>
     * <li><p><code>Period</code>: Runs the command as a scheduled task. This mode requires the <code>Frequency</code> parameter.</p>
     * </li>
     * <li><p><code>NextRebootOnly</code>: The command is automatically run the next time the instance starts.</p>
     * </li>
     * <li><p><code>EveryReboot</code>: The command is automatically run every time the instance starts.</p>
     * </li>
     * <li><p><code>DryRun</code>: Performs a dry run to check parameters and the environment without actually running the command.</p>
     * </li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If the <code>Frequency</code> parameter is not specified, the default value is <code>Once</code>.</p>
     * </li>
     * <li><p>If <code>Frequency</code> is specified, this parameter is automatically set to <code>Period</code>.</p>
     * </li>
     * </ul>
     * <p>Notes:</p>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop pending or scheduled commands.</p>
     * </li>
     * <li><p>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation and set <code>IncludeHistory=true</code> to query the historical execution records of the scheduled command.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group for the command execution. When you specify this parameter, the following rules apply:</p>
     * <ul>
     * <li><p>If an ECS instance specified by <code>InstanceId</code> is in a non-default resource group, it must belong to the resource group specified by this parameter.</p>
     * </li>
     * <li><p>You can use this parameter to filter command execution results when you call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation.</p>
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
     * <p>Tags used to filter instances for command execution. This allows you to run the command on all instances with matching tags, as an alternative to specifying instance IDs. The array can contain 0 to 20 tags.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<RunCommandRequestResourceTag> resourceTag;

    /**
     * <p>An array of tag pairs. The array can contain 0 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandRequestTag> tag;

    /**
     * <p>The mode for stopping the task when it is manually stopped or times out. Valid values:</p>
     * <ul>
     * <li><p><code>Process</code>: Stops the current script process.</p>
     * </li>
     * <li><p><code>ProcessTree</code>: Stops the current process tree. A process tree includes the current script process and all of its subprocesses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <blockquote>
     * <p>This parameter is deprecated and no longer has any effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The command execution timeout, in seconds.</p>
     * <p>A timeout forcibly terminates the command process if the command fails to run due to exceptions, such as a process conflict, a missing module, or a disabled Cloud Assistant Agent.</p>
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
     * <li><p><code>RunBatScript</code>: Bat commands for Windows instances.</p>
     * </li>
     * <li><p><code>RunPowerShellScript</code>: PowerShell commands for Windows instances.</p>
     * </li>
     * <li><p><code>RunShellScript</code>: Shell commands for Linux instances.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the user that runs the command on the ECS instance. The name can be up to 255 characters in length.</p>
     * <ul>
     * <li><p>Default on Linux: <code>root</code>.</p>
     * </li>
     * <li><p>Default on Windows: <code>System</code>.</p>
     * </li>
     * </ul>
     * <p>You can specify another existing user on the instance to run the command. Running Cloud Assistant commands as a standard user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a standard user</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password of the user that runs the command on a Windows instance. The name can be up to 255 characters in length.</p>
     * <p>To run a command as a non-default user on a Windows instance, you must specify both <code>Username</code> and <code>WindowsPasswordName</code>. To reduce the risk of password leaks, we recommend storing the password in OOS Parameter Store and providing the parameter name here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a standard user</a>.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter when you run a command as the <code>root</code> user on a Linux instance or as the <code>System</code> user on a Windows instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory for the command on the instance. The path can be up to 200 characters long.</p>
     * <p>Default values:</p>
     * <ul>
     * <li><p>For Linux instances, the default is the home directory of the <code>root</code> user (<code>/root</code>).</p>
     * </li>
     * <li><p>For Windows instances, the default is the directory of the Cloud Assistant Agent process, such as <code>C:\\Windows\\System32</code>.</p>
     * </li>
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
         * <p>Notes:</p>
         * <ul>
         * <li><p>You cannot specify both this parameter and the InstanceId parameter.</p>
         * </li>
         * <li><p>The tag key cannot be an empty string.</p>
         * </li>
         * <li><p>The number of instances matching the specified tag cannot exceed the per-execution instance limit (100 by default). If the number of matching instances exceeds this limit, you can use additional tags, such as <code>batch:b1</code>, to refine the selection.</p>
         * </li>
         * <li><p>The value can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It also cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that is used to filter instances.</p>
         * <p>Notes:</p>
         * <ul>
         * <li><p>The value can be an empty string.</p>
         * </li>
         * <li><p>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
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
         * <p>The tag key for the command execution. The key cannot be an empty string.</p>
         * <p>The key can be up to 64 characters long and cannot start with <code>aliyun</code> or <code>acs:</code>. It also cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>The value can be up to 64 characters long and cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for the command execution. The value can be an empty string.</p>
         * <p>The value can be up to 128 characters long and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
