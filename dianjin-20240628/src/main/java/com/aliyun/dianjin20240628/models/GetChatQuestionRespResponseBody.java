// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetChatQuestionRespResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetChatQuestionRespResponseBodyData data;

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
     * <p>44BD277A-87F9-5310-8D63-3E6645F1DA85</p>
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

    public static GetChatQuestionRespResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatQuestionRespResponseBody self = new GetChatQuestionRespResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatQuestionRespResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetChatQuestionRespResponseBody setData(GetChatQuestionRespResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatQuestionRespResponseBodyData getData() {
        return this.data;
    }

    public GetChatQuestionRespResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetChatQuestionRespResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetChatQuestionRespResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatQuestionRespResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChatQuestionRespResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetChatQuestionRespResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetChatQuestionRespResponseBodyDataQuestionList extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-11-17 10:05:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("reply")
        public String reply;

        /**
         * <strong>example:</strong>
         * <p>1732846760323001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>PRODUCT_QA</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>39847834568436</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("userName")
        public String userName;

        public static GetChatQuestionRespResponseBodyDataQuestionList build(java.util.Map<String, ?> map) throws Exception {
            GetChatQuestionRespResponseBodyDataQuestionList self = new GetChatQuestionRespResponseBodyDataQuestionList();
            return TeaModel.build(map, self);
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setReply(String reply) {
            this.reply = reply;
            return this;
        }
        public String getReply() {
            return this.reply;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetChatQuestionRespResponseBodyDataQuestionList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetChatQuestionRespResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("currentState")
        public String currentState;

        @NameInMap("questionList")
        public java.util.List<GetChatQuestionRespResponseBodyDataQuestionList> questionList;

        public static GetChatQuestionRespResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatQuestionRespResponseBodyData self = new GetChatQuestionRespResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatQuestionRespResponseBodyData setCurrentState(String currentState) {
            this.currentState = currentState;
            return this;
        }
        public String getCurrentState() {
            return this.currentState;
        }

        public GetChatQuestionRespResponseBodyData setQuestionList(java.util.List<GetChatQuestionRespResponseBodyDataQuestionList> questionList) {
            this.questionList = questionList;
            return this;
        }
        public java.util.List<GetChatQuestionRespResponseBodyDataQuestionList> getQuestionList() {
            return this.questionList;
        }

    }

}
