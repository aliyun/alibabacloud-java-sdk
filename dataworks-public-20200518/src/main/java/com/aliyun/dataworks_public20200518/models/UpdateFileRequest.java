// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings of the node.</p>
     * <p>This parameter corresponds to the Advanced Settings in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL nodes support this parameter. The parameter value is in JSON format.</p>
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
     * <p>Specifies whether to enable the automatic parsing feature for the file. Valid values:</p>
     * <ul>
     * <li>true: The file automatically parses code.</li>
     * <li>false: The file does not automatically parse code.</li>
     * </ul>
     * <p>This parameter corresponds to the Code Parsing setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between automatic reruns upon an error, in milliseconds. The maximum value is 1800000 milliseconds (30 minutes).</p>
     * <p>This parameter corresponds to the Rerun Interval setting under Scheduling Configuration &gt; Time Properties &gt; Auto Rerun upon Error for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.
     * The time unit for Rerun Interval in the console is minutes. Convert the time accordingly when calling this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns after an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The identifier of the data source used when the node corresponding to the file runs. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to obtain the list of available data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code content of the file. Files of different code types (fileType) have different code formats. In Operation Center, right-click a node of the corresponding type and select View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT &quot;1&quot;;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The cron expression for timed scheduling. This parameter corresponds to the cron Expression setting under Scheduling Configuration &gt; Time Property for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the Scheduling Epoch and Timed Scheduling time, DataWorks automatically generates the corresponding cron expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Timed scheduling at 05:30 every day: <code>00 30 05 * * ?</code>.</p>
     * </li>
     * <li><p>Timed scheduling at the 15th minute of every hour: <code>00 15 * * * ?</code>.</p>
     * </li>
     * <li><p>Schedule every 10 minutes: <code>00 00/10 * * * ?</code>.</p>
     * </li>
     * <li><p>Schedule every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-23 * * * ?</code>.</p>
     * </li>
     * <li><p>Timed scheduling at 00:20 on the 1st of every month: <code>00 20 00 1 * ?</code>.</p>
     * </li>
     * <li><p>Schedule every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code>.</p>
     * </li>
     * <li><p>Timed scheduling at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code>.</p>
     * </li>
     * </ul>
     * <p>The cron expression has the following limits due to the DataWorks scheduling system rules:</p>
     * <ul>
     * <li><p>The minimum scheduling interval is 5 minutes.</p>
     * </li>
     * <li><p>The earliest scheduling time each day is 00:05.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>00 00-59/5 1-23 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minute or hour) and DAY (day, week, or month).</p>
     * <p>This parameter corresponds to the Scheduling Cycle setting under Scheduling Configuration &gt; Time Properties for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes on which the current file depends when DependentType is set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
     * <p>This parameter corresponds to the Settings when you select Other Nodes as the dependency after configuring Scheduling Configuration &gt; Scheduling Dependency to Previous Epoch for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. This is part of the parameter settings for scheduling dependencies.</p>
     * 
     * <strong>example:</strong>
     * <p>5,10,15,20</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The mode in which the node depends on the previous cycle. Valid values:</p>
     * <ul>
     * <li>SELF: The dependency is set to the current node.</li>
     * <li>CHILD: The dependency is set to first-level child nodes.</li>
     * <li>USER_DEFINE: The dependency is set to other nodes.</li>
     * <li>NONE: No dependency is selected. The node does not depend on the previous cycle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The timestamp in milliseconds when automatic scheduling stops.</p>
     * <p>This parameter corresponds to the end time in milliseconds under Scheduling Configuration &gt; Time Properties &gt; Effective Date for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>The path of the file.</p>
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
     * <p>The name of the file. You can modify the file name by setting FileName to a new value.
     * For example, call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID in the target folder, and then call the <a href="https://help.aliyun.com/document_detail/173951.html">UpdateFile</a> operation to specify the file ID for the FileId parameter and configure the FileName parameter to rename the file.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_user_info_d</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>Specifies whether to skip the dry-run property of the upstream node under Scheduling Configuration &gt; Previous Cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <p>The custom image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-uf6d7npxk1hhek8ng0cb</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The output names of the upstream files on which the current file depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the Parent Node Output Name setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <blockquote>
     * <p>This parameter is required when you create a batch synchronization node by calling CreateDISyncTask and UpdateFile.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The input context parameters of the node. The parameter value is in JSON format. For the fields included, refer to the InputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Input Parameters of Current Node setting under Scheduling Configuration &gt; Node Context for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output of the file.</p>
     * <p>This parameter corresponds to the Output Name of Current Node setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project.ods_user_info_d</p>
     */
    @NameInMap("OutputList")
    public String outputList;

    /**
     * <p>The output context parameters of the node. The parameter value is in JSON format. For the fields included, refer to the OutputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
     * <p>This parameter corresponds to the Output Parameters of Current Node setting under Scheduling Configuration &gt; Node Context for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>This parameter corresponds to the Parameters setting under Scheduling Configuration for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>x=a y=b z=c</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
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
     * <p>This parameter corresponds to the Rerun Property setting under Scheduling Configuration &gt; Time Properties &gt; Rerun Property for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The schedule resource used when the file is published as a node and the node runs. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to obtain the list of available resource groups for the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default_group</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>NORMAL: A normal scheduling node.</li>
     * <li>MANUAL: A manual node that is not scheduled on a daily basis. This corresponds to nodes in a manual workflow.</li>
     * <li>PAUSE: A paused node.</li>
     * <li>SKIP: A dry-run node that is scheduled on a daily basis but is directly set to successful when scheduling starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The timestamp in milliseconds when automatic scheduling starts.</p>
     * <p>This parameter corresponds to the start time in milliseconds under Scheduling Configuration &gt; Time Properties &gt; Effective Date for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>936923400000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to start the node immediately after publishing. Valid values:</p>
     * <ul>
     * <li>true: Starts immediately after publishing.</li>
     * <li>false: Does not start after publishing.</li>
     * </ul>
     * <p>This parameter corresponds to the Start Mode setting under Configuration &gt; Time Properties in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>This parameter corresponds to the setting when Scheduling Type is set to Pause Scheduling under Scheduling Configuration &gt; Time Properties &gt; Scheduling Type for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    /**
     * <p>The timeout setting for the scheduling configuration.</p>
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
