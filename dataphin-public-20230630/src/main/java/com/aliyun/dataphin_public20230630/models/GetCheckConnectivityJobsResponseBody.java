// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>result</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCheckConnectivityJobsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCheckConnectivityJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobsResponseBody self = new GetCheckConnectivityJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCheckConnectivityJobsResponseBody setData(java.util.List<GetCheckConnectivityJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCheckConnectivityJobsResponseBodyData> getData() {
        return this.data;
    }

    public GetCheckConnectivityJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCheckConnectivityJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCheckConnectivityJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckConnectivityJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCheckConnectivityJobsResponseBodyData extends TeaModel {
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

        public static GetCheckConnectivityJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCheckConnectivityJobsResponseBodyData self = new GetCheckConnectivityJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCheckConnectivityJobsResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetCheckConnectivityJobsResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetCheckConnectivityJobsResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetCheckConnectivityJobsResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetCheckConnectivityJobsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCheckConnectivityJobsResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetCheckConnectivityJobsResponseBodyData setVoldemortTaskId(String voldemortTaskId) {
            this.voldemortTaskId = voldemortTaskId;
            return this;
        }
        public String getVoldemortTaskId() {
            return this.voldemortTaskId;
        }

    }

}
