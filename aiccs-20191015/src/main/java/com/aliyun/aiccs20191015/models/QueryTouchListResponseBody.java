// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTouchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>865658FD-80DE-5D49-ABEB-F3CC9863F4F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultData")
    public QueryTouchListResponseBodyResultData resultData;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTouchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTouchListResponseBody self = new QueryTouchListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTouchListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryTouchListResponseBody setResultData(QueryTouchListResponseBodyResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public QueryTouchListResponseBodyResultData getResultData() {
        return this.resultData;
    }

    public QueryTouchListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTouchListResponseBodyResultDataDataExtAttrs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>187****0000</p>
         */
        @NameInMap("Ani")
        public String ani;

        /**
         * <strong>example:</strong>
         * <p>05712688****</p>
         */
        @NameInMap("Dnis")
        public String dnis;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EvaluationSolution")
        public Integer evaluationSolution;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EvaluationStatus")
        public Integer evaluationStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineJoinRespInterval")
        public Integer onlineJoinRespInterval;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnlineSessionSource")
        public Integer onlineSessionSource;

        /**
         * <strong>example:</strong>
         * <p>05712688****</p>
         */
        @NameInMap("OutCallRouteNumber")
        public String outCallRouteNumber;

        public static QueryTouchListResponseBodyResultDataDataExtAttrs build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultDataDataExtAttrs self = new QueryTouchListResponseBodyResultDataDataExtAttrs();
            return TeaModel.build(map, self);
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setAni(String ani) {
            this.ani = ani;
            return this;
        }
        public String getAni() {
            return this.ani;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setDnis(String dnis) {
            this.dnis = dnis;
            return this;
        }
        public String getDnis() {
            return this.dnis;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationLevel(Integer evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationScore(Integer evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationSolution(Integer evaluationSolution) {
            this.evaluationSolution = evaluationSolution;
            return this;
        }
        public Integer getEvaluationSolution() {
            return this.evaluationSolution;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setEvaluationStatus(Integer evaluationStatus) {
            this.evaluationStatus = evaluationStatus;
            return this;
        }
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setOnlineJoinRespInterval(Integer onlineJoinRespInterval) {
            this.onlineJoinRespInterval = onlineJoinRespInterval;
            return this;
        }
        public Integer getOnlineJoinRespInterval() {
            return this.onlineJoinRespInterval;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setOnlineSessionSource(Integer onlineSessionSource) {
            this.onlineSessionSource = onlineSessionSource;
            return this;
        }
        public Integer getOnlineSessionSource() {
            return this.onlineSessionSource;
        }

        public QueryTouchListResponseBodyResultDataDataExtAttrs setOutCallRouteNumber(String outCallRouteNumber) {
            this.outCallRouteNumber = outCallRouteNumber;
            return this;
        }
        public String getOutCallRouteNumber() {
            return this.outCallRouteNumber;
        }

    }

    public static class QueryTouchListResponseBodyResultDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>905</p>
         */
        @NameInMap("BuId")
        public Long buId;

        /**
         * <strong>example:</strong>
         * <p>4f8807a9de024507a3090b5b66a8****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelType")
        public Integer channelType;

        /**
         * <strong>example:</strong>
         * <p>1611207976000</p>
         */
        @NameInMap("CloseTime")
        public Long closeTime;

        @NameInMap("CommonQueueName")
        public String commonQueueName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DepId")
        public Long depId;

        @NameInMap("ExtAttrs")
        public QueryTouchListResponseBodyResultDataDataExtAttrs extAttrs;

        @NameInMap("ExtAttrsString")
        public java.util.Map<String, ?> extAttrsString;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Feedback")
        public String feedback;

        /**
         * <strong>example:</strong>
         * <p>1611209971000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>6400665****</p>
         */
        @NameInMap("FromId")
        public Long fromId;

        /**
         * <strong>example:</strong>
         * <p>1611209971000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1611207979000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>6400665****</p>
         */
        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentTouchId")
        public Long parentTouchId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("QueueId")
        public Long queueId;

        /**
         * <strong>example:</strong>
         * <p>67****</p>
         */
        @NameInMap("ServicerId")
        public Long servicerId;

        /**
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SwitchUser")
        public String switchUser;

        /**
         * <strong>example:</strong>
         * <p>678026</p>
         */
        @NameInMap("ToId")
        public Long toId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TouchContent")
        public String touchContent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TouchEndReason")
        public Integer touchEndReason;

        /**
         * <strong>example:</strong>
         * <p>1386****</p>
         */
        @NameInMap("TouchId")
        public String touchId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("TouchTime")
        public String touchTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TouchType")
        public Integer touchType;

        /**
         * <strong>example:</strong>
         * <p>1386****</p>
         */
        @NameInMap("UserTouchId")
        public Long userTouchId;

        public static QueryTouchListResponseBodyResultDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultDataData self = new QueryTouchListResponseBodyResultDataData();
            return TeaModel.build(map, self);
        }

        public QueryTouchListResponseBodyResultDataData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryTouchListResponseBodyResultDataData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
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

        public QueryTouchListResponseBodyResultDataData setCommonQueueName(String commonQueueName) {
            this.commonQueueName = commonQueueName;
            return this;
        }
        public String getCommonQueueName() {
            return this.commonQueueName;
        }

        public QueryTouchListResponseBodyResultDataData setDepId(Long depId) {
            this.depId = depId;
            return this;
        }
        public Long getDepId() {
            return this.depId;
        }

        public QueryTouchListResponseBodyResultDataData setExtAttrs(QueryTouchListResponseBodyResultDataDataExtAttrs extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public QueryTouchListResponseBodyResultDataDataExtAttrs getExtAttrs() {
            return this.extAttrs;
        }

        public QueryTouchListResponseBodyResultDataData setExtAttrsString(java.util.Map<String, ?> extAttrsString) {
            this.extAttrsString = extAttrsString;
            return this;
        }
        public java.util.Map<String, ?> getExtAttrsString() {
            return this.extAttrsString;
        }

        public QueryTouchListResponseBodyResultDataData setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public QueryTouchListResponseBodyResultDataData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public QueryTouchListResponseBodyResultDataData setFromId(Long fromId) {
            this.fromId = fromId;
            return this;
        }
        public Long getFromId() {
            return this.fromId;
        }

        public QueryTouchListResponseBodyResultDataData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTouchListResponseBodyResultDataData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTouchListResponseBodyResultDataData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryTouchListResponseBodyResultDataData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryTouchListResponseBodyResultDataData setParentTouchId(Long parentTouchId) {
            this.parentTouchId = parentTouchId;
            return this;
        }
        public Long getParentTouchId() {
            return this.parentTouchId;
        }

        public QueryTouchListResponseBodyResultDataData setQueueId(Long queueId) {
            this.queueId = queueId;
            return this;
        }
        public Long getQueueId() {
            return this.queueId;
        }

        public QueryTouchListResponseBodyResultDataData setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryTouchListResponseBodyResultDataData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public QueryTouchListResponseBodyResultDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTouchListResponseBodyResultDataData setSwitchUser(String switchUser) {
            this.switchUser = switchUser;
            return this;
        }
        public String getSwitchUser() {
            return this.switchUser;
        }

        public QueryTouchListResponseBodyResultDataData setToId(Long toId) {
            this.toId = toId;
            return this;
        }
        public Long getToId() {
            return this.toId;
        }

        public QueryTouchListResponseBodyResultDataData setTouchContent(String touchContent) {
            this.touchContent = touchContent;
            return this;
        }
        public String getTouchContent() {
            return this.touchContent;
        }

        public QueryTouchListResponseBodyResultDataData setTouchEndReason(Integer touchEndReason) {
            this.touchEndReason = touchEndReason;
            return this;
        }
        public Integer getTouchEndReason() {
            return this.touchEndReason;
        }

        public QueryTouchListResponseBodyResultDataData setTouchId(String touchId) {
            this.touchId = touchId;
            return this;
        }
        public String getTouchId() {
            return this.touchId;
        }

        public QueryTouchListResponseBodyResultDataData setTouchTime(String touchTime) {
            this.touchTime = touchTime;
            return this;
        }
        public String getTouchTime() {
            return this.touchTime;
        }

        public QueryTouchListResponseBodyResultDataData setTouchType(Integer touchType) {
            this.touchType = touchType;
            return this;
        }
        public Integer getTouchType() {
            return this.touchType;
        }

        public QueryTouchListResponseBodyResultDataData setUserTouchId(Long userTouchId) {
            this.userTouchId = userTouchId;
            return this;
        }
        public Long getUserTouchId() {
            return this.userTouchId;
        }

    }

    public static class QueryTouchListResponseBodyResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Data")
        public java.util.List<QueryTouchListResponseBodyResultDataData> data;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Empty")
        public Boolean empty;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextPage")
        public Integer nextPage;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OnePageSize")
        public Integer onePageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PreviousPage")
        public Integer previousPage;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalPage")
        public Integer totalPage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalResults")
        public Integer totalResults;

        public static QueryTouchListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryTouchListResponseBodyResultData self = new QueryTouchListResponseBodyResultData();
            return TeaModel.build(map, self);
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

        public QueryTouchListResponseBodyResultData setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public QueryTouchListResponseBodyResultData setNextPage(Integer nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Integer getNextPage() {
            return this.nextPage;
        }

        public QueryTouchListResponseBodyResultData setOnePageSize(Integer onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }
        public Integer getOnePageSize() {
            return this.onePageSize;
        }

        public QueryTouchListResponseBodyResultData setPreviousPage(Integer previousPage) {
            this.previousPage = previousPage;
            return this;
        }
        public Integer getPreviousPage() {
            return this.previousPage;
        }

        public QueryTouchListResponseBodyResultData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryTouchListResponseBodyResultData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

    }

}
