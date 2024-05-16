// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The advanced configurations of the node.</p>
     * <br>
     * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Advanced Settings tab of the node in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     * <br>
     * <p>The value of this parameter must be in the JSON format.</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <p>Specifies whether to enable the automatic parsing feature for the file. Valid values:</p>
     * <br>
     * <p>*   true: enables the automatic parsing feature for the file.</p>
     * <p>*   false: does not enable the automatic parsing feature for the file.</p>
     * <br>
     * <p>This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <p>The interval between automatic reruns after an error occurs. Unit: milliseconds. Maximum value: 1800000 (30 minutes).</p>
     * <br>
     * <p>This parameter corresponds to the Rerun Interval parameter that is displayed after the Auto Rerun upon Error check box is selected in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     * <br>
     * <p>The interval that you specify in the DataWorks console is measured in minutes. Pay attention to the conversion between the units of time when you call the operation.</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <p>The number of automatic reruns that are allowed after an error occurs. Maximum value: 10.</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <p>The name of the data source for which the node is run.</p>
     * <br>
     * <p>You can call the [UpdateDataSource](https://help.aliyun.com/document_detail/211432.html) operation to query the available data sources in the workspace.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The code for the file. The code format varies based on the file type. To view the code format for a specific file type, go to Operation Center, right-click a node of the file type, and then select View Code.</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <p>The CRON expression that represents the automatic scheduling policy of the node. This parameter corresponds to the Cron Expression parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). After you configure the Scheduling Cycle and Run At parameters in the DataWorks console, DataWorks generates the value of the Cron Expression parameter.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   CRON expression for a node that is scheduled to run at 05:30 every day: `00 30 05 * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run at the fifteenth minute of each hour: `00 15 00-23/1 * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run every 10 minutes: `00 00/10 * * * ?`</p>
     * <p>*   CRON expression for a node that is scheduled to run every 10 minutes from 08:00 to 17:00 every day: `00 00-59/10 8-17 * * * ?`</p>
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
     * <p>The type of the scheduling cycle. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.</p>
     * <br>
     * <p>This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The IDs of the nodes that generate instances in the previous cycle on which the current node depends.</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <p>The type of the cross-cycle scheduling dependency of the node. Valid values:</p>
     * <br>
     * <p>*   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</p>
     * <br>
     * <p>*   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</p>
     * <br>
     * <p>*   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</p>
     * <br>
     * <p>*   NONE: No cross-cycle scheduling dependency type is selected for the node.</p>
     * <br>
     * <p>*   USER_DEFINE_AND_SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle and the instances generated for one or more specified nodes in the previous cycle.</p>
     * <br>
     * <p>*   CHILD_AND_SELF: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle and the instance generated for the node in the previous cycle.</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <p>The end time of automatic scheduling. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
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
     * <p>The name of the file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The type of the code in the file.</p>
     * <br>
     * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
     * <br>
     * <p>You can call the [ListFileType](https://help.aliyun.com/document_detail/212428.html) operation to query the type of the code for the file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

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
     * <p>The input parameters of the node. The value of this parameter must be in the JSON format. For more information about the input parameters, see the InputContextParameterList parameter in the Response parameters section of the [GetFile](https://help.aliyun.com/document_detail/173954.html) operation.</p>
     * <br>
     * <p>This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <p>The output parameters of the node. The value of this parameter must be in the JSON format. For more information about the output parameters, see the OutputContextParameterList parameter in the Response parameters section of the [GetFile](https://help.aliyun.com/document_detail/173954.html) operation.</p>
     * <br>
     * <p>This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <p>The ID of the Alibaba Cloud account used by the file owner. If this parameter is not configured, the ID of the Alibaba Cloud account of the user who calls the operation is used.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The scheduling parameters of the node. Separate multiple parameters with spaces.</p>
     * <br>
     * <p>This parameter corresponds to the Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information about the configurations of the scheduling parameters, see [Configure scheduling parameters](https://help.aliyun.com/document_detail/137548.html).</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>You must configure this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
     * <p>This parameter is deprecated. Do not use this parameter.</p>
     * <br>
     * <p>The identifier of the resource group that is used to run the node. This parameter corresponds to the Resource Group parameter in the Resource Group section of the Properties tab in the DataWorks console. You must configure one of the ResourceGroupId and ResourceGroupIdentifier parameters to determine the resource group that is used to run the node.</p>
     * <br>
     * <p>You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/173913.html) operation to query the available resource groups in the workspace. When you call the operation, set the ResourceGroupType parameter to 1. The response parameter Id indicates the ID of an available resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The identifier of the resource group that is used to run the node. You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/173913.html) operation to query the available resource groups in the workspace.</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <p>The scheduling type of the inner node. Valid values:</p>
     * <br>
     * <p>*   NORMAL: The node is an auto triggered node.</p>
     * <p>*   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</p>
     * <p>*   PAUSE: The node is a paused node.</p>
     * <p>*   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled, but the system sets the status of the nodes to successful when it starts to run them.</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The start time of automatic scheduling. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <p>Specifies whether to immediately run a node after the node is deployed to the production environment.</p>
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

}
