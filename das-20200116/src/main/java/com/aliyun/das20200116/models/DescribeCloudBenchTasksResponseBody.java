// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public DescribeCloudBenchTasksResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The archiving task ID.</p>
         */
        @NameInMap("ArchiveJobId")
        public String archiveJobId;

        /**
         * <p>The name of the table that was archived to Object Storage Service (OSS).</p>
         */
        @NameInMap("ArchiveOssTableName")
        public String archiveOssTableName;

        /**
         * <p>The archiving status of the file that stores the analysis result of full SQL statistics. Valid values:</p>
         * <br>
         * <p>* **0**: The file archiving is not started.</p>
         * <p>* **1**: The file is archived.</p>
         * <p>* **2**: An error occurred.</p>
         * <p>* **3**: The file is being archived.</p>
         * <p>* **4**: The archived file does not need to be downloaded.</p>
         */
        @NameInMap("ArchiveState")
        public Integer archiveState;

        /**
         * <p>The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup type. Valid values:</p>
         * <br>
         * <p>* **TIMESTAMP**: Data is restored to the state at a specific point in time.</p>
         * <p>* **BACKUPID**: Data is restored from a backup set that is identified by an ID.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The substep in the stress testing task. Valid values:</p>
         * <br>
         * <p>* **NEW**: Initialize the stress testing task.</p>
         * <p>* **WAIT_BUY_ECS**: Purchase an ECS instance.</p>
         * <p>* **WAIT_START_ECS**: Start the ECS instance.</p>
         * <p>* **WAIT_INSTALL_JDK**: Install the Java Development Kit (JDK).</p>
         * <p>* **WAIT_INSTALL_DBGATEWAY**: Install the database gateway (DBGateway).</p>
         * <p>* **ADD_SECURITY_IPS_STEP**: Configure the whitelist of the security group.</p>
         * <p>* **ARCHIVIE**: Archive the file that stores the analysis results of full SQL statistics.</p>
         * <p>* **DOWNLOAD**: Download the file that stores the analysis result of full SQL statistics.</p>
         * <p>* **PROCEED**: Preprocess the file that stores the analysis result of full SQL statistics.</p>
         * <p>* **PRE_LOAD**: Preload the file that stores the analysis result of full SQL statistics.</p>
         * <p>* **VALIDATE**: Verify the functionality of stress testing.</p>
         * <p>* **PRESSURE**: Start the stress testing task.</p>
         */
        @NameInMap("BenchStep")
        public String benchStep;

        /**
         * <p>The status that indicates the substep performed for the stress testing task. Valid values:</p>
         * <br>
         * <p>* **NEW**: The task is being initialized.</p>
         * <p>* **RUNNING**: The task is running.</p>
         * <p>* **FAILED**: The task failed.</p>
         * <p>* **FINISHED**: The task is complete.</p>
         * <p>* **Terminated**: The task is terminated.</p>
         * <p>* **Deleted**: The task is deleted.</p>
         */
        @NameInMap("BenchStepStatus")
        public String benchStepStatus;

        /**
         * <p>The DBGateway ID of the stress testing client.</p>
         */
        @NameInMap("ClientGatewayId")
        public String clientGatewayId;

        /**
         * <p>The type of the stress testing client. Valid values:</p>
         * <br>
         * <p>* **ECS**: indicates that you must prepare the DBGateway.</p>
         * <p>* **DAS_ECS**: indicates that DAS automatically purchases and deploys an ECS instance for stress testing.</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The description of the stress testing task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The UUID of the destination instance.</p>
         */
        @NameInMap("DstInstanceUuid")
        public String dstInstanceUuid;

        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <p>The port number of the destination instance.</p>
         */
        @NameInMap("DstPort")
        public Integer dstPort;

        /**
         * <p>The type of the identifier that is used to indicate the destination instance. Valid values:</p>
         * <br>
         * <p>* **Instance** (default): the instance ID.</p>
         * <p>* **ConnectionString**: the endpoint of the instance.</p>
         */
        @NameInMap("DstType")
        public String dstType;

        /**
         * <p>The specification of the DTS instance.</p>
         * <br>
         * <p>> For more information about the specifications of DTS instances and the test performance of each instance, see [Specifications of data migration instances](~~26606~~).</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The ID of the DTS migration task.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the Data Transmission Service (DTS) migration task.</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The status of the DTS migration task. Valid values:</p>
         * <br>
         * <p>* **NOT_STARTED**: The task is not started.</p>
         * <p>* **PRE_CHECKING**: The task is in precheck.</p>
         * <p>* **PRE_CHECK_FAILED**: The precheck failed.</p>
         * <p>* **CHECKING**: The task is being checked.</p>
         * <p>* **MIGRATING**: The data is being migrated.</p>
         * <p>* **CATCHED**: The data is migrated from the source instance to the destination instance.</p>
         * <p>* **SUSPENDING**: The task is suspended.</p>
         * <p>* **MIGRATION_FAILED**: The data failed to be migrated.</p>
         * <p>* **FINISHED**: The task is complete.</p>
         * <p>* **INITIALIZING**: The synchronization is being initialized.</p>
         * <p>* **INITIALIZE_FAILED**: The synchronization failed to be initialized.</p>
         * <p>* **SYNCHRONIZING**: The data is being synchronized.</p>
         * <p>* **MODIFYING**: The roles of the instances are being changed.</p>
         * <p>* **SWITCHING**: The roles of the instances are being switched.</p>
         * <p>* **FAILED**: The task failed.</p>
         */
        @NameInMap("DtsJobState")
        public Integer dtsJobState;

        /**
         * <p>The status of the DTS migration task. Valid values:</p>
         * <br>
         * <p>* **NOT_STARTED**: The task is not started.</p>
         * <p>* **PRE_CHECKING**: The task is in precheck.</p>
         * <p>* **PRE_CHECK_FAILED**: The precheck failed.</p>
         * <p>* **CHECKING**: The task is being checked.</p>
         * <p>* **MIGRATING**: The data is being migrated.</p>
         * <p>* **CATCHED**: The data is migrated from the source instance to the destination instance.</p>
         * <p>* **SUSPENDING**: The task is suspended.</p>
         * <p>* **MIGRATION_FAILED**: The data failed to be migrated.</p>
         * <p>* **FINISHED**: The task is complete.</p>
         * <p>* **INITIALIZING**: The synchronization is being initialized.</p>
         * <p>* **INITIALIZE_FAILED**: The synchronization failed to be initialized.</p>
         * <p>* **SYNCHRONIZING**: The data is being synchronized.</p>
         * <p>* **MODIFYING**: The roles of the instances are being changed.</p>
         * <p>* **SWITCHING**: The roles of the instances are being switched.</p>
         * <p>* **FAILED**: The task failed.</p>
         */
        @NameInMap("DtsJobStatus")
        public String dtsJobStatus;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The state that indicates the last operation performed for the stress testing task. Valid values:</p>
         * <br>
         * <p>* **WAIT_TARGET**: prepares the destination instance.</p>
         * <p>* **WAIT_DBGATEWAY**: prepares the DBGateway.</p>
         * <p>* **WAIT_SQL**: prepares the full SQL statistics.</p>
         * <p>* **WAIT_LOGIC**: prepares to replay the traffic.</p>
         * <br>
         * <p>> When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task is complete.</p>
         */
        @NameInMap("EndState")
        public String endState;

        /**
         * <p>The error code returned for the substep of the stress testing task.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("External")
        public String external;

        /**
         * <p>The rate at which the stress testing task replayed the traffic. This value is a positive integer. Valid values: **0** to **30**. Default value: **1**.</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The duration of the stress testing task. Unit: millisecond.</p>
         */
        @NameInMap("RequestDuration")
        public Long requestDuration;

        /**
         * <p>The duration of the stress testing task of the smart pressure test type. Unit: millisecond.</p>
         */
        @NameInMap("SmartPressureTime")
        public Integer smartPressureTime;

        /**
         * <p>The source of the task. Valid values:</p>
         * <br>
         * <p>* **DAS**</p>
         * <p>* **OPEN_API**</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The reused information about the analysis result of full SQL statistics.</p>
         */
        @NameInMap("SqlCompleteReuse")
        public String sqlCompleteReuse;

        /**
         * <p>The database engine of the source instance. Valid values:</p>
         */
        @NameInMap("SrcInstanceArea")
        public String srcInstanceArea;

        /**
         * <p>The UUID of the source instance.</p>
         */
        @NameInMap("SrcInstanceUuid")
        public String srcInstanceUuid;

        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("SrcPublicIp")
        public String srcPublicIp;

        /**
         * <p>The state that indicates the operation performed for the stress testing task. Valid values:</p>
         * <br>
         * <p>* **WAIT_TARGET**: prepares the destination instance.</p>
         * <p>* **WAIT_DBGATEWAY**: prepares the DBGateway.</p>
         * <p>* **WAIT_SQL**: prepares the full SQL statistics.</p>
         * <p>* **WAIT_LOGIC**: prepares to replay the traffic.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the stress testing task. Valid values:</p>
         * <br>
         * <p>* **SUCCESS**: The task was successful.</p>
         * <p>* **IGNORED**: The task was ignored.</p>
         * <p>* **RUNNING**: The task is running.</p>
         * <p>* **EXCEPTION**: The task is abnormal.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the table that is used for stress testing.</p>
         */
        @NameInMap("TableSchema")
        public String tableSchema;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the stress testing task. Valid values:</p>
         * <br>
         * <p>* **pressure test** (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</p>
         * <p>* **smart pressure test**: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The topic that contains the consumed data. This topic is a topic in Message Queue for Apache Kafka.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The version of the stress testing task. Valid values:</p>
         * <br>
         * <p>* **V2.0**</p>
         * <p>* **V3.0**</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The path of the temporary directory that is generated for stress testing.</p>
         */
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
        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The detailed information of the stress testing task.</p>
         */
        @NameInMap("List")
        public DescribeCloudBenchTasksResponseBodyDataList list;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
