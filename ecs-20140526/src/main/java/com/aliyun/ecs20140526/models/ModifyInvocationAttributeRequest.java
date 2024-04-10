// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeRequest extends TeaModel {
    /**
     * <p>The content of the command after modification. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <br>
     * <p>*   You can specify whether to retain the command after the command is run when you created the command. If you specified to retain the command, the Base64-encoded command content cannot exceed 18 KB in size. If you specified not to retain the command, the Base64-encoded command content cannot exceed 24 KB in size.</p>
     * <br>
     * <p>*   If the command content is Base64-encoded, set `ContentEncoding` to Base64.</p>
     * <br>
     * <p>*   If you set `EnableParameter` to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:</p>
     * <br>
     * <p>    *   You can define custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>    *   The number of custom parameters cannot exceed 20.</p>
     * <p>    *   A custom parameter name can contain letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</p>
     * <p>    *   Each custom parameter name cannot exceed 64 bytes in length.</p>
     * <br>
     * <p>*   You can specify built-in environment parameters as custom parameters. Then, when you run the command, these parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:</p>
     * <br>
     * <p>    *   `{{ACS::RegionId}}`: the region ID.</p>
     * <br>
     * <p>    *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.</p>
     * <br>
     * <p>    *   `{{ACS::InstanceId}}`: the instance ID. If you want to specify `{{ACS::InstanceId}}` as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::InstanceName}}`: the instance name. When the command is run on multiple instances, if you want to specify `{{ACS::InstanceName}}` as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.344</p>
     * <p>        *   Windows: 2.1.3.344</p>
     * <br>
     * <p>    *   `{{ACS::InvokeId}}`: the ID of the task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::CommandId}}`: the command ID. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding mode of the command content that is specified by `CommandContent`. Valid values (case-insensitive):</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is encoded in Base64.</p>
     * <br>
     * <p>Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to include custom parameters in the command.</p>
     * <br>
     * <p>*   If you want to enable the custom parameter feature, or configure `Parameters` to modify the custom parameters in the command, set EnableParameter to `true`.</p>
     * <p>*   If you do not want to configure `Parameters` to modify the custom parameters in the command, leave EnableParameter empty or set it to `false`.</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The frequency at which to run the command. This parameter takes effect only when `RepeatMode` is set to `Period`. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified point in time, or run at designated points in time based on a cron expression.</p>
     * <br>
     * <p>*   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which the command needs to be run at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value> <Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you specify an interval:</p>
     * <br>
     * <p>    *   The interval can be anywhere from 60 seconds to 7 days, and must be longer than the timeout period for executions of the command.</p>
     * <p>    *   The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes and the command requires 2 minutes to run once. Each time the command is run, the system waits 3 minutes before it runs the command again.</p>
     * <p>    *   A task is not run immediately after it is created. For example, you configure the command to run at an interval of 5 minutes. The command begins to run 5 minutes after it is created.</p>
     * <br>
     * <p>*   To run a command only once at a specific point in time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.</p>
     * <p>    *   Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</p>
     * <br>
     * <p>    For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.</p>
     * <br>
     * <p>*   To run a command at specific points in time, use a cron expression to define the schedule. Specify a schedule in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution points in time of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following forms:</p>
     * <br>
     * <p>    *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.</p>
     * <p>    *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.</p>
     * <p>    *   Time zone abbreviation: Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to `0 15 10 ? * * 2022 Asia/Shanghai`. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to `0 0/5 14 * 10 ? 2022/2 UTC`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of the Elastic Compute Service (ECS) instances or managed instances to be added to the execution information of the command that is run on schedule. The total number of instances after you add ECS instances or managed instances to the execution information of the command cannot exceed 100.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The execution ID of the command.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of the custom parameters that were passed in if custom parameters are included in the command.</p>
     * <br>
     * <p>The number of custom parameters ranges from 0 to 10. Take note of the following items:</p>
     * <br>
     * <p>*   The key of a custom parameter can be up to 64 characters in length, and cannot be an empty string.</p>
     * <p>*   The value of a custom parameter can be an empty string.</p>
     * <p>*   If the custom parameters and the original command content are encoded in Base64, the following rules apply: If you specified to retain the command, the total size of the Base64-encoded command content cannot exceed 18 KB. If you specified not to retain the command, the total size of the Base64-encoded command content cannot exceed 24 KB.</p>
     * <p>*   The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates not to modify the key-value pairs of the custom parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInvocationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInvocationAttributeRequest self = new ModifyInvocationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInvocationAttributeRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public ModifyInvocationAttributeRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public ModifyInvocationAttributeRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public ModifyInvocationAttributeRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public ModifyInvocationAttributeRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ModifyInvocationAttributeRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public ModifyInvocationAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInvocationAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInvocationAttributeRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public ModifyInvocationAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInvocationAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInvocationAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
