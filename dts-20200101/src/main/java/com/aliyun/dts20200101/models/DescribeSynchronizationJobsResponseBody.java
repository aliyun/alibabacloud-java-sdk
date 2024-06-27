// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsResponseBody extends TeaModel {
    /**
     * <p>The total number of data synchronization instances that belong to your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether full data synchronization is performed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The list of data synchronization instances and the details of each instance.</p>
     * 
     * <strong>example:</strong>
     * <p>92E1E99D-5224-4AD3-8C94-23A3516B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the data synchronization task.</p>
     */
    @NameInMap("SynchronizationInstances")
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances;

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
     * <p>100</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSynchronizationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobsResponseBody self = new DescribeSynchronizationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSynchronizationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronizationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobsResponseBody setSynchronizationInstances(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances) {
        this.synchronizationInstances = synchronizationInstances;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> getSynchronizationInstances() {
        return this.synchronizationInstances;
    }

    public DescribeSynchronizationJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus extends TeaModel {
        /**
         * <p>The status of incremental data synchronization.</p>
         * <blockquote>
         * <p> This parameter is no longer available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of incremental data synchronization.</p>
         * <blockquote>
         * <p> This parameter and its sub-parameters are no longer available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The synchronization latency.</p>
         * <blockquote>
         * <p> This parameter is no longer available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The number of records that have been synchronized during full data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The connection settings of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The error message returned if incremental data synchronization failed.</p>
         * <blockquote>
         * <p> This parameter is no longer available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint extends TeaModel {
        /**
         * <p>The data traffic that is synchronized per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The database account of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The database service port of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp162d4tp0500****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The database type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The performance of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The number of times SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance extends TeaModel {
        /**
         * <p>The precheck progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FLOW")
        public String FLOW;

        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The task passed the precheck.</li>
         * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RPS")
        public String RPS;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setFLOW(String FLOW) {
            this.FLOW = FLOW;
            return this;
        }
        public String getFLOW() {
            return this.FLOW;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setRPS(String RPS) {
            this.RPS = RPS;
            return this;
        }
        public String getRPS() {
            return this.RPS;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail extends TeaModel {
        /**
         * <p>The method to fix the precheck failure.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The connection settings of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The endpoint of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus extends TeaModel {
        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
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

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setDetail(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint extends TeaModel {
        /**
         * <p>The progress of schema synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The database account of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The database service port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The status of schema synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

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
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The number of tables whose schemas have been synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes extends TeaModel {
        /**
         * <p>The status of full data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes extends TeaModel {
        /**
         * <p>The progress of full data synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects extends TeaModel {
        /**
         * <p>The name of the excluded table.</p>
         * 
         * <strong>example:</strong>
         * <p>newdtstestdatabase</p>
         */
        @NameInMap("NewSchemaName")
        public String newSchemaName;

        /**
         * <p>The tables that are synchronized by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the synchronized table.</p>
         */
        @NameInMap("TableExcludes")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> tableExcludes;

        /**
         * <p>The status of full data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Full data synchronization is not started.</li>
         * <li><strong>Migrating</strong>: Full data synchronization is in progress.</li>
         * <li><strong>Failed</strong>: Full data synchronization failed.</li>
         * <li><strong>Finished</strong>: Full data synchronization is completed.</li>
         * </ul>
         */
        @NameInMap("TableIncludes")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> tableIncludes;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setNewSchemaName(String newSchemaName) {
            this.newSchemaName = newSchemaName;
            return this;
        }
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setTableExcludes(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> tableExcludes) {
            this.tableExcludes = tableExcludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setTableIncludes(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags extends TeaModel {
        /**
         * <p>The database name that is used in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the synchronized database.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstances extends TeaModel {
        /**
         * <p>The specification of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28 17:34:53.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The synchronization latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataInitialization")
        public String dataInitialization;

        /**
         * <p>The error message returned if full data synchronization failed.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The progress of incremental data synchronization. Unit: %.</p>
         * <blockquote>
         * <p> This parameter is no longer available.</p>
         * </blockquote>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The time when the data synchronization task was created. The time is displayed in the <em>yyyy-MM-dd</em> <em>HH:mm:ss</em>.0 format (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint;

        /**
         * <p>The billing method of the data synchronization instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether schema synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-07-07T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the data synchronization task was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28T09:36:32Z</p>
         */
        @NameInMap("InstanceCreateTime")
        public String instanceCreateTime;

        /**
         * <p>The tag value that corresponds to the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28T09:34:53Z</p>
         */
        @NameInMap("JobCreateTime")
        public String jobCreateTime;

        /**
         * <p>The time when the instance was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The precheck status.</p>
         */
        @NameInMap("Performance")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance performance;

        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus precheckStatus;

        /**
         * <p>The type of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint sourceEndpoint;

        /**
         * <p>The error message returned if data synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>synchronizing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureInitialization")
        public String structureInitialization;

        /**
         * <p>The error message returned if schema synchronization failed.</p>
         */
        @NameInMap("StructureInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong></li>
         * <li><strong>Reverse</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("SynchronizationJobClass")
        public String synchronizationJobClass;

        /**
         * <p>The collection of tags.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsexjk1alb116****</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>The time when the data synchronization instance expires. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>PayType</strong> parameter is <strong>PrePaid</strong>.</p>
         * </blockquote>
         */
        @NameInMap("SynchronizationJobName")
        public String synchronizationJobName;

        /**
         * <p>The source tables that are excluded from the data synchronization task.</p>
         */
        @NameInMap("SynchronizationObjects")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects;

        /**
         * <p>The objects that are synchronized by the task.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> tags;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstances self = new DescribeSynchronizationJobsResponseBodySynchronizationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataInitialization(String dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public String getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataInitializationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataSynchronizationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDestinationEndpoint(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setInstanceCreateTime(String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setJobCreateTime(String jobCreateTime) {
            this.jobCreateTime = jobCreateTime;
            return this;
        }
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPerformance(DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance getPerformance() {
            return this.performance;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPrecheckStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSourceEndpoint(DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitialization(String structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public String getStructureInitialization() {
            return this.structureInitialization;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitializationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobClass(String synchronizationJobClass) {
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }
        public String getSynchronizationJobClass() {
            return this.synchronizationJobClass;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }
        public String getSynchronizationJobName() {
            return this.synchronizationJobName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationObjects(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects) {
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> getSynchronizationObjects() {
            return this.synchronizationObjects;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setTags(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> getTags() {
            return this.tags;
        }

    }

}
