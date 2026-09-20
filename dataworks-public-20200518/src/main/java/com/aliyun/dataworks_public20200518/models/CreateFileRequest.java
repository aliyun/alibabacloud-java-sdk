// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings of the task.</p>
     * <p>This parameter corresponds to the &quot;Advanced Settings&quot; in the right-side navigation pane of the editing page for EMR Spark Streaming and EMR Streaming SQL DataStudio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL tasks support this parameter. The parameter value must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;queue&quot;:&quot;default&quot;,&quot;SPARK_CONF&quot;:&quot;--conf spark.driver.memory=2g&quot;}</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <p>Specifies whether the scheduling configuration takes effect immediately after publishing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyScheduleImmediately")
    public Boolean applyScheduleImmediately;

    /**
     * <p>Specifies whether to enable automatic parsing for the file. Valid values:</p>
     * <ul>
     * <li>true: The file automatically parses code.</li>
     * <li>false: The file does not automatically parse code.</li>
     * </ul>
     * <p>This parameter corresponds to the &quot;Code Parsing&quot; setting under &quot;Schedule Configuration &gt; Scheduling Dependency&quot; when &quot;Same Cycle&quot; is selected for a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between automatic reruns upon an error. Unit: milliseconds. The maximum value is 1800000 milliseconds (30 minutes).</p>
     * <p>This parameter corresponds to the &quot;Rerun Interval&quot; setting under &quot;Schedule Configuration &gt; Time Properties &gt; Auto Rerun upon Error&quot; of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. The time unit for &quot;Rerun Interval&quot; in the console is minutes. Convert the time accordingly when calling this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns allowed upon an error. The maximum value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The data source that the task connects to when running after the file is published. You can call the <a href="https://help.aliyun.com/document_detail/211432.html">UpdateDataSource</a> operation to obtain the list of available data sources for the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code content of the file. Different code types (fileType) have different code formats. You can find the corresponding type of node in Operation Center, right-click the node, and then click View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SHOW TABLES;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to automatically create the directory if the specified directory (FileFolderPath) does not exist in the system. Valid values:</p>
     * <ul>
     * <li>true: If the directory does not exist, automatically create the directory.</li>
     * <li>false: If the directory does not exist, the invocation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <p>The CRON expression for periodic scheduling. This parameter corresponds to the &quot;Schedule Configuration &gt; Time Property &gt; CRON Expression&quot; setting of a DataStudio node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the scheduling cycle and timed scheduling time, DataWorks automatically generates the corresponding CRON expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Timed scheduling at 05:30 every day: <code>00 30 05 * * ?</code></p>
     * </li>
     * <li><p>Timed scheduling at the 15th minute of every hour: <code>00 15 00-23/1 * * ?</code></p>
     * </li>
     * <li><p>Schedule every 10 minutes: <code>00 00/10 * * * ?</code></p>
     * </li>
     * <li><p>Schedule every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-17 * * * ?</code></p>
     * </li>
     * <li><p>Timed scheduling at 00:20 on the 1st of every month: <code>00 20 00 1 * ?</code></p>
     * </li>
     * <li><p>Schedule every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code></p>
     * </li>
     * <li><p>Timed scheduling at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code></p>
     * </li>
     * </ul>
     * <p>Due to the rules of the DataWorks scheduling system, CRON expressions have the following limits:</p>
     * <ul>
     * <li><p>The minimum scheduling interval is 5 minutes.</p>
     * </li>
     * <li><p>The earliest scheduling time each day is 00:05.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>00 05 00 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minute or hour) and DAY (day, week, or month).</p>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Time Properties &gt; Scheduling Cycle&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The list of nodes that the current node depends on from the previous cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The mode of cross-cycle dependency. Valid values:</p>
     * <ul>
     * <li>SELF: The dependency is the current node.</li>
     * <li>CHILD: The dependency is the first-level child nodes.</li>
     * <li>USER_DEFINE: The dependency is other nodes.</li>
     * <li>NONE: No dependency is selected. The node does not depend on the previous cycle.   </li>
     * <li>USER_DEFINE_AND_SELF: The dependency is a combination of the current node and other nodes across cycles.</li>
     * <li>CHILD_AND_SELF: The dependency is a combination of the first-level child nodes and the current node across cycles.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The timestamp when automatic scheduling stops. Unit: milliseconds.</p>
     * <p>This parameter corresponds to the end time (in milliseconds) of the &quot;Schedule Configuration &gt; Time Properties &gt; Effective Date&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>This is a file description</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The path of the file.</p>
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
     * <p>The code type of the file. Different file types have different codes. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the code types of files.</p>
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
     * <li><p>true: Inherit the dry-run property from the previous cycle.</p>
     * </li>
     * <li><p>false: Do not inherit the dry-run property from the previous cycle.</p>
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
     * <p>The output names of the upstream files on which the file depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the &quot;Parent Node Output Name&quot; setting under &quot;Schedule Configuration &gt; Scheduling Dependency&quot; when &quot;Same Cycle&quot; is selected for a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The input context parameters of the node. The parameter value is in JSON format. For the fields included, see the InputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Node Context &gt; Input Parameters of This Node&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    @NameInMap("OutputList")
    public String outputList;

    /**
     * <p>The output context parameters of the node. The parameter value is in JSON format. For the fields included, see the OutputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Node Context &gt; Output Parameters of This Node&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The Alibaba Cloud user ID of the file owner. If this parameter is left empty, the Alibaba Cloud user ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters. Separate multiple parameters with spaces. </p>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Parameters&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>a=x b=y</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace ID.</p>
     * <p>You must specify either this parameter or ProjectIdentifier to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace name.</p>
     * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The rerun property. Valid values:</p>
     * <ul>
     * <li>ALL_ALLOWED: The node can be rerun regardless of whether it runs successfully or fails.</li>
     * <li>FAILURE_ALLOWED: The node can be rerun only after it fails.</li>
     * <li>ALL_DENIED: The node cannot be rerun regardless of whether it runs successfully or fails.</li>
     * </ul>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Time Properties &gt; Rerun Property&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. Do not use it.</p>
     * <p>The schedule resource group used for executing the node after the file is published. This corresponds to the &quot;Schedule Configuration &gt; Resource Property &gt; Schedule Resource Group&quot; setting on the page. You can specify either this parameter or ResourceGroupIdentifier.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to obtain the list of active resource groups for the workspace. Set ResourceGroupType to 1 and use the ID field from the result.</p>
     * 
     * <strong>example:</strong>
     * <p>375827434852437</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The resource group used for running the task after the file is published. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation and use the <strong>identifier</strong> field to obtain the list of available resource groups for the workspace.</p>
     * <blockquote>
     * <p>Ensure that the resource group returned by the ListResourceGroups operation is bound to the workspace used for creating the file. The resource group can be used in CreateFile only after it is bound.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group_375827434852437</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>NORMAL: A normal scheduling task.</li>
     * <li>MANUAL: A manual task that is not scheduled on a daily basis. This corresponds to nodes in a manual workflow.</li>
     * <li>PAUSE: A paused task.</li>
     * <li>SKIP: A dry-run task that is scheduled on a daily basis but is directly set to successful when scheduling starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The timestamp in milliseconds when automatic scheduling starts.</p>
     * <p>This parameter corresponds to the start time (in milliseconds) of the &quot;Schedule Configuration &gt; Time Properties &gt; Effective Date&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1671608450000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to start the task immediately after publishing.</p>
     * <p>This parameter corresponds to the &quot;Configuration &gt; Time Properties &gt; Startup Method&quot; setting in the right-side navigation pane of the editing page for EMR Spark Streaming and EMR Streaming SQL DataStudio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <p>Specifies whether to suspend scheduling. Valid values:</p>
     * <ul>
     * <li>true: Suspend scheduling.</li>
     * <li>false: Do not suspend scheduling.</li>
     * </ul>
     * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Time Properties &gt; Scheduling Type&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> when the scheduling type is set to &quot;Suspend Scheduling&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    /**
     * <p>The timeout value defined in the scheduling configuration.</p>
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
