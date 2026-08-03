// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachTaskSessionResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessionList")
    public java.util.List<ListAICoachTaskSessionResponseBodySessionList> sessionList;

    @NameInMap("success")
    public Boolean success;

    public static ListAICoachTaskSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachTaskSessionResponseBody self = new ListAICoachTaskSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICoachTaskSessionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAICoachTaskSessionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAICoachTaskSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICoachTaskSessionResponseBody setSessionList(java.util.List<ListAICoachTaskSessionResponseBodySessionList> sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public java.util.List<ListAICoachTaskSessionResponseBodySessionList> getSessionList() {
        return this.sessionList;
    }

    public ListAICoachTaskSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAICoachTaskSessionResponseBodySessionList extends TeaModel {
        @NameInMap("sessionCreateTime")
        public String sessionCreateTime;

        @NameInMap("sessionDuration")
        public Long sessionDuration;

        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("sessionStatus")
        public Integer sessionStatus;

        public static ListAICoachTaskSessionResponseBodySessionList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachTaskSessionResponseBodySessionList self = new ListAICoachTaskSessionResponseBodySessionList();
            return TeaModel.build(map, self);
        }

        public ListAICoachTaskSessionResponseBodySessionList setSessionCreateTime(String sessionCreateTime) {
            this.sessionCreateTime = sessionCreateTime;
            return this;
        }
        public String getSessionCreateTime() {
            return this.sessionCreateTime;
        }

        public ListAICoachTaskSessionResponseBodySessionList setSessionDuration(Long sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Long getSessionDuration() {
            return this.sessionDuration;
        }

        public ListAICoachTaskSessionResponseBodySessionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListAICoachTaskSessionResponseBodySessionList setSessionStatus(Integer sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public Integer getSessionStatus() {
            return this.sessionStatus;
        }

    }

}
