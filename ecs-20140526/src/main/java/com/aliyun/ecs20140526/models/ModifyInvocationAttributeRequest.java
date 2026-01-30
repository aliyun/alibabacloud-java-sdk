// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the command after modification. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <ul>
     * <li><p>You can specify whether to retain the command after the command is run when you created the command. If you specified to retain the command, the Base64-encoded command content cannot exceed 18 KB in size. If you specified not to retain the command, the Base64-encoded command content cannot exceed 24 KB in size.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, set <code>ContentEncoding</code> to Base64.</p>
     * </li>
     * <li><p>If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:</p>
     * <ul>
     * <li>You can define custom parameters in the <code>{{}}</code> format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
     * <li>The number of custom parameters cannot exceed 20.</li>
     * <li>A custom parameter name can contain letters, digits, underscores (_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</li>
     * <li>Each custom parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters. Then, when you run the command, these parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:</p>
     * <ul>
     * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
     * </li>
     * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. If you want to specify <code>{{ACS::InstanceId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. When the command is run on multiple instances, if you want to specify <code>{{ACS::InstanceName}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InvokeId}}</code>: the ID of the task. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::CommandId}}</code>: the command ID. If you want to specify <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyAxMjM=</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding mode of the command content that is specified by <code>CommandContent</code>. Valid values (case-insensitive):</p>
     * <ul>
     * <li>PlainText: The command content is not encoded.</li>
     * <li>Base64: The command content is encoded in Base64.</li>
     * </ul>
     * <p>Default value: PlainText. If the value is invalid, the PlainText mode is used.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to include custom parameters in the command.</p>
     * <ul>
     * <li>If you want to enable the custom parameter feature, or configure <code>Parameters</code> to modify the custom parameters in the command, set EnableParameter to <code>true</code>.</li>
     * <li>If you do not want to configure <code>Parameters</code> to modify the custom parameters in the command, leave EnableParameter empty or set it to <code>false</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The frequency at which to run the command. This parameter takes effect only when <code>RepeatMode</code> is set to <code>Period</code>. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specific point in time, or run at designated points in time based on a cron expression.</p>
     * <ul>
     * <li><p>To run the command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: <code>rate(&lt;Execution interval value&gt; &lt;Execution interval unit&gt;)</code>. For example, specify <code>rate(5m)</code> to run the command every 5 minutes. Take note of the following limits when you specify an interval:</p>
     * <ul>
     * <li>The specified interval must be in the range of 60 seconds to 7 days and must be longer than the timeout period specified when you created the scheduled task.</li>
     * <li>The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes and the command requires 2 minutes to run once. Each time the command running is complete, the system waits 3 minutes instead of 5 minutes before the system runs the command again.</li>
     * <li>The point in time at which the command is run the next time is calculated based on the creation time of the task (the <a href="https://help.aliyun.com/document_detail/64840.html">CreationTime</a> value returned by the <code>DescribeInvocations</code> operation) and the modified execution interval.</li>
     * </ul>
     * </li>
     * <li><p>To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the <code>at(yyyy-MM-dd HH:mm:ss &lt;Time zone&gt;)</code> format, which indicates <code>at(Year-Month-Day Hours:Minutes:Seconds &lt;Time zone&gt;)</code>. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:</p>
     * <ul>
     * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
     * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
     * <li>The time zone abbreviation. Only UTC is supported.</li>
     * </ul>
     * <p>For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>To run a command at designated points in time, use a cron expression to define the schedule. Specify a schedule in the <code>&lt;Cron expression&gt; &lt;Time zone&gt;</code> format. The cron expression is in the <code>&lt;Seconds&gt; &lt;Minutes&gt; &lt;Hours&gt; &lt;Day of the month&gt; &lt;Month&gt; &lt;Day of the week&gt; &lt;Year (optional)&gt;</code> format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zones of the instances on which you want to run the command are used by default. For information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. You can specify the time zone in the following forms:</p>
     * <ul>
     * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
     * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
     * <li>The time zone abbreviation. Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Note</strong> The minimum interval must be 10 seconds or longer and cannot be shorter than the timeout period of scheduled executions.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The IDs of the ECS instances or managed instances that you want to add to the scheduled command task.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The execution ID of the command.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key-value pairs of the custom parameters that are passed in if custom parameters are included in the command.</p>
     * <p>You can specify 0 to 10 custom parameters. Take note of the following items:</p>
     * <ul>
     * <li>The key of a custom parameter can be up to 64 characters in length and cannot be an empty string.</li>
     * <li>The value of a custom parameter can be an empty string.</li>
     * <li>If you specified to retain the command when you create the command task, the total size of the custom parameters and original command content that are encoded in Base64 cannot exceed 18 KB. If you specified not to retain the command when you create the command task, the total size of the custom parameters and original command content that are encoded in Base64 cannot exceed 24 KB.</li>
     * <li>The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates not to modify the key-value pairs of the custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI*************&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public ModifyInvocationAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
