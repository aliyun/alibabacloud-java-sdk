// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandRequest extends TeaModel {
    /**
     * <p>The ID of the command. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.</p>
     * <br>
     * <p>>  Common Cloud Assistant commands can be run based on the names. For more information, see [View and run common Cloud Assistant commands](~~429635~~).</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. You can use container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` to specify container runtimes.</p>
     * <br>
     * <p>Note:</p>
     * <br>
     * <p>*   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <br>
     * <p>*   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.</p>
     * <br>
     * <p>    *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).</p>
     * <p>    *   For information about how to update the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).</p>
     * <br>
     * <p>*   If you specify this parameter, the `Username` parameter that is specified in a request to call this operation and the `WorkingDir` parameter that is specified in a request to call the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <br>
     * <p>Note:</p>
     * <br>
     * <p>*   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.</p>
     * <br>
     * <p>*   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.</p>
     * <br>
     * <p>    *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).</p>
     * <p>    *   For information about how to update the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).</p>
     * <br>
     * <p>*   If you specify this parameter, the `Username` parameter that is specified in a request to call this operation and the `WorkingDir` parameter that is specified in a request to call the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule on which you want to run the command. When you set the `Timed` parameter to `true`, you must specify this parameter. You can run a command at a fixed interval based on a rate expression, run the command only once at a specified time, or run the command at specific times based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify an interval in seconds, minutes, hours, or days. This option is suitable when tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you specify an interval:</p>
     * <br>
     * <p>    *   The specified interval can range from 60 seconds to seven days and must be longer than the timeout period of the scheduled task.</p>
     * <p>    *   The interval is the amount of time that elapsed between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes, and the amount of time that is required to run the command once is 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system reruns the command.</p>
     * <p>    *   A task is not immediately executed after it is created. For example, you set the interval to 5 minutes and create a task to run the command. The task runs 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specified time, specify a point in time and a time zone. Specify the point in time in the following format: `at(yyyy-MM-dd HH:mm:ss <Time zone>)`, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the default time zone UTC is used. You can specify the time zone in the following formats:</p>
     * <br>
     * <p>    *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.</p>
     * <p>    *   The abbreviation of the time zone. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to run a command only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To run a command only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at specific times, specify a cron expression. Specify the time in the following format: `<Cron expression> <Time zone>`, where the cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following formats:</p>
     * <br>
     * <p>    *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.</p>
     * <p>    *   The abbreviation of the time zone. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to run a command at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To run a command every 30 minutes from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To run a command every 5 minutes from 14:00:00 to 14:55:00 every October every two years starting from 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** The interval is at least 10 seconds and cannot be shorter than the timeout period of scheduled executions.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of the instances on which you want to run the command. You can specify up to 50 instance IDs in each request.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of the custom parameters that are passed in when the custom parameter feature is enabled. Number of custom parameters: 0 to 10.</p>
     * <br>
     * <p>*   Each key in a Map collection cannot be an empty string and can be up to 64 characters in length.</p>
     * <p>*   Values in a Map collection can be empty strings.</p>
     * <p>*   The size of the command after Base64 encoding, including the custom parameters and the original command content, cannot exceed 18 KB.</p>
     * <p>*   The custom parameter names that are specified by the Parameters parameter must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>If you want to disable the custom parameter feature, you can leave this parameter empty.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies how to run the command. Valid values:</p>
     * <br>
     * <p>*   Once: immediately runs the command.</p>
     * <p>*   Period: runs the command on a schedule. If you set this parameter to `Period`, you must set the `Timed` parameter to true and specify the `Frequency` parameter.</p>
     * <p>*   NextRebootOnly: automatically runs the command the next time the instance starts.</p>
     * <p>*   EveryReboot: automatically runs the command every time the instance starts.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If you set the `Timed` parameter to false and do not specify the `Frequency` parameter, the default value of the RepeatMode parameter is `Once`.</p>
     * <p>*   If you set the `Timed` parameter to true and specify the `Frequency` parameter, `Period` is used as the value of the RepeatMode parameter regardless of whether you specify the RepeatMode parameter.</p>
     * <br>
     * <p>Note:</p>
     * <br>
     * <p>*   If you set the RepeatMode parameter to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled execution of the command.</p>
     * <p>*   If you set the RepeatMode parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set the `IncludeHistory` parameter to true to view the results of previous scheduled executions.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which you want to assign the command executions. Take note of the following items when you set this parameter:</p>
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
     * <p>The tags that you want to add.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InvokeCommandRequestTag> tag;

    /**
     * <p>Specifies whether to run the command on a schedule. Valid values:</p>
     * <br>
     * <p>*   true: runs the command on the schedule that is specified by the `Frequency` parameter. The execution results of a command do not affect the next command execution.</p>
     * <p>*   false: runs the command only once.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    /**
     * <p>The timeout period for the command execution. Unit: seconds.</p>
     * <br>
     * <p>*   The timeout period cannot be less than 10 seconds.</p>
     * <p>*   If a command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist, a timeout error occurs. When an execution times out, the command process is forcibly terminated.</p>
     * <p>*   If you do not specify this parameter, the timeout period that is specified when the command is created prevails and</p>
     * <p>*   is used as the timeout period for the execution. The timeout period of the command is not modified.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The username that you use to run the command on instances.</p>
     * <br>
     * <p>*   For Linux instances, the root username is used.</p>
     * <p>*   For Windows instances, the System username is used.</p>
     * <br>
     * <p>You can also specify other usernames that already exist on the instances to run the command. To ensure security, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password that you use to run the command on Windows instances.</p>
     * <br>
     * <p>If you do not want to use the default username System to run the command on Windows instances, you must specify the WindowsPasswordName and `Username` parameters. The password is stored in plaintext in the parameter repository of Operation Orchestration Service (OOS) to mitigate the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Manage encryption parameters](~~186828~~) and [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     * <br>
     * <p>>  If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify the WindowsPasswordName parameter.</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    public static InvokeCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandRequest self = new InvokeCommandRequest();
        return TeaModel.build(map, self);
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

    public InvokeCommandRequest setTag(java.util.List<InvokeCommandRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InvokeCommandRequestTag> getTag() {
        return this.tag;
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

    public static class InvokeCommandRequestTag extends TeaModel {
        /**
         * <p>The keys of tags of the command. You can specify up to 20 tag keys for the command. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If you specify a tag to query resources, up to 1,000 resources that have the specified tag can be displayed in the response. If you specify multiple tags to query resources, up to 1,000 resources that have all specified tags can be displayed in the response. To query more than 1,000 resources that have the specified tags, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the tags of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
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
