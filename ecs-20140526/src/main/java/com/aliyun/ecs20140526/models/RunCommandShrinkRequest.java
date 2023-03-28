// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <p>The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <br>
     * <p>*   If you want to retain the command, make sure that the Base64-encoded command content does not exceed 18 KB in size. If you do not want to retain the command, make sure that the Base64-encoded command content does not exceed 24 KB in size. You can use the `KeepCommand` parameter to specify whether to retain the command.</p>
     * <br>
     * <p>*   If the command content is Base64-encoded, set the `ContentEncoding` parameter to Base64.</p>
     * <br>
     * <p>*   If you set the `EnableParameter` parameter to true, the custom parameter feature is enabled and you can specify custom parameters based on the following rules:</p>
     * <br>
     * <p>    *   Specify custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>    *   You can specify up to 20 custom parameters.</p>
     * <p>    *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is not case-sensitive.</p>
     * <p>    *   Each custom parameter name cannot exceed 64 bytes in length.</p>
     * <br>
     * <p>*   You can specify built-in environment parameters as custom parameters. Then, Cloud Assistant automatically specifies the parameters when you run the command. You can specify the following built-in environment parameters:</p>
     * <br>
     * <p>    *   `{{ACS::RegionId}}`: the ID of the region.</p>
     * <br>
     * <p>    *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.</p>
     * <br>
     * <p>    *   `{{ACS::InstanceId}}`: the ID of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::InstanceName}}`: the name of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.344</p>
     * <p>        *   Windows: 2.1.3.344</p>
     * <br>
     * <p>    *   `{{ACS::InvokeId}}`: the ID of the command task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::CommandId}}`: the ID of the command. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` can specify container runtimes.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <p>*   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.</p>
     * <p>*   If you specify this parameter, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <p>*   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <p>*   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.</p>
     * <p>*   If you specify this parameter, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <p>*   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The encoding mode of the command content that is specified by the `CommandContent` parameter. The valid values are not case-sensitive. Valid values:</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is encoded in Base64.</p>
     * <br>
     * <p>Default value: PlainText. If an invalid value is specified for this parameter, PlainText is used.</p>
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
     * <p>Default value: false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The schedule based on which the command is run. When you set the `Timed` parameter to `true`, you must specify this parameter. You can run a command at a fixed interval based on a rate expression, run the command only once at a specific time, or run the command at specific times based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
     * <br>
     * <p>    *   The specified interval can range from 60 seconds to 7 days and must be longer than the timeout period of the scheduled task.</p>
     * <p>    *   The interval is the amount of time that elapsed between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes, and the amount of time that is required to run the command once is 2 minutes. Each time the command is run, the system waits 3 minutes before the system reruns the command.</p>
     * <p>    *   A task is not immediately run after it is created. For example, you set the interval to 5 minutes and create a task to run the command. The task runs 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the default time zone UTC is used. You can specify the time zone in the following formats:</p>
     * <br>
     * <p>    *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.</p>
     * <p>    *   The abbreviation of the time zone. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to specify a command that runs only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To specify a command that runs only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at specific times, specify a cron expression. Specify the time in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following formats:</p>
     * <br>
     * <p>    *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.</p>
     * <p>    *   The abbreviation of the time zone. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to specify a command that runs at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To specify a command that runs every 30 minutes from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To specify a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years starting from 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**The interval must be at least 10 seconds and cannot be shorter than the timeout period of scheduled executions.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The ID of instance N on which you want to run the command. Valid values of N: 1 to 50.</p>
     * <br>
     * <p>If one of the specified instances does not meet the conditions for running the command, the call fails. To ensure that the call is successful, specify only the IDs of instances that meet the conditions.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>Specifies whether to retain the command after the command is run. Valid values:</p>
     * <br>
     * <p>*   true: retains the command. You can call the InvokeCommand operation to rerun the command. The retained command counts against the quota of Cloud Assistant commands.</p>
     * <p>*   false: does not retain the command. The command is automatically deleted after it is run and does not count against the quota of Cloud Assistant commands.</p>
     * <br>
     * <p>Default value: false</p>
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
     * <p>The key-value pairs of the custom parameters that are passed in when the command includes custom parameters. For example, the command content is `echo {{name}}`, and you can use the `Parameter` parameter to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is run.</p>
     * <br>
     * <p>You can specify up to 10 custom parameters. Take note of the following items:</p>
     * <br>
     * <p>*   The key cannot be an empty string. It can be up to 64 characters in length.</p>
     * <p>*   The value can be an empty string.</p>
     * <p>*   If you want to retain the command, make sure that the size of the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB. If you do not want to retain the command, make sure that the size of the command after Base64-encoding does not exceed 24 KB. You can use the `KeepCommand` parameter to specify whether to retain the command.</p>
     * <p>*   The custom parameter names that are specified by the Parameters parameter must be included in the custom parameter names that you specify when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>By default, this parameter is left empty. If you want to disable the custom parameter feature, you can leave this parameter empty.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the mode in which you want to run the command. Valid values:</p>
     * <br>
     * <p>*   Once: immediately runs the command.</p>
     * <p>*   Period: runs the command based on a schedule. If you set this parameter to `Period`, you must set the `Timed` parameter to true and specify the `Frequency` parameter.</p>
     * <p>*   NextRebootOnly: automatically runs the command the next time the instance is started.</p>
     * <p>*   EveryReboot: automatically runs the command every time the instance is started.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If you set the `Timed` parameter to false and do not specify the `Frequency` parameter, the default value of the RepeatMode parameter is `Once`.</p>
     * <p>*   If you set the `Timed` parameter to true and specify the `Frequency` parameter, `Period` is used as the value of the RepeatMode parameter regardless of whether you specify the RepeatMode parameter.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If you set this parameter to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled execution of the command.</p>
     * <p>*   If you set this parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set the `IncludeHistory` parameter to true to view the results of previous scheduled executions.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which you want to assign the command executions. When you specify this parameter, take note of the following items:</p>
     * <br>
     * <p>*   The instances that are specified by the InstanceId parameter must belong to the specified resource group.</p>
     * <p>*   You can specify this parameter to call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation to query execution results in the specified resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that you want to add to the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunCommandShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to run the command based on a schedule. Valid values:</p>
     * <br>
     * <p>*   true: runs the command based on the schedule that is specified by the `Frequency` parameter. The results of a command execution do not affect the next command execution.</p>
     * <p>*   false: runs the command only once.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command execution. Unit: seconds.</p>
     * <br>
     * <p>A timeout error occurs when a command cannot be run because the command process slows down or because a specific module or the Cloud Assistant client does not exist. When an execution times out, the command process is forcibly terminated.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The language type of the command. Valid values:</p>
     * <br>
     * <p>*   RunBatScript: batch command, applicable to Windows instances</p>
     * <p>*   RunPowerShellScript: PowerShell command, applicable to Windows instances</p>
     * <p>*   RunShellScript: shell command, applicable to Linux instances</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username that you use to run the command on instances.</p>
     * <br>
     * <p>*   For Linux instances, the root username is used.</p>
     * <p>*   For Windows instances, the System username is used.</p>
     * <br>
     * <p>You can also specify other usernames that already exist on the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password that you use to run the command on Windows instances.</p>
     * <br>
     * <p>If you do not want to use the default username System to run the command on Windows instances, you must specify the WindowsPasswordName and `Username` parameters. The password is stored in plaintext in the parameter repository of Operation Orchestration Service (OOS) to reduce the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Encrypt parameters](~~186828~~) and [Configure a regular user to run Cloud Assistant commands](~~203771~~).</p>
     * <br>
     * <p>> If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify the WindowsPasswordName parameter.</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The working directory of the command on the instance.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   For Linux instances, the default value is `/root`, which is the home directory of the administrator (the root user).</p>
     * <p>*   For Windows instances, the default value is the directory where the Cloud Assistant client process resides. Example: `C:\Windows\System32`.</p>
     */
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
        /**
         * <p>The key of tag N of the command. You can specify up to 20 tag keys for the command. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If you specify a tag to query resources, up to 1,000 resources that have the specified tag can be displayed in the response. If you specify multiple tags to query resources, up to 1,000 resources that have all specified tags can be displayed in the response. To query more than 1,000 resources that have the specified tags, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string.</p>
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
