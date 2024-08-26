// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetHistoryListByBizTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetHistoryListByBizTypeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9DF9B3F3-9FFE-52CB-A8DC-F7BD5F842F0E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetHistoryListByBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryListByBizTypeResponseBody self = new GetHistoryListByBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryListByBizTypeResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetHistoryListByBizTypeResponseBody setData(GetHistoryListByBizTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoryListByBizTypeResponseBodyData getData() {
        return this.data;
    }

    public GetHistoryListByBizTypeResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetHistoryListByBizTypeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetHistoryListByBizTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoryListByBizTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistoryListByBizTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetHistoryListByBizTypeResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetHistoryListByBizTypeResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GysYBsxx</p>
         */
        @NameInMap("bizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>LibraryChat</p>
         */
        @NameInMap("bizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("extraMessage")
        public Object extraMessage;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>210</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("llmAnswer")
        public String llmAnswer;

        @NameInMap("llmPrompt")
        public String llmPrompt;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("llmType")
        public String llmType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("userQuery")
        public String userQuery;

        public static GetHistoryListByBizTypeResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryListByBizTypeResponseBodyDataRecords self = new GetHistoryListByBizTypeResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setExtraMessage(Object extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public Object getExtraMessage() {
            return this.extraMessage;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setLlmAnswer(String llmAnswer) {
            this.llmAnswer = llmAnswer;
            return this;
        }
        public String getLlmAnswer() {
            return this.llmAnswer;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setLlmPrompt(String llmPrompt) {
            this.llmPrompt = llmPrompt;
            return this;
        }
        public String getLlmPrompt() {
            return this.llmPrompt;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setLlmType(String llmType) {
            this.llmType = llmType;
            return this;
        }
        public String getLlmType() {
            return this.llmType;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetHistoryListByBizTypeResponseBodyDataRecords setUserQuery(String userQuery) {
            this.userQuery = userQuery;
            return this;
        }
        public String getUserQuery() {
            return this.userQuery;
        }

    }

    public static class GetHistoryListByBizTypeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("records")
        public java.util.List<GetHistoryListByBizTypeResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPages")
        public Long totalPages;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalRecords")
        public Long totalRecords;

        public static GetHistoryListByBizTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryListByBizTypeResponseBodyData self = new GetHistoryListByBizTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryListByBizTypeResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetHistoryListByBizTypeResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetHistoryListByBizTypeResponseBodyData setRecords(java.util.List<GetHistoryListByBizTypeResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetHistoryListByBizTypeResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetHistoryListByBizTypeResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public GetHistoryListByBizTypeResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
