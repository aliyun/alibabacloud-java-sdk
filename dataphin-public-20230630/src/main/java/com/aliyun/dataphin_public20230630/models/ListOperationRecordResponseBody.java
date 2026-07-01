// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListOperationRecordResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The operation log list response.</p>
     */
    @NameInMap("OperationLogListResponse")
    public ListOperationRecordResponseBodyOperationLogListResponse operationLogListResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOperationRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationRecordResponseBody self = new ListOperationRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOperationRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOperationRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOperationRecordResponseBody setOperationLogListResponse(ListOperationRecordResponseBodyOperationLogListResponse operationLogListResponse) {
        this.operationLogListResponse = operationLogListResponse;
        return this;
    }
    public ListOperationRecordResponseBodyOperationLogListResponse getOperationLogListResponse() {
        return this.operationLogListResponse;
    }

    public ListOperationRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOperationRecordResponseBodyOperationLogListResponseResultData extends TeaModel {
        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15 10:30:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The code type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CodeType")
        public Integer codeType;

        /**
         * <p>The execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试任务</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The object type.</p>
         * 
         * <strong>example:</strong>
         * <p>onedata-ide</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The operation record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public Long operationId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of related tables.</p>
         */
        @NameInMap("RelationTables")
        public java.util.List<String> relationTables;

        /**
         * <p>The ID of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("Runner")
        public String runner;

        /**
         * <p>The name of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("RunnerName")
        public String runnerName;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListOperationRecordResponseBodyOperationLogListResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationRecordResponseBodyOperationLogListResponseResultData self = new ListOperationRecordResponseBodyOperationLogListResponseResultData();
            return TeaModel.build(map, self);
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setCodeType(Integer codeType) {
            this.codeType = codeType;
            return this;
        }
        public Integer getCodeType() {
            return this.codeType;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setRelationTables(java.util.List<String> relationTables) {
            this.relationTables = relationTables;
            return this;
        }
        public java.util.List<String> getRelationTables() {
            return this.relationTables;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setRunner(String runner) {
            this.runner = runner;
            return this;
        }
        public String getRunner() {
            return this.runner;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setRunnerName(String runnerName) {
            this.runnerName = runnerName;
            return this;
        }
        public String getRunnerName() {
            return this.runnerName;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOperationRecordResponseBodyOperationLogListResponseResultData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListOperationRecordResponseBodyOperationLogListResponse extends TeaModel {
        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The list of operation logs.</p>
         */
        @NameInMap("ResultData")
        public java.util.List<ListOperationRecordResponseBodyOperationLogListResponseResultData> resultData;

        public static ListOperationRecordResponseBodyOperationLogListResponse build(java.util.Map<String, ?> map) throws Exception {
            ListOperationRecordResponseBodyOperationLogListResponse self = new ListOperationRecordResponseBodyOperationLogListResponse();
            return TeaModel.build(map, self);
        }

        public ListOperationRecordResponseBodyOperationLogListResponse setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListOperationRecordResponseBodyOperationLogListResponse setResultData(java.util.List<ListOperationRecordResponseBodyOperationLogListResponseResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<ListOperationRecordResponseBodyOperationLogListResponseResultData> getResultData() {
            return this.resultData;
        }

    }

}
