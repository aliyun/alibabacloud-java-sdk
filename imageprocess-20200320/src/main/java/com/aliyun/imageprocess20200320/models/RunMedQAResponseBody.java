// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RunMedQAResponseBodyData data;

    public static RunMedQAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAResponseBody self = new RunMedQAResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMedQAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunMedQAResponseBody setData(RunMedQAResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunMedQAResponseBodyData getData() {
        return this.data;
    }

    public static class RunMedQAResponseBodyData extends TeaModel {
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("QuestionType")
        public String questionType;

        @NameInMap("Question")
        public String question;

        @NameInMap("AnswerType")
        public String answerType;

        @NameInMap("Options")
        public java.util.List<String> options;

        @NameInMap("Reports")
        public java.util.Map<String, String> reports;

        public static RunMedQAResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAResponseBodyData self = new RunMedQAResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunMedQAResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunMedQAResponseBodyData setQuestionType(String questionType) {
            this.questionType = questionType;
            return this;
        }
        public String getQuestionType() {
            return this.questionType;
        }

        public RunMedQAResponseBodyData setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public RunMedQAResponseBodyData setAnswerType(String answerType) {
            this.answerType = answerType;
            return this;
        }
        public String getAnswerType() {
            return this.answerType;
        }

        public RunMedQAResponseBodyData setOptions(java.util.List<String> options) {
            this.options = options;
            return this;
        }
        public java.util.List<String> getOptions() {
            return this.options;
        }

        public RunMedQAResponseBodyData setReports(java.util.Map<String, String> reports) {
            this.reports = reports;
            return this;
        }
        public java.util.Map<String, String> getReports() {
            return this.reports;
        }

    }

}
