// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RunMedQAResponseData data;

    public static RunMedQAResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAResponse self = new RunMedQAResponse();
        return TeaModel.build(map, self);
    }

    public RunMedQAResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunMedQAResponse setData(RunMedQAResponseData data) {
        this.data = data;
        return this;
    }
    public RunMedQAResponseData getData() {
        return this.data;
    }

    public static class RunMedQAResponseData extends TeaModel {
        @NameInMap("Answer")
        @Validation(required = true)
        public String answer;

        @NameInMap("SimilarQuestion")
        @Validation(required = true)
        public java.util.List<String> similarQuestion;

        public static RunMedQAResponseData build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAResponseData self = new RunMedQAResponseData();
            return TeaModel.build(map, self);
        }

        public RunMedQAResponseData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public RunMedQAResponseData setSimilarQuestion(java.util.List<String> similarQuestion) {
            this.similarQuestion = similarQuestion;
            return this;
        }
        public java.util.List<String> getSimilarQuestion() {
            return this.similarQuestion;
        }

    }

}
