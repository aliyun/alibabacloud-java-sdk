// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobByJobIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCheckConnectivityJobByJobIdResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCheckConnectivityJobByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobByJobIdResponseBody self = new GetCheckConnectivityJobByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobByJobIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCheckConnectivityJobByJobIdResponseBody setData(GetCheckConnectivityJobByJobIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCheckConnectivityJobByJobIdResponseBodyData getData() {
        return this.data;
    }

    public GetCheckConnectivityJobByJobIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCheckConnectivityJobByJobIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCheckConnectivityJobByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckConnectivityJobByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCheckConnectivityJobByJobIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>notFoundIp</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>application/cluster</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>t_7572319950395080706_20251225_7572319950395080707</p>
         */
        @NameInMap("VoldemortTaskId")
        public String voldemortTaskId;

        public static GetCheckConnectivityJobByJobIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCheckConnectivityJobByJobIdResponseBodyData self = new GetCheckConnectivityJobByJobIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetCheckConnectivityJobByJobIdResponseBodyData setVoldemortTaskId(String voldemortTaskId) {
            this.voldemortTaskId = voldemortTaskId;
            return this;
        }
        public String getVoldemortTaskId() {
            return this.voldemortTaskId;
        }

    }

}
