// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The advanced settings for the task.</p>
     * <p>This parameter corresponds to the Advanced Settings in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL tasks in Data Studio in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL tasks support this parameter, and the parameter must be in JSON format.</p>
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
     * <p>The number of automatic reruns after the file execution fails.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The name of the data source that is used to run the node. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the available data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The file code content. Different code types (fileType) have different code formats. In Operation Center, you can right-click a task of the corresponding type and select View Code to view the specific code format.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT &quot;1&quot;;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The cron expression for scheduled execution. This parameter corresponds to the Cron Expression setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure Scheduling Cycle and Scheduled Time, DataWorks automatically generates a cron expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Scheduled at 05:30 every day: <code>00 30 05 * * ?</code></li>
     * <li>Scheduled at the 15th minute of every hour: <code>00 15 * * * ?</code></li>
     * <li>Scheduled every 10 minutes: <code>00 00/10 * * * ?</code></li>
     * <li>Scheduled every 10 minutes between 08:00 and 23:00 every day: <code>00 00-59/10 8-23 * * * ?</code></li>
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
     * <p>00 00-59/5 1-23 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of scheduling cycle. Valid values: NOT_DAY (minute, hour) and DAY (day, week, month).</p>
     * <p>This parameter corresponds to the Scheduling Cycle setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes on which the current node depends. This parameter takes effect only when the DependentType parameter is set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
     * <p>This parameter corresponds to the Other Nodes option in Properties &gt; Dependencies &gt; Cross-cycle Dependency (Original Previous-cycle Dependency) for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>5,10,15,20</p>
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
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The timestamp (in milliseconds) when automatic scheduling stops.</p>
     * <p>This parameter corresponds to the end time of Effective Period in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>4155787800000</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    /**
     * <p>The file description.</p>
     * 
     * <strong>example:</strong>
     * <p>Here is the file description</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The path to the folder where the file is located.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/data_integration/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to obtain the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The file name. You can modify the file name by setting a new value for FileName. For example, you can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID in the target directory, and then call the <a href="https://help.aliyun.com/document_detail/173951.html">UpdateFile</a> operation with the file ID specified in the FileId parameter and a new value specified in the FileName parameter to modify the file name.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_user_info_d</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter corresponds to the Skip The Dry-Run Property Of The Ancestor Node option in Properties &gt; Dependencies &gt; Cross-cycle Dependency (Original Previous-cycle Dependency) when Instances of Current Node or Level-1 Child Node is selected for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
     * <p>The output names of the ancestor nodes on which the current node depends. Separate multiple output names with commas (,).</p>
     * <p>This parameter corresponds to the Output Name of Ancestor Node setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <blockquote>
     * <p>This parameter is required when you call the CreateDISyncTask or UpdateFile operation to create a batch synchronization node.</p>
     * </blockquote>
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
     * <p>The outputs of the node.</p>
     * <p>This parameter corresponds to the Output Name setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project.ods_user_info_d</p>
     */
    @NameInMap("OutputList")
    public String outputList;

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
     * <p>The file owner ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18023848927592</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters of the node.</p>
     * <p>This parameter corresponds to the Scheduling Parameter setting in Properties for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>x=a y=b z=c</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The DataWorks workspace ID. To obtain the ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace management page.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li>ALL_ALLOWD</li>
     * <li>FAILURE_ALLOWED</li>
     * <li>ALL_DENIED</li>
     * <li>ALL_ALLOWED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The resource group for the task published from the file. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the available resource groups in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default_group</p>
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
     * <p>This parameter corresponds to the Start Method setting in Configuration &gt; Scheduling Policies in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL tasks in Data Studio in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
