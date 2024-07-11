// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the data export ticket.</p>
     */
    @NameInMap("DataExportOrderDetail")
    public GetDataExportOrderDetailResponseBodyDataExportOrderDetail dataExportOrderDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataExportOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportOrderDetailResponseBody self = new GetDataExportOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataExportOrderDetailResponseBody setDataExportOrderDetail(GetDataExportOrderDetailResponseBodyDataExportOrderDetail dataExportOrderDetail) {
        this.dataExportOrderDetail = dataExportOrderDetail;
        return this;
    }
    public GetDataExportOrderDetailResponseBodyDataExportOrderDetail getDataExportOrderDetail() {
        return this.dataExportOrderDetail;
    }

    public GetDataExportOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataExportOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataExportOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataExportOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo extends TeaModel {
        /**
         * <p>The state of the data export ticket. Valid values:</p>
         * <ul>
         * <li><strong>PRE_CHECKING</strong>: The ticket was being prechecked.</li>
         * <li><strong>PRE_CHECK_SUCCESS</strong>: The ticket passed the precheck.</li>
         * <li><strong>PRE_CHECK_FAIL</strong>: The ticket failed to pass the prechecked.</li>
         * <li><strong>WAITING_APPLY_AUDIT</strong>: The ticket was to be submitted for approval.</li>
         * <li><strong>APPLY_AUDIT_SUCCESS</strong>: The ticket was submitted for approval.</li>
         * <li><strong>ENABLE_EXPORT</strong>: The ticket was approved. Data can be exported.</li>
         * <li><strong>WAITING_EXPORT</strong>: Data was to be scheduled for export.</li>
         * <li><strong>DOING_EXPORT</strong>: Data was being exported.</li>
         * <li><strong>EXPORT_FAIL</strong>: Data failed to be exported.</li>
         * <li><strong>EXPORT_SUCCESS</strong>: Data was exported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPORT_SUCCESS</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The precheck ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PreCheckId")
        public Long preCheckId;

        public static GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo self = new GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo();
            return TeaModel.build(map, self);
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo setPreCheckId(Long preCheckId) {
            this.preCheckId = preCheckId;
            return this;
        }
        public Long getPreCheckId() {
            return this.preCheckId;
        }

    }

    public static class GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail extends TeaModel {
        /**
         * <p>The number of rows that were affected by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The category of the reason for the data export.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The name of the database from which data was exported.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx@xxx:3306</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The ID of the database from which data was exported.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <p>The type of the environment to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The SQL statement that was executed to export data.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        @NameInMap("ExeSQL")
        public String exeSQL;

        /**
         * <p>Indicates whether the affected rows are skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        /**
         * <p>The reason why the affected rows are skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        /**
         * <p>Indicates whether the database is a logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        public static GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail self = new GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setActualAffectRows(Long actualAffectRows) {
            this.actualAffectRows = actualAffectRows;
            return this;
        }
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setExeSQL(String exeSQL) {
            this.exeSQL = exeSQL;
            return this;
        }
        public String getExeSQL() {
            return this.exeSQL;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setIgnoreAffectRows(Boolean ignoreAffectRows) {
            this.ignoreAffectRows = ignoreAffectRows;
            return this;
        }
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setIgnoreAffectRowsReason(String ignoreAffectRowsReason) {
            this.ignoreAffectRowsReason = ignoreAffectRowsReason;
            return this;
        }
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class GetDataExportOrderDetailResponseBodyDataExportOrderDetail extends TeaModel {
        /**
         * <p>The information about the ticket.</p>
         */
        @NameInMap("KeyInfo")
        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo keyInfo;

        /**
         * <p>The details of the ticket.</p>
         */
        @NameInMap("OrderDetail")
        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail orderDetail;

        public static GetDataExportOrderDetailResponseBodyDataExportOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportOrderDetailResponseBodyDataExportOrderDetail self = new GetDataExportOrderDetailResponseBodyDataExportOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetail setKeyInfo(GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo getKeyInfo() {
            return this.keyInfo;
        }

        public GetDataExportOrderDetailResponseBodyDataExportOrderDetail setOrderDetail(GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailOrderDetail getOrderDetail() {
            return this.orderDetail;
        }

    }

}
