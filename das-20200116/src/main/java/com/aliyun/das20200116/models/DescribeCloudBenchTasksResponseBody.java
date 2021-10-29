// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCloudBenchTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeCloudBenchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudBenchTasksResponseBody self = new DescribeCloudBenchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudBenchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCloudBenchTasksResponseBody setData(DescribeCloudBenchTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudBenchTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudBenchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudBenchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudBenchTasksResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks extends TeaModel {
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
        public Integer rate;

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

        public static DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks self = new DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setArchiveJobId(String archiveJobId) {
            this.archiveJobId = archiveJobId;
            return this;
        }
        public String getArchiveJobId() {
            return this.archiveJobId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setArchiveOssTableName(String archiveOssTableName) {
            this.archiveOssTableName = archiveOssTableName;
            return this;
        }
        public String getArchiveOssTableName() {
            return this.archiveOssTableName;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setArchiveState(Integer archiveState) {
            this.archiveState = archiveState;
            return this;
        }
        public Integer getArchiveState() {
            return this.archiveState;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setBenchStep(String benchStep) {
            this.benchStep = benchStep;
            return this;
        }
        public String getBenchStep() {
            return this.benchStep;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setBenchStepStatus(String benchStepStatus) {
            this.benchStepStatus = benchStepStatus;
            return this;
        }
        public String getBenchStepStatus() {
            return this.benchStepStatus;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setClientGatewayId(String clientGatewayId) {
            this.clientGatewayId = clientGatewayId;
            return this;
        }
        public String getClientGatewayId() {
            return this.clientGatewayId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDstInstanceUuid(String dstInstanceUuid) {
            this.dstInstanceUuid = dstInstanceUuid;
            return this;
        }
        public String getDstInstanceUuid() {
            return this.dstInstanceUuid;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDstType(String dstType) {
            this.dstType = dstType;
            return this;
        }
        public String getDstType() {
            return this.dstType;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDtsJobState(Integer dtsJobState) {
            this.dtsJobState = dtsJobState;
            return this;
        }
        public Integer getDtsJobState() {
            return this.dtsJobState;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setDtsJobStatus(String dtsJobStatus) {
            this.dtsJobStatus = dtsJobStatus;
            return this;
        }
        public String getDtsJobStatus() {
            return this.dtsJobStatus;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setEndState(String endState) {
            this.endState = endState;
            return this;
        }
        public String getEndState() {
            return this.endState;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setExternal(String external) {
            this.external = external;
            return this;
        }
        public String getExternal() {
            return this.external;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setRequestDuration(Long requestDuration) {
            this.requestDuration = requestDuration;
            return this;
        }
        public Long getRequestDuration() {
            return this.requestDuration;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSmartPressureTime(Integer smartPressureTime) {
            this.smartPressureTime = smartPressureTime;
            return this;
        }
        public Integer getSmartPressureTime() {
            return this.smartPressureTime;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSqlCompleteReuse(String sqlCompleteReuse) {
            this.sqlCompleteReuse = sqlCompleteReuse;
            return this;
        }
        public String getSqlCompleteReuse() {
            return this.sqlCompleteReuse;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSrcInstanceArea(String srcInstanceArea) {
            this.srcInstanceArea = srcInstanceArea;
            return this;
        }
        public String getSrcInstanceArea() {
            return this.srcInstanceArea;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSrcInstanceUuid(String srcInstanceUuid) {
            this.srcInstanceUuid = srcInstanceUuid;
            return this;
        }
        public String getSrcInstanceUuid() {
            return this.srcInstanceUuid;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setSrcPublicIp(String srcPublicIp) {
            this.srcPublicIp = srcPublicIp;
            return this;
        }
        public String getSrcPublicIp() {
            return this.srcPublicIp;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setTableSchema(String tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public String getTableSchema() {
            return this.tableSchema;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks setWorkDir(String workDir) {
            this.workDir = workDir;
            return this;
        }
        public String getWorkDir() {
            return this.workDir;
        }

    }

    public static class DescribeCloudBenchTasksResponseBodyDataList extends TeaModel {
        @NameInMap("cloudbenchTasks")
        public java.util.List<DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks> cloudbenchTasks;

        public static DescribeCloudBenchTasksResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudBenchTasksResponseBodyDataList self = new DescribeCloudBenchTasksResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeCloudBenchTasksResponseBodyDataList setCloudbenchTasks(java.util.List<DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks> cloudbenchTasks) {
            this.cloudbenchTasks = cloudbenchTasks;
            return this;
        }
        public java.util.List<DescribeCloudBenchTasksResponseBodyDataListCloudbenchTasks> getCloudbenchTasks() {
            return this.cloudbenchTasks;
        }

    }

    public static class DescribeCloudBenchTasksResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public DescribeCloudBenchTasksResponseBodyDataList list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeCloudBenchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudBenchTasksResponseBodyData self = new DescribeCloudBenchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudBenchTasksResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeCloudBenchTasksResponseBodyData setList(DescribeCloudBenchTasksResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public DescribeCloudBenchTasksResponseBodyDataList getList() {
            return this.list;
        }

        public DescribeCloudBenchTasksResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public DescribeCloudBenchTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudBenchTasksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
