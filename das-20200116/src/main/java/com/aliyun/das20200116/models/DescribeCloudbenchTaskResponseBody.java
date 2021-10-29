// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCloudbenchTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeCloudbenchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskResponseBody self = new DescribeCloudbenchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCloudbenchTaskResponseBody setData(DescribeCloudbenchTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudbenchTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudbenchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudbenchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudbenchTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCloudbenchTaskResponseBodyData extends TeaModel {
        @NameInMap("ArchiveJobId")
        public String archiveJobId;

        @NameInMap("ArchiveOssTableName")
        public String archiveOssTableName;

        @NameInMap("ArchiveState")
        public Integer archiveState;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("BenchStep")
        public String benchStep;

        @NameInMap("BenchStepStatus")
        public String benchStepStatus;

        @NameInMap("ClientGatewayId")
        public String clientGatewayId;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DstInstanceUuid")
        public String dstInstanceUuid;

        @NameInMap("DstIp")
        public String dstIp;

        @NameInMap("DstPort")
        public Integer dstPort;

        @NameInMap("DstType")
        public String dstType;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("DtsJobState")
        public Integer dtsJobState;

        @NameInMap("DtsJobStatus")
        public String dtsJobStatus;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EndState")
        public String endState;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("External")
        public String external;

        @NameInMap("Rate")
        public Long rate;

        @NameInMap("RequestDuration")
        public Long requestDuration;

        @NameInMap("SmartPressureTime")
        public Integer smartPressureTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("SqlCompleteReuse")
        public String sqlCompleteReuse;

        @NameInMap("SrcInstanceArea")
        public String srcInstanceArea;

        @NameInMap("SrcInstanceUuid")
        public String srcInstanceUuid;

        @NameInMap("SrcPublicIp")
        public String srcPublicIp;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("TableSchema")
        public String tableSchema;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Version")
        public String version;

        @NameInMap("WorkDir")
        public String workDir;

        public static DescribeCloudbenchTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudbenchTaskResponseBodyData self = new DescribeCloudbenchTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudbenchTaskResponseBodyData setArchiveJobId(String archiveJobId) {
            this.archiveJobId = archiveJobId;
            return this;
        }
        public String getArchiveJobId() {
            return this.archiveJobId;
        }

        public DescribeCloudbenchTaskResponseBodyData setArchiveOssTableName(String archiveOssTableName) {
            this.archiveOssTableName = archiveOssTableName;
            return this;
        }
        public String getArchiveOssTableName() {
            return this.archiveOssTableName;
        }

        public DescribeCloudbenchTaskResponseBodyData setArchiveState(Integer archiveState) {
            this.archiveState = archiveState;
            return this;
        }
        public Integer getArchiveState() {
            return this.archiveState;
        }

        public DescribeCloudbenchTaskResponseBodyData setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeCloudbenchTaskResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeCloudbenchTaskResponseBodyData setBenchStep(String benchStep) {
            this.benchStep = benchStep;
            return this;
        }
        public String getBenchStep() {
            return this.benchStep;
        }

        public DescribeCloudbenchTaskResponseBodyData setBenchStepStatus(String benchStepStatus) {
            this.benchStepStatus = benchStepStatus;
            return this;
        }
        public String getBenchStepStatus() {
            return this.benchStepStatus;
        }

        public DescribeCloudbenchTaskResponseBodyData setClientGatewayId(String clientGatewayId) {
            this.clientGatewayId = clientGatewayId;
            return this;
        }
        public String getClientGatewayId() {
            return this.clientGatewayId;
        }

        public DescribeCloudbenchTaskResponseBodyData setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeCloudbenchTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudbenchTaskResponseBodyData setDstInstanceUuid(String dstInstanceUuid) {
            this.dstInstanceUuid = dstInstanceUuid;
            return this;
        }
        public String getDstInstanceUuid() {
            return this.dstInstanceUuid;
        }

        public DescribeCloudbenchTaskResponseBodyData setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public DescribeCloudbenchTaskResponseBodyData setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public DescribeCloudbenchTaskResponseBodyData setDstType(String dstType) {
            this.dstType = dstType;
            return this;
        }
        public String getDstType() {
            return this.dstType;
        }

        public DescribeCloudbenchTaskResponseBodyData setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeCloudbenchTaskResponseBodyData setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeCloudbenchTaskResponseBodyData setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeCloudbenchTaskResponseBodyData setDtsJobState(Integer dtsJobState) {
            this.dtsJobState = dtsJobState;
            return this;
        }
        public Integer getDtsJobState() {
            return this.dtsJobState;
        }

        public DescribeCloudbenchTaskResponseBodyData setDtsJobStatus(String dtsJobStatus) {
            this.dtsJobStatus = dtsJobStatus;
            return this;
        }
        public String getDtsJobStatus() {
            return this.dtsJobStatus;
        }

        public DescribeCloudbenchTaskResponseBodyData setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeCloudbenchTaskResponseBodyData setEndState(String endState) {
            this.endState = endState;
            return this;
        }
        public String getEndState() {
            return this.endState;
        }

        public DescribeCloudbenchTaskResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeCloudbenchTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeCloudbenchTaskResponseBodyData setExternal(String external) {
            this.external = external;
            return this;
        }
        public String getExternal() {
            return this.external;
        }

        public DescribeCloudbenchTaskResponseBodyData setRate(Long rate) {
            this.rate = rate;
            return this;
        }
        public Long getRate() {
            return this.rate;
        }

        public DescribeCloudbenchTaskResponseBodyData setRequestDuration(Long requestDuration) {
            this.requestDuration = requestDuration;
            return this;
        }
        public Long getRequestDuration() {
            return this.requestDuration;
        }

        public DescribeCloudbenchTaskResponseBodyData setSmartPressureTime(Integer smartPressureTime) {
            this.smartPressureTime = smartPressureTime;
            return this;
        }
        public Integer getSmartPressureTime() {
            return this.smartPressureTime;
        }

        public DescribeCloudbenchTaskResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeCloudbenchTaskResponseBodyData setSqlCompleteReuse(String sqlCompleteReuse) {
            this.sqlCompleteReuse = sqlCompleteReuse;
            return this;
        }
        public String getSqlCompleteReuse() {
            return this.sqlCompleteReuse;
        }

        public DescribeCloudbenchTaskResponseBodyData setSrcInstanceArea(String srcInstanceArea) {
            this.srcInstanceArea = srcInstanceArea;
            return this;
        }
        public String getSrcInstanceArea() {
            return this.srcInstanceArea;
        }

        public DescribeCloudbenchTaskResponseBodyData setSrcInstanceUuid(String srcInstanceUuid) {
            this.srcInstanceUuid = srcInstanceUuid;
            return this;
        }
        public String getSrcInstanceUuid() {
            return this.srcInstanceUuid;
        }

        public DescribeCloudbenchTaskResponseBodyData setSrcPublicIp(String srcPublicIp) {
            this.srcPublicIp = srcPublicIp;
            return this;
        }
        public String getSrcPublicIp() {
            return this.srcPublicIp;
        }

        public DescribeCloudbenchTaskResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCloudbenchTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudbenchTaskResponseBodyData setTableSchema(String tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public String getTableSchema() {
            return this.tableSchema;
        }

        public DescribeCloudbenchTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCloudbenchTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeCloudbenchTaskResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeCloudbenchTaskResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCloudbenchTaskResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeCloudbenchTaskResponseBodyData setWorkDir(String workDir) {
            this.workDir = workDir;
            return this;
        }
        public String getWorkDir() {
            return this.workDir;
        }

    }

}
