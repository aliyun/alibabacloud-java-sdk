// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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

    @NameInMap("OperationLogDTO")
    public GetOperationRecordByIdResponseBodyOperationLogDTO operationLogDTO;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOperationRecordByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordByIdResponseBody self = new GetOperationRecordByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperationRecordByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOperationRecordByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOperationRecordByIdResponseBody setOperationLogDTO(GetOperationRecordByIdResponseBodyOperationLogDTO operationLogDTO) {
        this.operationLogDTO = operationLogDTO;
        return this;
    }
    public GetOperationRecordByIdResponseBodyOperationLogDTO getOperationLogDTO() {
        return this.operationLogDTO;
    }

    public GetOperationRecordByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationRecordByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOperationRecordByIdResponseBodyOperationLogDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-01-15 10:30:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CodeType")
        public Integer codeType;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>测试任务</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>onedata-ide</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public Long operationId;

        /**
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RelationTables")
        public java.util.List<String> relationTables;

        /**
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("Runner")
        public String runner;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("RunnerName")
        public String runnerName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetOperationRecordByIdResponseBodyOperationLogDTO build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordByIdResponseBodyOperationLogDTO self = new GetOperationRecordByIdResponseBodyOperationLogDTO();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setCodeType(Integer codeType) {
            this.codeType = codeType;
            return this;
        }
        public Integer getCodeType() {
            return this.codeType;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setRelationTables(java.util.List<String> relationTables) {
            this.relationTables = relationTables;
            return this;
        }
        public java.util.List<String> getRelationTables() {
            return this.relationTables;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setRunner(String runner) {
            this.runner = runner;
            return this;
        }
        public String getRunner() {
            return this.runner;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setRunnerName(String runnerName) {
            this.runnerName = runnerName;
            return this;
        }
        public String getRunnerName() {
            return this.runnerName;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetOperationRecordByIdResponseBodyOperationLogDTO setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
