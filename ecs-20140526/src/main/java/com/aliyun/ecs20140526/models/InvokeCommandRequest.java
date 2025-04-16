// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
     * <blockquote>
     * <p> Common Cloud Assistant commands can be run based on their names. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run common Cloud Assistant commands</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-e996287206324975b5fbe1d****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. You can use container IDs that are prefixed with <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> to specify container runtimes.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * </li>
     * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <ul>
     * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * </li>
     * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <ul>
     * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specific time, or run at specific times based on a cron expression.</p>
     * <ul>
     * <li><p>To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: <code>rate(&lt;Execution interval value&gt;&lt;Execution interval unit&gt;)</code>. For example, specify <code>rate(5m)</code> to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
     * <ul>
     * <li>The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</li>
     * <li>The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system runs the command again.</li>
     * <li>A task is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.</li>
     * </ul>
     * </li>
     * <li><p>To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the <code>at(yyyy-MM-dd HH:mm:ss &lt;Time zone&gt;)</code> format, which indicates <code>at(Year-Month-Day Hour:Minute:Second &lt;Time zone&gt;)</code>. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:</p>
     * <ul>
     * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
     * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
     * <li>The time zone abbreviation. Only UTC is supported.</li>
     * </ul>
     * <p>For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the <code>&lt;Cron expression&gt; &lt;Time zone&gt;</code> format. The cron expression is in the <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of the month&gt; &lt;month&gt; &lt;day of the week&gt; &lt;year (optional)&gt;</code> format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. You can specify a time zone in the following forms:</p>
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
     * <p>The IDs of instances on which you want to run the command. You can specify up to 100 instance IDs in each request. Valid values of N: 1 to 100.</p>
     * <p>You can apply for a quota increase in the Quota Center console. The quota name is Maximum number of instances supported for command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6n****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of custom parameters to pass in when the custom parameter feature is enabled. You can specify up to 10 custom parameters.</p>
     * <ul>
     * <li>Each key in a Map collection cannot be an empty string, and can be up to 64 characters in length.</li>
     * <li>Each value in a Map collection can be an empty string.</li>
     * <li>The size of the command after Base64 encoding, including the custom parameters and the original command content, cannot exceed 18 KB.</li>
     * <li>The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the custom parameters that are not specified.</li>
     * </ul>
     * <p>If you want to disable the custom parameter feature, you can leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI************&quot;}</p>
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
     * <li>Period: runs the command based on a schedule. If you set this parameter to <code>Period</code>, you must also configure the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: runs the command the next time the instance is started.</li>
     * <li>EveryReboot: The command is run every time the instances start.</li>
     * <li>DryRun: Specifies whether to perform only a dry run, without performing the actual request. The command does not take effect. The system checks the request, including the request parameters, instance execution environment, and Cloud Assistant Agent running status.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify <code>Frequency</code>, the default value is <code>Once</code>.</li>
     * <li>If you specify the <code>Frequency</code> parameter, <code>Period</code> is used as the value of RepeatMode regardless of whether RepeatMode is set to Period.</li>
     * </ul>
     * <p>Take note of the following items when you specify this property:</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop the pending or scheduled executions of the command.</li>
     * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation with <code>IncludeHistory</code> set to true to query the results of historical scheduled executions.</li>
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
     * <li>After the command is run, you can call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation with ResourceGroupId set to query the execution results in the specified resource group.</li>
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
     * <p>The tags of the instance. If you do not specify InstanceId.N, the command is run on the instances that have the specified tags.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<InvokeCommandRequestResourceTag> resourceTag;

    /**
     * <p>The tags of the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandRequestTag> tag;

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
     * <ul>
     * <li>The timeout period cannot be less than 10 seconds.</li>
     * <li>A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When the specified timeout period ends, the command process is forcefully terminated.</li>
     * <li>If you do not specify this parameter, the timeout period that is specified when the command is created is used.</li>
     * <li>This timeout period is applicable only to this execution. The timeout period of the command is not modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

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

    public static class InvokeCommandRequestResourceTag extends TeaModel {
        /**
         * <p>The key of tag N of the instance.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter and InstanceId.N are mutually exclusive.</li>
         * <li>Valid values of N: 1 to 10. The tag key cannot be an empty string.</li>
         * <li>The number of instances that have the specified tags cannot exceed 100. If more than 100 instances have the specified tags, we recommend that you use batch tags such as batch: b1 to group the instances into batches of up to 100 instances.</li>
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
         * <p>The key of tag N to add to the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the command task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
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
