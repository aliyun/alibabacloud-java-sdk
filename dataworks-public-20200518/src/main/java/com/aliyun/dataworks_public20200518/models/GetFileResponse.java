// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetFileResponseData data;

    public static GetFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponse self = new GetFileResponse();
        return TeaModel.build(map, self);
    }

    public GetFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFileResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileResponse setData(GetFileResponseData data) {
        this.data = data;
        return this;
    }
    public GetFileResponseData getData() {
        return this.data;
    }

    public static class GetFileResponseDataFile extends TeaModel {
        @NameInMap("ConnectionName")
        @Validation(required = true)
        public String connectionName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("IsMaxCompute")
        @Validation(required = true)
        public Boolean isMaxCompute;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("CreateUser")
        @Validation(required = true)
        public String createUser;

        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("FileFolderId")
        @Validation(required = true)
        public String fileFolderId;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public Integer fileType;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        @NameInMap("FileDescription")
        @Validation(required = true)
        public String fileDescription;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("CurrentVersion")
        @Validation(required = true)
        public Integer currentVersion;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("LastEditUser")
        @Validation(required = true)
        public String lastEditUser;

        @NameInMap("LastEditTime")
        @Validation(required = true)
        public Long lastEditTime;

        @NameInMap("CommitStatus")
        @Validation(required = true)
        public Integer commitStatus;

        @NameInMap("DeletedStatus")
        @Validation(required = true)
        public String deletedStatus;

        @NameInMap("BusinessId")
        @Validation(required = true)
        public Long businessId;

        @NameInMap("AutoParsing")
        @Validation(required = true)
        public Boolean autoParsing;

        public static GetFileResponseDataFile build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataFile self = new GetFileResponseDataFile();
            return TeaModel.build(map, self);
        }

        public GetFileResponseDataFile setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetFileResponseDataFile setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetFileResponseDataFile setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public GetFileResponseDataFile setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFileResponseDataFile setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetFileResponseDataFile setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetFileResponseDataFile setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public GetFileResponseDataFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileResponseDataFile setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetFileResponseDataFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

        public GetFileResponseDataFile setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public GetFileResponseDataFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileResponseDataFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileResponseDataFile setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public GetFileResponseDataFile setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFileResponseDataFile setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public GetFileResponseDataFile setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public GetFileResponseDataFile setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public GetFileResponseDataFile setDeletedStatus(String deletedStatus) {
            this.deletedStatus = deletedStatus;
            return this;
        }
        public String getDeletedStatus() {
            return this.deletedStatus;
        }

        public GetFileResponseDataFile setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetFileResponseDataFile setAutoParsing(Boolean autoParsing) {
            this.autoParsing = autoParsing;
            return this;
        }
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

    }

    public static class GetFileResponseDataNodeConfigurationInputList extends TeaModel {
        @NameInMap("Input")
        @Validation(required = true)
        public String input;

        @NameInMap("ParseType")
        @Validation(required = true)
        public String parseType;

        public static GetFileResponseDataNodeConfigurationInputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfigurationInputList self = new GetFileResponseDataNodeConfigurationInputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseDataNodeConfigurationInputList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetFileResponseDataNodeConfigurationInputList setParseType(String parseType) {
            this.parseType = parseType;
            return this;
        }
        public String getParseType() {
            return this.parseType;
        }

    }

    public static class GetFileResponseDataNodeConfigurationOutputList extends TeaModel {
        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("RefTableName")
        @Validation(required = true)
        public String refTableName;

        public static GetFileResponseDataNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfigurationOutputList self = new GetFileResponseDataNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseDataNodeConfigurationOutputList setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetFileResponseDataNodeConfigurationOutputList setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class GetFileResponseDataNodeConfiguration extends TeaModel {
        @NameInMap("AutoRerunTimes")
        @Validation(required = true)
        public Integer autoRerunTimes;

        @NameInMap("AutoRerunIntervalMillis")
        @Validation(required = true)
        public Integer autoRerunIntervalMillis;

        @NameInMap("RerunMode")
        @Validation(required = true)
        public String rerunMode;

        @NameInMap("Stop")
        @Validation(required = true)
        public Boolean stop;

        @NameInMap("ParaValue")
        @Validation(required = true)
        public String paraValue;

        @NameInMap("StartEffectDate")
        @Validation(required = true)
        public Long startEffectDate;

        @NameInMap("EndEffectDate")
        @Validation(required = true)
        public Long endEffectDate;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("CycleType")
        @Validation(required = true)
        public String cycleType;

        @NameInMap("DependentType")
        @Validation(required = true)
        public String dependentType;

        @NameInMap("DependentNodeIdList")
        @Validation(required = true)
        public String dependentNodeIdList;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public Long resourceGroupId;

        @NameInMap("InputList")
        @Validation(required = true)
        public java.util.List<GetFileResponseDataNodeConfigurationInputList> inputList;

        @NameInMap("OutputList")
        @Validation(required = true)
        public java.util.List<GetFileResponseDataNodeConfigurationOutputList> outputList;

        public static GetFileResponseDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfiguration self = new GetFileResponseDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetFileResponseDataNodeConfiguration setAutoRerunTimes(Integer autoRerunTimes) {
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        public GetFileResponseDataNodeConfiguration setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        public GetFileResponseDataNodeConfiguration setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetFileResponseDataNodeConfiguration setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public GetFileResponseDataNodeConfiguration setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public GetFileResponseDataNodeConfiguration setStartEffectDate(Long startEffectDate) {
            this.startEffectDate = startEffectDate;
            return this;
        }
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        public GetFileResponseDataNodeConfiguration setEndEffectDate(Long endEffectDate) {
            this.endEffectDate = endEffectDate;
            return this;
        }
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        public GetFileResponseDataNodeConfiguration setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetFileResponseDataNodeConfiguration setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public GetFileResponseDataNodeConfiguration setDependentType(String dependentType) {
            this.dependentType = dependentType;
            return this;
        }
        public String getDependentType() {
            return this.dependentType;
        }

        public GetFileResponseDataNodeConfiguration setDependentNodeIdList(String dependentNodeIdList) {
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        public GetFileResponseDataNodeConfiguration setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetFileResponseDataNodeConfiguration setInputList(java.util.List<GetFileResponseDataNodeConfigurationInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<GetFileResponseDataNodeConfigurationInputList> getInputList() {
            return this.inputList;
        }

        public GetFileResponseDataNodeConfiguration setOutputList(java.util.List<GetFileResponseDataNodeConfigurationOutputList> outputList) {
            this.outputList = outputList;
            return this;
        }
        public java.util.List<GetFileResponseDataNodeConfigurationOutputList> getOutputList() {
            return this.outputList;
        }

    }

    public static class GetFileResponseData extends TeaModel {
        @NameInMap("File")
        @Validation(required = true)
        public GetFileResponseDataFile file;

        @NameInMap("NodeConfiguration")
        @Validation(required = true)
        public GetFileResponseDataNodeConfiguration nodeConfiguration;

        public static GetFileResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseData self = new GetFileResponseData();
            return TeaModel.build(map, self);
        }

        public GetFileResponseData setFile(GetFileResponseDataFile file) {
            this.file = file;
            return this;
        }
        public GetFileResponseDataFile getFile() {
            return this.file;
        }

        public GetFileResponseData setNodeConfiguration(GetFileResponseDataNodeConfiguration nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public GetFileResponseDataNodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

    }

}
