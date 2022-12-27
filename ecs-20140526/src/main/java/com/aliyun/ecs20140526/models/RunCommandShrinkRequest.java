// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    // The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:
    // 
    // *   If you want to retain the command, make sure that the Base64-encoded command content does not exceed 18 KB in size. If you do not want to retain the command, make sure that the Base64-encoded command content does not exceed 24 KB in size. You can set `KeepCommand` to specify whether to retain the command.
    // 
    // *   If the command content is Base64-encoded, set `ContentEncoding` to Base64.
    // 
    // *   When `EnableParameter` is set to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:
    // 
    //     *   Define custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
    //     *   The number of custom parameters cannot exceed 20.
    //     *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.
    //     *   Each custom parameter name cannot exceed 64 bytes in length.
    // 
    // *   You can specify built-in environment parameters as custom parameters. Then, when you run the command, the parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:
    // 
    //     *   `{{ACS::RegionId}}`: the ID of the region.
    // 
    //     *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.
    // 
    //     *   `{{ACS::InstanceId}}`: the ID of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the Cloud Assistant client is not earlier than the following version:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    // 
    //     *   `{{ACS::InstanceName}}`: the name of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.344
    //         *   Windows: 2.1.3.344
    // 
    //     *   `{{ACS::InvokeId}}`: the ID of the command task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the Cloud Assistant client is not earlier than the following version:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    // 
    //     *   `{{ACS::CommandId}}`: the ID of the command. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    @NameInMap("CommandContent")
    public String commandContent;

    // The ID of the container. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` are allowed to specify container runtimes.
    // 
    // Take note of the following items:
    // 
    // *   If this parameter is specified, Cloud Assistant runs scripts in the specified container of the instance.
    // *   If this parameter is specified, scripts can be run only on Linux instances on which Cloud Assistant client versions not earlier than 2.2.3.44 are installed.
    // *   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
    // *   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
    @NameInMap("ContainerId")
    public String containerId;

    // The name of the container.
    // 
    // Take note of the following items:
    // 
    // *   If this parameter is specified, Cloud Assistant runs scripts in the specified container of the instance.
    // *   If this parameter is specified, scripts can be run only on Linux instances on which Cloud Assistant client versions not earlier than 2.2.3.44 are installed.
    // *   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
    // *   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
    @NameInMap("ContainerName")
    public String containerName;

    // The encoding mode of command content (`CommandContent`). The valid values are case-insensitive. Valid values:
    // 
    // *   PlainText: The command content is not encoded.
    // *   Base64: The command content is encoded in Base64.
    // 
    // Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // The description of the command. The description supports all character sets and can be up to 512 characters in length.
    @NameInMap("Description")
    public String description;

    // Specifies whether to include custom parameters in the command.
    // 
    // Default value: false.
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    // The schedule on which to run the command. You must specify this parameter when you set `Timed` to `true`. You can specify a schedule to run the command at a fixed interval based on a rate expression, only once at a specified time, or at designated times based on a cron expression.
    // 
    // *   Run at Fixed Interval: To run the command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is applicable when tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you set an interval:
    // 
    //     *   The specified interval can be anywhere from 60 seconds to 7 days and must be longer than the timeout period of the scheduled task.
    //     *   The interval is the duration between two consecutive executions. The interval is irrelevant to the amount of time required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before it runs the command again.
    //     *   A task is not executed immediately after it is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.
    // 
    // *   Run Only Once at Specified Time: To run the command only once at a specified time, specify a point in time and a time zone. Specify the time in the following format: `at(yyyy-MM-dd HH:mm:ss <Time zone>)`, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the UTC time zone is used by default. The time zone supports the following forms:
    // 
    //     *   The time zone name. Example: `Asia/Shanghai` and `America/Los_Angeles`.
    // 
    //     *   The time offset from Greenwich Mean Time (GMT). Example: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.
    // 
    //     *   The time zone abbreviation: Only UTC is supported.
    // 
    //         To specify a command to run only once at 13:15:30 on June 06, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To specify a command to run only once at 13:15:30 on June 06, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.
    // 
    // *   Run on Clock-based Schedule: To run the command at designated times, specify a cron expression. Specify the time in the following format: `<Cron expression> <Time zone>`, where the cron expression is in the format of `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)> <time zone>`. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which to run the command is used by default. For more information about cron expressions, see [Cron expressions](~~64769~~). The time zone supports the following forms:
    // 
    //     *   The time zone name. Example: `Asia/Shanghai` and `America/Los_Angeles`.
    // 
    //     *   The time offset from GMT. Example: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.
    // 
    //     *   The time zone abbreviation: Only UTC is supported.
    // 
    //         For example, to specify a command to run at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To specify a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * ? 2022 GMT +8:00`. To specify a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years since 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.
    // 
    //         > The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.
    @NameInMap("Frequency")
    public String frequency;

    // The list of instance ID.
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    // Specifies whether to retain the command after it is run. Valid values:
    // 
    // *   true: The command is retained. You can call the InvokeCommand operation to run the command again. The retained command counts against the quota of Cloud Assistant commands.
    // *   false: The command is not retained. The command is automatically deleted after it is run and is not included in the quota of Cloud Assistant commands.
    // 
    // Default value: false.
    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    // The name of the command. The name supports all character sets and can be up to 128 characters in length.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The key-value pairs of custom parameters to be passed in when the command includes custom parameters. For example, assume that the command content is `echo {{name}}`. You can use the `Parameter` parameter to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is actually run.
    // 
    // Number of custom parameters: 0 to 10. Take note of the following items:
    // 
    // *   The key cannot be an empty string. It can be up to 64 characters in length.
    // *   The value can be an empty string.
    // *   If you want to retain the command, make sure that the size of the command (including custom parameters and original command content) after Base64 encoding does not exceed 18 KB. If you do not want to retain the command, make sure that the size of the command after Base64-encoding does not exceed 24 KB. You can set `KeepCommand` to specify whether to retain the command.
    // *   The custom parameter names specified in the value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not passed in.
    // 
    // This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.
    @NameInMap("Parameters")
    public String parametersShrink;

    // The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The execution mode of the command. Valid values:
    // 
    // *   Once: runs the command instantly.
    // *   Period: runs the command on a schedule. If you set this parameter to `Period`, you must set `Timed` to true and specify `Frequency`.
    // *   NextRebootOnly: automatically runs the command the next time the instance starts.
    // *   EveryReboot: automatically runs the command every time the instance starts.
    // 
    // Default value:
    // 
    // *   When `Timed` is set to false and `Frequency` is not specified, the default value of RepeatMode is `Once`.
    // *   When `Timed` is set to true and `Frequency` is specified, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is specified.
    // 
    // Take note of the following items:
    // 
    // *   When this parameter is set to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled executions of the command.
    // *   When this parameter is set to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set `IncludeHistory` to true to view the results of historical scheduled executions.
    @NameInMap("RepeatMode")
    public String repeatMode;

    // The ID of the resource group to which the elasticity assurance belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.  
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<RunCommandShrinkRequestTag> tag;

    // Specifies whether to run the command on a schedule. Valid values:
    // 
    // *   true: runs the command on the schedule specified by `Frequency`. The results of each execution of a command do not affect the next execution of the command.
    // *   false: runs the command only once.
    // 
    // Default value: false.
    @NameInMap("Timed")
    public Boolean timed;

    // The timeout period for the command execution. Unit: seconds.
    // 
    // A timeout error occurs when a command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist. When an execution times out, the command process is forcefully terminated.
    // 
    // Default value: 60.
    @NameInMap("Timeout")
    public Long timeout;

    // The language type of the command. Valid values:
    // 
    // *   RunBatScript: batch command (applicable to Windows instances).
    // *   RunPowerShellScript: PowerShell command (applicable to Windows instances).
    // *   RunShellScript: shell command (applicable to Linux instances).
    @NameInMap("Type")
    public String type;

    // The username to use to run the command on ECS instances.
    // 
    // *   For Linux instances, the root username is used.
    // *   For Windows instances, the System user is used.
    // 
    // You can also specify other usernames that already exist in the ECS instance to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](~~203771~~).
    @NameInMap("Username")
    public String username;

    // The name of the password to use to run the command on a Windows instance.
    // 
    // If you want to use a username other than the default System username to run the command on the Windows instance, you must specify both the WindowsPasswordName and `Username` parameter. The password is hosted in plaintext in the parameter repository of Operation Orchestration Service (OOS) to reduce the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Encrypt parameters](~~186828~~) and [Configure a regular user to run Cloud Assistant commands](~~203771~~).
    // 
    // >  When you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify the WindowsPasswordName parameter.
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    // The working directory of the command on the ECS instance.
    // 
    // Default value:
    // 
    // *   Linux instances: the home directory of the administrator (the root user), which is `/root`.
    // *   Windows instances: the directory where the Cloud Assistant client process resides, such as `C:\Windows\System32`.
    @NameInMap("WorkingDir")
    public String workingDir;

    public static RunCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandShrinkRequest self = new RunCommandShrinkRequest();
        return TeaModel.build(map, self);
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

    public RunCommandShrinkRequest setTag(java.util.List<RunCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunCommandShrinkRequestTag> getTag() {
        return this.tag;
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

    public static class RunCommandShrinkRequestTag extends TeaModel {
        // The key of tag N of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        // 
        // The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the command. Valid values of N: 1 to 20. The tag value can be an empty string.
        // 
        // The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
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
