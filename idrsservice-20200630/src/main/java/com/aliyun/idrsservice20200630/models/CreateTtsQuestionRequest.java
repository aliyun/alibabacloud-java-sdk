// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionRequest extends TeaModel {
    @NameInMap("Request")
    public CreateTtsQuestionRequestRequest request;

    public static CreateTtsQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionRequest self = new CreateTtsQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionRequest setRequest(CreateTtsQuestionRequestRequest request) {
        this.request = request;
        return this;
    }
    public CreateTtsQuestionRequestRequest getRequest() {
        return this.request;
    }

    public static class CreateTtsQuestionRequestRequest extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        @NameInMap("Question")
        public String question;

        @NameInMap("QuestionGroupId")
        public String questionGroupId;

        public static CreateTtsQuestionRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateTtsQuestionRequestRequest self = new CreateTtsQuestionRequestRequest();
            return TeaModel.build(map, self);
        }

        public CreateTtsQuestionRequestRequest setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public CreateTtsQuestionRequestRequest setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public CreateTtsQuestionRequestRequest setQuestionGroupId(String questionGroupId) {
            this.questionGroupId = questionGroupId;
            return this;
        }
        public String getQuestionGroupId() {
            return this.questionGroupId;
        }

    }

}
