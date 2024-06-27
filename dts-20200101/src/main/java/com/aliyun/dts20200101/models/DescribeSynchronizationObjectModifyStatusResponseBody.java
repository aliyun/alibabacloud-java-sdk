// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationObjectModifyStatusResponseBody extends TeaModel {
    /**
     * <p>The status of full data synchronization.</p>
     */
    @NameInMap("DataInitializationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    /**
     * <p>The status of incremental data synchronization.</p>
     * <blockquote>
     * <p> This parameter and its sub-parameters will be removed in the future.</p>
     * </blockquote>
     */
    @NameInMap("DataSynchronizationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

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
     * <p>The error message returned if the task failed to modify the objects to be synchronized.</p>
     * 
     * <strong>example:</strong>
     * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The precheck status.</p>
     */
    @NameInMap("PrecheckStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus precheckStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B38C644B-4395-4F6F-86E3-592F26BE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task that changes the objects to be synchronized. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>Migrating</strong>: The task is running.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * <li><strong>Finished</strong>: The task is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The status of schema synchronization.</p>
     */
    @NameInMap("StructureInitializationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSynchronizationObjectModifyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationObjectModifyStatusResponseBody self = new DescribeSynchronizationObjectModifyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setDataInitializationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus dataInitializationStatus) {
        this.dataInitializationStatus = dataInitializationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setDataSynchronizationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus) {
        this.dataSynchronizationStatus = dataSynchronizationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setPrecheckStatus(DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setStructureInitializationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus structureInitializationStatus) {
        this.structureInitializationStatus = structureInitializationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus extends TeaModel {
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
         * <p>39754</p>
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

        public static DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The synchronization latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

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
         * <p>Migrating</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail extends TeaModel {
        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li>Success: The task passed the precheck.</li>
         * <li>Failed: The task failed to pass the precheck.</li>
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
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.xxx.xx\&quot; (using password: YES)</p>
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
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is Failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail self = new DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus extends TeaModel {
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> detail;

        /**
         * <p>The precheck progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck status.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setDetail(java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned if schema synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: Table \&quot;customer\&quot; already exists</p>
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

        public static DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
