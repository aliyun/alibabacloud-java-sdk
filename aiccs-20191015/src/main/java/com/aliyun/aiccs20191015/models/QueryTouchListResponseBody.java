// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTouchListResponseBody extends TeaModel {
    @NameInMap("ResultData")
    public QueryTouchListResponseBodyResultData resultData;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTouchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTouchListResponseBody self = new QueryTouchListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTouchListResponseBody setResultData(QueryTouchListResponseBodyResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public QueryTouchListResponseBodyResultData getResultData() {
        return this.resultData;
    }

    public QueryTouchListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTouchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTouchListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTouchListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTouchListResponseBodyResultDataDataExtAttrs extends TeaModel {
        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        @NameInMap("EvaluationSolution")
        public Integer evaluationSolution;

        @NameInMap("OnlineSessionSource")
        public Integer onlineSessionSource;

        @NameInMap("OnlineJoinRespInterval")
        public Integer onlineJoinRespInterval;

        @NameInMap("EvaluationStatus")
        public Integer evaluationStatus;

        public static QueryTouchListResponseBodyResultDataDataExtAttrs build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultDataDataExtAttrs self = new QueryTouchListResponseBodyResultDataDataExtAttrs();
            return TeaModel.build(map, self);
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationScore(Integer evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationLevel(Integer evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationSolution(Integer evaluationSolution) {
            this.evaluationSolution = evaluationSolution;
            return this;
        }
        public Integer getEvaluationSolution() {
            return this.evaluationSolution;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setOnlineSessionSource(Integer onlineSessionSource) {
            this.onlineSessionSource = onlineSessionSource;
            return this;
        }
        public Integer getOnlineSessionSource() {
            return this.onlineSessionSource;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setOnlineJoinRespInterval(Integer onlineJoinRespInterval) {
            this.onlineJoinRespInterval = onlineJoinRespInterval;
            return this;
        }
        public Integer getOnlineJoinRespInterval() {
            return this.onlineJoinRespInterval;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationStatus(Integer evaluationStatus) {
            this.evaluationStatus = evaluationStatus;
            return this;
        }
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

    }

    public static class QueryTouchListResponseBodyResultDataData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ToId")
        public Long toId;

        @NameInMap("ParentTouchId")
        public Long parentTouchId;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("CloseTime")
        public Long closeTime;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("SwitchUser")
        public String switchUser;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("FromId")
        public Long fromId;

        @NameInMap("UserTouchId")
        public Long userTouchId;

        @NameInMap("TouchTime")
        public String touchTime;

        @NameInMap("TouchContent")
        public String touchContent;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("TouchId")
        public String touchId;

        @NameInMap("QueueId")
        public Long queueId;

        @NameInMap("DepId")
        public Long depId;

        @NameInMap("TouchEndReason")
        public Integer touchEndReason;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("CommonQueueName")
        public String commonQueueName;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("TouchType")
        public Integer touchType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("ExtAttrs")
        public QueryTouchListResponseBodyResultDataDataExtAttrs extAttrs;

        public static QueryTouchListResponseBodyResultDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultDataData self = new QueryTouchListResponseBodyResultDataData();
            return TeaModel.build(map, self);
        }

        public QueryTouchListResponseBodyResultDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTouchListResponseBodyResultDataData setToId(Long toId) {
            this.toId = toId;
            return this;
        }
        public Long getToId() {
            return this.toId;
        }

        public QueryTouchListResponseBodyResultDataData setParentTouchId(Long parentTouchId) {
            this.parentTouchId = parentTouchId;
            return this;
        }
        public Long getParentTouchId() {
            return this.parentTouchId;
        }

        public QueryTouchListResponseBodyResultDataData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public QueryTouchListResponseBodyResultDataData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public QueryTouchListResponseBodyResultDataData setCloseTime(Long closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public Long getCloseTime() {
            return this.closeTime;
        }

        public QueryTouchListResponseBodyResultDataData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTouchListResponseBodyResultDataData setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryTouchListResponseBodyResultDataData setSwitchUser(String switchUser) {
            this.switchUser = switchUser;
            return this;
        }
        public String getSwitchUser() {
            return this.switchUser;
        }

        public QueryTouchListResponseBodyResultDataData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryTouchListResponseBodyResultDataData setFromId(Long fromId) {
            this.fromId = fromId;
            return this;
        }
        public Long getFromId() {
            return this.fromId;
        }

        public QueryTouchListResponseBodyResultDataData setUserTouchId(Long userTouchId) {
            this.userTouchId = userTouchId;
            return this;
        }
        public Long getUserTouchId() {
            return this.userTouchId;
        }

        public QueryTouchListResponseBodyResultDataData setTouchTime(String touchTime) {
            this.touchTime = touchTime;
            return this;
        }
        public String getTouchTime() {
            return this.touchTime;
        }

        public QueryTouchListResponseBodyResultDataData setTouchContent(String touchContent) {
            this.touchContent = touchContent;
            return this;
        }
        public String getTouchContent() {
            return this.touchContent;
        }

        public QueryTouchListResponseBodyResultDataData setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public QueryTouchListResponseBodyResultDataData setTouchId(String touchId) {
            this.touchId = touchId;
            return this;
        }
        public String getTouchId() {
            return this.touchId;
        }

        public QueryTouchListResponseBodyResultDataData setQueueId(Long queueId) {
            this.queueId = queueId;
            return this;
        }
        public Long getQueueId() {
            return this.queueId;
        }

        public QueryTouchListResponseBodyResultDataData setDepId(Long depId) {
            this.depId = depId;
            return this;
        }
        public Long getDepId() {
            return this.depId;
        }

        public QueryTouchListResponseBodyResultDataData setTouchEndReason(Integer touchEndReason) {
            this.touchEndReason = touchEndReason;
            return this;
        }
        public Integer getTouchEndReason() {
            return this.touchEndReason;
        }

        public QueryTouchListResponseBodyResultDataData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryTouchListResponseBodyResultDataData setCommonQueueName(String commonQueueName) {
            this.commonQueueName = commonQueueName;
            return this;
        }
        public String getCommonQueueName() {
            return this.commonQueueName;
        }

        public QueryTouchListResponseBodyResultDataData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public QueryTouchListResponseBodyResultDataData setTouchType(Integer touchType) {
            this.touchType = touchType;
            return this;
        }
        public Integer getTouchType() {
            return this.touchType;
        }

        public QueryTouchListResponseBodyResultDataData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryTouchListResponseBodyResultDataData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTouchListResponseBodyResultDataData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryTouchListResponseBodyResultDataData setExtAttrs(QueryTouchListResponseBodyResultDataDataExtAttrs extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public QueryTouchListResponseBodyResultDataDataExtAttrs getExtAttrs() {
            return this.extAttrs;
        }

    }

    public static class QueryTouchListResponseBodyResultData extends TeaModel {
        @NameInMap("TotalResults")
        public Integer totalResults;

        @NameInMap("NextPage")
        public Integer nextPage;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Data")
        public java.util.List<QueryTouchListResponseBodyResultDataData> data;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PreviousPage")
        public Integer previousPage;

        @NameInMap("OnePageSize")
        public Integer onePageSize;

        @NameInMap("Empty")
        public Boolean empty;

        public static QueryTouchListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultData self = new QueryTouchListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryTouchListResponseBodyResultData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public QueryTouchListResponseBodyResultData setNextPage(Integer nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Integer getNextPage() {
            return this.nextPage;
        }

        public QueryTouchListResponseBodyResultData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryTouchListResponseBodyResultData setData(java.util.List<QueryTouchListResponseBodyResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryTouchListResponseBodyResultDataData> getData() {
            return this.data;
        }

        public QueryTouchListResponseBodyResultData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryTouchListResponseBodyResultData setPreviousPage(Integer previousPage) {
            this.previousPage = previousPage;
            return this;
        }
        public Integer getPreviousPage() {
            return this.previousPage;
        }

        public QueryTouchListResponseBodyResultData setOnePageSize(Integer onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }
        public Integer getOnePageSize() {
            return this.onePageSize;
        }

        public QueryTouchListResponseBodyResultData setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

    }

}
