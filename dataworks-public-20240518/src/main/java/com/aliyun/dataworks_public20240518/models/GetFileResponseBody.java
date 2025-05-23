// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
         * <strong>example:</strong>
         * <p>{\&quot;priority\&quot;:\&quot;1\&quot;,\&quot;ENABLE_SPARKSQL_JDBC\&quot;:false,\&quot;FLOW_SKIP_SQL_ANALYZE\&quot;:false,\&quot;queue\&quot;:\&quot;default\&quot;}</p>
         */
        @NameInMap("AdvancedSettings")
        public String advancedSettings;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoParsing")
        public Boolean autoParsing;

        /**
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>424732****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        /**
         * <strong>example:</strong>
         * <p>RECYCLE</p>
         */
        @NameInMap("DeletedStatus")
        public String deletedStatus;

        /**
         * <strong>example:</strong>
         * <p>My first DataWorks file</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <strong>example:</strong>
         * <p>2735c2****</p>
         */
        @NameInMap("FileFolderId")
        public String fileFolderId;

        /**
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        /**
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <strong>example:</strong>
         * <p>424732****</p>
         */
        @NameInMap("LastEditUser")
        public String lastEditUser;

        /**
         * <strong>example:</strong>
         * <p>300001</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <strong>example:</strong>
         * <p>7775674356****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
         * <strong>example:</strong>
         * <p>project.001_out</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>MANUAL</p>
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
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>project_001.parent_node:outputs</p>
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
         * <strong>example:</strong>
         * <p>dw_project.002_out</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
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
         * <strong>example:</strong>
         * <p>It\&quot;s a context output parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>${bizdate}</p>
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyScheduleImmediately")
        public String applyScheduleImmediately;

        /**
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Integer autoRerunIntervalMillis;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoRerunTimes")
        public Integer autoRerunTimes;

        /**
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        /**
         * <strong>example:</strong>
         * <p>4155787800000</p>
         */
        @NameInMap("EndEffectDate")
        public Long endEffectDate;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreParentSkipRunningProperty")
        public String ignoreParentSkipRunningProperty;

        /**
         * <strong>example:</strong>
         * <p>m-bp1h4b5a8ogkbll2f3tr</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList;

        @NameInMap("InputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> inputParameters;

        @NameInMap("OutputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList;

        @NameInMap("OutputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> outputParameters;

        /**
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <strong>example:</strong>
         * <p>936923400000</p>
         */
        @NameInMap("StartEffectDate")
        public Long startEffectDate;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StartImmediately")
        public Boolean startImmediately;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stop")
        public Boolean stop;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetFileResponseBodyDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfiguration self = new GetFileResponseBodyDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfiguration setApplyScheduleImmediately(String applyScheduleImmediately) {
            this.applyScheduleImmediately = applyScheduleImmediately;
            return this;
        }
        public String getApplyScheduleImmediately() {
            return this.applyScheduleImmediately;
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

        public GetFileResponseBodyDataNodeConfiguration setIgnoreParentSkipRunningProperty(String ignoreParentSkipRunningProperty) {
            this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
            return this;
        }
        public String getIgnoreParentSkipRunningProperty() {
            return this.ignoreParentSkipRunningProperty;
        }

        public GetFileResponseBodyDataNodeConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
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

        public GetFileResponseBodyDataNodeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetFileResponseBodyDataResourceDownloadLink extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("downloadLink")
        public String downloadLink;

        public static GetFileResponseBodyDataResourceDownloadLink build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataResourceDownloadLink self = new GetFileResponseBodyDataResourceDownloadLink();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataResourceDownloadLink setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

    public static class GetFileResponseBodyData extends TeaModel {
        @NameInMap("File")
        public GetFileResponseBodyDataFile file;

        @NameInMap("NodeConfiguration")
        public GetFileResponseBodyDataNodeConfiguration nodeConfiguration;

        @NameInMap("ResourceDownloadLink")
        public GetFileResponseBodyDataResourceDownloadLink resourceDownloadLink;

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

        public GetFileResponseBodyData setResourceDownloadLink(GetFileResponseBodyDataResourceDownloadLink resourceDownloadLink) {
            this.resourceDownloadLink = resourceDownloadLink;
            return this;
        }
        public GetFileResponseBodyDataResourceDownloadLink getResourceDownloadLink() {
            return this.resourceDownloadLink;
        }

    }

}
