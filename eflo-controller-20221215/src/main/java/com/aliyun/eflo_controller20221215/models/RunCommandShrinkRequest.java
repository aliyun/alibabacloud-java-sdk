// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <p>Ensures idempotence of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests. 
     * ClientToken supports only ASCII characters and cannot exceed 64 characters. For more information, see How to Ensure Idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Command content. Please note the following:</p>
     * <ul>
     * <li>Specify <code>EnableParameter=true</code> to enable custom parameters in the command content.</li>
     * <li>Define custom parameters using the {{}} format; spaces and newlines within <code>{{}}</code> will be ignored.</li>
     * <li>The number of custom parameters cannot exceed 20.</li>
     * <li>Custom parameter names can only contain a-zA-Z0-9-_, and are case-insensitive.</li>
     * <li>A single custom parameter name cannot exceed 64 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyAxMjM=</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <strong>example:</strong>
     * <p>c-e996287206324975b5fbe1d***</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>Encoding method for the script content. Valid values:</p>
     * <ul>
     * <li>PlainText: No encoding, transmitted in plain text.</li>
     * <li>Base64: Base64 encoding.</li>
     * </ul>
     * <p>Default value: PlainText. If an invalid value is provided, it will be treated as PlainText.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Command description.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether the command contains custom parameters.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>Execution time for scheduled commands. Currently, three types of scheduling methods are supported: fixed interval (based on Rate expression), one-time execution at a specific time, and clock-based scheduling (based on Cron expression).</p>
     * <p>Fixed interval execution: Based on the Rate expression, the command is executed at the set interval. The interval can be set in seconds (s), minutes (m), hours (h), and days (d), suitable for scenarios where tasks need to be executed at fixed intervals. The format is rate(<interval value><interval unit>), such as rate(5m) for every 5 minutes. The following restrictions apply to fixed interval execution:</p>
     * <ul>
     * <li>The interval should not exceed 7 days and should be no less than 60 seconds, and it must be greater than the timeout of the scheduled task.</li>
     * <li>The interval is based on a fixed frequency and is independent of the actual execution time of the task. For example, if the command is set to execute every 5 minutes and the task takes 2 minutes to complete, the next round will start 3 minutes after the completion of the task.</li>
     * <li>The task will not be executed immediately upon creation. For example, if the command is set to execute every 5 minutes, it will not be executed immediately upon creation but will start 5 minutes after the task is created.
     * One-time execution at a specific time: Executes the command once at the specified time and timezone. The format is at(yyyy-MM-dd HH:mm:ss <timezone>), which is at(year-month-day hour:minute:second <timezone>). If no timezone is specified, UTC is used by default. Timezones support the following three formats:</li>
     * <li>Full timezone name: e.g., Asia/Shanghai (China/Shanghai time), America/Los_Angeles (America/Los Angeles time), etc.</li>
     * <li>Timezone offset from GMT: e.g., GMT+8:00 (UTC+8:00), GMT-7:00 (UTC-7:00). When using the GMT format, leading zeros are not allowed in the hour position.</li>
     * <li>Timezone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute once at 13:15:30 on June 6, 2022, in Shanghai, China, the format would be: at(2022-06-06 13:15:30 Asia/Shanghai); to execute once at 13:15:30 on June 6, 2022, in the GMT-7:00 timezone, the format would be: at(2022-06-06 13:15:30 GMT-7:00).</p>
     * <p>Clock-based scheduling (based on Cron expression): Based on the Cron expression, the command is executed according to the set schedule. The format is <second> <minute> <hour> <day> <month> <weekday> &lt;year (optional)&gt; <timezone>, i.e., <Cron expression> <timezone>. In the specified timezone, the scheduled task execution time is calculated based on the Cron expression and then executed. If no timezone is specified, the system\&quot;s internal timezone of the instance running the scheduled task is used by default. For more information about Cron expressions, see Cron Expressions. Timezones support the following three formats:</p>
     * <ul>
     * <li>Full timezone name: e.g., Asia/Shanghai (China/Shanghai time), America/Los_Angeles (America/Los Angeles time), etc.</li>
     * <li>Timezone offset from GMT: e.g., GMT+8:00 (UTC+8:00), GMT-7:00 (UTC-7:00). When using the GMT format, leading zeros are not allowed in the hour position.</li>
     * <li>Timezone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
     * </ul>
     * <p>For example, to execute the command at 10:15 AM every day in 2022 in Shanghai, China, the format would be 0 15 10 ? * * 2022 Asia/Shanghai; to execute the command every 30 minutes between 10:00 AM and 11:30 AM every day in 2022 in the GMT+8:00 timezone, the format would be 0 0/30 10-11 * * ? 2022 GMT+8:00; to execute the command every 5 minutes between 2:00 PM and 2:55 PM every day in October every two years starting from 2022 in UTC, the format would be 0 0/5 14 * 10 ? 2022/2 UTC.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>Command name.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>List of nodes.</p>
     */
    @NameInMap("NodeIdList")
    public String nodeIdListShrink;

    /**
     * <p>When the command contains custom parameters, you need to pass in key-value pairs of these custom parameters when executing the command. For example, if the command content is <code>echo {{name}}</code>, you can pass in the key-value pair <code>{&quot;name&quot;:&quot;Jack&quot;}</code> through the <code>Parameter</code> parameter. The custom parameter will automatically replace the variable value <code>name</code>, resulting in a new command, which actually executes as <code>echo Jack</code>.</p>
     * <p>The number of custom parameters ranges from 0 to 10, and you should note:</p>
     * <ul>
     * <li>Keys cannot be empty strings and support up to 64 characters at most.</li>
     * <li>Values can be empty strings.</li>
     * <li>When combined with the original command content and Base64 encoded, if the command is saved, the size after Base64 encoding must not exceed 18 KB; if the command is not saved, the size after Base64 encoding must not exceed 24 KB. You can set whether to keep the command via <code>KeepCommand</code>.</li>
     * <li>The set of custom parameter names must be a subset of the parameter set defined during command creation. For parameters that are not passed in, you can use an empty string as a substitute.</li>
     * </ul>
     * <p>The default value is empty, indicating that the parameter is not set, thus disabling custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>Set the command execution mode. Valid values:</p>
     * <ul>
     * <li>Once: Execute the command immediately.</li>
     * <li>Period: Execute the command at a scheduled time. When this parameter is set to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
     * <li>NextRebootOnly: Automatically execute the command when the instance starts next time.</li>
     * <li>EveryReboot: Automatically execute the command every time the instance starts.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>If the <code>Frequency</code> parameter is not specified, the default value is <code>Once</code>.</li>
     * <li>If the <code>Frequency</code> parameter is specified, regardless of whether this parameter is already set, it will be processed as <code>Period</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <strong>example:</strong>
     * <p>ProcessTree</p>
     */
    @NameInMap("TerminationMode")
    public String terminationMode;

    /**
     * <p>Timeout for executing the command, in seconds. If the command cannot run due to process issues, missing modules, or the absence of the Cloud Assistant Agent, a timeout will occur. After a timeout, the command process will be forcibly terminated. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The username to execute the command in the instance. The length must not exceed 255 characters.
     *     For Linux systems, the command is executed by the root user by default.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>You can customize the execution path of the command. The default paths are as follows:</p>
     * <ul>
     * <li>Linux instances: The default execution path is under the /home directory of the root user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/home/user</p>
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

    public RunCommandShrinkRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
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

    public RunCommandShrinkRequest setLauncher(String launcher) {
        this.launcher = launcher;
        return this;
    }
    public String getLauncher() {
        return this.launcher;
    }

    public RunCommandShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandShrinkRequest setNodeIdListShrink(String nodeIdListShrink) {
        this.nodeIdListShrink = nodeIdListShrink;
        return this;
    }
    public String getNodeIdListShrink() {
        return this.nodeIdListShrink;
    }

    public RunCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public RunCommandShrinkRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public RunCommandShrinkRequest setTerminationMode(String terminationMode) {
        this.terminationMode = terminationMode;
        return this;
    }
    public String getTerminationMode() {
        return this.terminationMode;
    }

    public RunCommandShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RunCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public RunCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

}
