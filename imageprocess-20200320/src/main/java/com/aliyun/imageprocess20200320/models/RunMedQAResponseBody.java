// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAResponseBody extends TeaModel {
    @NameInMap("Data")
    public RunMedQAResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>BFF7EEC3-F6B5-4387-AC1D-BB095A1A02E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunMedQAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAResponseBody self = new RunMedQAResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMedQAResponseBody setData(RunMedQAResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunMedQAResponseBodyData getData() {
        return this.data;
    }

    public RunMedQAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunMedQAResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("AnswerType")
        public String answerType;

        @NameInMap("Options")
        public java.util.List<String> options;

        @NameInMap("Question")
        public String question;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("QuestionType")
        public String questionType;

        @NameInMap("Reports")
        public java.util.Map<String, String> reports;

        /**
         * <strong>example:</strong>
         * <p>d1f6a6c2444f4c01adfadd413938e5c7</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static RunMedQAResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAResponseBodyData self = new RunMedQAResponseBodyData();
            return TeaModel.build(map, self);
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

        public RunMedQAResponseBodyData setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public RunMedQAResponseBodyData setQuestionType(String questionType) {
            this.questionType = questionType;
            return this;
        }
        public String getQuestionType() {
            return this.questionType;
        }

        public RunMedQAResponseBodyData setReports(java.util.Map<String, String> reports) {
            this.reports = reports;
            return this;
        }
        public java.util.Map<String, String> getReports() {
            return this.reports;
        }

        public RunMedQAResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
