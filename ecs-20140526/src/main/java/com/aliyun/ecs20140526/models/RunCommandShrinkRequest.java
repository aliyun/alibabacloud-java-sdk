// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <br>
     * <p>*   If you want to retain the command, make sure that the Base64-encoded command content does not exceed 18 KB in size. If you do not want to retain the command, make sure that the Base64-encoded command content does not exceed 24 KB in size. You can set the `KeepCommand` parameter to specify whether to retain the command.</p>
     * <br>
     * <p>*   If the command content is encoded in Base6, set `ContentEncoding` to Base64.</p>
     * <br>
     * <p>*   If you set the `EnableParameter` parameter to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:</p>
     * <br>
     * <p>    *   Specify custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>    *   You can specify up to 20 custom parameters.</p>
     * <p>    *   A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</p>
     * <p>    *   Each custom parameter name cannot exceed 64 bytes in length.</p>
     * <br>
     * <p>*   You can specify built-in environment parameters as custom parameters. Then, when you run a command, the parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:</p>
     * <br>
     * <p>    *   `{{ACS::RegionId}}`: the region ID.</p>
     * <br>
     * <p>    *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.</p>
     * <br>
     * <p>    *   `{{ACS::InstanceId}}`: the instance ID. If you want to run the command on multiple instances and specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::InstanceName}}`: the instance name. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.344</p>
     * <p>        *   Windows: 2.1.3.344</p>
     * <br>
     * <p>    *   `{{ACS::InvokeId}}`: the ID of the task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::CommandId}}`: the ID of the command. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. `docker://`, `containerd://`, or `cri-o://` can be used as the prefix to the container ID to specify the container runtime.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * <p>*   If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <p>*   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](https://help.aliyun.com/document_detail/456641.html).</p>
     * <p>*   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](https://help.aliyun.com/document_detail/456641.html).</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * <p>*   If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <p>*   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](https://help.aliyun.com/document_detail/456641.html).</p>
     * <p>*   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](https://help.aliyun.com/document_detail/456641.html).</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The encoding mode of command content (`CommandContent`). The valid values are case-insensitive. Valid values:</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is encoded in Base64.</p>
     * <br>
     * <p>Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to include custom parameters in the command.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified time, or run at designated times based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value> <Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
     * <br>
     * <p>    *   The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</p>
     * <p>    *   The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system runs the command again.</p>
     * <p>    *   A task is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the UTC time zone is used by default. You can specify the time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</p>
     * <p>    *   The time zone abbreviation. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see [Cron expressions](https://help.aliyun.com/document_detail/64769.html). You can specify the time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</p>
     * <p>    *   The time zone abbreviation. Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to `0 15 10 ? * * 2022 Asia/Shanghai`. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to `0 0/30 10-11 * * ? 2022 GMT+8:00`. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to `0 0/5 14 * 10 ? 2022/2 UTC`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of instances on which to run the command. N indicates that you can specify multiple instance IDs at the same time. Valid values of N: 1 to 100.</p>
     * <br>
     * <p>If one of the specified instances does not meet the conditions for running the command, the call fails. To ensure that the call is successful, specify only the IDs of instances that meet the conditions.</p>
     * <br>
     * <p>You can apply for a quota increase in the Quota Center console. The quota name is Maximum number of instances supported for command execution.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after the command is run. Valid values:</p>
     * <br>
     * <p>*   true: retains the command. Then, you can call the InvokeCommand operation to rerun the command. The retained command counts against the quota of Cloud Assistant commands.</p>
     * <p>*   false: does not retain the command. The command is automatically deleted after it is run and does not count against the quota of Cloud Assistant commands.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    /**
     * <p>The name of the command. The name supports all character sets and can be up to 128 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of the custom parameters that are passed in when the command that can include custom parameters is run. For example, assume that the command content is `echo {{name}}`. The `Parameter` parameter can be used to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is run.</p>
     * <br>
     * <p>You can specify up to 10 custom parameters. Take note of the following items:</p>
     * <br>
     * <p>*   The key cannot be an empty string. It can be up to 64 characters in length.</p>
     * <p>*   The value can be an empty string.</p>
     * <p>*   If you want to retain the command, make sure that the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB in size. If you do not want to retain the command, make sure that the command after Base64-encoding does not exceed 24 KB in size. You can set `KeepCommand` to specify whether to retain the command.</p>
     * <p>*   The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID of the command. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies how to run the command. Valid values:</p>
     * <br>
     * <p>*   Once: immediately runs the command.</p>
     * <p>*   Period: runs the command on a schedule. If you set this parameter to `Period`, you must specify `Frequency`.</p>
     * <p>*   NextRebootOnly: runs the command the next time the instance is started.</p>
     * <p>*   EveryReboot: runs the command every time the instance is started.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   If you do not specify the `Frequency` parameter, the default value is `Once`.</p>
     * <p>*   If you specify the `Frequency` parameter, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is set to Period.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   You can call the [StopInvocation](https://help.aliyun.com/document_detail/64838.html) operation to stop the pending or scheduled executions of the command.</p>
     * <p>*   If you set this parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](https://help.aliyun.com/document_detail/64845.html) operation with `IncludeHistory` set to true to query the results of historical scheduled executions.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which to assign the command executions. When you set this parameter, take note of the following items:</p>
     * <br>
     * <p>*   The instances specified by InstanceId.N must belong to the specified resource group.</p>
     * <p>*   After the command is run, you can set this parameter to call the [DescribeInvocations](https://help.aliyun.com/document_detail/64840.html) or [DescribeInvocationResults](https://help.aliyun.com/document_detail/64845.html) operation to query the execution results in the specified resource group.</p>
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
    public java.util.List<RunCommandShrinkRequestResourceTag> resourceTag;

    /**
     * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandShrinkRequestTag> tag;

    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <p>>  This parameter is no longer used and does not take effect.</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command execution. Unit: seconds.</p>
     * <br>
     * <p>A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When an execution times out, the command process is forcefully terminated.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The language type of the command. Valid values:</p>
     * <br>
     * <p>*   RunBatScript: batch command, applicable to Windows instances.</p>
     * <p>*   RunPowerShellScript: PowerShell command, applicable to Windows instances.</p>
     * <p>*   RunShellScript: shell command, applicable to Linux instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username to use to run the command on the ECS instances. The username cannot exceed 255 characters in length.</p>
     * <br>
     * <p>*   For Linux instances, the root username is used by default.</p>
     * <p>*   For Windows instances, the System username is used by default.</p>
     * <br>
     * <p>You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](https://help.aliyun.com/document_detail/203771.html).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password to use to run the command on a Windows instance. The name cannot exceed 255 characters in length.</p>
     * <br>
     * <p>If you do not want to use the default System user to run the command on Windows instances, specify both WindowsPasswordName and `Username`. To mitigate the risk of password leaks, the password is stored in plaintext in CloudOps Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName. For more information, see [Manage encryption parameters](https://help.aliyun.com/document_detail/186828.html) and [Run Cloud Assistant commands as a regular user](https://help.aliyun.com/document_detail/203771.html).</p>
     * <br>
     * <p>>  If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify WindowsPasswordName.</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory of the command on the instance. The value can be up to 200 characters in length.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   For Linux instances, the default value is `/root`, which is the home directory of the administrator (the root user).</p>
     * <p>*   For Windows instances, the default value is the directory where the Cloud Assistant Agent process resides, such as `C:\\Windows\\System32`.</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static RunCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandShrinkRequest self = new RunCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunCommandShrinkRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandShrinkRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public RunCommandShrinkRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public RunCommandShrinkRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunCommandShrinkRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public RunCommandShrinkRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public RunCommandShrinkRequest setKeepCommand(Boolean keepCommand) {
        this.keepCommand = keepCommand;
        return this;
    }
    public Boolean getKeepCommand() {
        return this.keepCommand;
    }

    public RunCommandShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunCommandShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public RunCommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandShrinkRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public RunCommandShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunCommandShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunCommandShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunCommandShrinkRequest setResourceTag(java.util.List<RunCommandShrinkRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<RunCommandShrinkRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public RunCommandShrinkRequest setTag(java.util.List<RunCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunCommandShrinkRequestTag> getTag() {
        return this.tag;
    }

    public RunCommandShrinkRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
    }

    public RunCommandShrinkRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public RunCommandShrinkRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public RunCommandShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RunCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public RunCommandShrinkRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public RunCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class RunCommandShrinkRequestResourceTag extends TeaModel {
        /**
         * <p>The key of tag N of the instance.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   This parameter and InstanceId.N are mutually exclusive.</p>
         * <p>*   Valid values of N: 1 to 10. The tag key cannot be an empty string.</p>
         * <p>*   The number of instances that have the specified tags cannot exceed 50. If more than 50 instances have the specified tags, we recommend that you use batch tags such as batch: b1 to group the instances into batches of up to 50 instances.</p>
         * <p>*   The tag key can be up to 64 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instance.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   Valid values of N: 1 to 10.</p>
         * <p>*   The tag value can be an empty string.</p>
         * <p>*   The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunCommandShrinkRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            RunCommandShrinkRequestResourceTag self = new RunCommandShrinkRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public RunCommandShrinkRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunCommandShrinkRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RunCommandShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call [ListTagResources](https://help.aliyun.com/document_detail/110425.html).</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the command task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunCommandShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunCommandShrinkRequestTag self = new RunCommandShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public RunCommandShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunCommandShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
