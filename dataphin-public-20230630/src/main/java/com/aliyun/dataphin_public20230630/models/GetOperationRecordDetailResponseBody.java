// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordDetailResponseBody extends TeaModel {
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
     * <p>The execution record detail response.</p>
     */
    @NameInMap("OperationRecordDetailResponse")
    public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse operationRecordDetailResponse;

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

    public static GetOperationRecordDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordDetailResponseBody self = new GetOperationRecordDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperationRecordDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOperationRecordDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOperationRecordDetailResponseBody setOperationRecordDetailResponse(GetOperationRecordDetailResponseBodyOperationRecordDetailResponse operationRecordDetailResponse) {
        this.operationRecordDetailResponse = operationRecordDetailResponse;
        return this;
    }
    public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse getOperationRecordDetailResponse() {
        return this.operationRecordDetailResponse;
    }

    public GetOperationRecordDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOperationRecordDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults extends TeaModel {
        /**
         * <p>The result index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The result content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;count&quot;:100,&quot;data&quot;:[{&quot;id&quot;:1}]}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The result SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM test_table</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task_123456</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The result title.</p>
         * 
         * <strong>example:</strong>
         * <p>查询结果</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults self = new GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetOperationRecordDetailResponseBodyOperationRecordDetailResponse extends TeaModel {
        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The log content.</p>
         * 
         * <strong>example:</strong>
         * <p>Task started...
         * Executing SQL...
         * Task finished successfully.</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>The operation record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The list of execution results.</p>
         */
        @NameInMap("Results")
        public java.util.List<GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults> results;

        public static GetOperationRecordDetailResponseBodyOperationRecordDetailResponse build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordDetailResponseBodyOperationRecordDetailResponse self = new GetOperationRecordDetailResponseBodyOperationRecordDetailResponse();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetOperationRecordDetailResponseBodyOperationRecordDetailResponse setResults(java.util.List<GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetOperationRecordDetailResponseBodyOperationRecordDetailResponseResults> getResults() {
            return this.results;
        }

    }

}
