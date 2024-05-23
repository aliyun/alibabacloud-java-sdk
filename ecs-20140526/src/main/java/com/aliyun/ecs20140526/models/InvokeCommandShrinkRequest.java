// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.</p>
     * <br>
     * <p>>  Common Cloud Assistant commands can be run based on their names. For more information, see [View and run common Cloud Assistant commands](~~429635~~).</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. You can use container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` to specify container runtimes.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * <br>
     * <p>*   If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <br>
     * <p>    *   For information about how to query the version of Cloud Assistant Agent, see [Install Cloud Assistant Agent](~~64921~~).</p>
     * <p>    *   For information about how to upgrade Cloud Assistant Agent, see [Upgrade or disable upgrades for Cloud Assistant Agent](~~134383~~).</p>
     * <br>
     * <p>*   If this parameter is specified, the `Username` parameter that is specified in a request to call this operation and the `WorkingDir` parameter that is specified in a request to call the [CreateCommand](~~64844~~) operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the container.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * <br>
     * <p>*   If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <br>
     * <p>    *   For information about how to query the version of Cloud Assistant Agent, see [Install Cloud Assistant Agent](~~64921~~).</p>
     * <p>    *   For information about how to upgrade Cloud Assistant Agent, see [Upgrade or disable upgrades for Cloud Assistant Agent](~~134383~~).</p>
     * <br>
     * <p>*   If this parameter is specified, the `Username` parameter that is specified in a request to call this operation and the `WorkingDir` parameter that is specified in a request to call the [CreateCommand](~~64844~~) operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     * <br>
     * <p>*   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specific time, or run at specific times based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
     * <br>
     * <p>    *   The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</p>
     * <p>    *   The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system runs the command again.</p>
     * <p>    *   A task is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</p>
     * <p>    *   The time zone abbreviation. Only UTC is supported.</p>
     * <br>
     * <p>    For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify a time zone in the following forms:</p>
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
     * <p>The IDs of instances on which you want to run the command. You can specify up to 100 instance IDs in each request. Valid values of N: 1 to 100.</p>
     * <br>
     * <p>You can apply for a quota increase in the Quota Center console. The quota name is Maximum number of instances supported for command execution.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled. Number of custom parameters: 0 to 10.</p>
     * <br>
     * <p>*   Keys in a Map collection can be up to 64 characters in length, and cannot be empty strings.</p>
     * <p>*   Values in a Map collection can be empty strings.</p>
     * <p>*   The size of the Base64-encoded custom parameters and original command content cannot exceed 18 KB.</p>
     * <p>*   The custom parameter names specified in the value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>If you want to disable the custom parameter feature, you can leave this parameter empty.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The mode in which you want to run the command. Valid values:</p>
     * <br>
     * <p>*   Once: runs the command immediately.</p>
     * <p>*   Period: runs the command based on a schedule. If you set this parameter to `Period`, you must also configure the `Frequency` parameter.</p>
     * <p>*   NextRebootOnly: runs the command the next time the instance is started.</p>
     * <p>*   EveryReboot: runs the command every time the instance is started.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   If you do not specify `Frequency`, the default value is `Once`.</p>
     * <p>*   If you specify `Frequency`, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is set to Period.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   You can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled executions of the command.</p>
     * <p>*   If you set this parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation with `IncludeHistory` set to true to query the results of historical scheduled executions.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which to assign the command executions. When you set this parameter, take note of the following items:</p>
     * <br>
     * <p>*   The instances specified by InstanceId.N must belong to the specified resource group.</p>
     * <p>*   After the command is run, you can call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation with ResourceGroupId set to query the execution results in the specified resource group.</p>
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
    public java.util.List<InvokeCommandShrinkRequestResourceTag> resourceTag;

    @NameInMap("Tag")
    public java.util.List<InvokeCommandShrinkRequestTag> tag;

    /**
     * <p>Specifies how to stop the command task when a command execution is manually stopped or times out. Valid values:</p>
     * <br>
     * <p>*   Process: stops the process of the command.</p>
     * <p>*   ProcessTree: stops the process tree of the command. In this case, the process of the command and all subprocesses of the process are stopped.</p>
     */
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
     * <p>*   The timeout period cannot be less than 10 seconds.</p>
     * <p>*   A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When the specified timeout period ends, the command process is forcefully terminated.</p>
     * <p>*   If you do not specify this parameter, the timeout period that is specified when the command is created is used.</p>
     * <p>*   This timeout period is applicable only to this execution. The timeout period of the command is not modified.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The username to use to run the command on the ECS instances. The username cannot exceed 255 characters in length.</p>
     * <br>
     * <p>*   For Linux instances, the root username is used by default.</p>
     * <p>*   For Windows instances, the System username is used by default.</p>
     * <br>
     * <p>You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the password to use to run the command on a Windows instance. The name cannot exceed 255 characters in length.</p>
     * <br>
     * <p>If you do not want to use the default System user to run the command on Windows instances, specify both WindowsPasswordName and `Username`. To mitigate the risk of password leaks, the password is stored in plaintext in CloudOps Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName. For more information, see [Manage encryption parameters](~~186828~~) and [Run Cloud Assistant commands as a regular user](~~203771~~).</p>
     * <br>
     * <p>>  If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify WindowsPasswordName.</p>
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

    public InvokeCommandShrinkRequest setResourceTag(java.util.List<InvokeCommandShrinkRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<InvokeCommandShrinkRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public InvokeCommandShrinkRequest setTag(java.util.List<InvokeCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InvokeCommandShrinkRequestTag> getTag() {
        return this.tag;
    }

    public InvokeCommandShrinkRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
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

    public static class InvokeCommandShrinkRequestResourceTag extends TeaModel {
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

        public static InvokeCommandShrinkRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            InvokeCommandShrinkRequestResourceTag self = new InvokeCommandShrinkRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public InvokeCommandShrinkRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InvokeCommandShrinkRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeCommandShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
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
