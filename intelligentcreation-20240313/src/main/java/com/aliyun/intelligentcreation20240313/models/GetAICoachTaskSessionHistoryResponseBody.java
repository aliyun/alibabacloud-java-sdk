// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionHistoryResponseBody extends TeaModel {
    @NameInMap("conversationList")
    public java.util.List<GetAICoachTaskSessionHistoryResponseBodyConversationList> conversationList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>2024-11-08 09:33:21</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>D5798660-1531-5D12-9C20-16FEE9D22351</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptName")
    public String scriptName;

    /**
     * <strong>example:</strong>
     * <p>2024-08-21 05:00:01</p>
     */
    @NameInMap("startTime")
    public String startTime;

    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1579404690269235</p>
     */
    @NameInMap("uid")
    public String uid;

    public static GetAICoachTaskSessionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionHistoryResponseBody self = new GetAICoachTaskSessionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionHistoryResponseBody setConversationList(java.util.List<GetAICoachTaskSessionHistoryResponseBodyConversationList> conversationList) {
        this.conversationList = conversationList;
        return this;
    }
    public java.util.List<GetAICoachTaskSessionHistoryResponseBodyConversationList> getConversationList() {
        return this.conversationList;
    }

    public GetAICoachTaskSessionHistoryResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetAICoachTaskSessionHistoryResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAICoachTaskSessionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachTaskSessionHistoryResponseBody setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public GetAICoachTaskSessionHistoryResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetAICoachTaskSessionHistoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAICoachTaskSessionHistoryResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetAICoachTaskSessionHistoryResponseBodyConversationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("evaluationResult")
        public String evaluationResult;

        @NameInMap("message")
        public String message;

        @NameInMap("role")
        public String role;

        public static GetAICoachTaskSessionHistoryResponseBodyConversationList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachTaskSessionHistoryResponseBodyConversationList self = new GetAICoachTaskSessionHistoryResponseBodyConversationList();
            return TeaModel.build(map, self);
        }

        public GetAICoachTaskSessionHistoryResponseBodyConversationList setEvaluationResult(String evaluationResult) {
            this.evaluationResult = evaluationResult;
            return this;
        }
        public String getEvaluationResult() {
            return this.evaluationResult;
        }

        public GetAICoachTaskSessionHistoryResponseBodyConversationList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAICoachTaskSessionHistoryResponseBodyConversationList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
