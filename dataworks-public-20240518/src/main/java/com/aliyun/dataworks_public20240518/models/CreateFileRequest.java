// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings of the task.</p>
     * <p>This parameter corresponds to the <strong>Advanced Settings</strong> in the right-side navigation pane of the edit page for EMR Spark Streaming and EMR Streaming SQL Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL tasks support this parameter, and the parameter value must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;queue&quot;:&quot;default&quot;,&quot;SPARK_CONF&quot;:&quot;--conf spark.driver.memory=2g&quot;}</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <p>Specifies whether the scheduling configuration takes effect immediately after the file is published.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyScheduleImmediately")
    public Boolean applyScheduleImmediately;

    /**
     * <p>Specifies whether to enable automatic parsing for the file. Valid values:</p>
     * <ul>
     * <li>true: Automatically parses the code in the file.</li>
     * <li>false: Does not automatically parse the code in the file.</li>
     * </ul>
     * <p>This parameter corresponds to the code parsing setting in <strong>Schedule Settings &gt; Scheduling Dependencies</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between automatic reruns after a failure, in milliseconds.
     * Maximum value: 1800000 (30 minutes).</p>
     * <p>This parameter corresponds to the <strong>Rerun Interval</strong> setting in <strong>Schedule Settings &gt; Time Attributes &gt; Automatic Rerun after Failure</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.
     * The time unit for <strong>Rerun Interval</strong> in the console is minutes. Convert the time accordingly when you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The maximum number of automatic reruns after an error occurs.
     * Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The data source connected when the task is run after the file is published as a task.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/211432.html">UpdateDataSource</a> operation to obtain the list of available data sources in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code content of the file. The code format varies based on the code type (fileType) of the file.
     * You can find a task of the corresponding type in Operation Center, right-click the task, and select View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SHOW TABLES;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to automatically create the directory specified by the FileFolderPath parameter if the directory does not exist. Valid values:</p>
     * <ul>
     * <li>true: Automatically creates the directory if it does not exist.</li>
     * <li>false: The call fails if the directory does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <p>The cron expression for periodic scheduling. This parameter corresponds to the <strong>Schedule Settings &gt; Time Property &gt; Cron Expression</strong> setting for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the <strong>Scheduling Cycle</strong> and <strong>timed scheduling time</strong>, DataWorks automatically generates the corresponding cron expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>timed scheduling at 05:30 every day: <code>00 30 05 * * ?</code></p>
     * </li>
     * <li><p>timed scheduling at the 15th minute of every hour: <code>00 15 00-23/1 * * ?</code></p>
     * </li>
     * <li><p>Schedule the task every 10 minutes: <code>00 00/10 * * * ?</code></p>
     * </li>
     * <li><p>Schedule the task every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-17 * * * ?</code></p>
     * </li>
     * <li><p>Automatically schedule the task at 00:20 on the 1st day of every month: <code>00 20 00 1 * ?</code></p>
     * </li>
     * <li><p>Schedule the task every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code></p>
     * </li>
     * <li><p>Automatically schedule the task at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code></p>
     * </li>
     * </ul>
     * <p>Due to the rules of the DataWorks scheduling system, cron expressions have the following limits:</p>
     * <ul>
     * <li><p>The minimum scheduling interval is 5 minutes.</p>
     * </li>
     * <li><p>The earliest scheduling time every day is 00:05.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>00 05 00 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minutes and hours) and DAY (days, weeks, and months).</p>
     * <p>This parameter corresponds to the <strong>Schedule Settings &gt; Time Attributes &gt; Schedule Cycle</strong> setting for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes on which the current file depends when the DependentType parameter settings are USER_DEFINE. Separate multiple node IDs with commas (,).</p>
     * <p>This parameter corresponds to the Settings when you set <strong>Schedule Settings &gt; Scheduling Dependencies</strong> to <strong>Cross-cycle Dependencies (formerly Previous Cycle)</strong> and select <strong>Other Nodes</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The dependency on the previous cycle. Valid values:</p>
     * <ul>
     * <li>SELF: Depends on the current node.</li>
     * <li>CHILD: Depends on the first-level child nodes.</li>
     * <li>USER_DEFINE: Depends on other nodes.</li>
     * <li>NONE: Does not depend on the previous cycle.   </li>
     * <li>USER_DEFINE_AND_SELF: Depends on a combination of the current node and other nodes across cycles.</li>
     * <li>CHILD_AND_SELF: Depends on a combination of the first-level child nodes and the current node across cycles.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The timestamp in milliseconds when automatic scheduling stops.</p>
     * <p>This parameter corresponds to the end time in milliseconds configured in <strong>Schedule Settings &gt; Time Attributes &gt; Effective Date</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1671694850000</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    /**
     * <p>The description of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/MaxCompute/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File name</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The code type of the file.
     * Different file types have different code formats. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node types</a>.
     * You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the code type of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <p>Specifies whether to inherit the dry-run property from the previous cycle. Valid values:</p>
     * <ul>
     * <li><p>true: Inherits the dry-run property from the previous cycle.</p>
     * </li>
     * <li><p>false: Does not inherit the dry-run property from the previous cycle.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <p>The ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1h4b5a8ogkbll2f3tr</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The output names of the upstream files on which the current file depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the <strong>Output Name of Upstream Node</strong> setting in <strong>Schedule Settings &gt; Scheduling Dependencies</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The context input parameters of the node. The parameter value is in JSON format. For the included fields, refer to the structure of the InputContextParameterList parameter in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the <strong>Schedule Settings &gt; Node Context Parameters &gt; Input Parameters of Current Node</strong> setting for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output of the file.</p>
     * <p>This parameter corresponds to the <strong>Output Name of Current Node</strong> setting in <strong>Schedule Settings &gt; Scheduling Dependencies</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project.ods_user_info_d</p>
     */
    @NameInMap("OutputList")
    public String outputList;

    /**
     * <p>The context output parameters of the node. The parameter value is in JSON format. For the included fields, refer to the structure of the OutputContextParameterList parameter in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the <strong>Schedule Settings &gt; Node Context Parameters &gt; Output Parameters of Current Node</strong> setting for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The Alibaba Cloud user ID of the file owner. If this parameter is left empty,
     * the Alibaba Cloud user ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters. Separate multiple parameters with spaces.</p>
     * <p>This parameter corresponds to the <strong>Schedule Settings &gt; Scheduling Parameters</strong> setting for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>a=x b=y</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.
     * You must specify either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace name.</p>
     * <p>You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The rerun policy. Valid values:</p>
     * <ul>
     * <li>ALL_ALLOWED: The task can be rerun after it succeeds or fails.</li>
     * <li>FAILURE_ALLOWED: The task cannot be rerun after it succeeds, but can be rerun after it fails.</li>
     * <li>ALL_DENIED: The task cannot be rerun regardless of whether it succeeds or fails.</li>
     * </ul>
     * <p>This parameter corresponds to the <strong>Rerun Policy</strong> setting in <strong>Schedule Settings &gt; Time Attributes &gt; Rerun Policy</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p><strong>[Deprecated]</strong> Do not use this field.</p>
     * 
     * <strong>example:</strong>
     * <p>375827434852437</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The resource group used to run the task after the file is published as a task. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>,
     * go to the Workspace Management page, and click <strong>Resource Groups</strong> in the left-side navigation pane to obtain the ID of the resource group bound to the current workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>S_res_group_559_1613715566828</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>NORMAL: Normal scheduling task.</li>
     * <li>MANUAL: Manual task. It is not run on a daily schedule and corresponds to a node in a manual business flow.</li>
     * <li>PAUSE: Paused task.</li>
     * <li>SKIP: Dry-run task. It is run on a daily schedule, but its status is directly set to successful when the scheduling is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The timestamp in milliseconds when automatic scheduling starts.</p>
     * <p>This parameter corresponds to the start time in milliseconds configured in <strong>Schedule Settings &gt; Time Attributes &gt; Effective Date</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1671608450000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to start the task immediately after it is published.</p>
     * <p>This parameter corresponds to the <strong>Configuration &gt; Time Attributes &gt; Start Mode</strong> setting in the right-side navigation pane of the edit page for EMR Spark Streaming and EMR Streaming SQL Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <p>Specifies whether to pause scheduling. Valid values:</p>
     * <ul>
     * <li>true: Pauses scheduling.</li>
     * <li>false: Does not pause scheduling.</li>
     * </ul>
     * <p>This parameter corresponds to setting <strong>Schedule Settings &gt; Time Attributes &gt; Schedule Type</strong> to <strong>Pause Scheduling</strong> for a Data Studio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    /**
     * <p>The timeout definition in the scheduling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setAdvancedSettings(String advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public String getAdvancedSettings() {
        return this.advancedSettings;
    }

    public CreateFileRequest setApplyScheduleImmediately(Boolean applyScheduleImmediately) {
        this.applyScheduleImmediately = applyScheduleImmediately;
        return this;
    }
    public Boolean getApplyScheduleImmediately() {
        return this.applyScheduleImmediately;
    }

    public CreateFileRequest setAutoParsing(Boolean autoParsing) {
        this.autoParsing = autoParsing;
        return this;
    }
    public Boolean getAutoParsing() {
        return this.autoParsing;
    }

    public CreateFileRequest setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
        this.autoRerunIntervalMillis = autoRerunIntervalMillis;
        return this;
    }
    public Integer getAutoRerunIntervalMillis() {
        return this.autoRerunIntervalMillis;
    }

    public CreateFileRequest setAutoRerunTimes(Integer autoRerunTimes) {
        this.autoRerunTimes = autoRerunTimes;
        return this;
    }
    public Integer getAutoRerunTimes() {
        return this.autoRerunTimes;
    }

    public CreateFileRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateFileRequest setCreateFolderIfNotExists(Boolean createFolderIfNotExists) {
        this.createFolderIfNotExists = createFolderIfNotExists;
        return this;
    }
    public Boolean getCreateFolderIfNotExists() {
        return this.createFolderIfNotExists;
    }

    public CreateFileRequest setCronExpress(String cronExpress) {
        this.cronExpress = cronExpress;
        return this;
    }
    public String getCronExpress() {
        return this.cronExpress;
    }

    public CreateFileRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public CreateFileRequest setDependentNodeIdList(String dependentNodeIdList) {
        this.dependentNodeIdList = dependentNodeIdList;
        return this;
    }
    public String getDependentNodeIdList() {
        return this.dependentNodeIdList;
    }

    public CreateFileRequest setDependentType(String dependentType) {
        this.dependentType = dependentType;
        return this;
    }
    public String getDependentType() {
        return this.dependentType;
    }

    public CreateFileRequest setEndEffectDate(Long endEffectDate) {
        this.endEffectDate = endEffectDate;
        return this;
    }
    public Long getEndEffectDate() {
        return this.endEffectDate;
    }

    public CreateFileRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public CreateFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public CreateFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateFileRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public CreateFileRequest setIgnoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
        this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
        return this;
    }
    public Boolean getIgnoreParentSkipRunningProperty() {
        return this.ignoreParentSkipRunningProperty;
    }

    public CreateFileRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateFileRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public CreateFileRequest setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public String getInputParameters() {
        return this.inputParameters;
    }

    public CreateFileRequest setOutputList(String outputList) {
        this.outputList = outputList;
        return this;
    }
    public String getOutputList() {
        return this.outputList;
    }

    public CreateFileRequest setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
        return this;
    }
    public String getOutputParameters() {
        return this.outputParameters;
    }

    public CreateFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateFileRequest setParaValue(String paraValue) {
        this.paraValue = paraValue;
        return this;
    }
    public String getParaValue() {
        return this.paraValue;
    }

    public CreateFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateFileRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public CreateFileRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFileRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public CreateFileRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public CreateFileRequest setStartEffectDate(Long startEffectDate) {
        this.startEffectDate = startEffectDate;
        return this;
    }
    public Long getStartEffectDate() {
        return this.startEffectDate;
    }

    public CreateFileRequest setStartImmediately(Boolean startImmediately) {
        this.startImmediately = startImmediately;
        return this;
    }
    public Boolean getStartImmediately() {
        return this.startImmediately;
    }

    public CreateFileRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

    public CreateFileRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
