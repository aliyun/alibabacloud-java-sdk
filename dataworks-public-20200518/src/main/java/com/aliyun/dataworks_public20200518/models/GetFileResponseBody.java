// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    /**
     * <p>The details of the file.</p>
     */
    @NameInMap("Data")
    public GetFileResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponseBody self = new GetFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileResponseBody setData(GetFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileResponseBodyData getData() {
        return this.data;
    }

    public GetFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileResponseBodyDataFile extends TeaModel {
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
         * <p>Indicates whether the automatic parsing feature is enabled for the file. Valid values:</p>
         * <br>
         * <p>*   true: The automatic parsing feature is enabled for the file.</p>
         * <p>*   false: The automatic parsing feature is not enabled for the file.</p>
         * <br>
         * <p>This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("AutoParsing")
        public Boolean autoParsing;

        /**
         * <p>The ID of the workflow to which the file belongs. This parameter is deprecated and replaced by the BusinessId parameter.</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The ID of the workflow to which the file belongs.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>Indicates whether the latest code in the file is committed. Valid values: 0 and 1. The value 0 indicates that the latest code in the file is not committed. The value 1 indicates that the latest code in the file is committed.</p>
         */
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        /**
         * <p>The ID of the compute engine instance that is used to run the node that corresponds to the file.</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The code in the file.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account used to create the file.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The latest version number of the file.</p>
         */
        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        /**
         * <p>The status of the file. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The file is not deleted.</p>
         * <p>*   RECYCLE_BIN: The file is stored in the recycle bin.</p>
         * <p>*   DELETED: The file is deleted.</p>
         */
        @NameInMap("DeletedStatus")
        public String deletedStatus;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <p>The ID of the folder to which the file belongs.</p>
         */
        @NameInMap("FileFolderId")
        public String fileFolderId;

        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the code for the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>Indicates whether the file needs to be uploaded to MaxCompute.</p>
         * <br>
         * <p>This parameter is returned only if the file is a MaxCompute resource file.</p>
         */
        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        /**
         * <p>The time when the file was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <p>The ID of the Alibaba Cloud account used to last modify the file.</p>
         */
        @NameInMap("LastEditUser")
        public String lastEditUser;

        /**
         * <p>The ID of the auto triggered node that is generated in the scheduling system after the file is committed.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the file owner.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the node group file to which the current file belongs. This parameter is returned only if the current file is an inner file of the node group file.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The file is used for DataStudio.</p>
         * <p>*   MANUAL: The file is used for a manually triggered node.</p>
         * <p>*   MANUAL_BIZ: The file is used for a manually triggered workflow.</p>
         * <p>*   SKIP: The file is used for a dry-run DataStudio node.</p>
         * <p>*   ADHOCQUERY: The file is used for an ad hoc query.</p>
         * <p>*   COMPONENT: The file is used for a snippet.</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetFileResponseBodyDataFile build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataFile self = new GetFileResponseBodyDataFile();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataFile setAdvancedSettings(String advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }
        public String getAdvancedSettings() {
            return this.advancedSettings;
        }

        public GetFileResponseBodyDataFile setAutoParsing(Boolean autoParsing) {
            this.autoParsing = autoParsing;
            return this;
        }
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        public GetFileResponseBodyDataFile setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetFileResponseBodyDataFile setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetFileResponseBodyDataFile setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public GetFileResponseBodyDataFile setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetFileResponseBodyDataFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileResponseBodyDataFile setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFileResponseBodyDataFile setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetFileResponseBodyDataFile setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public GetFileResponseBodyDataFile setDeletedStatus(String deletedStatus) {
            this.deletedStatus = deletedStatus;
            return this;
        }
        public String getDeletedStatus() {
            return this.deletedStatus;
        }

        public GetFileResponseBodyDataFile setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public GetFileResponseBodyDataFile setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public GetFileResponseBodyDataFile setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetFileResponseBodyDataFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileResponseBodyDataFile setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetFileResponseBodyDataFile setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public GetFileResponseBodyDataFile setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public GetFileResponseBodyDataFile setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public GetFileResponseBodyDataFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileResponseBodyDataFile setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFileResponseBodyDataFile setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetFileResponseBodyDataFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationInputList extends TeaModel {
        /**
         * <p>The output name of the parent file on which the current file depends.</p>
         * <br>
         * <p>This parameter corresponds to the Output Name parameter under Parent Nodes after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The mode of the configuration file dependency. Valid values:</p>
         * <br>
         * <p>*   MANUAL: Scheduling dependencies are manually configured.</p>
         * <p>*   AUTO: Scheduling dependencies are automatically parsed.</p>
         */
        @NameInMap("ParseType")
        public String parseType;

        public static GetFileResponseBodyDataNodeConfigurationInputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationInputList self = new GetFileResponseBodyDataNodeConfigurationInputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationInputList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetFileResponseBodyDataNodeConfigurationInputList setParseType(String parseType) {
            this.parseType = parseType;
            return this;
        }
        public String getParseType() {
            return this.parseType;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationInputParameters extends TeaModel {
        /**
         * <p>The name of the input parameter of the node. In the code, you can use the ${...} method to reference the input parameter of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Parameter Name parameter in the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value source of the input parameter of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Value Source parameter in the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("ValueSource")
        public String valueSource;

        public static GetFileResponseBodyDataNodeConfigurationInputParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationInputParameters self = new GetFileResponseBodyDataNodeConfigurationInputParameters();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationInputParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetFileResponseBodyDataNodeConfigurationInputParameters setValueSource(String valueSource) {
            this.valueSource = valueSource;
            return this;
        }
        public String getValueSource() {
            return this.valueSource;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationOutputList extends TeaModel {
        /**
         * <p>The output name of the current file.</p>
         * <br>
         * <p>This parameter corresponds to the Output Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The output table name of the current file.</p>
         * <br>
         * <p>This parameter corresponds to the Output Table Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("RefTableName")
        public String refTableName;

        public static GetFileResponseBodyDataNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationOutputList self = new GetFileResponseBodyDataNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationOutputParameters extends TeaModel {
        /**
         * <p>The description of the output parameter of the node.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the output parameter of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Parameter Name parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The type of the output parameter of the node. Valid values:</p>
         * <br>
         * <p>*   1: indicates a constant.</p>
         * <p>*   2: indicates a variable.</p>
         * <p>*   3: indicates a pass-through variable.</p>
         * <br>
         * <p>This parameter corresponds to the Type parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the output parameter of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Value parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetFileResponseBodyDataNodeConfigurationOutputParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationOutputParameters self = new GetFileResponseBodyDataNodeConfigurationOutputParameters();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFileResponseBodyDataNodeConfiguration extends TeaModel {
        /**
         * <p>The interval between automatic reruns after an error occurs. Unit: milliseconds.</p>
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
         * <p>The CRON expression that represents the periodic scheduling policy of the node.</p>
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
         * <p>The ID of the node on which the node corresponding to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
         * <br>
         * <p>The value of this parameter is equivalent to the ID of the node that you specified after you select Previous Cycle and set Depend On to Other Nodes in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <p>The type of the cross-cycle scheduling dependency of the node. Valid values:</p>
         * <br>
         * <p>*   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</p>
         * <p>*   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</p>
         * <p>*   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</p>
         * <p>*   NONE: No cross-cycle scheduling dependency type is selected for the node.</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        /**
         * <p>The end time of automatic scheduling. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("EndEffectDate")
        public Long endEffectDate;

        /**
         * <p>The output names of the parent files on which the current file depends.</p>
         */
        @NameInMap("InputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList;

        /**
         * <p>Input parameters of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("InputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> inputParameters;

        /**
         * <p>The output names of the current file.</p>
         * <br>
         * <p>This parameter corresponds to the Output Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("OutputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList;

        /**
         * <p>Output parameters of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("OutputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> outputParameters;

        /**
         * <p>The scheduling parameters of the node.</p>
         * <br>
         * <p>This parameter corresponds to the Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information about the configurations of the scheduling parameters, see [Configure scheduling parameters](~~137548~~).</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <p>Indicates whether the node that corresponds to the file can be rerun. Valid values:</p>
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
         * <p>The ID of the resource group that is used to run the node. You can call the [ListResourceGroups](~~173913~~) operation to query the available resource groups in the workspace.</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The node is an auto triggered node.</p>
         * <p>*   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</p>
         * <p>*   PAUSE: The node is a paused node.</p>
         * <p>*   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The start time of automatic scheduling. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("StartEffectDate")
        public Long startEffectDate;

        /**
         * <p>Indicates whether a node is immediately run after the node is deployed to the production environment.</p>
         * <br>
         * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Start Method parameter in the Schedule section of the Configure tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("StartImmediately")
        public Boolean startImmediately;

        /**
         * <p>Indicates whether the scheduling for the node is suspended Valid values:</p>
         * <br>
         * <p>*   true: The scheduling for the node is suspended.</p>
         * <p>*   false: The scheduling for the node is not suspended.</p>
         * <br>
         * <p>This parameter corresponds to the Recurrence parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Stop")
        public Boolean stop;

        public static GetFileResponseBodyDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfiguration self = new GetFileResponseBodyDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunTimes(Integer autoRerunTimes) {
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        public GetFileResponseBodyDataNodeConfiguration setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetFileResponseBodyDataNodeConfiguration setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentNodeIdList(String dependentNodeIdList) {
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentType(String dependentType) {
            this.dependentType = dependentType;
            return this;
        }
        public String getDependentType() {
            return this.dependentType;
        }

        public GetFileResponseBodyDataNodeConfiguration setEndEffectDate(Long endEffectDate) {
            this.endEffectDate = endEffectDate;
            return this;
        }
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setInputList(java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> getInputList() {
            return this.inputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setInputParameters(java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> getInputParameters() {
            return this.inputParameters;
        }

        public GetFileResponseBodyDataNodeConfiguration setOutputList(java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList) {
            this.outputList = outputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> getOutputList() {
            return this.outputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setOutputParameters(java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> outputParameters) {
            this.outputParameters = outputParameters;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> getOutputParameters() {
            return this.outputParameters;
        }

        public GetFileResponseBodyDataNodeConfiguration setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public GetFileResponseBodyDataNodeConfiguration setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetFileResponseBodyDataNodeConfiguration setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetFileResponseBodyDataNodeConfiguration setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetFileResponseBodyDataNodeConfiguration setStartEffectDate(Long startEffectDate) {
            this.startEffectDate = startEffectDate;
            return this;
        }
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setStartImmediately(Boolean startImmediately) {
            this.startImmediately = startImmediately;
            return this;
        }
        public Boolean getStartImmediately() {
            return this.startImmediately;
        }

        public GetFileResponseBodyDataNodeConfiguration setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

    }

    public static class GetFileResponseBodyData extends TeaModel {
        /**
         * <p>The basic information about the file.</p>
         */
        @NameInMap("File")
        public GetFileResponseBodyDataFile file;

        /**
         * <p>The scheduling configurations of the file.</p>
         */
        @NameInMap("NodeConfiguration")
        public GetFileResponseBodyDataNodeConfiguration nodeConfiguration;

        public static GetFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyData self = new GetFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyData setFile(GetFileResponseBodyDataFile file) {
            this.file = file;
            return this;
        }
        public GetFileResponseBodyDataFile getFile() {
            return this.file;
        }

        public GetFileResponseBodyData setNodeConfiguration(GetFileResponseBodyDataNodeConfiguration nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public GetFileResponseBodyDataNodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

    }

}
