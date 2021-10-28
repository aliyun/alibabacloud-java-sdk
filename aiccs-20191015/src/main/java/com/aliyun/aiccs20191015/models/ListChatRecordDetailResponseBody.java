// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListChatRecordDetailResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("ResultData")
    public ListChatRecordDetailResponseBodyResultData resultData;

    // success
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

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("MsgType")
        public String msgType;

        @NameInMap("SenderName")
        public String senderName;

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
        // 在线结束时间
        @NameInMap("EndTime")
        public Long endTime;

        // 在线会话详细信息
        @NameInMap("MessageList")
        public java.util.List<ListChatRecordDetailResponseBodyResultDataDataMessageList> messageList;

        @NameInMap("ServicerName")
        public String servicerName;

        // 在线开始时间
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
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Data")
        public java.util.List<ListChatRecordDetailResponseBodyResultDataData> data;

        @NameInMap("OnePageSize")
        public Long onePageSize;

        @NameInMap("TotalPage")
        public Long totalPage;

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
