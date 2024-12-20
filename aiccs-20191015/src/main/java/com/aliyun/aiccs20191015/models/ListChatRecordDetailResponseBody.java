// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListChatRecordDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultData")
    public ListChatRecordDetailResponseBodyResultData resultData;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChatRecordDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatRecordDetailResponseBody self = new ListChatRecordDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatRecordDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatRecordDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListChatRecordDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatRecordDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatRecordDetailResponseBody setResultData(ListChatRecordDetailResponseBodyResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public ListChatRecordDetailResponseBodyResultData getResultData() {
        return this.resultData;
    }

    public ListChatRecordDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChatRecordDetailResponseBodyResultDataDataMessageList extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1614578400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>MSG</p>
         */
        @NameInMap("MsgType")
        public String msgType;

        /**
         * <strong>example:</strong>
         * <p>account1</p>
         */
        @NameInMap("SenderName")
        public String senderName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SenderType")
        public Long senderType;

        public static ListChatRecordDetailResponseBodyResultDataDataMessageList build(java.util.Map<String, ?> map) throws Exception {
            ListChatRecordDetailResponseBodyResultDataDataMessageList self = new ListChatRecordDetailResponseBodyResultDataDataMessageList();
            return TeaModel.build(map, self);
        }

        public ListChatRecordDetailResponseBodyResultDataDataMessageList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListChatRecordDetailResponseBodyResultDataDataMessageList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListChatRecordDetailResponseBodyResultDataDataMessageList setMsgType(String msgType) {
            this.msgType = msgType;
            return this;
        }
        public String getMsgType() {
            return this.msgType;
        }

        public ListChatRecordDetailResponseBodyResultDataDataMessageList setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public ListChatRecordDetailResponseBodyResultDataDataMessageList setSenderType(Long senderType) {
            this.senderType = senderType;
            return this;
        }
        public Long getSenderType() {
            return this.senderType;
        }

    }

    public static class ListChatRecordDetailResponseBodyResultDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1614578410000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MessageList")
        public java.util.List<ListChatRecordDetailResponseBodyResultDataDataMessageList> messageList;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <strong>example:</strong>
         * <p>1614578400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListChatRecordDetailResponseBodyResultDataData build(java.util.Map<String, ?> map) throws Exception {
            ListChatRecordDetailResponseBodyResultDataData self = new ListChatRecordDetailResponseBodyResultDataData();
            return TeaModel.build(map, self);
        }

        public ListChatRecordDetailResponseBodyResultDataData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListChatRecordDetailResponseBodyResultDataData setMessageList(java.util.List<ListChatRecordDetailResponseBodyResultDataDataMessageList> messageList) {
            this.messageList = messageList;
            return this;
        }
        public java.util.List<ListChatRecordDetailResponseBodyResultDataDataMessageList> getMessageList() {
            return this.messageList;
        }

        public ListChatRecordDetailResponseBodyResultDataData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public ListChatRecordDetailResponseBodyResultDataData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListChatRecordDetailResponseBodyResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Data")
        public java.util.List<ListChatRecordDetailResponseBodyResultDataData> data;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OnePageSize")
        public Long onePageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalResults")
        public Long totalResults;

        public static ListChatRecordDetailResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListChatRecordDetailResponseBodyResultData self = new ListChatRecordDetailResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListChatRecordDetailResponseBodyResultData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListChatRecordDetailResponseBodyResultData setData(java.util.List<ListChatRecordDetailResponseBodyResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListChatRecordDetailResponseBodyResultDataData> getData() {
            return this.data;
        }

        public ListChatRecordDetailResponseBodyResultData setOnePageSize(Long onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }
        public Long getOnePageSize() {
            return this.onePageSize;
        }

        public ListChatRecordDetailResponseBodyResultData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListChatRecordDetailResponseBodyResultData setTotalResults(Long totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Long getTotalResults() {
            return this.totalResults;
        }

    }

}
