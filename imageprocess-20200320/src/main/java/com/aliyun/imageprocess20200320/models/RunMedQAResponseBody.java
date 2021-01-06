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
        @NameInMap("Answer")
        public String answer;

        @NameInMap("SimilarQuestion")
        public java.util.List<String> similarQuestion;

        public static RunMedQAResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAResponseBodyData self = new RunMedQAResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunMedQAResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public RunMedQAResponseBodyData setSimilarQuestion(java.util.List<String> similarQuestion) {
            this.similarQuestion = similarQuestion;
            return this;
        }
        public java.util.List<String> getSimilarQuestion() {
            return this.similarQuestion;
        }

    }

}
