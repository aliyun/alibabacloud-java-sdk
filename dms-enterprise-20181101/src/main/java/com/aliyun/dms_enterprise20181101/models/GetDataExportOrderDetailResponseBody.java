// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataExportOrderDetail")
    public GetDataExportOrderDetailResponseBodyDataExportOrderDetail dataExportOrderDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("JobStatus")
        public String jobStatus;

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
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("Database")
        public String database;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("ExeSQL")
        public String exeSQL;

        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

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
        @NameInMap("KeyInfo")
        public GetDataExportOrderDetailResponseBodyDataExportOrderDetailKeyInfo keyInfo;

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
