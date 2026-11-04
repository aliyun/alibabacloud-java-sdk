// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInvocationAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The modified command content. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <ul>
     * <li><p>The size of the Base64-encoded command content cannot exceed 24 KB.</p>
     * </li>
     * <li><p>If the command content is Base64-encoded, you must set <code>ContentEncoding</code> to <code>Base64</code>.</p>
     * </li>
     * <li><p>You can set <code>EnableParameter</code> to <code>true</code> to enable the custom parameter feature in the command content:</p>
     * <ul>
     * <li>Define custom parameters by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter names within <code>{{}}</code> are ignored.</li>
     * <li>You can define up to 20 custom parameters.</li>
     * <li>A custom parameter name can contain letters, digits, hyphens (-), and underscores (_). The <code>acs::</code> prefix is not supported for specifying non-built-in environment variables. Other characters are not supported. Parameter names are not case-sensitive.</li>
     * <li>A single custom parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment variables as custom parameters. When the command is executed, you do not need to manually assign values to these parameters. Cloud Assistant automatically replaces them with the corresponding values in the environment. The following built-in environment variables are supported:</p>
     * <ul>
     * <li><code>{{ACS::RegionId}}</code>: the region ID.</li>
     * <li><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</li>
     * <li><code>{{ACS::InstanceId}}</code>: the instance ID. If the command is sent to multiple instances and you want to specify <code>{{ACS::InstanceId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InstanceName}}</code>: the instance name. If the command is sent to multiple instances and you want to specify <code>{{ACS::InstanceName}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::InvokeId}}</code>: the command execution ID. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><code>{{ACS::CommandId}}</code>: the command ID. If you call this operation to execute a command and want to specify <code>{{ACS::CommandId}}</code> as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following versions: <ul>
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
     * <p>The encoding method of the command content specified by <code>CommandContent</code>. Valid values (case-insensitive):</p>
     * <ul>
     * <li>PlainText: no encoding. The command content is transmitted in plaintext.</li>
     * <li>Base64: Base64 encoding.</li>
     * </ul>
     * <p>Default value: PlainText. If an invalid value is specified, PlainText is used.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether the modified command contains custom parameters.</p>
     * <ul>
     * <li>If you enable custom parameters or modify the custom parameters specified by <code>Parameters</code>, set this parameter to <code>true</code>.</li>
     * <li>If you do not modify the custom parameters specified by <code>Parameters</code>, leave this parameter empty or set it to <code>false</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The modified scheduled execution frequency. This parameter takes effect only when <code>RepeatMode</code> is set to <code>Period</code>. Three scheduled execution modes are supported: execution at a fixed time interval (based on a rate expression), one-time execution at a specified time, and clock-based scheduled execution (based on a cron expression).</p>
     * <ul>
     * <li><p>Execution at a fixed time interval: based on a rate expression, the command is executed at the specified time interval. The time interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This mode is suitable for scenarios where tasks are executed at fixed time intervals. The format is <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to execute the command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to execution at a fixed time interval:</p>
     * <ul>
     * <li>The specified time interval must not exceed 7 days, must not be less than 60 seconds, and must be greater than the timeout period specified when the scheduled task was created.</li>
     * <li>The execution interval is based only on the fixed frequency and is independent of the actual time required to execute the task. For example, if the command is executed every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed.</li>
     * <li>The next execution time is calculated based on the task creation time (refer to <a href="https://help.aliyun.com/document_detail/64840.html">CreationTime</a> returned by <code>DescribeInvocations</code>, not the modification time) and the modified execution interval.</li>
     * </ul>
     * </li>
     * <li><p>One-time execution at a specified time: the command is executed once at the specified time zone and time point. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>, which means <code>at(year-month-day hour:minute:second &lt;time zone&gt;)</code>. If no time zone is specified, the UTC time zone is used by default. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: such as <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). When the GMT format is used, leading zeros are not supported for the hour.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute the command once at 13:15:30 on June 6, 2022 in the China/Shanghai time zone, use <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To execute the command once at 13:15:30 on June 6, 2022 in the UTC-7 time zone, use <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
     * </li>
     * <li><p>Clock-based scheduled execution (based on a cron expression): based on a cron expression, the command is executed according to the scheduled task settings. The format is <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which means <code>&lt;cron expression&gt; &lt;time zone&gt;</code>. In the specified time zone, the execution time of the scheduled task is calculated based on the cron expression and executed. If no time zone is specified, the internal system time zone of the instance that executes the scheduled task is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
     * <ul>
     * <li>Time zone full name: such as <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
     * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). When the GMT format is used, leading zeros are not supported for the hour.</li>
     * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.
     * For example, to execute the command once at 10:15 every day in 2022 in the China/Shanghai time zone, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To execute the command every half hour from 10:00 to 11:30 every day in 2022 in the UTC+8 time zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To execute the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in the UTC time zone, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
     * </ul>
     * <blockquote>
     * <p>The minimum time interval must be greater than or equal to the timeout period specified when the scheduled task was created, and must not be less than 10 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The ECS instance ID or managed instance ID to be added to the task.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The execution ID of the command for the task to be modified.</p>
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
     * <p>The key-value pairs of the custom parameters passed when the command is executed. This parameter is valid when the command contains custom parameters.</p>
     * <p>You can specify 0 to 10 custom parameters. Take note of the following items:</p>
     * <ul>
     * <li>A key cannot be an empty string and can be up to 64 characters in length.</li>
     * <li>A value can be an empty string.</li>
     * <li>After the custom parameters and the original command content are Base64-encoded, the size of the Base64-encoded command content cannot exceed 24 KB.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed, you can use empty strings.</li>
     * </ul>
     * <p>Default value: empty. This indicates that the key-value pairs of custom parameters are not modified.</p>
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
