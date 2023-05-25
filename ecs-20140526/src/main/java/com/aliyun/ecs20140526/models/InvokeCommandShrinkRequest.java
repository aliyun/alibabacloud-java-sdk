// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandShrinkRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见[如何保证幂等性](~~25693~~)。</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.</p>
     * <br>
     * <p>> Common Cloud Assistant commands can be run based on their names. For more information, see [View and run common Cloud Assistant commands](~~429635~~).</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The container ID. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` are allowed to specify container runtimes.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is configured, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <br>
     * <p>*   If this parameter is configured, scripts can be run only on Linux instances on which Cloud Assistant clients whose versions are not earlier than 2.2.3.344 are installed.</p>
     * <br>
     * <p>    *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).</p>
     * <p>    *   For information about how to upgrade the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).</p>
     * <br>
     * <p>*   If this parameter is configured, the `Username` parameter configured in a request to this operation and the `WorkingDir` parameter configured in a request to the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If this parameter is configured, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is configured, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <br>
     * <p>*   If this parameter is configured, scripts can be run only on Linux instances on which Cloud Assistant clients whose versions are not earlier than 2.2.3.344 are installed.</p>
     * <br>
     * <p>    *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).</p>
     * <p>    *   For information about how to upgrade the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).</p>
     * <br>
     * <p>*   If this parameter is configured, the `Username` parameter configured in a request to this operation and the `WorkingDir` parameter configured in a request to the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If this parameter is configured, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule based on which you want to run the command. This parameter is required if you set `Timed` to `true`. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified point in time, or run at designated points in time based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is applicable when tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Running interval value><Running interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you specify an interval:</p>
     * <br>
     * <p>    *   The specified interval can range from 60 seconds to 7 days and must be longer than the timeout period of the scheduled task.</p>
     * <p>    *   The interval is the duration between two consecutive executions. The interval is irrelevant to the amount of time required to run the command once. For example, if you set the interval to 5 minutes and 2 minutes are required to run the command each time. Each time the command is run, the system waits 3 minutes before it runs the command again.</p>
     * <p>    *   A task is not run immediately after it is created. For example, if you set the interval to 5 minutes and create a task to run the command. The task begins to run 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specified point in time, specify a point in time and a time zone. Specify the point in time in the following format: `at(yyyy-MM-dd HH:mm:ss <Time zone>)`, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the UTC time zone is used by default. You can specify the time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.</p>
     * <p>    *   The time zone abbreviation. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to configure a command to run only once at 13:15:30 on June 06, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 06, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at designated points in time, specify a cron expression. Specify the time in the following format: `<Cron expression> <Time zone>`, where the cron expression is in the format of `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>`. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which to run the command is used by default. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.</p>
     * <p>    *   The time zone abbreviation. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years since 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of the instances on which you want to run the command. You can specify a maximum of 50 instance IDs in each request. Valid values of N: 1 to 50.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of custom parameters to pass in when the custom parameter feature is enabled. Supported number of custom parameters: 0 to 10.</p>
     * <br>
     * <p>*   Each key in a Map collection cannot be an empty string and can be a maximum of 64 characters in length.</p>
     * <p>*   Values in a Map collection can be empty strings.</p>
     * <p>*   The size of the command (including custom parameters and original command content) after Base64 encoding cannot exceed 18 KB.</p>
     * <p>*   The custom parameter names specified in the value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not specified.</p>
     * <br>
     * <p>You can leave this parameter empty to disable the custom parameter feature.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The mode in which you want to run the command. Valid values:</p>
     * <br>
     * <p>*   Once: Immediately runs the command.</p>
     * <p>*   Period: Runs the command on a schedule. If you set this parameter to `Period`, you must set `Timed` to true and configure `Frequency`.</p>
     * <p>*   NextRebootOnly: Automatically runs the command the next time the instance starts.</p>
     * <p>*   EveryReboot: Automatically runs the command every time the instance starts.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   When `Timed` is set to false and `Frequency` is not configured, the default value of RepeatMode is `Once`.</p>
     * <p>*   When `Timed` is set to true and `Frequency` is configured, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is configured.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   When this parameter is set to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled executions of the command.</p>
     * <p>*   When this parameter is set to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set `IncludeHistory` to true to view the results of historical scheduled executions.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group on which you want to run the command. When you configure this parameter, take note of the following items:</p>
     * <br>
     * <p>*   The instances that are specified by the InstanceId parameter must belong to this resource group.</p>
     * <p>*   After the command is run, you can call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation with ResourceGroupId configured to query the running results of the command.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags to add to the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to run the command on a schedule. Valid values:</p>
     * <br>
     * <p>*   true: Runs the command on the schedule specified by `Frequency`. The results of each execution of a command do not affect the next execution of the command.</p>
     * <p>*   false: Runs the command only once.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command running. Unit: seconds.</p>
     * <br>
     * <p>*   The timeout period cannot be less than 10 seconds.</p>
     * <p>*   A timeout error occurs when a command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist. When an execution times out, the command process is forcefully terminated.</p>
     * <p>*   If this parameter is not configured, the timeout period specified when the command is created is used.</p>
     * <p>*   The value of this parameter is used only as the timeout period for command execution. The timeout period of the command is not changed.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The username to use to run the command on ECS instances.</p>
     * <br>
     * <p>*   For Linux instances, the root user is used.</p>
     * <p>*   For Windows instances, the System user is used.</p>
     * <br>
     * <p>You can also specify other usernames that already exist in the ECS instance to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](~~203771~~).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password to use to run the command on a Windows instance.</p>
     * <br>
     * <p>If you want to use a username other than the default System username to run the command on the Windows instance, you must configure both the WindowsPasswordName and `Username` parameters. The password is hosted in plaintext in the parameter repository of Operation Orchestration Service (OOS) to mitigate the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Manage encryption parameters](~~186828~~) and [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     * <br>
     * <p>> When you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to configure the WindowsPasswordName parameter.</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

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

    public InvokeCommandShrinkRequest setTag(java.util.List<InvokeCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InvokeCommandShrinkRequestTag> getTag() {
        return this.tag;
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

    public static class InvokeCommandShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If a single tag is specified to query resources, a maximum of 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, a maximum of 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be a maximum of 64 characters in length and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the command. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be a maximum of 128 characters in length and cannot contain `http://` or `https://`.</p>
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
