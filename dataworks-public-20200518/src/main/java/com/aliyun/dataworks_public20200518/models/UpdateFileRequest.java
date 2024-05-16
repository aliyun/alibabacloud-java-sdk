// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    /**
     * <p>The advanced configurations of the node.</p>
     * <br>
     * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Advanced Settings tab of the node in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     * <br>
     * <p>This parameter is configured in the JSON format.</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <p>Specifies whether the automatic parsing feature is enabled for the file. Valid values:</p>
     * <br>
     * <p>*   true: The automatic parsing feature is enabled for the file.</p>
     * <p>*   false: The automatic parsing feature is not enabled for the file.</p>
     * <br>
     * <p>This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between two consecutive automatic reruns after an error occurs. Unit: milliseconds. Maximum value: 1800000 (30 minutes).</p>
     * <br>
     * <p>This parameter corresponds to the Rerun Interval parameter that is displayed after the Auto Rerun upon Error check box is selected in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     * <br>
     * <p>The interval that you specify in the DataWorks console is measured in minutes. Pay attention to the conversion between the units of time when you call the operation.</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns that are allowed after an error occurs.</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The name of the connected data source that is used to run the node. You can call the [ListDataSources](https://help.aliyun.com/document_detail/211431.html) operation to query the available data sources of the workspace.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code of the file. The code format varies based on the file type. To view the code format for a specific file type, go to Operation Center, right-click a node of the file type, and then select View Code.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The CRON expression that represents the periodic scheduling policy of the node. This parameter corresponds to the Cron Expression parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). After you configure the Scheduling Cycle and Run At parameters in the DataWorks console, DataWorks automatically generates a value for the Cron Expression parameter.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   CRON expression for a node that is scheduled to run at 05:30 every day: `00 30 05 * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run at the fifteenth minute of each hour: `00 15 * * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run every 10 minutes: `00 00/10 * * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run every 10 minutes from 08:00 to 17:00 every day: `00 00-59/10 8-23 * * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run at 00:20 on the first day of each month: `00 20 00 1 * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run every three months starting from 00:10 on January 1: `00 10 00 1 1-12/3 ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run at 00:05 every Tuesday and Friday: `00 05 00 * * 2,5`</p>
     * <br>
     * <p>The scheduling system of DataWorks imposes the following limits on CRON expressions:</p>
     * <br>
     * <p>*   A node can be scheduled to run at a minimum interval of 5 minutes.</p>
     * <p>*   A node can be scheduled to run at 00:05 every day at the earliest.</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <p>The type of the scheduling cycle of the node that corresponds to the file. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.</p>
     * <br>
     * <p>This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The ID of the node on which the node corresponding to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
     * <br>
     * <p>The value of this parameter corresponds to the ID of the node that you specified after you select Previous Cycle and set Depend On to Other Nodes in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The type of the cross-cycle scheduling dependency of the node that corresponds to the file. Valid values:</p>
     * <br>
     * <p>*   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</p>
     * <p>*   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</p>
     * <p>*   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</p>
     * <p>*   NONE: No cross-cycle scheduling dependency type is selected for the node.</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The end time of automatic scheduling. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter corresponds to the end time specified for the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    /**
     * <p>The description of the file.</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The path of the file.</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The ID of the file. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The name of the file. You can set the FileName parameter to a new value to change the file name.</p>
     * <br>
     * <p>You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to query the ID of the file whose name you want to change. Then, you can set the FileId parameter to the ID and set the FileName parameter to a new value when you call the [UpdateFile](https://help.aliyun.com/document_detail/173951.html) operation.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <p>The output name of the parent file on which the current file depends. If you specify multiple output names, separate them with commas (,).</p>
     * <br>
     * <p>This parameter corresponds to the Output Name parameter under Parent Nodes in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The input parameters of the node. This parameter is configured in the JSON format. For more information about the input parameters, refer to the InputContextParameterList parameter in the Response parameters section of the [GetFile](https://help.aliyun.com/document_detail/173954.html) operation.</p>
     * <br>
     * <p>This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output name of the current file.</p>
     * <br>
     * <p>This parameter corresponds to the Output Name parameter in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("OutputList")
    public String outputList;

    /**
     * <p>The output parameters of the node. This parameter is configured in the JSON format. For more information about the output parameters, refer to the OutputContextParameterList parameter in the Response parameters section of the [GetFile](https://help.aliyun.com/document_detail/173954.html) operation.</p>
     * <br>
     * <p>This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The ID of the file owner.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters of the node.</p>
     * <br>
     * <p>This parameter corresponds to the Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information, see [Configure scheduling parameters](https://help.aliyun.com/document_detail/137548.html).</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace name.</p>
     * <br>
     * <p>You must configure this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>Specifies whether the node that corresponds to the file can be rerun. Valid values:</p>
     * <br>
     * <p>*   ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.</p>
     * <p>*   FAILURE_ALLOWED: The node can be rerun only after it fails to run.</p>
     * <p>*   ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.</p>
     * <br>
     * <p>This parameter corresponds to the Rerun parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The identifier of the resource group that is used to run the node. You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/173913.html) operation to query the available resource groups in the workspace.</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type of the node. Valid values:</p>
     * <br>
     * <p>*   NORMAL: The node is an auto triggered node.</p>
     * <p>*   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</p>
     * <p>*   PAUSE: The node is a paused node.</p>
     * <p>*   SKIP: The inner node is a dry-run node. Dry-run nodes are started as scheduled but the scheduling system sets the status of the nodes to succeeded when the scheduling system starts to run the nodes.</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The start time of automatic scheduling. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to immediately run a node after the node is deployed to the production environment. Valid values:</p>
     * <br>
     * <p>*   true: A node is immediately run after the node is deployed to the production environment.</p>
     * <p>*   false: A node is not immediately run after the node is deployed to the production environment.</p>
     * <br>
     * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Start Method parameter in the Schedule section of the Configure tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <p>Specifies whether to suspend the scheduling of the node. Valid values:</p>
     * <br>
     * <p>*   true: suspends the scheduling of the node.</p>
     * <p>*   false: does not suspend the scheduling of the node.</p>
     * <br>
     * <p>This parameter corresponds to the Recurrence parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

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

}
