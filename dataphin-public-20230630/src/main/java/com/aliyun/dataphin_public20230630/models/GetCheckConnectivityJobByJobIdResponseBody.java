// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobByJobIdResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The connectivity check task.</p>
     */
    @NameInMap("Data")
    public GetCheckConnectivityJobByJobIdResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
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
         * <p>The ID of the data source. This parameter is empty if the check is performed before creation.</p>
         * 
         * <strong>example:</strong>
         * <p>192</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The error message returned when the check fails.</p>
         * 
         * <strong>example:</strong>
         * <p>notFoundIp</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the connectivity check task.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/cluster</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The job status. Valid values: NEW, IN_PROCESS, SUCCESS, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant to which the check task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the underlying execution task.</p>
         * 
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
