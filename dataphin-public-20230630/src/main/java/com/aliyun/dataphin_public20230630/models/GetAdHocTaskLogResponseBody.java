// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocTaskLogResponseBody extends TeaModel {
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

    @NameInMap("LogInfo")
    public GetAdHocTaskLogResponseBodyLogInfo logInfo;

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

    @NameInMap("Success")
    public Boolean success;

    public static GetAdHocTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocTaskLogResponseBody self = new GetAdHocTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdHocTaskLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAdHocTaskLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAdHocTaskLogResponseBody setLogInfo(GetAdHocTaskLogResponseBodyLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }
    public GetAdHocTaskLogResponseBodyLogInfo getLogInfo() {
        return this.logInfo;
    }

    public GetAdHocTaskLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAdHocTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdHocTaskLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAdHocTaskLogResponseBodyLogInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("HasResult")
        public Boolean hasResult;

        /**
         * <strong>example:</strong>
         * <p>2021</p>
         */
        @NameInMap("NextOffset")
        public Integer nextOffset;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubTaskId")
        public Integer subTaskId;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute_SQL_300000843_1611548758327</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>WAIT_RESOURCE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetAdHocTaskLogResponseBodyLogInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAdHocTaskLogResponseBodyLogInfo self = new GetAdHocTaskLogResponseBodyLogInfo();
            return TeaModel.build(map, self);
        }

        public GetAdHocTaskLogResponseBodyLogInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setHasResult(Boolean hasResult) {
            this.hasResult = hasResult;
            return this;
        }
        public Boolean getHasResult() {
            return this.hasResult;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setNextOffset(Integer nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }
        public Integer getNextOffset() {
            return this.nextOffset;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setSubTaskId(Integer subTaskId) {
            this.subTaskId = subTaskId;
            return this;
        }
        public Integer getSubTaskId() {
            return this.subTaskId;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAdHocTaskLogResponseBodyLogInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
