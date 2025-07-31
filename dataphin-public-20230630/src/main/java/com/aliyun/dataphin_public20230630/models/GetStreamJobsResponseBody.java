// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetStreamJobsResponseBodyData> data;

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

    public static GetStreamJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStreamJobsResponseBody self = new GetStreamJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStreamJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStreamJobsResponseBody setData(java.util.List<GetStreamJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStreamJobsResponseBodyData> getData() {
        return this.data;
    }

    public GetStreamJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStreamJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStreamJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStreamJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStreamJobsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>716555</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>flink_order_detail</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>300006788</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>300006788</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>7162269257990111</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>FLINK_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStreamJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStreamJobsResponseBodyData self = new GetStreamJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStreamJobsResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetStreamJobsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStreamJobsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetStreamJobsResponseBodyData setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetStreamJobsResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetStreamJobsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetStreamJobsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStreamJobsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
