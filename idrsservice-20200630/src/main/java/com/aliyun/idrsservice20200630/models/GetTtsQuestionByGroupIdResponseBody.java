// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTtsQuestionByGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTtsQuestionByGroupIdResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTtsQuestionByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTtsQuestionByGroupIdResponseBody self = new GetTtsQuestionByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTtsQuestionByGroupIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTtsQuestionByGroupIdResponseBody setData(GetTtsQuestionByGroupIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTtsQuestionByGroupIdResponseBodyData getData() {
        return this.data;
    }

    public GetTtsQuestionByGroupIdResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetTtsQuestionByGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTtsQuestionByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTtsQuestionByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTtsQuestionByGroupIdResponseBodyDataQuestions extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("Question")
        public String question;

        @NameInMap("QuestionGroupId")
        public Long questionGroupId;

        @NameInMap("QuestionKey")
        public String questionKey;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetTtsQuestionByGroupIdResponseBodyDataQuestions build(java.util.Map<String, ?> map) throws Exception {
            GetTtsQuestionByGroupIdResponseBodyDataQuestions self = new GetTtsQuestionByGroupIdResponseBodyDataQuestions();
            return TeaModel.build(map, self);
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setQuestionGroupId(Long questionGroupId) {
            this.questionGroupId = questionGroupId;
            return this;
        }
        public Long getQuestionGroupId() {
            return this.questionGroupId;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setQuestionKey(String questionKey) {
            this.questionKey = questionKey;
            return this;
        }
        public String getQuestionKey() {
            return this.questionKey;
        }

        public GetTtsQuestionByGroupIdResponseBodyDataQuestions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetTtsQuestionByGroupIdResponseBodyData extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Questions")
        public java.util.List<GetTtsQuestionByGroupIdResponseBodyDataQuestions> questions;

        public static GetTtsQuestionByGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTtsQuestionByGroupIdResponseBodyData self = new GetTtsQuestionByGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTtsQuestionByGroupIdResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetTtsQuestionByGroupIdResponseBodyData setQuestions(java.util.List<GetTtsQuestionByGroupIdResponseBodyDataQuestions> questions) {
            this.questions = questions;
            return this;
        }
        public java.util.List<GetTtsQuestionByGroupIdResponseBodyDataQuestions> getQuestions() {
            return this.questions;
        }

    }

}
