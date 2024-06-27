// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusResponseBody extends TeaModel {
    /**
     * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
     * <blockquote>
     * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1610616144</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>Indicates whether full data synchronization is performed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public String dataInitialization;

    /**
     * <p>The status of full data synchronization.</p>
     */
    @NameInMap("DataInitializationStatus")
    public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    /**
     * <p>The status of incremental data synchronization.</p>
     */
    @NameInMap("DataSynchronizationStatus")
    public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    /**
     * <p>The synchronization latency, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Delay")
    public String delay;

    /**
     * <p>The synchronization delay, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>506</p>
     */
    @NameInMap("DelayMillis")
    public Long delayMillis;

    /**
     * <p>The connection settings of the destination instance.</p>
     */
    @NameInMap("DestinationEndpoint")
    public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint destinationEndpoint;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if data synchronization failed.</p>
     * 
     * <strong>example:</strong>
     * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The time when the data synchronization instance expires. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
     * <blockquote>
     * <p> This parameter is returned only if the return value of the <strong>PayType</strong> parameter is <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-03-07T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The billing method of the data synchronization instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The performance of the data synchronization instance.</p>
     */
    @NameInMap("Performance")
    public DescribeSynchronizationJobStatusResponseBodyPerformance performance;

    /**
     * <p>The precheck status.</p>
     */
    @NameInMap("PrecheckStatus")
    public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus precheckStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DACDF659-AFC6-4DC8-ADB8-4569419A4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The connection settings of the source instance.</p>
     */
    @NameInMap("SourceEndpoint")
    public DescribeSynchronizationJobStatusResponseBodySourceEndpoint sourceEndpoint;

    /**
     * <p>The status of the data synchronization task. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
     * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
     * <li><strong>Synchronizing</strong>: The task is synchronizing data.</li>
     * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
     * <li><strong>Suspending</strong>: The task is paused.</li>
     * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
     * <li><strong>Finished</strong>: The task is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>synchronizing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether schema synchronization is performed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StructureInitialization")
    public String structureInitialization;

    /**
     * <p>The status of schema synchronization.</p>
     */
    @NameInMap("StructureInitializationStatus")
    public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong></li>
     * <li><strong>Reverse</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The specification of the data synchronization instance.</p>
     * 
     * <strong>example:</strong>
     * <p>large</p>
     */
    @NameInMap("SynchronizationJobClass")
    public String synchronizationJobClass;

    /**
     * <p>The ID of the data synchronization instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsexjk1alb116****</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    /**
     * <p>The name of the data synchronization task.</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    /**
     * <p>The objects that are synchronized by the task.</p>
     */
    @NameInMap("SynchronizationObjects")
    public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> synchronizationObjects;

    /**
     * <strong>example:</strong>
     * <p>exjk1alb116****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeSynchronizationJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusResponseBody self = new DescribeSynchronizationJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusResponseBody setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataInitialization(String dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public String getDataInitialization() {
        return this.dataInitialization;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataInitializationStatus(DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus) {
        this.dataInitializationStatus = dataInitializationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataSynchronizationStatus(DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus) {
        this.dataSynchronizationStatus = dataSynchronizationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setDelay(String delay) {
        this.delay = delay;
        return this;
    }
    public String getDelay() {
        return this.delay;
    }

    public DescribeSynchronizationJobStatusResponseBody setDelayMillis(Long delayMillis) {
        this.delayMillis = delayMillis;
        return this;
    }
    public Long getDelayMillis() {
        return this.delayMillis;
    }

    public DescribeSynchronizationJobStatusResponseBody setDestinationEndpoint(DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSynchronizationJobStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationJobStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSynchronizationJobStatusResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeSynchronizationJobStatusResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeSynchronizationJobStatusResponseBody setPerformance(DescribeSynchronizationJobStatusResponseBodyPerformance performance) {
        this.performance = performance;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyPerformance getPerformance() {
        return this.performance;
    }

    public DescribeSynchronizationJobStatusResponseBody setPrecheckStatus(DescribeSynchronizationJobStatusResponseBodyPrecheckStatus precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobStatusResponseBody setSourceEndpoint(DescribeSynchronizationJobStatusResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSynchronizationJobStatusResponseBody setStructureInitialization(String structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public String getStructureInitialization() {
        return this.structureInitialization;
    }

    public DescribeSynchronizationJobStatusResponseBody setStructureInitializationStatus(DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus) {
        this.structureInitializationStatus = structureInitializationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobClass(String synchronizationJobClass) {
        this.synchronizationJobClass = synchronizationJobClass;
        return this;
    }
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationObjects(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> synchronizationObjects) {
        this.synchronizationObjects = synchronizationObjects;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public DescribeSynchronizationJobStatusResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned if full data synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of full data synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been synchronized during full data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of full data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Full data synchronization is not started.</li>
         * <li><strong>Migrating</strong>: Full data synchronization is in progress.</li>
         * <li><strong>Failed</strong>: Full data synchronization failed.</li>
         * <li><strong>Finished</strong>: Full data synchronization is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus self = new DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>1610709865</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The synchronization latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The synchronization latency, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>856</p>
         */
        @NameInMap("DelayMillis")
        public Long delayMillis;

        /**
         * <p>The error message returned if incremental data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of incremental data synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The status of incremental data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Incremental data synchronization is not started.</li>
         * <li><strong>Migrating</strong>: Incremental data synchronization is in progress.</li>
         * <li><strong>Failed</strong>: Incremental data synchronization failed.</li>
         * <li><strong>Finished</strong>: Incremental data synchronization is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus self = new DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setDelayMillis(Long delayMillis) {
            this.delayMillis = delayMillis;
            return this;
        }
        public Long getDelayMillis() {
            return this.delayMillis;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint extends TeaModel {
        /**
         * <p>The database type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp162d4tp0500****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The database service port of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint self = new DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPerformance extends TeaModel {
        /**
         * <p>The data traffic that is synchronized per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FLOW")
        public String FLOW;

        /**
         * <p>The number of times SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RPS")
        public String RPS;

        public static DescribeSynchronizationJobStatusResponseBodyPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPerformance self = new DescribeSynchronizationJobStatusResponseBodyPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPerformance setFLOW(String FLOW) {
            this.FLOW = FLOW;
            return this;
        }
        public String getFLOW() {
            return this.FLOW;
        }

        public DescribeSynchronizationJobStatusResponseBodyPerformance setRPS(String RPS) {
            this.RPS = RPS;
            return this;
        }
        public String getRPS() {
            return this.RPS;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail extends TeaModel {
        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The task passed the precheck.</li>
         * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The method to fix the precheck failure.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail self = new DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPrecheckStatus extends TeaModel {
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> detail;

        /**
         * <p>The precheck progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The task passed the precheck.</li>
         * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPrecheckStatus self = new DescribeSynchronizationJobStatusResponseBodyPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setDetail(java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySourceEndpoint extends TeaModel {
        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The database service port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSynchronizationJobStatusResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySourceEndpoint self = new DescribeSynchronizationJobStatusResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned if schema synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables whose schemas have been synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of schema synchronization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Schema synchronization is not started.</li>
         * <li><strong>Migrating</strong>: Schema synchronization is in progress.</li>
         * <li><strong>Failed</strong>: Schema synchronization failed.</li>
         * <li><strong>Finished</strong>: Schema synchronization is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus self = new DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes extends TeaModel {
        /**
         * <p>The name of the excluded table.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes extends TeaModel {
        /**
         * <p>The name of the synchronized table.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjects extends TeaModel {
        /**
         * <p>The database name that is used in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>newdtstestdatabase</p>
         */
        @NameInMap("NewSchemaName")
        public String newSchemaName;

        /**
         * <p>The name of the synchronized database.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The source tables that are excluded from the data synchronization task.</p>
         */
        @NameInMap("TableExcludes")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> tableExcludes;

        /**
         * <p>The tables that are synchronized by the task.</p>
         */
        @NameInMap("TableIncludes")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> tableIncludes;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjects self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjects();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setNewSchemaName(String newSchemaName) {
            this.newSchemaName = newSchemaName;
            return this;
        }
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setTableExcludes(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> tableExcludes) {
            this.tableExcludes = tableExcludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setTableIncludes(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

    }

}
