// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public GetFileResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponseBody self = new GetFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public GetFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileResponseBodyDataNodeConfigurationOutputList extends TeaModel {
        @NameInMap("RefTableName")
        public String refTableName;

        @NameInMap("Output")
        public String output;

        public static GetFileResponseBodyDataNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationOutputList self = new GetFileResponseBodyDataNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationInputList extends TeaModel {
        @NameInMap("Input")
        public String input;

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

    }

    public static class GetFileResponseBodyDataNodeConfiguration extends TeaModel {
        @NameInMap("RerunMode")
        public String rerunMode;

        @NameInMap("Stop")
        public Boolean stop;

        @NameInMap("ParaValue")
        public String paraValue;

        @NameInMap("StartEffectDate")
        public Long startEffectDate;

        @NameInMap("EndEffectDate")
        public Long endEffectDate;

        @NameInMap("CycleType")
        public String cycleType;

        @NameInMap("OutputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList;

        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        @NameInMap("InputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList;

        @NameInMap("DependentType")
        public String dependentType;

        @NameInMap("AutoRerunTimes")
        public Integer autoRerunTimes;

        @NameInMap("AutoRerunIntervalMillis")
        public Integer autoRerunIntervalMillis;

        @NameInMap("CronExpress")
        public String cronExpress;

        public static GetFileResponseBodyDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfiguration self = new GetFileResponseBodyDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfiguration setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetFileResponseBodyDataNodeConfiguration setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public GetFileResponseBodyDataNodeConfiguration setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public GetFileResponseBodyDataNodeConfiguration setStartEffectDate(Long startEffectDate) {
            this.startEffectDate = startEffectDate;
            return this;
        }
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setEndEffectDate(Long endEffectDate) {
            this.endEffectDate = endEffectDate;
            return this;
        }
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public GetFileResponseBodyDataNodeConfiguration setOutputList(java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList) {
            this.outputList = outputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> getOutputList() {
            return this.outputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentNodeIdList(String dependentNodeIdList) {
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        public GetFileResponseBodyDataNodeConfiguration setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetFileResponseBodyDataNodeConfiguration setInputList(java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> getInputList() {
            return this.inputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentType(String dependentType) {
            this.dependentType = dependentType;
            return this;
        }
        public String getDependentType() {
            return this.dependentType;
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunTimes(Integer autoRerunTimes) {
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        public GetFileResponseBodyDataNodeConfiguration setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

    }

    public static class GetFileResponseBodyDataFile extends TeaModel {
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FileType")
        public Integer fileType;

        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        @NameInMap("LastEditUser")
        public String lastEditUser;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("UseType")
        public String useType;

        @NameInMap("FileFolderId")
        public String fileFolderId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        @NameInMap("FileDescription")
        public String fileDescription;

        @NameInMap("LastEditTime")
        public Long lastEditTime;

        @NameInMap("Content")
        public String content;

        @NameInMap("NodeId")
        public Long nodeId;

        public static GetFileResponseBodyDataFile build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataFile self = new GetFileResponseBodyDataFile();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataFile setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public GetFileResponseBodyDataFile setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFileResponseBodyDataFile setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFileResponseBodyDataFile setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetFileResponseBodyDataFile setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetFileResponseBodyDataFile setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public GetFileResponseBodyDataFile setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public GetFileResponseBodyDataFile setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetFileResponseBodyDataFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileResponseBodyDataFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

        public GetFileResponseBodyDataFile setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public GetFileResponseBodyDataFile setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetFileResponseBodyDataFile setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetFileResponseBodyDataFile setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public GetFileResponseBodyDataFile setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public GetFileResponseBodyDataFile setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public GetFileResponseBodyDataFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileResponseBodyDataFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetFileResponseBodyData extends TeaModel {
        @NameInMap("NodeConfiguration")
        public GetFileResponseBodyDataNodeConfiguration nodeConfiguration;

        @NameInMap("File")
        public GetFileResponseBodyDataFile file;

        public static GetFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyData self = new GetFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyData setNodeConfiguration(GetFileResponseBodyDataNodeConfiguration nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public GetFileResponseBodyDataNodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        public GetFileResponseBodyData setFile(GetFileResponseBodyDataFile file) {
            this.file = file;
            return this;
        }
        public GetFileResponseBodyDataFile getFile() {
            return this.file;
        }

    }

}
