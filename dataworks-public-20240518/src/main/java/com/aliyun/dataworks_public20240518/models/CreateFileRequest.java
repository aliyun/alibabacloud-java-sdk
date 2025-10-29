// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings of the node.</p>
     * <p>This parameter corresponds to the Advanced Settings section in the right-side navigation pane on the configuration tab of EMR Spark Streaming and EMR Streaming SQL nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>Only EMR Spark Streaming and EMR Streaming SQL nodes support this parameter. The value must be in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;queue&quot;:&quot;default&quot;,&quot;SPARK_CONF&quot;:&quot;--conf spark.driver.memory=2g&quot;}</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <p>Specifies whether to apply the scheduling configuration immediately after the file is published.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyScheduleImmediately")
    public Boolean applyScheduleImmediately;

    /**
     * <p>Specifies whether to enable automatic parsing for the file. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter corresponds to the Analyze Code setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval at which the node is automatically rerun after a failure. Unit: milliseconds. Maximum value: 1800000 milliseconds (30 minutes).</p>
     * <p>This parameter corresponds to the Rerun interval parameter in Properties &gt; Schedule &gt; Auto Rerun upon Failure for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. In the console, the unit of the rerun interval is minutes. Convert the time unit when you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns after an error occurs. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The data source used when the task published from the file is run.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/211432.html">UpdateDataSource</a> operation to query the available data sources in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The file code content. Different code types (fileType) have different code formats. In Operation Center, you can find a task of the corresponding type, right-click it, and select View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SHOW TABLES;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to automatically create the directory specified by FileFolderPath if the directory does not exist. Valid values:</p>
     * <ul>
     * <li>true: If the directory does not exist, automatically create it.</li>
     * <li>false: If the directory does not exist, the call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <p>The cron expression for scheduled execution. This parameter corresponds to the Cron Expression setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure Scheduling Cycle and Scheduled Time, DataWorks automatically generates a cron expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Scheduled at 05:30 every day: <code>00 30 05 * * ?</code></li>
     * <li>Scheduled at the 15th minute of every hour: <code>00 15 00-23/1 * * ?</code></li>
     * <li>Scheduled every 10 minutes: <code>00 00/10 * * * ?</code></li>
     * <li>Scheduled every 10 minutes between 08:00 and 17:00 every day: <code>00 00-59/10 8-17 * * * ?</code></li>
     * <li>Scheduled at 00:20 on the 1st day of every month: <code>00 20 00 1 * ?</code></li>
     * <li>Scheduled every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code></li>
     * <li>Scheduled at 00:05 on every Tuesday and Friday: <code>00 05 00 * * 2,5</code></li>
     * </ul>
     * <p>Due to the rules of the DataWorks scheduling system, cron expressions have the following restrictions:</p>
     * <ul>
     * <li>The minimum scheduling interval is 5 minutes.</li>
     * <li>The earliest scheduling time each day is 00:05.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>00 05 00 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of scheduling cycle. Valid values: NOT_DAY (minute, hour) and DAY (day, week, month).</p>
     * <p>This parameter corresponds to the Scheduling Cycle setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes on which the current node depends. This parameter takes effect only when the DependentType parameter is set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
     * <p>This parameter corresponds to the Other Nodes option in Properties &gt; Dependencies &gt; Cross-cycle Dependency (Original Previous-cycle Dependency) for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The dependency mode on the previous cycle. Valid values:</p>
     * <ul>
     * <li>SELF: Depends on the current node.</li>
     * <li>CHILD: Depends on the child nodes.</li>
     * <li>USER_DEFINE: Depends on other nodes.</li>
     * <li>NONE: No dependencies. Does not depend on the previous cycle.</li>
     * <li>USER_DEFINE_AND_SELF: Depends on both the current node and other nodes in the previous cycle.</li>
     * <li>CHILD_AND_SELF: Depends on both the current node and its child nodes in the previous cycle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The timestamp (in milliseconds) when automatic scheduling stops.</p>
     * <p>This parameter corresponds to the end time of Effective Period in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File name</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The code type of the file. Different file types have different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node types</a>. You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the code types of files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <p>Specifies whether to inherit the dry-run status from the previous cycle. Valid values:</p>
     * <ul>
     * <li>true: Inherit the dry-run status from the previous cycle.</li>
     * <li>false: Do not inherit the dry-run status from the previous cycle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <p>The custom image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1h4b5a8ogkbll2f3tr</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The output names of the ancestor nodes on which the current node depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the Output Name of Ancestor Node setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The input context parameters of the node. The value must be in the JSON format. For more information about the parameter structure, see the InputContextParameterList parameter in the response parameters of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Input Parameters setting in Properties &gt; Input and Output Parameters for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output context parameters of the node. The value must be in the JSON format. For more information about the parameter structure, see the OutputContextParameterList parameter in the response parameters of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Output Parameters setting in Properties &gt; Input and Output Parameters for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The Alibaba Cloud account ID of the file owner. If this parameter is not specified, the Alibaba Cloud account ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters of the node. Separate multiple parameters with spaces.</p>
     * <p>This parameter corresponds to the Scheduling Parameter setting in Properties for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>a=x b=y</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The DataWorks workspace ID. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks workspace name. To obtain the workspace name, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
     * <p>You must specify either this parameter or ProjectId to identify the target DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The rerun policy. Valid values:</p>
     * <ul>
     * <li>ALL_ALLOWED: Reruns are allowed regardless of whether the task succeeds or fails.</li>
     * <li>FAILURE_ALLOWED: Reruns are allowed only when the task fails.</li>
     * <li>ALL_DENIED: Reruns are not allowed regardless of whether the task succeeds or fails.</li>
     * </ul>
     * <p>This parameter corresponds to the Support for Rerun setting in Scheduling &gt; Scheduling Policies for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>375827434852437</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The resource group for the task published from the file. To obtain the ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, navigate to the workspace configuration page, and click Resource Groups in the left-side navigation pane to view the IDs of resource groups bound to the current workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>S_res_group_559_1613715566828</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>NORMAL: Normal scheduled task.</li>
     * <li>MANUAL: Manually triggered node. Not scheduled for daily execution. Corresponds to nodes in manually triggered workflows.</li>
     * <li>PAUSE: Paused task.</li>
     * <li>SKIP: Dry-run task. Scheduled for daily execution but is directly marked as successful when scheduling starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The timestamp (in milliseconds) when automatic scheduling starts.</p>
     * <p>This parameter corresponds to the start time of Effective Period in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1671608450000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to immediately run the node after the node is deployed.</p>
     * <p>This parameter corresponds to the Start Method setting in Settings &gt; Schedule in the right-side navigation pane on the configuration tab of EMR Spark Streaming and EMR Streaming SQL nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <p>Specifies whether to skip execution. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter corresponds to the Skip Execution option in Properties &gt; Schedule &gt; Recurrence for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    /**
     * <p>The timeout settings for scheduling configuration.</p>
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
