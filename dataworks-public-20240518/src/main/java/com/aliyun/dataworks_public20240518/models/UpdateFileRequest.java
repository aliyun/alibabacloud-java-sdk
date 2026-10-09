// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings of the task.</p>
     * <p>This parameter corresponds to the Advanced Settings section in the right-side navigation pane of the edit page for EMR Spark Streaming and EMR Streaming SQL data development tasks in the DataWorks console.</p>
     * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL tasks support this parameter, and the parameter value must be in JSON format.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
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
     * <p>Specifies whether to enable the automatic parsing feature for the file. Valid values:</p>
     * <ul>
     * <li>true: The file automatically parses code.</li>
     * <li>false: The file does not automatically parse code.</li>
     * </ul>
     * <p>This parameter corresponds to the Code Parsing parameter in the Schedule &gt; Scheduling Dependencies section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between automatic reruns after a failure, in milliseconds. The maximum value is 1800000, which indicates 30 minutes.</p>
     * <p>This parameter corresponds to the Rerun Interval parameter in the Schedule &gt; Time Attributes &gt; Auto Rerun upon Failure section of the DataWorks console. The unit of the Rerun Interval parameter in the console is minutes. Convert the time unit when you call this operation.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns allowed after an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The identifier of the data source used when the task corresponding to the file is executed. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to obtain the list of available data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code content of the file. The code format varies based on the file type. You can go to Operation Center, right-click a task of the corresponding type, and select View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT &quot;1&quot;;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The cron expression for periodic scheduling. This parameter corresponds to the cron expression in the Schedule &gt; Time Property section for the data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the scheduling cycle and timed scheduling time, DataWorks automatically generates the corresponding cron expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Schedule a node at 05:30 every day: <code>00 30 05 * * ?</code>.</p>
     * </li>
     * <li><p>Schedule a node at the 15th minute of every hour: <code>00 15 * * * ?</code>.</p>
     * </li>
     * <li><p>Schedule a node every 10 minutes: <code>00 00/10 * * * ?</code>.</p>
     * </li>
     * <li><p>Schedule a node every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-23 * * * ?</code>.</p>
     * </li>
     * <li><p>Schedule a node at 00:20 on the first day of every month: <code>00 20 00 1 * ?</code>.</p>
     * </li>
     * <li><p>Schedule a node every three months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code>.</p>
     * </li>
     * <li><p>Schedule a node at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code>.</p>
     * </li>
     * </ul>
     * <p>Due to the rules of the DataWorks scheduling system, cron expressions have the following limits:</p>
     * <ul>
     * <li><p>The minimum scheduling interval is 5 minutes.</p>
     * </li>
     * <li><p>The earliest scheduling time of a day is 00:05.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>00 00-59/5 1-23 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minutes and hours) and DAY (days, weeks, and months).</p>
     * <p>This parameter corresponds to the Schedule Type parameter in the Schedule &gt; Time Attributes section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>NOT_DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes on which the current file depends when the parameter settings of DependentType are set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
     * <p>This parameter corresponds to the content configured when you set the Dependency parameter to Cross-cycle Dependency (Previous Cycle) and select Other Nodes in the Schedule &gt; Scheduling Dependencies section for the data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>5,10,15,20</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The dependency on the previous cycle. Valid values:</p>
     * <ul>
     * <li>SELF: The current node.</li>
     * <li>CHILD: The child nodes at the first level.</li>
     * <li>USER_DEFINE: Other nodes.</li>
     * <li>NONE: No dependency on the previous cycle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The end time of automatic scheduling, in the form of a millisecond timestamp.</p>
     * <p>This parameter corresponds to the end time in the Schedule &gt; Time Attributes &gt; Effective Date section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>4155787800000</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    /**
     * <p>The description of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>Here is the file description</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The path where the file is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/data_integration/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The ID of the file. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to obtain the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The name of the file. You can change the file name by resetting the value of FileName. For example, you can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID of a file in the destination directory, call the <a href="https://help.aliyun.com/document_detail/173951.html">UpdateFile</a> operation, specify the queried file ID in the FileId parameter, and configure the FileName parameter to change the name of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_user_info_d</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter corresponds to the Skip Dry Run of Upstream Nodes parameter that is configured when you set the Dependency parameter to Cross-cycle Dependency (Previous Cycle) and select Current Node or Child Nodes at First Level in the Schedule &gt; Scheduling Dependencies section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <p>The ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-uf6d7npxk1hhek8ng0cb</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The output names of the upstream files on which the current file depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the Output Name of Upstream Node parameter in the Schedule &gt; Scheduling Dependencies section of the DataWorks console.</p>
     * <blockquote>
     * <p>This parameter is required when you create a batch synchronization task by calling the CreateDISyncTask or UpdateFile operation.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The context input parameters of the node. The parameter value is in JSON format. For the included fields, refer to the InputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Input Parameters of Current Node parameter in the Schedule &gt; Node Context Parameters section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output of the file.</p>
     * <p>This parameter corresponds to the Output Name of Current Node parameter in the Schedule &gt; Scheduling Dependencies section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>dw_project.ods_user_info_d</p>
     */
    @NameInMap("OutputList")
    public String outputList;

    /**
     * <p>The context output parameters of the node. The parameter value is in JSON format. For the included fields, refer to the OutputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Output Parameters of Current Node parameter in the Schedule &gt; Node Context Parameters section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The user ID of the file owner.</p>
     * 
     * <strong>example:</strong>
     * <p>18023848927592</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters.</p>
     * <p>This parameter corresponds to the Scheduling Parameters section in the Schedule section of the DataWorks console. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>x=a y=b z=c</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace name.</p>
     * <p>You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The rerun mode. Valid values:</p>
     * <ul>
     * <li>ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.</li>
     * <li>FAILURE_ALLOWED: The node can be rerun only after it fails to run.</li>
     * <li>ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.</li>
     * </ul>
     * <p>This parameter corresponds to the Rerun Mode parameter in the Schedule &gt; Time Attributes section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The resource group used when the task is executed after the file is published as a task. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to obtain the list of available resource groups in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default_group</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>NORMAL: Normal scheduling task.</li>
     * <li>MANUAL: Manual task. It is not scheduled on a daily basis and corresponds to a node in a manual workflow.</li>
     * <li>PAUSE: Paused task.</li>
     * <li>SKIP: Dry-run task. It is scheduled on a daily basis, but its status is directly set to successful when the scheduling is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The start time of automatic scheduling, in the form of a millisecond timestamp.</p>
     * <p>This parameter corresponds to the start time in the Schedule &gt; Time Attributes &gt; Effective Date section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>936923400000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to start the task immediately after it is published. Valid values:</p>
     * <ul>
     * <li>true: Start the task immediately after it is published.</li>
     * <li>false: Do not start the task immediately after it is published.</li>
     * </ul>
     * <p>This parameter corresponds to the Startup Method parameter in the Configuration &gt; Time Attributes section in the right-side navigation pane of the edit page for EMR Spark Streaming and EMR Streaming SQL data development tasks in the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <p>Specifies whether to pause scheduling. Valid values:</p>
     * <ul>
     * <li>true: Pause scheduling.</li>
     * <li>false: Do not pause scheduling.</li>
     * </ul>
     * <p>This parameter corresponds to the Pause Scheduling option in the Schedule &gt; Time Attributes &gt; Schedule Type section of the DataWorks console.
     * <a href="https://workbench.data.aliyun.com/console">DataWorks console</a></p>
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

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileRequest setAdvancedSettings(String advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public String getAdvancedSettings() {
        return this.advancedSettings;
    }

    public UpdateFileRequest setApplyScheduleImmediately(Boolean applyScheduleImmediately) {
        this.applyScheduleImmediately = applyScheduleImmediately;
        return this;
    }
    public Boolean getApplyScheduleImmediately() {
        return this.applyScheduleImmediately;
    }

    public UpdateFileRequest setAutoParsing(Boolean autoParsing) {
        this.autoParsing = autoParsing;
        return this;
    }
    public Boolean getAutoParsing() {
        return this.autoParsing;
    }

    public UpdateFileRequest setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
        this.autoRerunIntervalMillis = autoRerunIntervalMillis;
        return this;
    }
    public Integer getAutoRerunIntervalMillis() {
        return this.autoRerunIntervalMillis;
    }

    public UpdateFileRequest setAutoRerunTimes(Integer autoRerunTimes) {
        this.autoRerunTimes = autoRerunTimes;
        return this;
    }
    public Integer getAutoRerunTimes() {
        return this.autoRerunTimes;
    }

    public UpdateFileRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateFileRequest setCronExpress(String cronExpress) {
        this.cronExpress = cronExpress;
        return this;
    }
    public String getCronExpress() {
        return this.cronExpress;
    }

    public UpdateFileRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public UpdateFileRequest setDependentNodeIdList(String dependentNodeIdList) {
        this.dependentNodeIdList = dependentNodeIdList;
        return this;
    }
    public String getDependentNodeIdList() {
        return this.dependentNodeIdList;
    }

    public UpdateFileRequest setDependentType(String dependentType) {
        this.dependentType = dependentType;
        return this;
    }
    public String getDependentType() {
        return this.dependentType;
    }

    public UpdateFileRequest setEndEffectDate(Long endEffectDate) {
        this.endEffectDate = endEffectDate;
        return this;
    }
    public Long getEndEffectDate() {
        return this.endEffectDate;
    }

    public UpdateFileRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public UpdateFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public UpdateFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateFileRequest setIgnoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
        this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
        return this;
    }
    public Boolean getIgnoreParentSkipRunningProperty() {
        return this.ignoreParentSkipRunningProperty;
    }

    public UpdateFileRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateFileRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public UpdateFileRequest setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public String getInputParameters() {
        return this.inputParameters;
    }

    public UpdateFileRequest setOutputList(String outputList) {
        this.outputList = outputList;
        return this;
    }
    public String getOutputList() {
        return this.outputList;
    }

    public UpdateFileRequest setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
        return this;
    }
    public String getOutputParameters() {
        return this.outputParameters;
    }

    public UpdateFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateFileRequest setParaValue(String paraValue) {
        this.paraValue = paraValue;
        return this;
    }
    public String getParaValue() {
        return this.paraValue;
    }

    public UpdateFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public UpdateFileRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateFileRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public UpdateFileRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public UpdateFileRequest setStartEffectDate(Long startEffectDate) {
        this.startEffectDate = startEffectDate;
        return this;
    }
    public Long getStartEffectDate() {
        return this.startEffectDate;
    }

    public UpdateFileRequest setStartImmediately(Boolean startImmediately) {
        this.startImmediately = startImmediately;
        return this;
    }
    public Boolean getStartImmediately() {
        return this.startImmediately;
    }

    public UpdateFileRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

    public UpdateFileRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
