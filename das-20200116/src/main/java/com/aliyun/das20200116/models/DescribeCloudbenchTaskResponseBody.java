// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the total number of entries and error codes.</p>
     */
    @NameInMap("Data")
    public DescribeCloudbenchTaskResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The archiving task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;202105211430070112231480820340758****</p>
         */
        @NameInMap("ArchiveJobId")
        public String archiveJobId;

        /**
         * <p>The name of the archived OSS table.</p>
         * 
         * <strong>example:</strong>
         * <p>custins15546355_161604665****</p>
         */
        @NameInMap("ArchiveOssTableName")
        public String archiveOssTableName;

        /**
         * <p>The SQL archiving state. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not started.</li>
         * <li><strong>1</strong>: completed.</li>
         * <li><strong>2</strong>: error.</li>
         * <li><strong>3</strong>: running.</li>
         * <li><strong>4</strong>: no download required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ArchiveState")
        public Integer archiveState;

        /**
         * <p>The backup set ID. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to obtain the backup set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>229132</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>TIMESTAMP</strong>: by backup time.</li>
         * <li><strong>BACKUPID</strong>: by backup set ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIMESTAMP</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The substep of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>NEW</strong>: task initialization.</li>
         * <li><strong>WAIT_BUY_ECS</strong>: purchasing an ECS instance.</li>
         * <li><strong>WAIT_START_ECS</strong>: starting the ECS instance.</li>
         * <li><strong>WAIT_INSTALL_JDK</strong>: installing JDK.</li>
         * <li><strong>WAIT_INSTALL_DBGATEWAY</strong>: installing DBGateway.</li>
         * <li><strong>ADD_SECURITY_IPS_STEP</strong>: configuring the security group whitelist.</li>
         * <li><strong>ARCHIVE</strong>: archiving full SQL.</li>
         * <li><strong>DOWNLOAD</strong>: downloading the full SQL file.</li>
         * <li><strong>PROCEED</strong>: preprocessing the full SQL file.</li>
         * <li><strong>PRE_LOAD</strong>: preloading the full SQL file.</li>
         * <li><strong>VALIDATE</strong>: functional verification.</li>
         * <li><strong>PRESSURE</strong>: performance stress testing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROCEED</p>
         */
        @NameInMap("BenchStep")
        public String benchStep;

        /**
         * <p>The status of the stress testing substep. Valid values:</p>
         * <ul>
         * <li><strong>NEW</strong>: task initialization.</li>
         * <li><strong>RUNNING</strong>: running.</li>
         * <li><strong>FAILED</strong>: failed.</li>
         * <li><strong>FINISHED</strong>: completed.</li>
         * <li><strong>Terminated</strong>: terminated.</li>
         * <li><strong>Deleted</strong>: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("BenchStepStatus")
        public String benchStepStatus;

        /**
         * <p>The database gateway ID of the stress testing machine.</p>
         * 
         * <strong>example:</strong>
         * <p>58598b2af48a0193dfc16fc6964ef****</p>
         */
        @NameInMap("ClientGatewayId")
        public String clientGatewayId;

        /**
         * <p>The type of the stress testing machine. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: You need to prepare the <a href="https://help.aliyun.com/document_detail/64905.html">Database Gateway</a> on your own.</li>
         * <li><strong>DAS_ECS</strong>: an ECS instance automatically purchased and deployed by DAS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The description of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>test-das-bench-0501</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique identity of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_d887b5ccf99fa0dc9a1e5aaac368****</p>
         */
        @NameInMap("DstInstanceUuid")
        public String dstInstanceUuid;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <p>The port of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("DstPort")
        public Integer dstPort;

        /**
         * <p>The type of the target instance. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong> (default): instance ID.</li>
         * <li><strong>ConnectionString</strong>: endpoint of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("DstType")
        public String dstType;

        /**
         * <p>The DTS task specification.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The ID of the DTS migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the Data Transmission Service (DTS) task.</p>
         * 
         * <strong>example:</strong>
         * <p>Migration between RDS instances</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The DTS task state. Valid values:</p>
         * <ul>
         * <li><strong>NOT_STARTED</strong>: not started.</li>
         * <li><strong>PRE_CHECKING</strong>: precheck in progress.</li>
         * <li><strong>PRE_CHECK_FAILED</strong>: precheck failed.</li>
         * <li><strong>CHECKING</strong>: checking.</li>
         * <li><strong>MIGRATING</strong>: migrating.</li>
         * <li><strong>CATCHED</strong>: caught up.</li>
         * <li><strong>SUSPENDING</strong>: suspending.</li>
         * <li><strong>MIGRATION_FAILED</strong>: migration failed.</li>
         * <li><strong>FINISHED</strong>: completed.</li>
         * <li><strong>INITIALIZING</strong>: synchronization initializing.</li>
         * <li><strong>INITIALIZE_FAILED</strong>: synchronization initialization failed.</li>
         * <li><strong>SYNCHRONIZING</strong>: synchronizing.</li>
         * <li><strong>MODIFYING</strong>: modifying synchronization objects.</li>
         * <li><strong>SWITCHING</strong>: switching.</li>
         * <li><strong>FAILED</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHECKING</p>
         */
        @NameInMap("DtsJobState")
        public Integer dtsJobState;

        /**
         * <p>The DTS task state. Valid values:</p>
         * <ul>
         * <li><strong>NOT_STARTED</strong>: not started.</li>
         * <li><strong>PRE_CHECKING</strong>: precheck in progress.</li>
         * <li><strong>PRE_CHECK_FAILED</strong>: precheck failed.</li>
         * <li><strong>CHECKING</strong>: checking.</li>
         * <li><strong>MIGRATING</strong>: migrating.</li>
         * <li><strong>CATCHED</strong>: caught up.</li>
         * <li><strong>SUSPENDING</strong>: suspending.</li>
         * <li><strong>MIGRATION_FAILED</strong>: migration failed.</li>
         * <li><strong>FINISHED</strong>: completed.</li>
         * <li><strong>INITIALIZING</strong>: synchronization initializing.</li>
         * <li><strong>INITIALIZE_FAILED</strong>: synchronization initialization failed.</li>
         * <li><strong>SYNCHRONIZING</strong>: synchronizing.</li>
         * <li><strong>MODIFYING</strong>: modifying synchronization objects.</li>
         * <li><strong>SWITCHING</strong>: switching.</li>
         * <li><strong>FAILED</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE_CHECKING</p>
         */
        @NameInMap("DtsJobStatus")
        public String dtsJobStatus;

        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ecr5go2go1****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The state after the stress testing task ends. Valid values:</p>
         * <ul>
         * <li><strong>WAIT_TARGET</strong>: preparing the target instance for stress testing.</li>
         * <li><strong>WAIT_DBGATEWAY</strong>: preparing the stress testing deployment.</li>
         * <li><strong>WAIT_SQL</strong>: preparing full SQL.</li>
         * <li><strong>WAIT_LOGIC</strong>: preparing to start traffic replay.</li>
         * </ul>
         * <blockquote>
         * <p>After the stress testing task executes the state specified by EndState, the task directly reaches the completed state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WAIT_LOGIC</p>
         */
        @NameInMap("EndState")
        public String endState;

        /**
         * <p>The error code returned by the internal stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>10910</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        @NameInMap("External")
        public String external;

        /**
         * <p>The stress testing rate multiplier. The replay rate must be a positive integer. Valid values: <strong>0</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rate")
        public Long rate;

        /**
         * <p>The duration of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>864000</p>
         */
        @NameInMap("RequestDuration")
        public Long requestDuration;

        /**
         * <p>The generated stress testing duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400000</p>
         */
        @NameInMap("SmartPressureTime")
        public Integer smartPressureTime;

        /**
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li><strong>DAS</strong>.</li>
         * <li><strong>OPEN_API</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAS</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The reuse information of the full SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sqlUuid&quot;:&quot;task_a37d2f07-45cb-<strong><strong>-a2a6-c66c62</strong></strong>&quot;,&quot;metaUuid&quot;:&quot;task_211e2561-5c0c-486b-864c-56b511****&quot;,&quot;sqlFile&quot;:&quot;cl-1620057600000-1800626.sc&quot;,&quot;metaFile&quot;:&quot;cl-1620057600000-180****.meta&quot;}</p>
         */
        @NameInMap("SqlCompleteReuse")
        public String sqlCompleteReuse;

        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("SrcInstanceArea")
        public String srcInstanceArea;

        /**
         * <p>The UUID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a364e414-e68b-4e5c-9166-65b3a153****</p>
         */
        @NameInMap("SrcInstanceUuid")
        public String srcInstanceUuid;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("SrcPublicIp")
        public String srcPublicIp;

        /**
         * <p>The current state of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>WAIT_TARGET</strong>: preparing the target instance for stress testing.</li>
         * <li><strong>WAIT_DBGATEWAY</strong>: preparing the stress testing deployment.</li>
         * <li><strong>WAIT_SQL</strong>: preparing full SQL.</li>
         * <li><strong>WAIT_LOGIC</strong>: preparing to start traffic replay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WAIT_TARGET</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The running status of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: successful.</li>
         * <li><strong>IGNORED</strong>: ignored.</li>
         * <li><strong>RUNNING</strong>: running.</li>
         * <li><strong>EXCEPTION</strong>: abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table names involved in the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TABLE_NAME&quot;:&quot;customer1&quot;,&quot;TABLE_SCHEMA&quot;:&quot;tpcc&quot;}]</p>
         */
        @NameInMap("TableSchema")
        public String tableSchema;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e5cec704-0518-430f-8263-76f4dcds****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>pressure test</strong> (default): intelligent stress testing. The traffic captured from the target instance is replayed on the destination instance at the maximum speed supported by the destination instance specifications.</li>
         * <li><strong>smart pressure test</strong>: generated stress testing. By analyzing and learning the traffic captured from the target instance within a short period of time, traffic that is consistent with the business model and traffic distribution of the original traffic is generated for continuous stress testing. This reduces the time required to collect data from the target instance and lowers storage costs and performance overhead.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pressure test</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The Kafka consumption topic.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>109141182625****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The version of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>V2.0</strong></li>
         * <li><strong>V3.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V3.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The temporary directory generated by the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/bench/</p>
         */
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
